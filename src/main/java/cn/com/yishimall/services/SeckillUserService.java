package cn.com.yishimall.services;

import cn.com.yishimall.entity.UserSeckill;
import cn.com.yishimall.mapper.UserSeckillMapper;
import cn.com.yishimall.result.CodeMsg;
import cn.com.yishimall.util.MD5Util;
import cn.com.yishimall.util.UUIDUtil;
import cn.com.yishimall.vo.LoginVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.TimeUnit;

/**
 * @author qinghua.zhang
 */
@Service
public class SeckillUserService {
	
	public static final String COOKIE_NAME_TOKEN="token";
	
	@Resource
	private RedisTemplate<String, UserSeckill> redisTemplate;

	@Resource
	private UserSeckillMapper userSeckillMapper;
	
	public CodeMsg login(HttpServletResponse response, LoginVo loginVo) {
		if(loginVo==null) {
			return CodeMsg.SERVER_ERROR;
		}
		//经过了一次MD5的密码
		String mobile=loginVo.getMobile();
		String formPass=loginVo.getPassword();
		//判断手机号是否存在
		UserSeckill user = userSeckillMapper.selectByPrimaryKey(Long.parseLong(mobile));
		//查询不到该手机号的用户
		if(user==null) {
			return CodeMsg.MOBILE_NOT_EXIST;
		}
		//手机号存在的情况，验证密码，获取数据库里面的密码与salt去验证
		//111111--->e5d22cfc746c7da8da84e0a996e0fffa
		String dbPass=user.getPassword();
		String dbSalt=user.getSalt();
		//验证密码，计算二次MD5出来的pass是否与数据库 一致
		String tmppass= MD5Util.formPassToDBPass(formPass, dbSalt);
		if(!tmppass.equals(dbPass)) {
			return CodeMsg.PASSWORD_ERROR;
		}
		//生成cookie
		String token = UUIDUtil.uuid();
		addCookie(user,token,response);
		return CodeMsg.SUCCESS;		
	}
	/**
	 * 添加或者叫做更新cookie
	 */
	public void addCookie(UserSeckill user,String token,HttpServletResponse response) {
		// 可以用老的token，不用每次都生成cookie，可以用之前的
		System.out.println("uuid:" + token);
		// 将token写到cookie当中，然后传递给客户端
		// 此token对应的是哪一个用户,将我们的私人信息存放到一个第三方的缓存中
		String key = COOKIE_NAME_TOKEN + token;
		redisTemplate.opsForValue().set(key,user,30, TimeUnit.MINUTES);
		Cookie cookie = new Cookie(COOKIE_NAME_TOKEN, token);
		// 设置cookie的有效期，与session有效期一致
		cookie.setMaxAge(30 * 60);
		// 设置网站的根目录
		cookie.setPath("/");
		// 需要写到response中
		response.addCookie(cookie);
	}
	/**
	 * 从缓存里面取得值，取得value
	 */
	public UserSeckill getByToken(String token,HttpServletResponse response) {
		if(StringUtils.isEmpty(token)) {
			return null;
		}
		String key = COOKIE_NAME_TOKEN + token;
		UserSeckill user = redisTemplate.opsForValue().get(key);
		// 再次请求时候，延长有效期 重新设置缓存里面的值，使用之前cookie里面的token
		if(user!=null) {
			addCookie(user,token,response);
		}
		return user;
	}
}

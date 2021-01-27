package cn.com.yishimall.services;

import cn.com.yishimall.entity.UserSeckill;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @author qinghua.zhang
 */
@Service
public class RedisService {

    @Resource
    private RedisTemplate<String, UserSeckill> redisTemplate;

    @Resource
    private RedisTemplate<String, String> redisTemplateString;

    public UserSeckill get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    public String getString(String key) {
        return redisTemplateString.opsForValue().get(key);
    }

}
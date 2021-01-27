package cn.com.yishimall.controller;

import cn.com.yishimall.result.CodeMsg;
import cn.com.yishimall.result.Result;
import cn.com.yishimall.services.SeckillUserService;
import cn.com.yishimall.vo.LoginVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * @author qinghua.zhang
 * @Date 2021/1/25 11:15
 * @Description
 */
@Api(value = "User")
@RestController
public class UserController {

    @Resource
    private SeckillUserService seckillUserService;

    @ApiOperation(value = "用户登录", notes = "用户登录")
    @RequestMapping(value = "/Login", method = RequestMethod.POST)
    public Result<Boolean> doLogin(HttpServletResponse response, @RequestBody @Valid LoginVo loginVo) {//0代表成功
        //参数检验成功之后，登录
        CodeMsg cm = seckillUserService.login(response,loginVo);
        if(cm.getCode()==0) {
            return Result.success(true);
        }else {
            return Result.error(cm);
        }
    }

}

package cn.com.yishimall.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qinghua.zhang
 * @Date 2021/1/27 9:56
 * @Description
 */

@Controller
@Api(value = "Login")
public class LoginController {

    @ApiOperation(value = "登录", notes = "登录")
    @RequestMapping(value = "/userLogin", method = RequestMethod.GET)
    public String login(){
        return "login";
    }
}

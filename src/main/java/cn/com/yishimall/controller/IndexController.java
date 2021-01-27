package cn.com.yishimall.controller;

import cn.com.yishimall.entity.UserSeckill;
import cn.com.yishimall.services.RedisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 测试Redis集群
 * @author: qinghua.zhang
 * @create: 2021-01-02 16:56
 */

@RestController
@Api(value = "Shop")
public class IndexController {

    @Resource
    private RedisService redisService;

    @ApiOperation(value = "获取value", notes = "根据key获取(User)value")
    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public UserSeckill get(String key) {
        return redisService.get(key);
    }

    @ApiOperation(value = "获取value", notes = "根据key获取(String)value")
    @RequestMapping(value = "/getString", method = RequestMethod.POST)
    public String getString(String key) {
        return redisService.getString(key);
    }

}
package cn.com.yishimall.controller;

import cn.com.yishimall.entity.Goods;
import cn.com.yishimall.services.GoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author free-go
 * @Date Created in 23:33 2021/1/24
 **/
@RestController
@Api(value = "GoodsDTO")
public class GoodsController {

    @Resource
    private GoodsService goodsService;

    @ApiOperation(value = "增加商品", notes = "增加商品")
    @RequestMapping(value = "/addGoods", method = RequestMethod.POST)
    public Boolean get(@RequestBody @Validated Goods goods) {
        boolean res = goodsService.addGoods(goods);
        return res;
    }

    @ApiOperation(value = "查询商品", notes = "根据商品id查询商品")
    @RequestMapping(value = "/queryGoods", method = RequestMethod.POST)
    public Goods queryGoodsById(@RequestBody @Validated Integer id) {
        Goods res = goodsService.queryGoodsById(id);
        return res;
    }

    @ApiOperation(value = "更新商品", notes = "更新商品")
    @RequestMapping(value = "/updateGoods", method = RequestMethod.POST)
    public Boolean updateGoods(@RequestBody @Validated Goods goods) {
        Boolean res = goodsService.updateGoodsInfo(goods);
        return res;
    }

    @ApiOperation(value = "删除商品", notes = "删除商品")
    @RequestMapping(value = "/deleteGoods", method = RequestMethod.POST)
    public Boolean updateGoods(@RequestBody @Validated Integer id) {
        Boolean res = goodsService.deleteGoodsById(id);
        return res;
    }

}

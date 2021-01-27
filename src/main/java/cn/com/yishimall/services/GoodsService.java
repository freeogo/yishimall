package cn.com.yishimall.services;

import cn.com.yishimall.entity.Goods;

/**
 * @Author free-go
 * @Date Created in 23:37 2021/1/24
 **/
public interface GoodsService {
    Boolean addGoods(Goods goods);

    Goods queryGoodsById(Integer id);

    Boolean updateGoodsInfo(Goods goods);

    Boolean deleteGoodsById(Integer id);

}

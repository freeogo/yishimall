package cn.com.yishimall.services.impl;

import cn.com.yishimall.entity.Goods;
import cn.com.yishimall.mapper.GoodsMapper;
import cn.com.yishimall.services.GoodsService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

/**
 * @author qinghua.zhang
 */
@Service
public class GoodsServiceImpl implements GoodsService {
	
	@Resource
	private GoodsMapper goodsMapper;
	
	@Override
	public Boolean addGoods(Goods goods){
		int count = goodsMapper.insertSelective(goods);
		if (count > 0) {
			return true;
		}
		return false;
	}

	@Override
	public Goods queryGoodsById(Integer id){
		Goods goods = goodsMapper.selectByPrimaryKey(id);
		return goods;
	}

	@Override
	public Boolean updateGoodsInfo(Goods goods){
		Example example = new Example(Goods.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andEqualTo("id",goods.getId());
		int count = goodsMapper.updateByExampleSelective(goods, example);
		if (count > 0) {
			return true;
		}
		return false;
	}

	@Override
	public Boolean deleteGoodsById(Integer id){
		int count = goodsMapper.deleteByPrimaryKey(id);
		if (count > 0) {
			return true;
		}
		return false;
	}
	
}

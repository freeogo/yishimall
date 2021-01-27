package cn.com.yishimall.vo;


import cn.com.yishimall.entity.OrderInfo;
import lombok.Data;

@Data
public class OrderDetailVo {
	private GoodsVo goods;
	private OrderInfo order;
}

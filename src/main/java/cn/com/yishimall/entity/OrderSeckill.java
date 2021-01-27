package cn.com.yishimall.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 秒杀订单表
 * @author qinghua.zhang
 */
@Data
@Table(name = "order_seckill")
public class OrderSeckill {

	/**
	 * 主键id
	 */
	@Id
	@GeneratedValue(generator = "JDBC")
	private Long id;

	/**
	 * 用户ID
	 */
	@Column(name = "user_id")
	private Long userId;

	/**
	 * 订单ID
	 */
	@Column(name = "order_id")
	private Long  orderId;

	/**
	 * 商品ID
	 */
	@Column(name = "goods_id")
	private Long goodsId;
}

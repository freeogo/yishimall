package cn.com.yishimall.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

/**
 * 商品秒杀表
 * @author qinghua.zhang
 */
@Data
@Table(name = "goods_seckill")
public class GoodsSeckill {

	/**
	 * 秒杀商品id
	 */
	@Column(name = "id")
	private Long id;

	/**
	 * 商品id
	 */
	@Column(name = "goods_id")
	private Long goodsId;

	/**
	 * 秒杀价
	 */
	@Column(name = "seckill_price")
	private Integer seckillPrice;

	/**
	 * 库存数量
	 */
	@Column(name = "stock_count")
	private Integer stockCount;

	/**
	 * 秒杀开始时间
	 */
	@Column(name = "start_date")
	private Date startDate;

	/**
	 * 秒杀结束时间
	 */
	@Column(name = "end_date")
	private Date endDate;
}

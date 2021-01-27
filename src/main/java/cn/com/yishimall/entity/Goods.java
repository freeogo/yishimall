package cn.com.yishimall.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 商品表
 * @author qinghua.zhang
 */
@Data
@Table(name = "goods")
public class Goods {

	/**
	 * 商品ID
	 */
	@Id
	private Long id;

	/**
	 * 商品名称
	 */
	@Column(name = "goods_name")
	private String goodsName;

	/**
	 * 商品标题
	 */
	@Column(name = "goods_title")
	private String goodsTitle;

	/**
	 * 商品图片
	 */
	@Column(name = "goods_img")
	private String goodsImg;

	/**
	 * 商品详情
	 */
	@Column(name = "goods_detail")
	private String goodsDetail;

	/**
	 * 商品价格
	 */
	@Column(name = "goods_price")
	private Double goodsPrice;

	/**
	 * 商品库存
	 */
	@Column(name = "goods_stock")
	private Integer goodsStock;
}

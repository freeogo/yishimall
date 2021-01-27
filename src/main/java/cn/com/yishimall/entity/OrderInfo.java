package cn.com.yishimall.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 订单信息表
 * @author qinghua.zhang
 */
@Data
@Table(name = "order_info")
public class OrderInfo {

	/**
	 * 主键id
	 */
	@Id
	@GeneratedValue(generator = "JDBC")
	private Long id;

	/**
	 *用户ID
	 */
	@Column(name = "user_id")
	private Long userId;

	/**
	 *商品ID
	 */
	@Column(name = "goods_id")
	private Long goodsId;

	/**
	 *收获地址ID
	 */
	@Column(name = "delivery_addr_id")
	private Long  deliveryAddrId;

	/**
	 *冗余过来的商品名称
	 */
	@Column(name = "goods_name")
	private String goodsName;

	/**
	 *商品数量
	 */
	@Column(name = "goods_count")
	private Integer goodsCount;

	/**
	 *商品单价
	 */
	@Column(name = "goods_price")
	private Double goodsPrice;

	/**
	 *渠道
	 */
	@Column(name = "order_channel")
	private Integer orderChannel;

	/**
	 *订单状态
	 */
	@Column(name = "status")
	private Integer status;

	/**
	 *订单的创建时间
	 */
	@Column(name = "create_date")
	private Date createDate;

	/**
	 *支付时间
	 */
	@Column(name = "pay_date")
	private Date payDate;
}

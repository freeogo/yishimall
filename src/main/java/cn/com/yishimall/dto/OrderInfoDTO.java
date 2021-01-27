package cn.com.yishimall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 订单信息表
 * @author qinghua.zhang
 */
@Data
public class OrderInfoDTO {

	@NotNull
	@ApiModelProperty(value = "用户ID", required = true)
	private Long userId;

	@NotNull
	@ApiModelProperty(value = "商品ID", required = true)
	private Long goodsId;

	@NotNull
	@ApiModelProperty(value = "收获地址ID", required = true)
	private Long  deliveryAddrId;

	@NotNull
	@ApiModelProperty(value = "冗余过来的商品名称", required = true)
	private String goodsName;

	@NotNull
	@ApiModelProperty(value = "商品数量", required = true)
	private Integer goodsCount;

	@NotNull
	@ApiModelProperty(value = "商品单价", required = true)
	private Double goodsPrice;

	@NotNull
	@ApiModelProperty(value = "渠道", required = true)
	private Integer orderChannel;

	@NotNull
	@ApiModelProperty(value = "订单状态", required = true)
	private Integer status;

	@NotNull
	@ApiModelProperty(value = "订单的创建时间", required = true)
	private Date createDate;

	@NotNull
	@ApiModelProperty(value = "支付时间", required = true)
	private Date payDate;
}

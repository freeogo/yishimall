package cn.com.yishimall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 秒杀订单表
 * @author qinghua.zhang
 */
@Data
public class OrderSeckillDTO {

	@NotNull
	@ApiModelProperty(value = "主键id", required = true)
	private Long id;

	@NotNull
	@ApiModelProperty(value = "用户ID", required = true)
	private Long userId;

	@NotNull
	@ApiModelProperty(value = "订单ID", required = true)
	private Long  orderId;

	@NotNull
	@ApiModelProperty(value = "商品ID", required = true)
	private Long goodsId;
}

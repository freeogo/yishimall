package cn.com.yishimall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 商品秒杀表
 * @author qinghua.zhang
 */
@Data
public class GoodsSeckillDTO {

	@NotNull
	@ApiModelProperty(value = "秒杀商品id", required = true)
	private Long id;

	@NotNull
	@ApiModelProperty(value = "商品id", required = true)
	private Long goodsId;

	@NotNull
	@ApiModelProperty(value = "秒杀价", required = true)
	private Integer seckillPrice;

	@NotNull
	@ApiModelProperty(value = "库存数量", required = true)
	private Integer stockCount;

	@NotNull
	@ApiModelProperty(value = "秒杀开始时间", required = true)
	private Date startDate;

	@NotNull
	@ApiModelProperty(value = "秒杀结束时间", required = true)
	private Date endDate;
}

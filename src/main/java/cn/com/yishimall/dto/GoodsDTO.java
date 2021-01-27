package cn.com.yishimall.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * 商品表
 * @author qinghua.zhang
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "商品表")
public class GoodsDTO {

	@NotNull
	@ApiModelProperty(value = "商品名称", required = true)
	private String goodsName;

	@NotNull
	@ApiModelProperty(value = "商品标题", required = true)
	private String goodsTitle;

	@NotNull
	@ApiModelProperty(value = "商品图片", required = true)
	private String goodsImg;

	@NotNull
	@ApiModelProperty(value = "商品详情", required = true)
	private String goodsDetail;

	@NotNull
	@ApiModelProperty(value = "商品价格", required = true)
	private Double goodsPrice;

	@NotNull
	@ApiModelProperty(value = "商品库存", required = true)
	private Integer goodsStock;
}

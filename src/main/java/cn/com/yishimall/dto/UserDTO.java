package cn.com.yishimall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 用户表
 * @author qinghua.zhang
 */
@Data
public class UserDTO {

	@NotNull
	@ApiModelProperty(value = "用户id", required = true)
	private Integer id;

	@NotNull
	@ApiModelProperty(value = "用户id", required = true)
	private String name;
}

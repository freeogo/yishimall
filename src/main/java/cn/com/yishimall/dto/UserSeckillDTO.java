package cn.com.yishimall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * 秒杀用户表
 * @author qinghua.zhang
 */
@Data
public class UserSeckillDTO implements Serializable {

	@NotNull
	@ApiModelProperty(value = "用户ID,手机号码", required = true)
	private Long id;

	@NotNull
	@ApiModelProperty(value = "昵称", required = true)
	private String nickname;

	@NotNull
	@ApiModelProperty(value = "密码", required = true)
	private String password;

	@NotNull
	@ApiModelProperty(value = "盐值", required = true)
	private String salt;

	@NotNull
	@ApiModelProperty(value = "头像,云存储的ID", required = true)
	private String head;

	@NotNull
	@ApiModelProperty(value = "注册时间", required = true)
	private Date registerDate;

	@NotNull
	@ApiModelProperty(value = "上一次登录时间", required = true)
	private Date lastLoginDate;

	@NotNull
	@ApiModelProperty(value = "登录次数", required = true)
	private Integer loginCount;
}

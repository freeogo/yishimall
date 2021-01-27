package cn.com.yishimall.vo;

import cn.com.yishimall.validator.IsMobile;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * @author qinghua.zhang
 */
@Data
public class LoginVo {
	
	@NotNull
	@IsMobile
	private String mobile;
	
	@NotNull
	@Length(min=32)
	private String password;
	
	@Override
	public String toString() {
		return "LoginVo [mobile=" + mobile + ", password=" + password + "]";
	}
}

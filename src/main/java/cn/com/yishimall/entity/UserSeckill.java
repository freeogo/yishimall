package cn.com.yishimall.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 秒杀用户表
 * @author qinghua.zhang
 */
@Data
@Table(name = "user_seckill")
public class UserSeckill implements Serializable {

	/**
	 * 用户ID,手机号码
	 */
	@Id
	private Long id;

	/**
	 * 昵称
	 */
	@Column(name = "nickname")
	private String nickname;

	/**
	 * 密码
	 */
	@Column(name = "password")
	private String password;

	/**
	 * 盐值
	 */
	@Column(name = "salt")
	private String salt;

	/**
	 * 头像,云存储的ID
	 */
	@Column(name = "head")
	private String head;

	/**
	 * 注册时间
	 */
	@Column(name = "register_date")
	private Date registerDate;

	/**
	 * 上一次登录时间
	 */
	@Column(name = "last_login_date")
	private Date lastLoginDate;

	/**
	 * 登录次数
	 */
	@Column(name = "login_count")
	private Integer loginCount;
}

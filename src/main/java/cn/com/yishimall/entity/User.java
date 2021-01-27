package cn.com.yishimall.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * 用户表
 * @author qinghua.zhang
 */
@Data
@Table(name = "user")
public class User {

	/**
	 * 用户id
	 */
	@Column(name = "id")
	private int id;

	/**
	 * 用户名称
	 */
	@Column(name = "name")
	private String name;
}

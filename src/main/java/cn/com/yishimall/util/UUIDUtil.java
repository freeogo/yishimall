package cn.com.yishimall.util;

import java.util.UUID;

/**
 * @author qinghua.zhang
 */
public class UUIDUtil {
	public static String uuid() {
		return UUID.randomUUID().toString().replace("-", "");
	}
}

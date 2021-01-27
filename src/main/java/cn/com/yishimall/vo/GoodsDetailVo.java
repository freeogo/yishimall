package cn.com.yishimall.vo;


import cn.com.yishimall.entity.UserSeckill;
import lombok.Data;

@Data
public class GoodsDetailVo {
	private int miaoshaStatus = 0;
	private int remainSeconds = 0;
	private GoodsVo goods ;
	private UserSeckill user;
}

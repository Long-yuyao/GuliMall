package gulicoupon.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 优惠券与产品关联
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
public class CouponSpuEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//优惠券id
	private Long couponId;
	//spu_id
	private Long spuId;
	//spu_name
	private String spuName;

	/**
	 * 设置：id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：优惠券id
	 */
	public void setCouponId(Long couponId) {
		this.couponId = couponId;
	}
	/**
	 * 获取：优惠券id
	 */
	public Long getCouponId() {
		return couponId;
	}
	/**
	 * 设置：spu_id
	 */
	public void setSpuId(Long spuId) {
		this.spuId = spuId;
	}
	/**
	 * 获取：spu_id
	 */
	public Long getSpuId() {
		return spuId;
	}
	/**
	 * 设置：spu_name
	 */
	public void setSpuName(String spuName) {
		this.spuName = spuName;
	}
	/**
	 * 获取：spu_name
	 */
	public String getSpuName() {
		return spuName;
	}
}

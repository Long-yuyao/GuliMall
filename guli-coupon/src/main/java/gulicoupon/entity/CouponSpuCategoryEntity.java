package gulicoupon.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 优惠券分类关联
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
public class CouponSpuCategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//优惠券id
	private Long couponId;
	//产品分类id
	private Long categoryId;
	//产品分类名称
	private String categoryName;

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
	 * 设置：产品分类id
	 */
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * 获取：产品分类id
	 */
	public Long getCategoryId() {
		return categoryId;
	}
	/**
	 * 设置：产品分类名称
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	/**
	 * 获取：产品分类名称
	 */
	public String getCategoryName() {
		return categoryName;
	}
}

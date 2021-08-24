package gulicoupon.entity;
import java.math.BigDecimal;

import java.io.Serializable;
import java.util.Date;



/**
 * 商品spu积分设置
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
public class SkuBoundsEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//
	private Long skuId;
	//成长积分
	private BigDecimal growBounds;
	//购物积分
	private BigDecimal buyBounds;
	//优惠生效情况[1111（四个状态位，从右到左）;0 - 无优惠，成长积分是否赠送;1 - 无优惠，购物积分是否赠送;2 - 有优惠，成长积分是否赠送;3 - 有优惠，购物积分是否赠送【状态位0：不赠送，1：赠送】]
	private Integer work;

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
	 * 设置：
	 */
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}
	/**
	 * 获取：
	 */
	public Long getSkuId() {
		return skuId;
	}
	/**
	 * 设置：成长积分
	 */
	public void setGrowBounds(BigDecimal growBounds) {
		this.growBounds = growBounds;
	}
	/**
	 * 获取：成长积分
	 */
	public BigDecimal getGrowBounds() {
		return growBounds;
	}
	/**
	 * 设置：购物积分
	 */
	public void setBuyBounds(BigDecimal buyBounds) {
		this.buyBounds = buyBounds;
	}
	/**
	 * 获取：购物积分
	 */
	public BigDecimal getBuyBounds() {
		return buyBounds;
	}
	/**
	 * 设置：优惠生效情况[1111（四个状态位，从右到左）;0 - 无优惠，成长积分是否赠送;1 - 无优惠，购物积分是否赠送;2 - 有优惠，成长积分是否赠送;3 - 有优惠，购物积分是否赠送【状态位0：不赠送，1：赠送】]
	 */
	public void setWork(Integer work) {
		this.work = work;
	}
	/**
	 * 获取：优惠生效情况[1111（四个状态位，从右到左）;0 - 无优惠，成长积分是否赠送;1 - 无优惠，购物积分是否赠送;2 - 有优惠，成长积分是否赠送;3 - 有优惠，购物积分是否赠送【状态位0：不赠送，1：赠送】]
	 */
	public Integer getWork() {
		return work;
	}
}

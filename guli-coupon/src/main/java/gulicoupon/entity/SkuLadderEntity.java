package gulicoupon.entity;
import java.math.BigDecimal;

import java.io.Serializable;
import java.util.Date;



/**
 * 商品阶梯价格
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
public class SkuLadderEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//spu_id
	private Long skuId;
	//满几件
	private Integer fullCount;
	//打几折
	private BigDecimal discount;
	//是否叠加其他优惠[0-不可叠加，1-可叠加]
	private Integer addOther;

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
	 * 设置：spu_id
	 */
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}
	/**
	 * 获取：spu_id
	 */
	public Long getSkuId() {
		return skuId;
	}
	/**
	 * 设置：满几件
	 */
	public void setFullCount(Integer fullCount) {
		this.fullCount = fullCount;
	}
	/**
	 * 获取：满几件
	 */
	public Integer getFullCount() {
		return fullCount;
	}
	/**
	 * 设置：打几折
	 */
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
	/**
	 * 获取：打几折
	 */
	public BigDecimal getDiscount() {
		return discount;
	}
	/**
	 * 设置：是否叠加其他优惠[0-不可叠加，1-可叠加]
	 */
	public void setAddOther(Integer addOther) {
		this.addOther = addOther;
	}
	/**
	 * 获取：是否叠加其他优惠[0-不可叠加，1-可叠加]
	 */
	public Integer getAddOther() {
		return addOther;
	}
}

package gulicoupon.entity;
import java.math.BigDecimal;

import java.io.Serializable;
import java.util.Date;



/**
 * 商品会员价格
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
public class MemberPriceEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//sku_id
	private Long skuId;
	//会员等级id
	private Long memberLevelId;
	//会员等级名
	private String memberLevelName;
	//会员对应价格
	private BigDecimal memberPrice;
	//可否叠加其他优惠[0-不可叠加优惠，1-可叠加]
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
	 * 设置：sku_id
	 */
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}
	/**
	 * 获取：sku_id
	 */
	public Long getSkuId() {
		return skuId;
	}
	/**
	 * 设置：会员等级id
	 */
	public void setMemberLevelId(Long memberLevelId) {
		this.memberLevelId = memberLevelId;
	}
	/**
	 * 获取：会员等级id
	 */
	public Long getMemberLevelId() {
		return memberLevelId;
	}
	/**
	 * 设置：会员等级名
	 */
	public void setMemberLevelName(String memberLevelName) {
		this.memberLevelName = memberLevelName;
	}
	/**
	 * 获取：会员等级名
	 */
	public String getMemberLevelName() {
		return memberLevelName;
	}
	/**
	 * 设置：会员对应价格
	 */
	public void setMemberPrice(BigDecimal memberPrice) {
		this.memberPrice = memberPrice;
	}
	/**
	 * 获取：会员对应价格
	 */
	public BigDecimal getMemberPrice() {
		return memberPrice;
	}
	/**
	 * 设置：可否叠加其他优惠[0-不可叠加优惠，1-可叠加]
	 */
	public void setAddOther(Integer addOther) {
		this.addOther = addOther;
	}
	/**
	 * 获取：可否叠加其他优惠[0-不可叠加优惠，1-可叠加]
	 */
	public Integer getAddOther() {
		return addOther;
	}
}

package gulicoupon.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 优惠券领取历史记录
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
public class CouponHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//优惠券id
	private Long couponId;
	//会员id
	private Long memberId;
	//会员名字
	private String memberNickName;
	//获取方式[0->后台赠送；1->主动领取]
	private Integer getType;
	//创建时间
	private Date createTime;
	//使用状态[0->未使用；1->已使用；2->已过期]
	private Integer useType;
	//使用时间
	private Date useTime;
	//订单id
	private Long orderId;
	//订单号
	private Long orderSn;

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
	 * 设置：会员id
	 */
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	/**
	 * 获取：会员id
	 */
	public Long getMemberId() {
		return memberId;
	}
	/**
	 * 设置：会员名字
	 */
	public void setMemberNickName(String memberNickName) {
		this.memberNickName = memberNickName;
	}
	/**
	 * 获取：会员名字
	 */
	public String getMemberNickName() {
		return memberNickName;
	}
	/**
	 * 设置：获取方式[0->后台赠送；1->主动领取]
	 */
	public void setGetType(Integer getType) {
		this.getType = getType;
	}
	/**
	 * 获取：获取方式[0->后台赠送；1->主动领取]
	 */
	public Integer getGetType() {
		return getType;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：使用状态[0->未使用；1->已使用；2->已过期]
	 */
	public void setUseType(Integer useType) {
		this.useType = useType;
	}
	/**
	 * 获取：使用状态[0->未使用；1->已使用；2->已过期]
	 */
	public Integer getUseType() {
		return useType;
	}
	/**
	 * 设置：使用时间
	 */
	public void setUseTime(Date useTime) {
		this.useTime = useTime;
	}
	/**
	 * 获取：使用时间
	 */
	public Date getUseTime() {
		return useTime;
	}
	/**
	 * 设置：订单id
	 */
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	/**
	 * 获取：订单id
	 */
	public Long getOrderId() {
		return orderId;
	}
	/**
	 * 设置：订单号
	 */
	public void setOrderSn(Long orderSn) {
		this.orderSn = orderSn;
	}
	/**
	 * 获取：订单号
	 */
	public Long getOrderSn() {
		return orderSn;
	}
}

package gulicoupon.entity;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;



/**
 * 优惠券信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
public class CouponEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//优惠卷类型[0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券]
	private Integer couponType;
	//优惠券图片
	private String couponImg;
	//优惠卷名字
	private String couponName;
	//数量
	private Integer num;
	//金额
	private BigDecimal amount;
	//每人限领张数
	private Integer perLimit;
	//使用门槛
	private BigDecimal minPoint;
	//开始时间
	private Date startTime;
	//结束时间
	private Date endTime;
	//使用类型[0->全场通用；1->指定分类；2->指定商品]
	private Integer useType;
	//备注
	private String note;
	//发行数量
	private Integer publishCount;
	//已使用数量
	private Integer useCount;
	//领取数量
	private Integer receiveCount;
	//可以领取的开始日期
	private Date enableStartTime;
	//可以领取的结束日期
	private Date enableEndTime;
	//优惠码
	private String code;
	//可以领取的会员等级[0->不限等级，其他-对应等级]
	private Integer memberLevel;
	//发布状态[0-未发布，1-已发布]
	private Integer publish;

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
	 * 设置：优惠卷类型[0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券]
	 */
	public void setCouponType(Integer couponType) {
		this.couponType = couponType;
	}
	/**
	 * 获取：优惠卷类型[0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券]
	 */
	public Integer getCouponType() {
		return couponType;
	}
	/**
	 * 设置：优惠券图片
	 */
	public void setCouponImg(String couponImg) {
		this.couponImg = couponImg;
	}
	/**
	 * 获取：优惠券图片
	 */
	public String getCouponImg() {
		return couponImg;
	}
	/**
	 * 设置：优惠卷名字
	 */
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}
	/**
	 * 获取：优惠卷名字
	 */
	public String getCouponName() {
		return couponName;
	}
	/**
	 * 设置：数量
	 */
	public void setNum(Integer num) {
		this.num = num;
	}
	/**
	 * 获取：数量
	 */
	public Integer getNum() {
		return num;
	}
	/**
	 * 设置：金额
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	/**
	 * 获取：金额
	 */
	public BigDecimal getAmount() {
		return amount;
	}
	/**
	 * 设置：每人限领张数
	 */
	public void setPerLimit(Integer perLimit) {
		this.perLimit = perLimit;
	}
	/**
	 * 获取：每人限领张数
	 */
	public Integer getPerLimit() {
		return perLimit;
	}
	/**
	 * 设置：使用门槛
	 */
	public void setMinPoint(BigDecimal minPoint) {
		this.minPoint = minPoint;
	}
	/**
	 * 获取：使用门槛
	 */
	public BigDecimal getMinPoint() {
		return minPoint;
	}
	/**
	 * 设置：开始时间
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	/**
	 * 获取：开始时间
	 */
	public Date getStartTime() {
		return startTime;
	}
	/**
	 * 设置：结束时间
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	/**
	 * 获取：结束时间
	 */
	public Date getEndTime() {
		return endTime;
	}
	/**
	 * 设置：使用类型[0->全场通用；1->指定分类；2->指定商品]
	 */
	public void setUseType(Integer useType) {
		this.useType = useType;
	}
	/**
	 * 获取：使用类型[0->全场通用；1->指定分类；2->指定商品]
	 */
	public Integer getUseType() {
		return useType;
	}
	/**
	 * 设置：备注
	 */
	public void setNote(String note) {
		this.note = note;
	}
	/**
	 * 获取：备注
	 */
	public String getNote() {
		return note;
	}
	/**
	 * 设置：发行数量
	 */
	public void setPublishCount(Integer publishCount) {
		this.publishCount = publishCount;
	}
	/**
	 * 获取：发行数量
	 */
	public Integer getPublishCount() {
		return publishCount;
	}
	/**
	 * 设置：已使用数量
	 */
	public void setUseCount(Integer useCount) {
		this.useCount = useCount;
	}
	/**
	 * 获取：已使用数量
	 */
	public Integer getUseCount() {
		return useCount;
	}
	/**
	 * 设置：领取数量
	 */
	public void setReceiveCount(Integer receiveCount) {
		this.receiveCount = receiveCount;
	}
	/**
	 * 获取：领取数量
	 */
	public Integer getReceiveCount() {
		return receiveCount;
	}
	/**
	 * 设置：可以领取的开始日期
	 */
	public void setEnableStartTime(Date enableStartTime) {
		this.enableStartTime = enableStartTime;
	}
	/**
	 * 获取：可以领取的开始日期
	 */
	public Date getEnableStartTime() {
		return enableStartTime;
	}
	/**
	 * 设置：可以领取的结束日期
	 */
	public void setEnableEndTime(Date enableEndTime) {
		this.enableEndTime = enableEndTime;
	}
	/**
	 * 获取：可以领取的结束日期
	 */
	public Date getEnableEndTime() {
		return enableEndTime;
	}
	/**
	 * 设置：优惠码
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * 获取：优惠码
	 */
	public String getCode() {
		return code;
	}
	/**
	 * 设置：可以领取的会员等级[0->不限等级，其他-对应等级]
	 */
	public void setMemberLevel(Integer memberLevel) {
		this.memberLevel = memberLevel;
	}
	/**
	 * 获取：可以领取的会员等级[0->不限等级，其他-对应等级]
	 */
	public Integer getMemberLevel() {
		return memberLevel;
	}
	/**
	 * 设置：发布状态[0-未发布，1-已发布]
	 */
	public void setPublish(Integer publish) {
		this.publish = publish;
	}
	/**
	 * 获取：发布状态[0-未发布，1-已发布]
	 */
	public Integer getPublish() {
		return publish;
	}
}

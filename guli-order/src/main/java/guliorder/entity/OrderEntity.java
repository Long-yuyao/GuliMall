package guliorder.entity;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;



/**
 * 订单
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
public class OrderEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//member_id
	private Long userId;
	//订单号
	private String orderSn;
	//使用的优惠券
	private Long couponId;
	//创建时间
	private Date createTime;
	//用户名
	private String username;
	//订单总额
	private BigDecimal totalAmount;
	//应付总额
	private BigDecimal payAmount;
	//运费金额
	private BigDecimal freightAmount;
	//促销优化金额（促销价、满减、阶梯价）
	private BigDecimal promotionAmount;
	//积分抵扣金额
	private BigDecimal integrationAmount;
	//优惠券抵扣金额
	private BigDecimal couponAmount;
	//后台调整订单使用的折扣金额
	private BigDecimal discountAmount;
	//支付方式【1->支付宝；2->微信；3->银联； 4->货到付款；】
	private Integer payType;
	//订单来源[0->PC订单；1->app订单]
	private Integer sourceType;
	//订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】
	private Integer status;
	//物流公司(配送方式)
	private String deliveryCompany;
	//物流单号
	private String deliverySn;
	//自动确认时间（天）
	private Integer autoConfirmDay;
	//可以获得的积分
	private Integer integration;
	//可以获得的成长值
	private Integer growth;
	//发票类型[0->不开发票；1->电子发票；2->纸质发票]
	private Integer billType;
	//发票抬头
	private String billHeader;
	//发票内容
	private String billContent;
	//收票人电话
	private String billReceiverPhone;
	//收票人邮箱
	private String billReceiverEmail;
	//收货人姓名
	private String receiverName;
	//收货人电话
	private String receiverPhone;
	//收货人邮编
	private String receiverPostCode;
	//省份/直辖市
	private String receiverProvince;
	//城市
	private String receiverCity;
	//区
	private String receiverRegion;
	//详细地址
	private String receiverAddress;
	//确认收货状态[0->未确认；1->已确认]
	private Integer confirmStatus;
	//删除状态【0->未删除；1->已删除】
	private Integer deleteStatus;
	//下单时使用的积分
	private Integer useIntegration;
	//支付时间
	private Date paymentTime;
	//发货时间
	private Date deliveryTime;
	//确认收货时间
	private Date receiveTime;
	//评价时间
	private Date commentTime;
	//修改时间
	private Date modifyTime;
	//订单备注
	private String remark;

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
	 * 设置：member_id
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：member_id
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * 设置：订单号
	 */
	public void setOrderSn(String orderSn) {
		this.orderSn = orderSn;
	}
	/**
	 * 获取：订单号
	 */
	public String getOrderSn() {
		return orderSn;
	}
	/**
	 * 设置：使用的优惠券
	 */
	public void setCouponId(Long couponId) {
		this.couponId = couponId;
	}
	/**
	 * 获取：使用的优惠券
	 */
	public Long getCouponId() {
		return couponId;
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
	 * 设置：用户名
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * 获取：用户名
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * 设置：订单总额
	 */
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	/**
	 * 获取：订单总额
	 */
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	/**
	 * 设置：应付总额
	 */
	public void setPayAmount(BigDecimal payAmount) {
		this.payAmount = payAmount;
	}
	/**
	 * 获取：应付总额
	 */
	public BigDecimal getPayAmount() {
		return payAmount;
	}
	/**
	 * 设置：运费金额
	 */
	public void setFreightAmount(BigDecimal freightAmount) {
		this.freightAmount = freightAmount;
	}
	/**
	 * 获取：运费金额
	 */
	public BigDecimal getFreightAmount() {
		return freightAmount;
	}
	/**
	 * 设置：促销优化金额（促销价、满减、阶梯价）
	 */
	public void setPromotionAmount(BigDecimal promotionAmount) {
		this.promotionAmount = promotionAmount;
	}
	/**
	 * 获取：促销优化金额（促销价、满减、阶梯价）
	 */
	public BigDecimal getPromotionAmount() {
		return promotionAmount;
	}
	/**
	 * 设置：积分抵扣金额
	 */
	public void setIntegrationAmount(BigDecimal integrationAmount) {
		this.integrationAmount = integrationAmount;
	}
	/**
	 * 获取：积分抵扣金额
	 */
	public BigDecimal getIntegrationAmount() {
		return integrationAmount;
	}
	/**
	 * 设置：优惠券抵扣金额
	 */
	public void setCouponAmount(BigDecimal couponAmount) {
		this.couponAmount = couponAmount;
	}
	/**
	 * 获取：优惠券抵扣金额
	 */
	public BigDecimal getCouponAmount() {
		return couponAmount;
	}
	/**
	 * 设置：后台调整订单使用的折扣金额
	 */
	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}
	/**
	 * 获取：后台调整订单使用的折扣金额
	 */
	public BigDecimal getDiscountAmount() {
		return discountAmount;
	}
	/**
	 * 设置：支付方式【1->支付宝；2->微信；3->银联； 4->货到付款；】
	 */
	public void setPayType(Integer payType) {
		this.payType = payType;
	}
	/**
	 * 获取：支付方式【1->支付宝；2->微信；3->银联； 4->货到付款；】
	 */
	public Integer getPayType() {
		return payType;
	}
	/**
	 * 设置：订单来源[0->PC订单；1->app订单]
	 */
	public void setSourceType(Integer sourceType) {
		this.sourceType = sourceType;
	}
	/**
	 * 获取：订单来源[0->PC订单；1->app订单]
	 */
	public Integer getSourceType() {
		return sourceType;
	}
	/**
	 * 设置：订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：物流公司(配送方式)
	 */
	public void setDeliveryCompany(String deliveryCompany) {
		this.deliveryCompany = deliveryCompany;
	}
	/**
	 * 获取：物流公司(配送方式)
	 */
	public String getDeliveryCompany() {
		return deliveryCompany;
	}
	/**
	 * 设置：物流单号
	 */
	public void setDeliverySn(String deliverySn) {
		this.deliverySn = deliverySn;
	}
	/**
	 * 获取：物流单号
	 */
	public String getDeliverySn() {
		return deliverySn;
	}
	/**
	 * 设置：自动确认时间（天）
	 */
	public void setAutoConfirmDay(Integer autoConfirmDay) {
		this.autoConfirmDay = autoConfirmDay;
	}
	/**
	 * 获取：自动确认时间（天）
	 */
	public Integer getAutoConfirmDay() {
		return autoConfirmDay;
	}
	/**
	 * 设置：可以获得的积分
	 */
	public void setIntegration(Integer integration) {
		this.integration = integration;
	}
	/**
	 * 获取：可以获得的积分
	 */
	public Integer getIntegration() {
		return integration;
	}
	/**
	 * 设置：可以获得的成长值
	 */
	public void setGrowth(Integer growth) {
		this.growth = growth;
	}
	/**
	 * 获取：可以获得的成长值
	 */
	public Integer getGrowth() {
		return growth;
	}
	/**
	 * 设置：发票类型[0->不开发票；1->电子发票；2->纸质发票]
	 */
	public void setBillType(Integer billType) {
		this.billType = billType;
	}
	/**
	 * 获取：发票类型[0->不开发票；1->电子发票；2->纸质发票]
	 */
	public Integer getBillType() {
		return billType;
	}
	/**
	 * 设置：发票抬头
	 */
	public void setBillHeader(String billHeader) {
		this.billHeader = billHeader;
	}
	/**
	 * 获取：发票抬头
	 */
	public String getBillHeader() {
		return billHeader;
	}
	/**
	 * 设置：发票内容
	 */
	public void setBillContent(String billContent) {
		this.billContent = billContent;
	}
	/**
	 * 获取：发票内容
	 */
	public String getBillContent() {
		return billContent;
	}
	/**
	 * 设置：收票人电话
	 */
	public void setBillReceiverPhone(String billReceiverPhone) {
		this.billReceiverPhone = billReceiverPhone;
	}
	/**
	 * 获取：收票人电话
	 */
	public String getBillReceiverPhone() {
		return billReceiverPhone;
	}
	/**
	 * 设置：收票人邮箱
	 */
	public void setBillReceiverEmail(String billReceiverEmail) {
		this.billReceiverEmail = billReceiverEmail;
	}
	/**
	 * 获取：收票人邮箱
	 */
	public String getBillReceiverEmail() {
		return billReceiverEmail;
	}
	/**
	 * 设置：收货人姓名
	 */
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	/**
	 * 获取：收货人姓名
	 */
	public String getReceiverName() {
		return receiverName;
	}
	/**
	 * 设置：收货人电话
	 */
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}
	/**
	 * 获取：收货人电话
	 */
	public String getReceiverPhone() {
		return receiverPhone;
	}
	/**
	 * 设置：收货人邮编
	 */
	public void setReceiverPostCode(String receiverPostCode) {
		this.receiverPostCode = receiverPostCode;
	}
	/**
	 * 获取：收货人邮编
	 */
	public String getReceiverPostCode() {
		return receiverPostCode;
	}
	/**
	 * 设置：省份/直辖市
	 */
	public void setReceiverProvince(String receiverProvince) {
		this.receiverProvince = receiverProvince;
	}
	/**
	 * 获取：省份/直辖市
	 */
	public String getReceiverProvince() {
		return receiverProvince;
	}
	/**
	 * 设置：城市
	 */
	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}
	/**
	 * 获取：城市
	 */
	public String getReceiverCity() {
		return receiverCity;
	}
	/**
	 * 设置：区
	 */
	public void setReceiverRegion(String receiverRegion) {
		this.receiverRegion = receiverRegion;
	}
	/**
	 * 获取：区
	 */
	public String getReceiverRegion() {
		return receiverRegion;
	}
	/**
	 * 设置：详细地址
	 */
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	/**
	 * 获取：详细地址
	 */
	public String getReceiverAddress() {
		return receiverAddress;
	}
	/**
	 * 设置：确认收货状态[0->未确认；1->已确认]
	 */
	public void setConfirmStatus(Integer confirmStatus) {
		this.confirmStatus = confirmStatus;
	}
	/**
	 * 获取：确认收货状态[0->未确认；1->已确认]
	 */
	public Integer getConfirmStatus() {
		return confirmStatus;
	}
	/**
	 * 设置：删除状态【0->未删除；1->已删除】
	 */
	public void setDeleteStatus(Integer deleteStatus) {
		this.deleteStatus = deleteStatus;
	}
	/**
	 * 获取：删除状态【0->未删除；1->已删除】
	 */
	public Integer getDeleteStatus() {
		return deleteStatus;
	}
	/**
	 * 设置：下单时使用的积分
	 */
	public void setUseIntegration(Integer useIntegration) {
		this.useIntegration = useIntegration;
	}
	/**
	 * 获取：下单时使用的积分
	 */
	public Integer getUseIntegration() {
		return useIntegration;
	}
	/**
	 * 设置：支付时间
	 */
	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}
	/**
	 * 获取：支付时间
	 */
	public Date getPaymentTime() {
		return paymentTime;
	}
	/**
	 * 设置：发货时间
	 */
	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	/**
	 * 获取：发货时间
	 */
	public Date getDeliveryTime() {
		return deliveryTime;
	}
	/**
	 * 设置：确认收货时间
	 */
	public void setReceiveTime(Date receiveTime) {
		this.receiveTime = receiveTime;
	}
	/**
	 * 获取：确认收货时间
	 */
	public Date getReceiveTime() {
		return receiveTime;
	}
	/**
	 * 设置：评价时间
	 */
	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}
	/**
	 * 获取：评价时间
	 */
	public Date getCommentTime() {
		return commentTime;
	}
	/**
	 * 设置：修改时间
	 */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	/**
	 * 获取：修改时间
	 */
	public Date getModifyTime() {
		return modifyTime;
	}
	/**
	 * 设置：订单备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：订单备注
	 */
	public String getRemark() {
		return remark;
	}
}

package guliorder.entity;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 支付信息表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
public class PaymentInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//订单号（对外业务号）
	private String orderSn;
	//订单id
	private Long orderId;
	//支付宝交易流水号
	private String alipayTradeNo;
	//支付总金额
	private BigDecimal totalAmount;
	//交易内容
	private String subject;
	//支付状态
	private String paymentStatus;
	//创建时间
	private Date createTime;
	//确认时间
	private Date confirmTime;
	//回调内容
	private String callbackContent;
	//回调时间
	private Date callbackTime;

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
	 * 设置：订单号（对外业务号）
	 */
	public void setOrderSn(String orderSn) {
		this.orderSn = orderSn;
	}
	/**
	 * 获取：订单号（对外业务号）
	 */
	public String getOrderSn() {
		return orderSn;
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
	 * 设置：支付宝交易流水号
	 */
	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}
	/**
	 * 获取：支付宝交易流水号
	 */
	public String getAlipayTradeNo() {
		return alipayTradeNo;
	}
	/**
	 * 设置：支付总金额
	 */
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	/**
	 * 获取：支付总金额
	 */
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	/**
	 * 设置：交易内容
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * 获取：交易内容
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * 设置：支付状态
	 */
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	/**
	 * 获取：支付状态
	 */
	public String getPaymentStatus() {
		return paymentStatus;
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
	 * 设置：确认时间
	 */
	public void setConfirmTime(Date confirmTime) {
		this.confirmTime = confirmTime;
	}
	/**
	 * 获取：确认时间
	 */
	public Date getConfirmTime() {
		return confirmTime;
	}
	/**
	 * 设置：回调内容
	 */
	public void setCallbackContent(String callbackContent) {
		this.callbackContent = callbackContent;
	}
	/**
	 * 获取：回调内容
	 */
	public String getCallbackContent() {
		return callbackContent;
	}
	/**
	 * 设置：回调时间
	 */
	public void setCallbackTime(Date callbackTime) {
		this.callbackTime = callbackTime;
	}
	/**
	 * 获取：回调时间
	 */
	public Date getCallbackTime() {
		return callbackTime;
	}
}

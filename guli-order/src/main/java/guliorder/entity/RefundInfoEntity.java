package guliorder.entity;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 退款信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
public class RefundInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//退款的订单
	private Long orderReturnId;
	//退款金额
	private BigDecimal refund;
	//退款交易流水号
	private String refundSn;
	//退款状态
	private Integer refundStatus;
	//退款渠道[1-支付宝，2-微信，3-银联，4-汇款]
	private Integer refundChannel;
	//
	private String refundContent;

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
	 * 设置：退款的订单
	 */
	public void setOrderReturnId(Long orderReturnId) {
		this.orderReturnId = orderReturnId;
	}
	/**
	 * 获取：退款的订单
	 */
	public Long getOrderReturnId() {
		return orderReturnId;
	}
	/**
	 * 设置：退款金额
	 */
	public void setRefund(BigDecimal refund) {
		this.refund = refund;
	}
	/**
	 * 获取：退款金额
	 */
	public BigDecimal getRefund() {
		return refund;
	}
	/**
	 * 设置：退款交易流水号
	 */
	public void setRefundSn(String refundSn) {
		this.refundSn = refundSn;
	}
	/**
	 * 获取：退款交易流水号
	 */
	public String getRefundSn() {
		return refundSn;
	}
	/**
	 * 设置：退款状态
	 */
	public void setRefundStatus(Integer refundStatus) {
		this.refundStatus = refundStatus;
	}
	/**
	 * 获取：退款状态
	 */
	public Integer getRefundStatus() {
		return refundStatus;
	}
	/**
	 * 设置：退款渠道[1-支付宝，2-微信，3-银联，4-汇款]
	 */
	public void setRefundChannel(Integer refundChannel) {
		this.refundChannel = refundChannel;
	}
	/**
	 * 获取：退款渠道[1-支付宝，2-微信，3-银联，4-汇款]
	 */
	public Integer getRefundChannel() {
		return refundChannel;
	}
	/**
	 * 设置：
	 */
	public void setRefundContent(String refundContent) {
		this.refundContent = refundContent;
	}
	/**
	 * 获取：
	 */
	public String getRefundContent() {
		return refundContent;
	}
}

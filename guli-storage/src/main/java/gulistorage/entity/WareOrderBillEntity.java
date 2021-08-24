package gulistorage.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 库存工作单
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:46:23
 */
public class WareOrderBillEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//order_id
	private Long orderId;
	//order_sn
	private String orderSn;
	//收货人
	private String consignee;
	//收货人电话
	private String consigneeTel;
	//配送地址
	private String deliveryAddress;
	//订单备注
	private String orderComment;
	//付款方式【 1:在线付款 2:货到付款】
	private Integer paymentWay;
	//任务状态
	private Integer taskStatus;
	//订单描述
	private String orderBody;
	//物流单号
	private String trackingNo;
	//create_time
	private Date createTime;
	//仓库id
	private Long wareId;
	//工作单备注
	private String taskComment;

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
	 * 设置：order_id
	 */
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	/**
	 * 获取：order_id
	 */
	public Long getOrderId() {
		return orderId;
	}
	/**
	 * 设置：order_sn
	 */
	public void setOrderSn(String orderSn) {
		this.orderSn = orderSn;
	}
	/**
	 * 获取：order_sn
	 */
	public String getOrderSn() {
		return orderSn;
	}
	/**
	 * 设置：收货人
	 */
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	/**
	 * 获取：收货人
	 */
	public String getConsignee() {
		return consignee;
	}
	/**
	 * 设置：收货人电话
	 */
	public void setConsigneeTel(String consigneeTel) {
		this.consigneeTel = consigneeTel;
	}
	/**
	 * 获取：收货人电话
	 */
	public String getConsigneeTel() {
		return consigneeTel;
	}
	/**
	 * 设置：配送地址
	 */
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	/**
	 * 获取：配送地址
	 */
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	/**
	 * 设置：订单备注
	 */
	public void setOrderComment(String orderComment) {
		this.orderComment = orderComment;
	}
	/**
	 * 获取：订单备注
	 */
	public String getOrderComment() {
		return orderComment;
	}
	/**
	 * 设置：付款方式【 1:在线付款 2:货到付款】
	 */
	public void setPaymentWay(Integer paymentWay) {
		this.paymentWay = paymentWay;
	}
	/**
	 * 获取：付款方式【 1:在线付款 2:货到付款】
	 */
	public Integer getPaymentWay() {
		return paymentWay;
	}
	/**
	 * 设置：任务状态
	 */
	public void setTaskStatus(Integer taskStatus) {
		this.taskStatus = taskStatus;
	}
	/**
	 * 获取：任务状态
	 */
	public Integer getTaskStatus() {
		return taskStatus;
	}
	/**
	 * 设置：订单描述
	 */
	public void setOrderBody(String orderBody) {
		this.orderBody = orderBody;
	}
	/**
	 * 获取：订单描述
	 */
	public String getOrderBody() {
		return orderBody;
	}
	/**
	 * 设置：物流单号
	 */
	public void setTrackingNo(String trackingNo) {
		this.trackingNo = trackingNo;
	}
	/**
	 * 获取：物流单号
	 */
	public String getTrackingNo() {
		return trackingNo;
	}
	/**
	 * 设置：create_time
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：create_time
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：仓库id
	 */
	public void setWareId(Long wareId) {
		this.wareId = wareId;
	}
	/**
	 * 获取：仓库id
	 */
	public Long getWareId() {
		return wareId;
	}
	/**
	 * 设置：工作单备注
	 */
	public void setTaskComment(String taskComment) {
		this.taskComment = taskComment;
	}
	/**
	 * 获取：工作单备注
	 */
	public String getTaskComment() {
		return taskComment;
	}
}

package guliorder.entity;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;



/**
 * 订单操作历史记录
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
public class OrderOperateHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//订单id
	private Long orderId;
	//操作人[用户；系统；后台管理员]
	private String operateMan;
	//操作时间
	private Date createTime;
	//订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】
	private Integer orderStatus;
	//备注
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
	 * 设置：操作人[用户；系统；后台管理员]
	 */
	public void setOperateMan(String operateMan) {
		this.operateMan = operateMan;
	}
	/**
	 * 获取：操作人[用户；系统；后台管理员]
	 */
	public String getOperateMan() {
		return operateMan;
	}
	/**
	 * 设置：操作时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：操作时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】
	 */
	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}
	/**
	 * 获取：订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】
	 */
	public Integer getOrderStatus() {
		return orderStatus;
	}
	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：备注
	 */
	public String getRemark() {
		return remark;
	}
}

package gulistorage.entity;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;



/**
 * 采购信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:46:23
 */
public class PurchaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//采购单id
	private Long id;
	//采购人id
	private Long assigneeId;
	//采购人名
	private String assigneeName;
	//联系方式
	private String phone;
	//优先级
	private Integer priority;
	//状态
	private Integer status;
	//仓库id
	private Long wareId;
	//总金额
	private BigDecimal amount;
	//创建日期
	private Date createTime;
	//更新日期
	private Date updateTime;

	/**
	 * 设置：采购单id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：采购单id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：采购人id
	 */
	public void setAssigneeId(Long assigneeId) {
		this.assigneeId = assigneeId;
	}
	/**
	 * 获取：采购人id
	 */
	public Long getAssigneeId() {
		return assigneeId;
	}
	/**
	 * 设置：采购人名
	 */
	public void setAssigneeName(String assigneeName) {
		this.assigneeName = assigneeName;
	}
	/**
	 * 获取：采购人名
	 */
	public String getAssigneeName() {
		return assigneeName;
	}
	/**
	 * 设置：联系方式
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：联系方式
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：优先级
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	/**
	 * 获取：优先级
	 */
	public Integer getPriority() {
		return priority;
	}
	/**
	 * 设置：状态
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态
	 */
	public Integer getStatus() {
		return status;
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
	 * 设置：总金额
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	/**
	 * 获取：总金额
	 */
	public BigDecimal getAmount() {
		return amount;
	}
	/**
	 * 设置：创建日期
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建日期
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：更新日期
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：更新日期
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
}

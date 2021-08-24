package gulicoupon.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 秒杀活动场次
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
public class SeckillSessionEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//场次名称
	private String name;
	//每日开始时间
	private Date startTime;
	//每日结束时间
	private Date endTime;
	//启用状态
	private Integer status;
	//创建时间
	private Date createTime;

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
	 * 设置：场次名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：场次名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：每日开始时间
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	/**
	 * 获取：每日开始时间
	 */
	public Date getStartTime() {
		return startTime;
	}
	/**
	 * 设置：每日结束时间
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	/**
	 * 获取：每日结束时间
	 */
	public Date getEndTime() {
		return endTime;
	}
	/**
	 * 设置：启用状态
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：启用状态
	 */
	public Integer getStatus() {
		return status;
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
}

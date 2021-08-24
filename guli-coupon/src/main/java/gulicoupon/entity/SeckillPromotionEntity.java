package gulicoupon.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 秒杀活动
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
public class SeckillPromotionEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//活动标题
	private String title;
	//开始日期
	private Date startTime;
	//结束日期
	private Date endTime;
	//上下线状态
	private Integer status;
	//创建时间
	private Date createTime;
	//创建人
	private Long userId;

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
	 * 设置：活动标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：活动标题
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：开始日期
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	/**
	 * 获取：开始日期
	 */
	public Date getStartTime() {
		return startTime;
	}
	/**
	 * 设置：结束日期
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	/**
	 * 获取：结束日期
	 */
	public Date getEndTime() {
		return endTime;
	}
	/**
	 * 设置：上下线状态
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：上下线状态
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
	/**
	 * 设置：创建人
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：创建人
	 */
	public Long getUserId() {
		return userId;
	}
}

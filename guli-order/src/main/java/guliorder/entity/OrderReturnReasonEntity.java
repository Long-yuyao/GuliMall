package guliorder.entity;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;



/**
 * 退货原因
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
public class OrderReturnReasonEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//退货原因名
	private String name;
	//排序
	private Integer sort;
	//启用状态
	private Integer status;
	//create_time
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
	 * 设置：退货原因名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：退货原因名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：排序
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	/**
	 * 获取：排序
	 */
	public Integer getSort() {
		return sort;
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
}

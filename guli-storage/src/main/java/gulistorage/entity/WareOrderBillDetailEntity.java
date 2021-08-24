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
public class WareOrderBillDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//sku_id
	private Long skuId;
	//sku_name
	private String skuName;
	//购买个数
	private Integer skuNum;
	//工作单id
	private Long taskId;

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
	 * 设置：sku_id
	 */
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}
	/**
	 * 获取：sku_id
	 */
	public Long getSkuId() {
		return skuId;
	}
	/**
	 * 设置：sku_name
	 */
	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}
	/**
	 * 获取：sku_name
	 */
	public String getSkuName() {
		return skuName;
	}
	/**
	 * 设置：购买个数
	 */
	public void setSkuNum(Integer skuNum) {
		this.skuNum = skuNum;
	}
	/**
	 * 获取：购买个数
	 */
	public Integer getSkuNum() {
		return skuNum;
	}
	/**
	 * 设置：工作单id
	 */
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}
	/**
	 * 获取：工作单id
	 */
	public Long getTaskId() {
		return taskId;
	}
}

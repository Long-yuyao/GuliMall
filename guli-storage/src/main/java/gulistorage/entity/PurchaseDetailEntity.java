package gulistorage.entity;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;



/**
 * 
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:46:23
 */
public class PurchaseDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long id;
	//采购单id
	private Long purchaseId;
	//采购商品id
	private Long skuId;
	//采购数量
	private Integer skuNum;
	//采购金额
	private BigDecimal skuPrice;
	//仓库id
	private Long wareId;
	//状态[0新建，1已分配，2正在采购，3已完成，4采购失败]
	private Integer status;

	/**
	 * 设置：
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：采购单id
	 */
	public void setPurchaseId(Long purchaseId) {
		this.purchaseId = purchaseId;
	}
	/**
	 * 获取：采购单id
	 */
	public Long getPurchaseId() {
		return purchaseId;
	}
	/**
	 * 设置：采购商品id
	 */
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}
	/**
	 * 获取：采购商品id
	 */
	public Long getSkuId() {
		return skuId;
	}
	/**
	 * 设置：采购数量
	 */
	public void setSkuNum(Integer skuNum) {
		this.skuNum = skuNum;
	}
	/**
	 * 获取：采购数量
	 */
	public Integer getSkuNum() {
		return skuNum;
	}
	/**
	 * 设置：采购金额
	 */
	public void setSkuPrice(BigDecimal skuPrice) {
		this.skuPrice = skuPrice;
	}
	/**
	 * 获取：采购金额
	 */
	public BigDecimal getSkuPrice() {
		return skuPrice;
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
	 * 设置：状态[0新建，1已分配，2正在采购，3已完成，4采购失败]
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态[0新建，1已分配，2正在采购，3已完成，4采购失败]
	 */
	public Integer getStatus() {
		return status;
	}
}

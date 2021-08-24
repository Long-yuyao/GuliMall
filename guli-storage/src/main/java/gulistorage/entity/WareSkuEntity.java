package gulistorage.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 商品库存
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:46:23
 */
public class WareSkuEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//sku_id
	private Long skuId;
	//仓库id
	private Long wareId;
	//库存数
	private Integer stock;
	//sku_name
	private String skuName;
	//锁定库存
	private Integer stockLocked;
	//销量
	private Long sales;

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
	 * 设置：库存数
	 */
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	/**
	 * 获取：库存数
	 */
	public Integer getStock() {
		return stock;
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
	 * 设置：锁定库存
	 */
	public void setStockLocked(Integer stockLocked) {
		this.stockLocked = stockLocked;
	}
	/**
	 * 获取：锁定库存
	 */
	public Integer getStockLocked() {
		return stockLocked;
	}
	/**
	 * 设置：销量
	 */
	public void setSales(Long sales) {
		this.sales = sales;
	}
	/**
	 * 获取：销量
	 */
	public Long getSales() {
		return sales;
	}
}

package com.yuyao.guliproduct.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * sku销售属性&值
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
public class SkuAttrValueEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//sku_id
	private Long skuId;
	//attr_id
	private Long attrId;
	//销售属性名
	private String attrName;
	//销售属性值
	private String attrValue;
	//顺序
	private Integer sort;

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
	 * 设置：attr_id
	 */
	public void setAttrId(Long attrId) {
		this.attrId = attrId;
	}
	/**
	 * 获取：attr_id
	 */
	public Long getAttrId() {
		return attrId;
	}
	/**
	 * 设置：销售属性名
	 */
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}
	/**
	 * 获取：销售属性名
	 */
	public String getAttrName() {
		return attrName;
	}
	/**
	 * 设置：销售属性值
	 */
	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}
	/**
	 * 获取：销售属性值
	 */
	public String getAttrValue() {
		return attrValue;
	}
	/**
	 * 设置：顺序
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	/**
	 * 获取：顺序
	 */
	public Integer getSort() {
		return sort;
	}
}

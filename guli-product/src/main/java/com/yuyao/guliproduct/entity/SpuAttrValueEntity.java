package com.yuyao.guliproduct.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * spu属性值
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
public class SpuAttrValueEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//商品id
	private Long spuId;
	//属性id
	private Long attrId;
	//属性名
	private String attrName;
	//属性值
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
	 * 设置：商品id
	 */
	public void setSpuId(Long spuId) {
		this.spuId = spuId;
	}
	/**
	 * 获取：商品id
	 */
	public Long getSpuId() {
		return spuId;
	}
	/**
	 * 设置：属性id
	 */
	public void setAttrId(Long attrId) {
		this.attrId = attrId;
	}
	/**
	 * 获取：属性id
	 */
	public Long getAttrId() {
		return attrId;
	}
	/**
	 * 设置：属性名
	 */
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}
	/**
	 * 获取：属性名
	 */
	public String getAttrName() {
		return attrName;
	}
	/**
	 * 设置：属性值
	 */
	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}
	/**
	 * 获取：属性值
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

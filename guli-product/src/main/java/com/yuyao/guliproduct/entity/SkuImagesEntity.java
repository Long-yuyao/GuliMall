package com.yuyao.guliproduct.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * sku图片
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
public class SkuImagesEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//sku_id
	private Long skuId;
	//图片地址
	private String url;
	//排序
	private Integer sort;
	//默认图[0 - 不是默认图，1 - 是默认图]
	private Integer defaultStatus;

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
	 * 设置：图片地址
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * 获取：图片地址
	 */
	public String getUrl() {
		return url;
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
	 * 设置：默认图[0 - 不是默认图，1 - 是默认图]
	 */
	public void setDefaultStatus(Integer defaultStatus) {
		this.defaultStatus = defaultStatus;
	}
	/**
	 * 获取：默认图[0 - 不是默认图，1 - 是默认图]
	 */
	public Integer getDefaultStatus() {
		return defaultStatus;
	}
}

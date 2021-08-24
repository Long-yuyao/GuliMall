package com.yuyao.guliproduct.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 品牌分类关联
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
public class CategoryBrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long id;
	//品牌id
	private Long brandId;
	//分类id
	private Long categoryId;
	//品牌名称
	private String brandName;
	//分类名称
	private String categoryName;

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
	 * 设置：品牌id
	 */
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}
	/**
	 * 获取：品牌id
	 */
	public Long getBrandId() {
		return brandId;
	}
	/**
	 * 设置：分类id
	 */
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * 获取：分类id
	 */
	public Long getCategoryId() {
		return categoryId;
	}
	/**
	 * 设置：品牌名称
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	/**
	 * 获取：品牌名称
	 */
	public String getBrandName() {
		return brandName;
	}
	/**
	 * 设置：分类名称
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	/**
	 * 获取：分类名称
	 */
	public String getCategoryName() {
		return categoryName;
	}
}

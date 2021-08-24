package com.yuyao.guliproduct.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 商品三级分类
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
public class CategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//分类id
	private Long id;
	//分类名称
	private String name;
	//父分类id
	private Long parentId;
	//是否显示[0-不显示，1显示]
	private Integer status;
	//排序
	private Integer sort;
	//图标地址
	private String icon;
	//计量单位
	private String unit;

	/**
	 * 设置：分类id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：分类id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：分类名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：分类名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：父分类id
	 */
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：父分类id
	 */
	public Long getParentId() {
		return parentId;
	}
	/**
	 * 设置：是否显示[0-不显示，1显示]
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：是否显示[0-不显示，1显示]
	 */
	public Integer getStatus() {
		return status;
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
	 * 设置：图标地址
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}
	/**
	 * 获取：图标地址
	 */
	public String getIcon() {
		return icon;
	}
	/**
	 * 设置：计量单位
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	/**
	 * 获取：计量单位
	 */
	public String getUnit() {
		return unit;
	}
}

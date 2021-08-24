package com.yuyao.guliproduct.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 属性分组
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
public class AttrGroupEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//分组id
	private Long id;
	//组名
	private String name;
	//排序
	private Integer sort;
	//组图标
	private String icon;
	//所属分类id
	private Long categoryId;
	//备注
	private String remark;

	/**
	 * 设置：分组id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：分组id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：组名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：组名
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
	 * 设置：组图标
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}
	/**
	 * 获取：组图标
	 */
	public String getIcon() {
		return icon;
	}
	/**
	 * 设置：所属分类id
	 */
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * 获取：所属分类id
	 */
	public Long getCategoryId() {
		return categoryId;
	}
	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：备注
	 */
	public String getRemark() {
		return remark;
	}
}

package com.yuyao.guliproduct.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 商品属性
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
public class AttrEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//属性id
	private Long id;
	//属性名
	private String name;
	//是否需要检索[0-不需要，1-需要]
	private Integer searchType;
	//属性图标
	private String icon;
	//可选值列表[用逗号分隔]
	private String valueSelect;
	//属性类型[0-销售属性，1-基本属性，2-既是销售属性又是基本属性]
	private Integer type;
	//启用状态[0 - 禁用，1 - 启用]
	private Long enable;
	//快速展示【是否展示在介绍上；0-否 1-是】，在sku中仍然可以调整
	private Integer showDesc;
	//所属分类
	private Long categoryId;
	//规格分组id
	private Long groupId;

	/**
	 * 设置：属性id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：属性id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：属性名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：属性名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：是否需要检索[0-不需要，1-需要]
	 */
	public void setSearchType(Integer searchType) {
		this.searchType = searchType;
	}
	/**
	 * 获取：是否需要检索[0-不需要，1-需要]
	 */
	public Integer getSearchType() {
		return searchType;
	}
	/**
	 * 设置：属性图标
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}
	/**
	 * 获取：属性图标
	 */
	public String getIcon() {
		return icon;
	}
	/**
	 * 设置：可选值列表[用逗号分隔]
	 */
	public void setValueSelect(String valueSelect) {
		this.valueSelect = valueSelect;
	}
	/**
	 * 获取：可选值列表[用逗号分隔]
	 */
	public String getValueSelect() {
		return valueSelect;
	}
	/**
	 * 设置：属性类型[0-销售属性，1-基本属性，2-既是销售属性又是基本属性]
	 */
	public void setType(Integer type) {
		this.type = type;
	}
	/**
	 * 获取：属性类型[0-销售属性，1-基本属性，2-既是销售属性又是基本属性]
	 */
	public Integer getType() {
		return type;
	}
	/**
	 * 设置：启用状态[0 - 禁用，1 - 启用]
	 */
	public void setEnable(Long enable) {
		this.enable = enable;
	}
	/**
	 * 获取：启用状态[0 - 禁用，1 - 启用]
	 */
	public Long getEnable() {
		return enable;
	}
	/**
	 * 设置：快速展示【是否展示在介绍上；0-否 1-是】，在sku中仍然可以调整
	 */
	public void setShowDesc(Integer showDesc) {
		this.showDesc = showDesc;
	}
	/**
	 * 获取：快速展示【是否展示在介绍上；0-否 1-是】，在sku中仍然可以调整
	 */
	public Integer getShowDesc() {
		return showDesc;
	}
	/**
	 * 设置：所属分类
	 */
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * 获取：所属分类
	 */
	public Long getCategoryId() {
		return categoryId;
	}
	/**
	 * 设置：规格分组id
	 */
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	/**
	 * 获取：规格分组id
	 */
	public Long getGroupId() {
		return groupId;
	}
}

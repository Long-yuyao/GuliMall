package com.yuyao.guliproduct.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 品牌
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//品牌id
	private Long id;
	//品牌名
	private String name;
	//品牌logo
	private String logo;
	//显示状态[0-不显示；1-显示]
	private Integer status;
	//检索首字母
	private String firstLetter;
	//排序
	private Integer sort;
	//备注
	private String remark;

	/**
	 * 设置：品牌id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：品牌id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：品牌名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：品牌名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：品牌logo
	 */
	public void setLogo(String logo) {
		this.logo = logo;
	}
	/**
	 * 获取：品牌logo
	 */
	public String getLogo() {
		return logo;
	}
	/**
	 * 设置：显示状态[0-不显示；1-显示]
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：显示状态[0-不显示；1-显示]
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：检索首字母
	 */
	public void setFirstLetter(String firstLetter) {
		this.firstLetter = firstLetter;
	}
	/**
	 * 获取：检索首字母
	 */
	public String getFirstLetter() {
		return firstLetter;
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

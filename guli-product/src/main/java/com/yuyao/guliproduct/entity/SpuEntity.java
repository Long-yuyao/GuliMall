package com.yuyao.guliproduct.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * spu信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
public class SpuEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//商品id
	private Long id;
	//商品名称
	private String name;
	//所属分类id
	private Long categoryId;
	//品牌id
	private Long brandId;
	//上架状态[0 - 下架，1 - 上架]
	private Integer publishStatus;
	//创建时间
	private Date createTime;
	//更新时间
	private Date updateTime;

	/**
	 * 设置：商品id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：商品id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：商品名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：商品名称
	 */
	public String getName() {
		return name;
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
	 * 设置：上架状态[0 - 下架，1 - 上架]
	 */
	public void setPublishStatus(Integer publishStatus) {
		this.publishStatus = publishStatus;
	}
	/**
	 * 获取：上架状态[0 - 下架，1 - 上架]
	 */
	public Integer getPublishStatus() {
		return publishStatus;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
}

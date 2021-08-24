package com.yuyao.guliproduct.entity;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * sku信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
public class SkuEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//skuId
	private Long id;
	//spuId
	private Long spuId;
	//sku名称
	private String name;
	//所属分类id
	private Long catagoryId;
	//品牌id
	private Long brandId;
	//默认图片
	private String defaultImage;
	//标题
	private String title;
	//副标题
	private String subtitle;
	//价格
	private BigDecimal price;
	//重量（克）
	private Integer weight;

	/**
	 * 设置：skuId
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：skuId
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：spuId
	 */
	public void setSpuId(Long spuId) {
		this.spuId = spuId;
	}
	/**
	 * 获取：spuId
	 */
	public Long getSpuId() {
		return spuId;
	}
	/**
	 * 设置：sku名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：sku名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：所属分类id
	 */
	public void setCatagoryId(Long catagoryId) {
		this.catagoryId = catagoryId;
	}
	/**
	 * 获取：所属分类id
	 */
	public Long getCatagoryId() {
		return catagoryId;
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
	 * 设置：默认图片
	 */
	public void setDefaultImage(String defaultImage) {
		this.defaultImage = defaultImage;
	}
	/**
	 * 获取：默认图片
	 */
	public String getDefaultImage() {
		return defaultImage;
	}
	/**
	 * 设置：标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：标题
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：副标题
	 */
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	/**
	 * 获取：副标题
	 */
	public String getSubtitle() {
		return subtitle;
	}
	/**
	 * 设置：价格
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
	public BigDecimal getPrice() {
		return price;
	}
	/**
	 * 设置：重量（克）
	 */
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	/**
	 * 获取：重量（克）
	 */
	public Integer getWeight() {
		return weight;
	}
}

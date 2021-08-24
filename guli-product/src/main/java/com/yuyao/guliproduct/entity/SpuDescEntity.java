package com.yuyao.guliproduct.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * spu信息介绍
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
public class SpuDescEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//商品id
	private Long spuId;
	//商品介绍
	private String decript;

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
	 * 设置：商品介绍
	 */
	public void setDecript(String decript) {
		this.decript = decript;
	}
	/**
	 * 获取：商品介绍
	 */
	public String getDecript() {
		return decript;
	}
}

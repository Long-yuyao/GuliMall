package com.yuyao.guliproduct.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 商品评价
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
public class CommentEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//sku_id
	private Long skuId;
	//spu_id
	private Long spuId;
	//商品名字
	private String spuName;
	//会员昵称
	private String nickName;
	//星级
	private Integer star;
	//会员ip
	private String ip;
	//创建时间
	private Date createTime;
	//显示状态[0-不显示，1-显示]
	private Integer status;
	//购买时属性组合
	private String spuAttributes;
	//点赞数
	private Integer followCount;
	//回复数
	private Integer replyCount;
	//评论图片/视频[json数据；[{type:文件类型,url:资源路径}]]
	private String resources;
	//内容
	private String content;
	//用户头像
	private String icon;
	//评论类型[0 - 对商品的直接评论，1 - 对评论的回复]
	private Integer type;

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
	 * 设置：spu_id
	 */
	public void setSpuId(Long spuId) {
		this.spuId = spuId;
	}
	/**
	 * 获取：spu_id
	 */
	public Long getSpuId() {
		return spuId;
	}
	/**
	 * 设置：商品名字
	 */
	public void setSpuName(String spuName) {
		this.spuName = spuName;
	}
	/**
	 * 获取：商品名字
	 */
	public String getSpuName() {
		return spuName;
	}
	/**
	 * 设置：会员昵称
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	/**
	 * 获取：会员昵称
	 */
	public String getNickName() {
		return nickName;
	}
	/**
	 * 设置：星级
	 */
	public void setStar(Integer star) {
		this.star = star;
	}
	/**
	 * 获取：星级
	 */
	public Integer getStar() {
		return star;
	}
	/**
	 * 设置：会员ip
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	/**
	 * 获取：会员ip
	 */
	public String getIp() {
		return ip;
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
	 * 设置：显示状态[0-不显示，1-显示]
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：显示状态[0-不显示，1-显示]
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：购买时属性组合
	 */
	public void setSpuAttributes(String spuAttributes) {
		this.spuAttributes = spuAttributes;
	}
	/**
	 * 获取：购买时属性组合
	 */
	public String getSpuAttributes() {
		return spuAttributes;
	}
	/**
	 * 设置：点赞数
	 */
	public void setFollowCount(Integer followCount) {
		this.followCount = followCount;
	}
	/**
	 * 获取：点赞数
	 */
	public Integer getFollowCount() {
		return followCount;
	}
	/**
	 * 设置：回复数
	 */
	public void setReplyCount(Integer replyCount) {
		this.replyCount = replyCount;
	}
	/**
	 * 获取：回复数
	 */
	public Integer getReplyCount() {
		return replyCount;
	}
	/**
	 * 设置：评论图片/视频[json数据；[{type:文件类型,url:资源路径}]]
	 */
	public void setResources(String resources) {
		this.resources = resources;
	}
	/**
	 * 获取：评论图片/视频[json数据；[{type:文件类型,url:资源路径}]]
	 */
	public String getResources() {
		return resources;
	}
	/**
	 * 设置：内容
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：内容
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 设置：用户头像
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}
	/**
	 * 获取：用户头像
	 */
	public String getIcon() {
		return icon;
	}
	/**
	 * 设置：评论类型[0 - 对商品的直接评论，1 - 对评论的回复]
	 */
	public void setType(Integer type) {
		this.type = type;
	}
	/**
	 * 获取：评论类型[0 - 对商品的直接评论，1 - 对评论的回复]
	 */
	public Integer getType() {
		return type;
	}
}

package com.yuyao.guliproduct.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 商品评价回复关系
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
public class CommentReplayEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//评论id
	private Long commentId;
	//回复id
	private Long replyId;

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
	 * 设置：评论id
	 */
	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}
	/**
	 * 获取：评论id
	 */
	public Long getCommentId() {
		return commentId;
	}
	/**
	 * 设置：回复id
	 */
	public void setReplyId(Long replyId) {
		this.replyId = replyId;
	}
	/**
	 * 获取：回复id
	 */
	public Long getReplyId() {
		return replyId;
	}
}

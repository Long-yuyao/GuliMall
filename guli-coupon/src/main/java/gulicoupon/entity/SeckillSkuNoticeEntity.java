package gulicoupon.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 秒杀商品通知订阅
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
public class SeckillSkuNoticeEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//member_id
	private Long memberId;
	//sku_id
	private Long skuId;
	//活动场次id
	private Long sessionId;
	//订阅时间
	private Date subcribeTime;
	//发送时间
	private Date sendTime;
	//通知方式[0-短信，1-邮件]
	private Integer noticeType;

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
	 * 设置：member_id
	 */
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	/**
	 * 获取：member_id
	 */
	public Long getMemberId() {
		return memberId;
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
	 * 设置：活动场次id
	 */
	public void setSessionId(Long sessionId) {
		this.sessionId = sessionId;
	}
	/**
	 * 获取：活动场次id
	 */
	public Long getSessionId() {
		return sessionId;
	}
	/**
	 * 设置：订阅时间
	 */
	public void setSubcribeTime(Date subcribeTime) {
		this.subcribeTime = subcribeTime;
	}
	/**
	 * 获取：订阅时间
	 */
	public Date getSubcribeTime() {
		return subcribeTime;
	}
	/**
	 * 设置：发送时间
	 */
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
	/**
	 * 获取：发送时间
	 */
	public Date getSendTime() {
		return sendTime;
	}
	/**
	 * 设置：通知方式[0-短信，1-邮件]
	 */
	public void setNoticeType(Integer noticeType) {
		this.noticeType = noticeType;
	}
	/**
	 * 获取：通知方式[0-短信，1-邮件]
	 */
	public Integer getNoticeType() {
		return noticeType;
	}
}

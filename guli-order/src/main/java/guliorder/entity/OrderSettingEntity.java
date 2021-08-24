package guliorder.entity;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 订单配置信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
public class OrderSettingEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//秒杀订单超时关闭时间(分)
	private Integer flashOrderOvertime;
	//正常订单超时时间(分)
	private Integer normalOrderOvertime;
	//发货后自动确认收货时间（天）
	private Integer confirmOvertime;
	//自动完成交易时间，不能申请退货（天）
	private Integer finishOvertime;
	//订单完成后自动好评时间（天）
	private Integer commentOvertime;
	//会员等级【0-不限会员等级，全部通用；其他-对应的其他会员等级】
	private Integer memberLevel;

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
	 * 设置：秒杀订单超时关闭时间(分)
	 */
	public void setFlashOrderOvertime(Integer flashOrderOvertime) {
		this.flashOrderOvertime = flashOrderOvertime;
	}
	/**
	 * 获取：秒杀订单超时关闭时间(分)
	 */
	public Integer getFlashOrderOvertime() {
		return flashOrderOvertime;
	}
	/**
	 * 设置：正常订单超时时间(分)
	 */
	public void setNormalOrderOvertime(Integer normalOrderOvertime) {
		this.normalOrderOvertime = normalOrderOvertime;
	}
	/**
	 * 获取：正常订单超时时间(分)
	 */
	public Integer getNormalOrderOvertime() {
		return normalOrderOvertime;
	}
	/**
	 * 设置：发货后自动确认收货时间（天）
	 */
	public void setConfirmOvertime(Integer confirmOvertime) {
		this.confirmOvertime = confirmOvertime;
	}
	/**
	 * 获取：发货后自动确认收货时间（天）
	 */
	public Integer getConfirmOvertime() {
		return confirmOvertime;
	}
	/**
	 * 设置：自动完成交易时间，不能申请退货（天）
	 */
	public void setFinishOvertime(Integer finishOvertime) {
		this.finishOvertime = finishOvertime;
	}
	/**
	 * 获取：自动完成交易时间，不能申请退货（天）
	 */
	public Integer getFinishOvertime() {
		return finishOvertime;
	}
	/**
	 * 设置：订单完成后自动好评时间（天）
	 */
	public void setCommentOvertime(Integer commentOvertime) {
		this.commentOvertime = commentOvertime;
	}
	/**
	 * 获取：订单完成后自动好评时间（天）
	 */
	public Integer getCommentOvertime() {
		return commentOvertime;
	}
	/**
	 * 设置：会员等级【0-不限会员等级，全部通用；其他-对应的其他会员等级】
	 */
	public void setMemberLevel(Integer memberLevel) {
		this.memberLevel = memberLevel;
	}
	/**
	 * 获取：会员等级【0-不限会员等级，全部通用；其他-对应的其他会员等级】
	 */
	public Integer getMemberLevel() {
		return memberLevel;
	}
}

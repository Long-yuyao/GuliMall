package gulimember.entity;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;



/**
 * 统计信息表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
public class UserStatisticsEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//用户id
	private Long userId;
	//累计消费金额
	private BigDecimal consumeAmount;
	//累计优惠金额
	private BigDecimal couponAmount;
	//订单数量
	private Integer orderCount;
	//优惠券数量
	private Integer couponCount;
	//评价数
	private Integer commentCount;
	//退货数量
	private Integer returnOrderCount;
	//登录次数
	private Integer loginCount;
	//关注数量
	private Integer attendCount;
	//粉丝数量
	private Integer fansCount;
	//收藏的商品数量
	private Integer collectProductCount;
	//收藏的专题活动数量
	private Integer collectSubjectCount;
	//收藏的评论数量
	private Integer collectCommentCount;
	//邀请的朋友数量
	private Integer inviteFriendCount;

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
	 * 设置：用户id
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * 设置：累计消费金额
	 */
	public void setConsumeAmount(BigDecimal consumeAmount) {
		this.consumeAmount = consumeAmount;
	}
	/**
	 * 获取：累计消费金额
	 */
	public BigDecimal getConsumeAmount() {
		return consumeAmount;
	}
	/**
	 * 设置：累计优惠金额
	 */
	public void setCouponAmount(BigDecimal couponAmount) {
		this.couponAmount = couponAmount;
	}
	/**
	 * 获取：累计优惠金额
	 */
	public BigDecimal getCouponAmount() {
		return couponAmount;
	}
	/**
	 * 设置：订单数量
	 */
	public void setOrderCount(Integer orderCount) {
		this.orderCount = orderCount;
	}
	/**
	 * 获取：订单数量
	 */
	public Integer getOrderCount() {
		return orderCount;
	}
	/**
	 * 设置：优惠券数量
	 */
	public void setCouponCount(Integer couponCount) {
		this.couponCount = couponCount;
	}
	/**
	 * 获取：优惠券数量
	 */
	public Integer getCouponCount() {
		return couponCount;
	}
	/**
	 * 设置：评价数
	 */
	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}
	/**
	 * 获取：评价数
	 */
	public Integer getCommentCount() {
		return commentCount;
	}
	/**
	 * 设置：退货数量
	 */
	public void setReturnOrderCount(Integer returnOrderCount) {
		this.returnOrderCount = returnOrderCount;
	}
	/**
	 * 获取：退货数量
	 */
	public Integer getReturnOrderCount() {
		return returnOrderCount;
	}
	/**
	 * 设置：登录次数
	 */
	public void setLoginCount(Integer loginCount) {
		this.loginCount = loginCount;
	}
	/**
	 * 获取：登录次数
	 */
	public Integer getLoginCount() {
		return loginCount;
	}
	/**
	 * 设置：关注数量
	 */
	public void setAttendCount(Integer attendCount) {
		this.attendCount = attendCount;
	}
	/**
	 * 获取：关注数量
	 */
	public Integer getAttendCount() {
		return attendCount;
	}
	/**
	 * 设置：粉丝数量
	 */
	public void setFansCount(Integer fansCount) {
		this.fansCount = fansCount;
	}
	/**
	 * 获取：粉丝数量
	 */
	public Integer getFansCount() {
		return fansCount;
	}
	/**
	 * 设置：收藏的商品数量
	 */
	public void setCollectProductCount(Integer collectProductCount) {
		this.collectProductCount = collectProductCount;
	}
	/**
	 * 获取：收藏的商品数量
	 */
	public Integer getCollectProductCount() {
		return collectProductCount;
	}
	/**
	 * 设置：收藏的专题活动数量
	 */
	public void setCollectSubjectCount(Integer collectSubjectCount) {
		this.collectSubjectCount = collectSubjectCount;
	}
	/**
	 * 获取：收藏的专题活动数量
	 */
	public Integer getCollectSubjectCount() {
		return collectSubjectCount;
	}
	/**
	 * 设置：收藏的评论数量
	 */
	public void setCollectCommentCount(Integer collectCommentCount) {
		this.collectCommentCount = collectCommentCount;
	}
	/**
	 * 获取：收藏的评论数量
	 */
	public Integer getCollectCommentCount() {
		return collectCommentCount;
	}
	/**
	 * 设置：邀请的朋友数量
	 */
	public void setInviteFriendCount(Integer inviteFriendCount) {
		this.inviteFriendCount = inviteFriendCount;
	}
	/**
	 * 获取：邀请的朋友数量
	 */
	public Integer getInviteFriendCount() {
		return inviteFriendCount;
	}
}

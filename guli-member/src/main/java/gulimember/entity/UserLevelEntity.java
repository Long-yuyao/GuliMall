package gulimember.entity;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 会员等级表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
public class UserLevelEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//等级名称
	private String name;
	//等级需要的成长值
	private Integer growthPoint;
	//默认等级
	private Integer defaultStatus;
	//免运费标准
	private BigDecimal freeFreightPoint;
	//每次评价获取的成长值
	private Integer commentGrowthPoint;
	//是否有免邮特权
	private Integer priviledgeFreeFreight;
	//是否有会员价格特权
	private Integer priviledgeMemberPrice;
	//是否有生日特权
	private Integer priviledgeBirthday;
	//备注
	private String remark;

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
	 * 设置：等级名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：等级名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：等级需要的成长值
	 */
	public void setGrowthPoint(Integer growthPoint) {
		this.growthPoint = growthPoint;
	}
	/**
	 * 获取：等级需要的成长值
	 */
	public Integer getGrowthPoint() {
		return growthPoint;
	}
	/**
	 * 设置：默认等级
	 */
	public void setDefaultStatus(Integer defaultStatus) {
		this.defaultStatus = defaultStatus;
	}
	/**
	 * 获取：默认等级
	 */
	public Integer getDefaultStatus() {
		return defaultStatus;
	}
	/**
	 * 设置：免运费标准
	 */
	public void setFreeFreightPoint(BigDecimal freeFreightPoint) {
		this.freeFreightPoint = freeFreightPoint;
	}
	/**
	 * 获取：免运费标准
	 */
	public BigDecimal getFreeFreightPoint() {
		return freeFreightPoint;
	}
	/**
	 * 设置：每次评价获取的成长值
	 */
	public void setCommentGrowthPoint(Integer commentGrowthPoint) {
		this.commentGrowthPoint = commentGrowthPoint;
	}
	/**
	 * 获取：每次评价获取的成长值
	 */
	public Integer getCommentGrowthPoint() {
		return commentGrowthPoint;
	}
	/**
	 * 设置：是否有免邮特权
	 */
	public void setPriviledgeFreeFreight(Integer priviledgeFreeFreight) {
		this.priviledgeFreeFreight = priviledgeFreeFreight;
	}
	/**
	 * 获取：是否有免邮特权
	 */
	public Integer getPriviledgeFreeFreight() {
		return priviledgeFreeFreight;
	}
	/**
	 * 设置：是否有会员价格特权
	 */
	public void setPriviledgeMemberPrice(Integer priviledgeMemberPrice) {
		this.priviledgeMemberPrice = priviledgeMemberPrice;
	}
	/**
	 * 获取：是否有会员价格特权
	 */
	public Integer getPriviledgeMemberPrice() {
		return priviledgeMemberPrice;
	}
	/**
	 * 设置：是否有生日特权
	 */
	public void setPriviledgeBirthday(Integer priviledgeBirthday) {
		this.priviledgeBirthday = priviledgeBirthday;
	}
	/**
	 * 获取：是否有生日特权
	 */
	public Integer getPriviledgeBirthday() {
		return priviledgeBirthday;
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

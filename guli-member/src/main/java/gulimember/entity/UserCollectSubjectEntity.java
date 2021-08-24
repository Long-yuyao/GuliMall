package gulimember.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 关注活动表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
public class UserCollectSubjectEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//用户id
	private Integer userId;
	//活动id
	private Long subjectId;
	//活动名称
	private String subjectName;
	//活动默认图片
	private String subjectImage;
	//活动链接
	private String subjectUrl;
	//关注时间
	private Date createTime;

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
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户id
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * 设置：活动id
	 */
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	/**
	 * 获取：活动id
	 */
	public Long getSubjectId() {
		return subjectId;
	}
	/**
	 * 设置：活动名称
	 */
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	/**
	 * 获取：活动名称
	 */
	public String getSubjectName() {
		return subjectName;
	}
	/**
	 * 设置：活动默认图片
	 */
	public void setSubjectImage(String subjectImage) {
		this.subjectImage = subjectImage;
	}
	/**
	 * 获取：活动默认图片
	 */
	public String getSubjectImage() {
		return subjectImage;
	}
	/**
	 * 设置：活动链接
	 */
	public void setSubjectUrl(String subjectUrl) {
		this.subjectUrl = subjectUrl;
	}
	/**
	 * 获取：活动链接
	 */
	public String getSubjectUrl() {
		return subjectUrl;
	}
	/**
	 * 设置：关注时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：关注时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
}

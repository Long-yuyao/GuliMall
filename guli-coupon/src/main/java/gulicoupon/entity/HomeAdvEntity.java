package gulicoupon.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 首页轮播广告
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
public class HomeAdvEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//名字
	private String name;
	//图片地址
	private String pic;
	//开始时间
	private Date startTime;
	//结束时间
	private Date endTime;
	//状态
	private Integer status;
	//点击数
	private Integer clickCount;
	//广告详情连接地址
	private String url;
	//备注
	private String note;
	//排序
	private Integer sort;
	//发布者
	private Long publisherId;
	//审核者
	private Long authId;

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
	 * 设置：名字
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：名字
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：图片地址
	 */
	public void setPic(String pic) {
		this.pic = pic;
	}
	/**
	 * 获取：图片地址
	 */
	public String getPic() {
		return pic;
	}
	/**
	 * 设置：开始时间
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	/**
	 * 获取：开始时间
	 */
	public Date getStartTime() {
		return startTime;
	}
	/**
	 * 设置：结束时间
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	/**
	 * 获取：结束时间
	 */
	public Date getEndTime() {
		return endTime;
	}
	/**
	 * 设置：状态
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：点击数
	 */
	public void setClickCount(Integer clickCount) {
		this.clickCount = clickCount;
	}
	/**
	 * 获取：点击数
	 */
	public Integer getClickCount() {
		return clickCount;
	}
	/**
	 * 设置：广告详情连接地址
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * 获取：广告详情连接地址
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * 设置：备注
	 */
	public void setNote(String note) {
		this.note = note;
	}
	/**
	 * 获取：备注
	 */
	public String getNote() {
		return note;
	}
	/**
	 * 设置：排序
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	/**
	 * 获取：排序
	 */
	public Integer getSort() {
		return sort;
	}
	/**
	 * 设置：发布者
	 */
	public void setPublisherId(Long publisherId) {
		this.publisherId = publisherId;
	}
	/**
	 * 获取：发布者
	 */
	public Long getPublisherId() {
		return publisherId;
	}
	/**
	 * 设置：审核者
	 */
	public void setAuthId(Long authId) {
		this.authId = authId;
	}
	/**
	 * 获取：审核者
	 */
	public Long getAuthId() {
		return authId;
	}
}

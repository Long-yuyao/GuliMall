package gulimember.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 用户登陆记录表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
public class UserLoginLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//用户id
	private Long userId;
	//登陆时间
	private Date createTime;
	//登录ip
	private String ip;
	//登录城市
	private String city;
	//登录类型【0-web，1-移动】
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
	 * 设置：登陆时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：登陆时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：登录ip
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	/**
	 * 获取：登录ip
	 */
	public String getIp() {
		return ip;
	}
	/**
	 * 设置：登录城市
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 获取：登录城市
	 */
	public String getCity() {
		return city;
	}
	/**
	 * 设置：登录类型【0-web，1-移动】
	 */
	public void setType(Integer type) {
		this.type = type;
	}
	/**
	 * 获取：登录类型【0-web，1-移动】
	 */
	public Integer getType() {
		return type;
	}
}

package gulimember.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 收货地址表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
public class UserAddressEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//member_id
	private Long userId;
	//收货人
	private String name;
	//电话
	private String phone;
	//右边
	private String postCode;
	//省份
	private String province;
	//城市
	private String city;
	//区
	private String region;
	//详细地址
	private String address;
	//是否默认地址
	private Integer defaultStatus;

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
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：member_id
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * 设置：收货人
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：收货人
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：电话
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：电话
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：右边
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	/**
	 * 获取：右边
	 */
	public String getPostCode() {
		return postCode;
	}
	/**
	 * 设置：省份
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * 获取：省份
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * 设置：城市
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 获取：城市
	 */
	public String getCity() {
		return city;
	}
	/**
	 * 设置：区
	 */
	public void setRegion(String region) {
		this.region = region;
	}
	/**
	 * 获取：区
	 */
	public String getRegion() {
		return region;
	}
	/**
	 * 设置：详细地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：详细地址
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置：是否默认地址
	 */
	public void setDefaultStatus(Integer defaultStatus) {
		this.defaultStatus = defaultStatus;
	}
	/**
	 * 获取：是否默认地址
	 */
	public Integer getDefaultStatus() {
		return defaultStatus;
	}
}

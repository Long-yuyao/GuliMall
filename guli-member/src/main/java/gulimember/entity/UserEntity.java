package gulimember.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 用户表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//��Ա�ȼ�id
	private Long levelId;
	//用户名
	private String username;
	//密码
	private String password;
	//盐
	private String salt;
	//昵称
	private String nickname;
	//手机号
	private String phone;
	//邮箱
	private String email;
	//头像
	private String header;
	//性别
	private Integer gender;
	//生日
	private Date birthday;
	//城市
	private String city;
	//职业
	private String job;
	//个性签名
	private String sign;
	//来源
	private Integer sourceType;
	//购物积分
	private Integer integration;
	//赠送积分
	private Integer growth;
	//状态
	private Integer status;
	//注册时间
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
	 * 设置：��Ա�ȼ�id
	 */
	public void setLevelId(Long levelId) {
		this.levelId = levelId;
	}
	/**
	 * 获取：��Ա�ȼ�id
	 */
	public Long getLevelId() {
		return levelId;
	}
	/**
	 * 设置：用户名
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * 获取：用户名
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * 设置：密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：密码
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：盐
	 */
	public void setSalt(String salt) {
		this.salt = salt;
	}
	/**
	 * 获取：盐
	 */
	public String getSalt() {
		return salt;
	}
	/**
	 * 设置：昵称
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * 获取：昵称
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * 设置：手机号
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：手机号
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：邮箱
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：邮箱
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置：头像
	 */
	public void setHeader(String header) {
		this.header = header;
	}
	/**
	 * 获取：头像
	 */
	public String getHeader() {
		return header;
	}
	/**
	 * 设置：性别
	 */
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	/**
	 * 获取：性别
	 */
	public Integer getGender() {
		return gender;
	}
	/**
	 * 设置：生日
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	/**
	 * 获取：生日
	 */
	public Date getBirthday() {
		return birthday;
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
	 * 设置：职业
	 */
	public void setJob(String job) {
		this.job = job;
	}
	/**
	 * 获取：职业
	 */
	public String getJob() {
		return job;
	}
	/**
	 * 设置：个性签名
	 */
	public void setSign(String sign) {
		this.sign = sign;
	}
	/**
	 * 获取：个性签名
	 */
	public String getSign() {
		return sign;
	}
	/**
	 * 设置：来源
	 */
	public void setSourceType(Integer sourceType) {
		this.sourceType = sourceType;
	}
	/**
	 * 获取：来源
	 */
	public Integer getSourceType() {
		return sourceType;
	}
	/**
	 * 设置：购物积分
	 */
	public void setIntegration(Integer integration) {
		this.integration = integration;
	}
	/**
	 * 获取：购物积分
	 */
	public Integer getIntegration() {
		return integration;
	}
	/**
	 * 设置：赠送积分
	 */
	public void setGrowth(Integer growth) {
		this.growth = growth;
	}
	/**
	 * 获取：赠送积分
	 */
	public Integer getGrowth() {
		return growth;
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
	 * 设置：注册时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：注册时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
}

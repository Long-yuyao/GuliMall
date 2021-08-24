package gulimember.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 关注店铺表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
public class UserCollectShopEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long id;
	//用户id
	private Long userId;
	//店铺id
	private Long shopId;
	//店铺名
	private String shopName;
	//店铺logo
	private String shopLogo;
	//关注时间
	private Date createtime;

	/**
	 * 设置：
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：
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
	 * 设置：店铺id
	 */
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	/**
	 * 获取：店铺id
	 */
	public Long getShopId() {
		return shopId;
	}
	/**
	 * 设置：店铺名
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	/**
	 * 获取：店铺名
	 */
	public String getShopName() {
		return shopName;
	}
	/**
	 * 设置：店铺logo
	 */
	public void setShopLogo(String shopLogo) {
		this.shopLogo = shopLogo;
	}
	/**
	 * 获取：店铺logo
	 */
	public String getShopLogo() {
		return shopLogo;
	}
	/**
	 * 设置：关注时间
	 */
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	/**
	 * 获取：关注时间
	 */
	public Date getCreatetime() {
		return createtime;
	}
}

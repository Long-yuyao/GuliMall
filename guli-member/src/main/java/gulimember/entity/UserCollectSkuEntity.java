package gulimember.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 关注商品表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
public class UserCollectSkuEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//用户id
	private Long userId;
	//sku_id
	private Long skuId;
	//sku标题
	private String skuTitle;
	//sku默认图片
	private String skuImage;
	//创建时间
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
	 * 设置：sku标题
	 */
	public void setSkuTitle(String skuTitle) {
		this.skuTitle = skuTitle;
	}
	/**
	 * 获取：sku标题
	 */
	public String getSkuTitle() {
		return skuTitle;
	}
	/**
	 * 设置：sku默认图片
	 */
	public void setSkuImage(String skuImage) {
		this.skuImage = skuImage;
	}
	/**
	 * 获取：sku默认图片
	 */
	public String getSkuImage() {
		return skuImage;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
}

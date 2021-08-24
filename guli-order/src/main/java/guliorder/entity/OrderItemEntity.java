package guliorder.entity;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;



/**
 * 订单项信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
public class OrderItemEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//order_id
	private Long orderId;
	//order_sn
	private String orderSn;
	//spu_id
	private Long spuId;
	//spu_name
	private String spuName;
	//spu_pic
	private String spuPic;
	//品牌
	private String spuBrand;
	//商品分类id
	private Long categoryId;
	//商品sku编号
	private Long skuId;
	//商品sku名字
	private String skuName;
	//商品sku图片
	private String skuPic;
	//商品sku价格
	private BigDecimal skuPrice;
	//商品购买的数量
	private Integer skuQuantity;
	//商品销售属性组合（JSON）
	private String skuAttrsVals;
	//商品促销分解金额
	private BigDecimal promotionAmount;
	//优惠券优惠分解金额
	private BigDecimal couponAmount;
	//积分优惠分解金额
	private BigDecimal integrationAmount;
	//该商品经过优惠后的分解金额
	private BigDecimal realAmount;
	//赠送积分
	private Integer giftIntegration;
	//赠送成长值
	private Integer giftGrowth;

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
	 * 设置：order_id
	 */
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	/**
	 * 获取：order_id
	 */
	public Long getOrderId() {
		return orderId;
	}
	/**
	 * 设置：order_sn
	 */
	public void setOrderSn(String orderSn) {
		this.orderSn = orderSn;
	}
	/**
	 * 获取：order_sn
	 */
	public String getOrderSn() {
		return orderSn;
	}
	/**
	 * 设置：spu_id
	 */
	public void setSpuId(Long spuId) {
		this.spuId = spuId;
	}
	/**
	 * 获取：spu_id
	 */
	public Long getSpuId() {
		return spuId;
	}
	/**
	 * 设置：spu_name
	 */
	public void setSpuName(String spuName) {
		this.spuName = spuName;
	}
	/**
	 * 获取：spu_name
	 */
	public String getSpuName() {
		return spuName;
	}
	/**
	 * 设置：spu_pic
	 */
	public void setSpuPic(String spuPic) {
		this.spuPic = spuPic;
	}
	/**
	 * 获取：spu_pic
	 */
	public String getSpuPic() {
		return spuPic;
	}
	/**
	 * 设置：品牌
	 */
	public void setSpuBrand(String spuBrand) {
		this.spuBrand = spuBrand;
	}
	/**
	 * 获取：品牌
	 */
	public String getSpuBrand() {
		return spuBrand;
	}
	/**
	 * 设置：商品分类id
	 */
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * 获取：商品分类id
	 */
	public Long getCategoryId() {
		return categoryId;
	}
	/**
	 * 设置：商品sku编号
	 */
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}
	/**
	 * 获取：商品sku编号
	 */
	public Long getSkuId() {
		return skuId;
	}
	/**
	 * 设置：商品sku名字
	 */
	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}
	/**
	 * 获取：商品sku名字
	 */
	public String getSkuName() {
		return skuName;
	}
	/**
	 * 设置：商品sku图片
	 */
	public void setSkuPic(String skuPic) {
		this.skuPic = skuPic;
	}
	/**
	 * 获取：商品sku图片
	 */
	public String getSkuPic() {
		return skuPic;
	}
	/**
	 * 设置：商品sku价格
	 */
	public void setSkuPrice(BigDecimal skuPrice) {
		this.skuPrice = skuPrice;
	}
	/**
	 * 获取：商品sku价格
	 */
	public BigDecimal getSkuPrice() {
		return skuPrice;
	}
	/**
	 * 设置：商品购买的数量
	 */
	public void setSkuQuantity(Integer skuQuantity) {
		this.skuQuantity = skuQuantity;
	}
	/**
	 * 获取：商品购买的数量
	 */
	public Integer getSkuQuantity() {
		return skuQuantity;
	}
	/**
	 * 设置：商品销售属性组合（JSON）
	 */
	public void setSkuAttrsVals(String skuAttrsVals) {
		this.skuAttrsVals = skuAttrsVals;
	}
	/**
	 * 获取：商品销售属性组合（JSON）
	 */
	public String getSkuAttrsVals() {
		return skuAttrsVals;
	}
	/**
	 * 设置：商品促销分解金额
	 */
	public void setPromotionAmount(BigDecimal promotionAmount) {
		this.promotionAmount = promotionAmount;
	}
	/**
	 * 获取：商品促销分解金额
	 */
	public BigDecimal getPromotionAmount() {
		return promotionAmount;
	}
	/**
	 * 设置：优惠券优惠分解金额
	 */
	public void setCouponAmount(BigDecimal couponAmount) {
		this.couponAmount = couponAmount;
	}
	/**
	 * 获取：优惠券优惠分解金额
	 */
	public BigDecimal getCouponAmount() {
		return couponAmount;
	}
	/**
	 * 设置：积分优惠分解金额
	 */
	public void setIntegrationAmount(BigDecimal integrationAmount) {
		this.integrationAmount = integrationAmount;
	}
	/**
	 * 获取：积分优惠分解金额
	 */
	public BigDecimal getIntegrationAmount() {
		return integrationAmount;
	}
	/**
	 * 设置：该商品经过优惠后的分解金额
	 */
	public void setRealAmount(BigDecimal realAmount) {
		this.realAmount = realAmount;
	}
	/**
	 * 获取：该商品经过优惠后的分解金额
	 */
	public BigDecimal getRealAmount() {
		return realAmount;
	}
	/**
	 * 设置：赠送积分
	 */
	public void setGiftIntegration(Integer giftIntegration) {
		this.giftIntegration = giftIntegration;
	}
	/**
	 * 获取：赠送积分
	 */
	public Integer getGiftIntegration() {
		return giftIntegration;
	}
	/**
	 * 设置：赠送成长值
	 */
	public void setGiftGrowth(Integer giftGrowth) {
		this.giftGrowth = giftGrowth;
	}
	/**
	 * 获取：赠送成长值
	 */
	public Integer getGiftGrowth() {
		return giftGrowth;
	}
}

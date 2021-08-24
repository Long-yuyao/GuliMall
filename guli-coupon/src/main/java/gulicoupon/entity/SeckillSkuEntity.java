package gulicoupon.entity;
import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;



/**
 * 秒杀活动商品关联
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
public class SeckillSkuEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//活动id
	private Long promotionId;
	//活动场次id
	private Long promotionSessionId;
	//商品id
	private Long skuId;
	//秒杀价格
	private BigDecimal seckillPrice;
	//秒杀总量
	private BigDecimal seckillCount;
	//每人限购数量
	private BigDecimal seckillLimit;
	//排序
	private Integer seckillSort;

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
	 * 设置：活动id
	 */
	public void setPromotionId(Long promotionId) {
		this.promotionId = promotionId;
	}
	/**
	 * 获取：活动id
	 */
	public Long getPromotionId() {
		return promotionId;
	}
	/**
	 * 设置：活动场次id
	 */
	public void setPromotionSessionId(Long promotionSessionId) {
		this.promotionSessionId = promotionSessionId;
	}
	/**
	 * 获取：活动场次id
	 */
	public Long getPromotionSessionId() {
		return promotionSessionId;
	}
	/**
	 * 设置：商品id
	 */
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}
	/**
	 * 获取：商品id
	 */
	public Long getSkuId() {
		return skuId;
	}
	/**
	 * 设置：秒杀价格
	 */
	public void setSeckillPrice(BigDecimal seckillPrice) {
		this.seckillPrice = seckillPrice;
	}
	/**
	 * 获取：秒杀价格
	 */
	public BigDecimal getSeckillPrice() {
		return seckillPrice;
	}
	/**
	 * 设置：秒杀总量
	 */
	public void setSeckillCount(BigDecimal seckillCount) {
		this.seckillCount = seckillCount;
	}
	/**
	 * 获取：秒杀总量
	 */
	public BigDecimal getSeckillCount() {
		return seckillCount;
	}
	/**
	 * 设置：每人限购数量
	 */
	public void setSeckillLimit(BigDecimal seckillLimit) {
		this.seckillLimit = seckillLimit;
	}
	/**
	 * 获取：每人限购数量
	 */
	public BigDecimal getSeckillLimit() {
		return seckillLimit;
	}
	/**
	 * 设置：排序
	 */
	public void setSeckillSort(Integer seckillSort) {
		this.seckillSort = seckillSort;
	}
	/**
	 * 获取：排序
	 */
	public Integer getSeckillSort() {
		return seckillSort;
	}
}

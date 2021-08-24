package gulicoupon.entity;
import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;



/**
 * 商品满减信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
public class SkuFullReductionEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//spu_id
	private Long skuId;
	//满多少
	private BigDecimal fullPrice;
	//减多少
	private BigDecimal reducePrice;
	//是否参与其他优惠
	private Integer addOther;

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
	 * 设置：spu_id
	 */
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}
	/**
	 * 获取：spu_id
	 */
	public Long getSkuId() {
		return skuId;
	}
	/**
	 * 设置：满多少
	 */
	public void setFullPrice(BigDecimal fullPrice) {
		this.fullPrice = fullPrice;
	}
	/**
	 * 获取：满多少
	 */
	public BigDecimal getFullPrice() {
		return fullPrice;
	}
	/**
	 * 设置：减多少
	 */
	public void setReducePrice(BigDecimal reducePrice) {
		this.reducePrice = reducePrice;
	}
	/**
	 * 获取：减多少
	 */
	public BigDecimal getReducePrice() {
		return reducePrice;
	}
	/**
	 * 设置：是否参与其他优惠
	 */
	public void setAddOther(Integer addOther) {
		this.addOther = addOther;
	}
	/**
	 * 获取：是否参与其他优惠
	 */
	public Integer getAddOther() {
		return addOther;
	}
}

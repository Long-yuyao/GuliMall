package guliorder.entity;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;



/**
 * 订单退货申请
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
public class OrderReturnApplyEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//order_id
	private Long orderId;
	//退货商品id
	private Long skuId;
	//订单编号
	private String orderSn;
	//申请时间
	private Date createTime;
	//会员用户名
	private String memberUsername;
	//退款金额
	private BigDecimal returnAmount;
	//退货人姓名
	private String returnName;
	//退货人电话
	private String returnPhone;
	//申请状态[0->待处理；1->退货中；2->已完成；3->已拒绝]
	private Integer status;
	//处理时间
	private Date handleTime;
	//商品图片
	private String skuImg;
	//商品名称
	private String skuName;
	//商品品牌
	private String skuBrand;
	//商品销售属性(JSON)
	private String skuAttrsVals;
	//退货数量
	private Integer skuCount;
	//商品单价
	private BigDecimal skuPrice;
	//商品实际支付单价
	private BigDecimal skuRealPrice;
	//原因
	private String reason;
	//描述
	private String description述;
	//凭证图片，以逗号隔开
	private String descPics;
	//处理备注
	private String handleNote;
	//处理人员
	private String handleMan;
	//收货人
	private String receiveMan;
	//收货时间
	private Date receiveTime;
	//收货备注
	private String receiveNote;
	//收货电话
	private String receivePhone;
	//公司收货地址
	private String receiveAddress;

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
	 * 设置：退货商品id
	 */
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}
	/**
	 * 获取：退货商品id
	 */
	public Long getSkuId() {
		return skuId;
	}
	/**
	 * 设置：订单编号
	 */
	public void setOrderSn(String orderSn) {
		this.orderSn = orderSn;
	}
	/**
	 * 获取：订单编号
	 */
	public String getOrderSn() {
		return orderSn;
	}
	/**
	 * 设置：申请时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：申请时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：会员用户名
	 */
	public void setMemberUsername(String memberUsername) {
		this.memberUsername = memberUsername;
	}
	/**
	 * 获取：会员用户名
	 */
	public String getMemberUsername() {
		return memberUsername;
	}
	/**
	 * 设置：退款金额
	 */
	public void setReturnAmount(BigDecimal returnAmount) {
		this.returnAmount = returnAmount;
	}
	/**
	 * 获取：退款金额
	 */
	public BigDecimal getReturnAmount() {
		return returnAmount;
	}
	/**
	 * 设置：退货人姓名
	 */
	public void setReturnName(String returnName) {
		this.returnName = returnName;
	}
	/**
	 * 获取：退货人姓名
	 */
	public String getReturnName() {
		return returnName;
	}
	/**
	 * 设置：退货人电话
	 */
	public void setReturnPhone(String returnPhone) {
		this.returnPhone = returnPhone;
	}
	/**
	 * 获取：退货人电话
	 */
	public String getReturnPhone() {
		return returnPhone;
	}
	/**
	 * 设置：申请状态[0->待处理；1->退货中；2->已完成；3->已拒绝]
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：申请状态[0->待处理；1->退货中；2->已完成；3->已拒绝]
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：处理时间
	 */
	public void setHandleTime(Date handleTime) {
		this.handleTime = handleTime;
	}
	/**
	 * 获取：处理时间
	 */
	public Date getHandleTime() {
		return handleTime;
	}
	/**
	 * 设置：商品图片
	 */
	public void setSkuImg(String skuImg) {
		this.skuImg = skuImg;
	}
	/**
	 * 获取：商品图片
	 */
	public String getSkuImg() {
		return skuImg;
	}
	/**
	 * 设置：商品名称
	 */
	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}
	/**
	 * 获取：商品名称
	 */
	public String getSkuName() {
		return skuName;
	}
	/**
	 * 设置：商品品牌
	 */
	public void setSkuBrand(String skuBrand) {
		this.skuBrand = skuBrand;
	}
	/**
	 * 获取：商品品牌
	 */
	public String getSkuBrand() {
		return skuBrand;
	}
	/**
	 * 设置：商品销售属性(JSON)
	 */
	public void setSkuAttrsVals(String skuAttrsVals) {
		this.skuAttrsVals = skuAttrsVals;
	}
	/**
	 * 获取：商品销售属性(JSON)
	 */
	public String getSkuAttrsVals() {
		return skuAttrsVals;
	}
	/**
	 * 设置：退货数量
	 */
	public void setSkuCount(Integer skuCount) {
		this.skuCount = skuCount;
	}
	/**
	 * 获取：退货数量
	 */
	public Integer getSkuCount() {
		return skuCount;
	}
	/**
	 * 设置：商品单价
	 */
	public void setSkuPrice(BigDecimal skuPrice) {
		this.skuPrice = skuPrice;
	}
	/**
	 * 获取：商品单价
	 */
	public BigDecimal getSkuPrice() {
		return skuPrice;
	}
	/**
	 * 设置：商品实际支付单价
	 */
	public void setSkuRealPrice(BigDecimal skuRealPrice) {
		this.skuRealPrice = skuRealPrice;
	}
	/**
	 * 获取：商品实际支付单价
	 */
	public BigDecimal getSkuRealPrice() {
		return skuRealPrice;
	}
	/**
	 * 设置：原因
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}
	/**
	 * 获取：原因
	 */
	public String getReason() {
		return reason;
	}
	/**
	 * 设置：描述
	 */
	public void setDescription述(String description述) {
		this.description述 = description述;
	}
	/**
	 * 获取：描述
	 */
	public String getDescription述() {
		return description述;
	}
	/**
	 * 设置：凭证图片，以逗号隔开
	 */
	public void setDescPics(String descPics) {
		this.descPics = descPics;
	}
	/**
	 * 获取：凭证图片，以逗号隔开
	 */
	public String getDescPics() {
		return descPics;
	}
	/**
	 * 设置：处理备注
	 */
	public void setHandleNote(String handleNote) {
		this.handleNote = handleNote;
	}
	/**
	 * 获取：处理备注
	 */
	public String getHandleNote() {
		return handleNote;
	}
	/**
	 * 设置：处理人员
	 */
	public void setHandleMan(String handleMan) {
		this.handleMan = handleMan;
	}
	/**
	 * 获取：处理人员
	 */
	public String getHandleMan() {
		return handleMan;
	}
	/**
	 * 设置：收货人
	 */
	public void setReceiveMan(String receiveMan) {
		this.receiveMan = receiveMan;
	}
	/**
	 * 获取：收货人
	 */
	public String getReceiveMan() {
		return receiveMan;
	}
	/**
	 * 设置：收货时间
	 */
	public void setReceiveTime(Date receiveTime) {
		this.receiveTime = receiveTime;
	}
	/**
	 * 获取：收货时间
	 */
	public Date getReceiveTime() {
		return receiveTime;
	}
	/**
	 * 设置：收货备注
	 */
	public void setReceiveNote(String receiveNote) {
		this.receiveNote = receiveNote;
	}
	/**
	 * 获取：收货备注
	 */
	public String getReceiveNote() {
		return receiveNote;
	}
	/**
	 * 设置：收货电话
	 */
	public void setReceivePhone(String receivePhone) {
		this.receivePhone = receivePhone;
	}
	/**
	 * 获取：收货电话
	 */
	public String getReceivePhone() {
		return receivePhone;
	}
	/**
	 * 设置：公司收货地址
	 */
	public void setReceiveAddress(String receiveAddress) {
		this.receiveAddress = receiveAddress;
	}
	/**
	 * 获取：公司收货地址
	 */
	public String getReceiveAddress() {
		return receiveAddress;
	}
}

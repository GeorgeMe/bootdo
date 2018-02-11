package com.zscat.shop.domain;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;



/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public class OrderformDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//finishTime
	private Date finishtime;
	//goods_amount
	private BigDecimal goodsAmount;
	//invoice
	private String invoice;
	//invoiceType
	private Integer invoicetype;
	//msg
	private String msg;
	//order_id
	private String orderId;
	//order_status
	private Integer orderStatus;
	//payTime
	private Date paytime;
	//pay_msg
	private String payMsg;
	//refund
	private BigDecimal refund;
	//refund_type
	private String refundType;
	//shipCode
	private String shipcode;
	//shipTime
	private Date shiptime;
	//ship_price
	private BigDecimal shipPrice;
	//totalPrice
	private BigDecimal totalprice;
	//addr_id
	private Long addrId;
	//payment_id
	private Long paymentId;
	//store_id
	private Long storeId;
	//user_id
	private Long userId;
	//auto_confirm_email
	private Boolean autoConfirmEmail;
	//auto_confirm_sms
	private Boolean autoConfirmSms;
	//transport
	private String transport;
	//out_order_id
	private String outOrderId;
	//ec_id
	private Long ecId;
	//ci_id
	private Long ciId;
	//order_seller_intro
	private String orderSellerIntro;
	//return_shipCode
	private String returnShipcode;
	//return_ec_id
	private Long returnEcId;
	//return_content
	private String returnContent;
	//return_shipTime
	private Date returnShiptime;
	//order_type
	private String orderType;

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
	 * 设置：addTime
	 */
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	/**
	 * 获取：addTime
	 */
	public Date getAddtime() {
		return addtime;
	}
	/**
	 * 设置：deleteStatus
	 */
	public void setDeletestatus(Boolean deletestatus) {
		this.deletestatus = deletestatus;
	}
	/**
	 * 获取：deleteStatus
	 */
	public Boolean getDeletestatus() {
		return deletestatus;
	}
	/**
	 * 设置：finishTime
	 */
	public void setFinishtime(Date finishtime) {
		this.finishtime = finishtime;
	}
	/**
	 * 获取：finishTime
	 */
	public Date getFinishtime() {
		return finishtime;
	}
	/**
	 * 设置：goods_amount
	 */
	public void setGoodsAmount(BigDecimal goodsAmount) {
		this.goodsAmount = goodsAmount;
	}
	/**
	 * 获取：goods_amount
	 */
	public BigDecimal getGoodsAmount() {
		return goodsAmount;
	}
	/**
	 * 设置：invoice
	 */
	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}
	/**
	 * 获取：invoice
	 */
	public String getInvoice() {
		return invoice;
	}
	/**
	 * 设置：invoiceType
	 */
	public void setInvoicetype(Integer invoicetype) {
		this.invoicetype = invoicetype;
	}
	/**
	 * 获取：invoiceType
	 */
	public Integer getInvoicetype() {
		return invoicetype;
	}
	/**
	 * 设置：msg
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	/**
	 * 获取：msg
	 */
	public String getMsg() {
		return msg;
	}
	/**
	 * 设置：order_id
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	/**
	 * 获取：order_id
	 */
	public String getOrderId() {
		return orderId;
	}
	/**
	 * 设置：order_status
	 */
	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}
	/**
	 * 获取：order_status
	 */
	public Integer getOrderStatus() {
		return orderStatus;
	}
	/**
	 * 设置：payTime
	 */
	public void setPaytime(Date paytime) {
		this.paytime = paytime;
	}
	/**
	 * 获取：payTime
	 */
	public Date getPaytime() {
		return paytime;
	}
	/**
	 * 设置：pay_msg
	 */
	public void setPayMsg(String payMsg) {
		this.payMsg = payMsg;
	}
	/**
	 * 获取：pay_msg
	 */
	public String getPayMsg() {
		return payMsg;
	}
	/**
	 * 设置：refund
	 */
	public void setRefund(BigDecimal refund) {
		this.refund = refund;
	}
	/**
	 * 获取：refund
	 */
	public BigDecimal getRefund() {
		return refund;
	}
	/**
	 * 设置：refund_type
	 */
	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}
	/**
	 * 获取：refund_type
	 */
	public String getRefundType() {
		return refundType;
	}
	/**
	 * 设置：shipCode
	 */
	public void setShipcode(String shipcode) {
		this.shipcode = shipcode;
	}
	/**
	 * 获取：shipCode
	 */
	public String getShipcode() {
		return shipcode;
	}
	/**
	 * 设置：shipTime
	 */
	public void setShiptime(Date shiptime) {
		this.shiptime = shiptime;
	}
	/**
	 * 获取：shipTime
	 */
	public Date getShiptime() {
		return shiptime;
	}
	/**
	 * 设置：ship_price
	 */
	public void setShipPrice(BigDecimal shipPrice) {
		this.shipPrice = shipPrice;
	}
	/**
	 * 获取：ship_price
	 */
	public BigDecimal getShipPrice() {
		return shipPrice;
	}
	/**
	 * 设置：totalPrice
	 */
	public void setTotalprice(BigDecimal totalprice) {
		this.totalprice = totalprice;
	}
	/**
	 * 获取：totalPrice
	 */
	public BigDecimal getTotalprice() {
		return totalprice;
	}
	/**
	 * 设置：addr_id
	 */
	public void setAddrId(Long addrId) {
		this.addrId = addrId;
	}
	/**
	 * 获取：addr_id
	 */
	public Long getAddrId() {
		return addrId;
	}
	/**
	 * 设置：payment_id
	 */
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	/**
	 * 获取：payment_id
	 */
	public Long getPaymentId() {
		return paymentId;
	}
	/**
	 * 设置：store_id
	 */
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}
	/**
	 * 获取：store_id
	 */
	public Long getStoreId() {
		return storeId;
	}
	/**
	 * 设置：user_id
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：user_id
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * 设置：auto_confirm_email
	 */
	public void setAutoConfirmEmail(Boolean autoConfirmEmail) {
		this.autoConfirmEmail = autoConfirmEmail;
	}
	/**
	 * 获取：auto_confirm_email
	 */
	public Boolean getAutoConfirmEmail() {
		return autoConfirmEmail;
	}
	/**
	 * 设置：auto_confirm_sms
	 */
	public void setAutoConfirmSms(Boolean autoConfirmSms) {
		this.autoConfirmSms = autoConfirmSms;
	}
	/**
	 * 获取：auto_confirm_sms
	 */
	public Boolean getAutoConfirmSms() {
		return autoConfirmSms;
	}
	/**
	 * 设置：transport
	 */
	public void setTransport(String transport) {
		this.transport = transport;
	}
	/**
	 * 获取：transport
	 */
	public String getTransport() {
		return transport;
	}
	/**
	 * 设置：out_order_id
	 */
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}
	/**
	 * 获取：out_order_id
	 */
	public String getOutOrderId() {
		return outOrderId;
	}
	/**
	 * 设置：ec_id
	 */
	public void setEcId(Long ecId) {
		this.ecId = ecId;
	}
	/**
	 * 获取：ec_id
	 */
	public Long getEcId() {
		return ecId;
	}
	/**
	 * 设置：ci_id
	 */
	public void setCiId(Long ciId) {
		this.ciId = ciId;
	}
	/**
	 * 获取：ci_id
	 */
	public Long getCiId() {
		return ciId;
	}
	/**
	 * 设置：order_seller_intro
	 */
	public void setOrderSellerIntro(String orderSellerIntro) {
		this.orderSellerIntro = orderSellerIntro;
	}
	/**
	 * 获取：order_seller_intro
	 */
	public String getOrderSellerIntro() {
		return orderSellerIntro;
	}
	/**
	 * 设置：return_shipCode
	 */
	public void setReturnShipcode(String returnShipcode) {
		this.returnShipcode = returnShipcode;
	}
	/**
	 * 获取：return_shipCode
	 */
	public String getReturnShipcode() {
		return returnShipcode;
	}
	/**
	 * 设置：return_ec_id
	 */
	public void setReturnEcId(Long returnEcId) {
		this.returnEcId = returnEcId;
	}
	/**
	 * 获取：return_ec_id
	 */
	public Long getReturnEcId() {
		return returnEcId;
	}
	/**
	 * 设置：return_content
	 */
	public void setReturnContent(String returnContent) {
		this.returnContent = returnContent;
	}
	/**
	 * 获取：return_content
	 */
	public String getReturnContent() {
		return returnContent;
	}
	/**
	 * 设置：return_shipTime
	 */
	public void setReturnShiptime(Date returnShiptime) {
		this.returnShiptime = returnShiptime;
	}
	/**
	 * 获取：return_shipTime
	 */
	public Date getReturnShiptime() {
		return returnShiptime;
	}
	/**
	 * 设置：order_type
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	/**
	 * 获取：order_type
	 */
	public String getOrderType() {
		return orderType;
	}
}

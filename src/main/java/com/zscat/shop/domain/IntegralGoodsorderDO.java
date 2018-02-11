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
public class IntegralGoodsorderDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//igo_msg
	private String igoMsg;
	//igo_order_sn
	private String igoOrderSn;
	//igo_pay_msg
	private String igoPayMsg;
	//igo_pay_time
	private Date igoPayTime;
	//igo_payment
	private String igoPayment;
	//igo_ship_code
	private String igoShipCode;
	//igo_ship_content
	private String igoShipContent;
	//igo_ship_time
	private Date igoShipTime;
	//igo_status
	private Integer igoStatus;
	//igo_total_integral
	private Integer igoTotalIntegral;
	//igo_trans_fee
	private BigDecimal igoTransFee;
	//igo_addr_id
	private Long igoAddrId;
	//igo_user_id
	private Long igoUserId;

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
	 * 设置：igo_msg
	 */
	public void setIgoMsg(String igoMsg) {
		this.igoMsg = igoMsg;
	}
	/**
	 * 获取：igo_msg
	 */
	public String getIgoMsg() {
		return igoMsg;
	}
	/**
	 * 设置：igo_order_sn
	 */
	public void setIgoOrderSn(String igoOrderSn) {
		this.igoOrderSn = igoOrderSn;
	}
	/**
	 * 获取：igo_order_sn
	 */
	public String getIgoOrderSn() {
		return igoOrderSn;
	}
	/**
	 * 设置：igo_pay_msg
	 */
	public void setIgoPayMsg(String igoPayMsg) {
		this.igoPayMsg = igoPayMsg;
	}
	/**
	 * 获取：igo_pay_msg
	 */
	public String getIgoPayMsg() {
		return igoPayMsg;
	}
	/**
	 * 设置：igo_pay_time
	 */
	public void setIgoPayTime(Date igoPayTime) {
		this.igoPayTime = igoPayTime;
	}
	/**
	 * 获取：igo_pay_time
	 */
	public Date getIgoPayTime() {
		return igoPayTime;
	}
	/**
	 * 设置：igo_payment
	 */
	public void setIgoPayment(String igoPayment) {
		this.igoPayment = igoPayment;
	}
	/**
	 * 获取：igo_payment
	 */
	public String getIgoPayment() {
		return igoPayment;
	}
	/**
	 * 设置：igo_ship_code
	 */
	public void setIgoShipCode(String igoShipCode) {
		this.igoShipCode = igoShipCode;
	}
	/**
	 * 获取：igo_ship_code
	 */
	public String getIgoShipCode() {
		return igoShipCode;
	}
	/**
	 * 设置：igo_ship_content
	 */
	public void setIgoShipContent(String igoShipContent) {
		this.igoShipContent = igoShipContent;
	}
	/**
	 * 获取：igo_ship_content
	 */
	public String getIgoShipContent() {
		return igoShipContent;
	}
	/**
	 * 设置：igo_ship_time
	 */
	public void setIgoShipTime(Date igoShipTime) {
		this.igoShipTime = igoShipTime;
	}
	/**
	 * 获取：igo_ship_time
	 */
	public Date getIgoShipTime() {
		return igoShipTime;
	}
	/**
	 * 设置：igo_status
	 */
	public void setIgoStatus(Integer igoStatus) {
		this.igoStatus = igoStatus;
	}
	/**
	 * 获取：igo_status
	 */
	public Integer getIgoStatus() {
		return igoStatus;
	}
	/**
	 * 设置：igo_total_integral
	 */
	public void setIgoTotalIntegral(Integer igoTotalIntegral) {
		this.igoTotalIntegral = igoTotalIntegral;
	}
	/**
	 * 获取：igo_total_integral
	 */
	public Integer getIgoTotalIntegral() {
		return igoTotalIntegral;
	}
	/**
	 * 设置：igo_trans_fee
	 */
	public void setIgoTransFee(BigDecimal igoTransFee) {
		this.igoTransFee = igoTransFee;
	}
	/**
	 * 获取：igo_trans_fee
	 */
	public BigDecimal getIgoTransFee() {
		return igoTransFee;
	}
	/**
	 * 设置：igo_addr_id
	 */
	public void setIgoAddrId(Long igoAddrId) {
		this.igoAddrId = igoAddrId;
	}
	/**
	 * 获取：igo_addr_id
	 */
	public Long getIgoAddrId() {
		return igoAddrId;
	}
	/**
	 * 设置：igo_user_id
	 */
	public void setIgoUserId(Long igoUserId) {
		this.igoUserId = igoUserId;
	}
	/**
	 * 获取：igo_user_id
	 */
	public Long getIgoUserId() {
		return igoUserId;
	}
}

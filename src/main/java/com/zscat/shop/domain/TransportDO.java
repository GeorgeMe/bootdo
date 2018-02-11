package com.zscat.shop.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:39
 */
public class TransportDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//trans_ems
	private Boolean transEms;
	//trans_ems_info
	private String transEmsInfo;
	//trans_express
	private Boolean transExpress;
	//trans_express_info
	private String transExpressInfo;
	//trans_mail
	private Boolean transMail;
	//trans_mail_info
	private String transMailInfo;
	//trans_name
	private String transName;
	//store_id
	private Long storeId;
	//trans_time
	private Integer transTime;
	//trans_type
	private Integer transType;

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
	 * 设置：trans_ems
	 */
	public void setTransEms(Boolean transEms) {
		this.transEms = transEms;
	}
	/**
	 * 获取：trans_ems
	 */
	public Boolean getTransEms() {
		return transEms;
	}
	/**
	 * 设置：trans_ems_info
	 */
	public void setTransEmsInfo(String transEmsInfo) {
		this.transEmsInfo = transEmsInfo;
	}
	/**
	 * 获取：trans_ems_info
	 */
	public String getTransEmsInfo() {
		return transEmsInfo;
	}
	/**
	 * 设置：trans_express
	 */
	public void setTransExpress(Boolean transExpress) {
		this.transExpress = transExpress;
	}
	/**
	 * 获取：trans_express
	 */
	public Boolean getTransExpress() {
		return transExpress;
	}
	/**
	 * 设置：trans_express_info
	 */
	public void setTransExpressInfo(String transExpressInfo) {
		this.transExpressInfo = transExpressInfo;
	}
	/**
	 * 获取：trans_express_info
	 */
	public String getTransExpressInfo() {
		return transExpressInfo;
	}
	/**
	 * 设置：trans_mail
	 */
	public void setTransMail(Boolean transMail) {
		this.transMail = transMail;
	}
	/**
	 * 获取：trans_mail
	 */
	public Boolean getTransMail() {
		return transMail;
	}
	/**
	 * 设置：trans_mail_info
	 */
	public void setTransMailInfo(String transMailInfo) {
		this.transMailInfo = transMailInfo;
	}
	/**
	 * 获取：trans_mail_info
	 */
	public String getTransMailInfo() {
		return transMailInfo;
	}
	/**
	 * 设置：trans_name
	 */
	public void setTransName(String transName) {
		this.transName = transName;
	}
	/**
	 * 获取：trans_name
	 */
	public String getTransName() {
		return transName;
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
	 * 设置：trans_time
	 */
	public void setTransTime(Integer transTime) {
		this.transTime = transTime;
	}
	/**
	 * 获取：trans_time
	 */
	public Integer getTransTime() {
		return transTime;
	}
	/**
	 * 设置：trans_type
	 */
	public void setTransType(Integer transType) {
		this.transType = transType;
	}
	/**
	 * 获取：trans_type
	 */
	public Integer getTransType() {
		return transType;
	}
}

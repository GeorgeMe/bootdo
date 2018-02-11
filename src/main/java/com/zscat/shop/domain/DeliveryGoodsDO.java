package com.zscat.shop.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:36
 */
public class DeliveryGoodsDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//d_status
	private Integer dStatus;
	//d_admin_user_id
	private Long dAdminUserId;
	//d_delivery_goods_id
	private Long dDeliveryGoodsId;
	//d_goods_id
	private Long dGoodsId;
	//d_begin_time
	private Date dBeginTime;
	//d_end_time
	private Date dEndTime;
	//d_audit_time
	private Date dAuditTime;
	//d_refuse_time
	private Date dRefuseTime;

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
	 * 设置：d_status
	 */
	public void setDStatus(Integer dStatus) {
		this.dStatus = dStatus;
	}
	/**
	 * 获取：d_status
	 */
	public Integer getDStatus() {
		return dStatus;
	}
	/**
	 * 设置：d_admin_user_id
	 */
	public void setDAdminUserId(Long dAdminUserId) {
		this.dAdminUserId = dAdminUserId;
	}
	/**
	 * 获取：d_admin_user_id
	 */
	public Long getDAdminUserId() {
		return dAdminUserId;
	}
	/**
	 * 设置：d_delivery_goods_id
	 */
	public void setDDeliveryGoodsId(Long dDeliveryGoodsId) {
		this.dDeliveryGoodsId = dDeliveryGoodsId;
	}
	/**
	 * 获取：d_delivery_goods_id
	 */
	public Long getDDeliveryGoodsId() {
		return dDeliveryGoodsId;
	}
	/**
	 * 设置：d_goods_id
	 */
	public void setDGoodsId(Long dGoodsId) {
		this.dGoodsId = dGoodsId;
	}
	/**
	 * 获取：d_goods_id
	 */
	public Long getDGoodsId() {
		return dGoodsId;
	}
	/**
	 * 设置：d_begin_time
	 */
	public void setDBeginTime(Date dBeginTime) {
		this.dBeginTime = dBeginTime;
	}
	/**
	 * 获取：d_begin_time
	 */
	public Date getDBeginTime() {
		return dBeginTime;
	}
	/**
	 * 设置：d_end_time
	 */
	public void setDEndTime(Date dEndTime) {
		this.dEndTime = dEndTime;
	}
	/**
	 * 获取：d_end_time
	 */
	public Date getDEndTime() {
		return dEndTime;
	}
	/**
	 * 设置：d_audit_time
	 */
	public void setDAuditTime(Date dAuditTime) {
		this.dAuditTime = dAuditTime;
	}
	/**
	 * 获取：d_audit_time
	 */
	public Date getDAuditTime() {
		return dAuditTime;
	}
	/**
	 * 设置：d_refuse_time
	 */
	public void setDRefuseTime(Date dRefuseTime) {
		this.dRefuseTime = dRefuseTime;
	}
	/**
	 * 获取：d_refuse_time
	 */
	public Date getDRefuseTime() {
		return dRefuseTime;
	}
}

package com.zscat.shop.domain;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;



/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:35
 */
public class BargainGoodsDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//bg_price
	private BigDecimal bgPrice;
	//bg_status
	private Integer bgStatus;
	//bg_time
	private Date bgTime;
	//bg_admin_user_id
	private Long bgAdminUserId;
	//bg_goods_id
	private Long bgGoodsId;
	//bg_count
	private Integer bgCount;
	//bg_rebate
	private BigDecimal bgRebate;
	//audit_time
	private Date auditTime;

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
	 * 设置：bg_price
	 */
	public void setBgPrice(BigDecimal bgPrice) {
		this.bgPrice = bgPrice;
	}
	/**
	 * 获取：bg_price
	 */
	public BigDecimal getBgPrice() {
		return bgPrice;
	}
	/**
	 * 设置：bg_status
	 */
	public void setBgStatus(Integer bgStatus) {
		this.bgStatus = bgStatus;
	}
	/**
	 * 获取：bg_status
	 */
	public Integer getBgStatus() {
		return bgStatus;
	}
	/**
	 * 设置：bg_time
	 */
	public void setBgTime(Date bgTime) {
		this.bgTime = bgTime;
	}
	/**
	 * 获取：bg_time
	 */
	public Date getBgTime() {
		return bgTime;
	}
	/**
	 * 设置：bg_admin_user_id
	 */
	public void setBgAdminUserId(Long bgAdminUserId) {
		this.bgAdminUserId = bgAdminUserId;
	}
	/**
	 * 获取：bg_admin_user_id
	 */
	public Long getBgAdminUserId() {
		return bgAdminUserId;
	}
	/**
	 * 设置：bg_goods_id
	 */
	public void setBgGoodsId(Long bgGoodsId) {
		this.bgGoodsId = bgGoodsId;
	}
	/**
	 * 获取：bg_goods_id
	 */
	public Long getBgGoodsId() {
		return bgGoodsId;
	}
	/**
	 * 设置：bg_count
	 */
	public void setBgCount(Integer bgCount) {
		this.bgCount = bgCount;
	}
	/**
	 * 获取：bg_count
	 */
	public Integer getBgCount() {
		return bgCount;
	}
	/**
	 * 设置：bg_rebate
	 */
	public void setBgRebate(BigDecimal bgRebate) {
		this.bgRebate = bgRebate;
	}
	/**
	 * 获取：bg_rebate
	 */
	public BigDecimal getBgRebate() {
		return bgRebate;
	}
	/**
	 * 设置：audit_time
	 */
	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}
	/**
	 * 获取：audit_time
	 */
	public Date getAuditTime() {
		return auditTime;
	}
}

package com.zscat.shop.domain;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;



/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:36
 */
public class EvaluateDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//evaluate_admin_info
	private String evaluateAdminInfo;
	//evaluate_buyer_val
	private Integer evaluateBuyerVal;
	//evaluate_info
	private String evaluateInfo;
	//evaluate_seller_info
	private String evaluateSellerInfo;
	//evaluate_seller_time
	private Date evaluateSellerTime;
	//evaluate_seller_val
	private Integer evaluateSellerVal;
	//evaluate_status
	private Integer evaluateStatus;
	//evaluate_type
	private String evaluateType;
	//goods_spec
	private String goodsSpec;
	//evaluate_goods_id
	private Long evaluateGoodsId;
	//evaluate_seller_user_id
	private Long evaluateSellerUserId;
	//evaluate_user_id
	private Long evaluateUserId;
	//of_id
	private Long ofId;
	//description_evaluate
	private BigDecimal descriptionEvaluate;
	//service_evaluate
	private BigDecimal serviceEvaluate;
	//ship_evaluate
	private BigDecimal shipEvaluate;

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
	 * 设置：evaluate_admin_info
	 */
	public void setEvaluateAdminInfo(String evaluateAdminInfo) {
		this.evaluateAdminInfo = evaluateAdminInfo;
	}
	/**
	 * 获取：evaluate_admin_info
	 */
	public String getEvaluateAdminInfo() {
		return evaluateAdminInfo;
	}
	/**
	 * 设置：evaluate_buyer_val
	 */
	public void setEvaluateBuyerVal(Integer evaluateBuyerVal) {
		this.evaluateBuyerVal = evaluateBuyerVal;
	}
	/**
	 * 获取：evaluate_buyer_val
	 */
	public Integer getEvaluateBuyerVal() {
		return evaluateBuyerVal;
	}
	/**
	 * 设置：evaluate_info
	 */
	public void setEvaluateInfo(String evaluateInfo) {
		this.evaluateInfo = evaluateInfo;
	}
	/**
	 * 获取：evaluate_info
	 */
	public String getEvaluateInfo() {
		return evaluateInfo;
	}
	/**
	 * 设置：evaluate_seller_info
	 */
	public void setEvaluateSellerInfo(String evaluateSellerInfo) {
		this.evaluateSellerInfo = evaluateSellerInfo;
	}
	/**
	 * 获取：evaluate_seller_info
	 */
	public String getEvaluateSellerInfo() {
		return evaluateSellerInfo;
	}
	/**
	 * 设置：evaluate_seller_time
	 */
	public void setEvaluateSellerTime(Date evaluateSellerTime) {
		this.evaluateSellerTime = evaluateSellerTime;
	}
	/**
	 * 获取：evaluate_seller_time
	 */
	public Date getEvaluateSellerTime() {
		return evaluateSellerTime;
	}
	/**
	 * 设置：evaluate_seller_val
	 */
	public void setEvaluateSellerVal(Integer evaluateSellerVal) {
		this.evaluateSellerVal = evaluateSellerVal;
	}
	/**
	 * 获取：evaluate_seller_val
	 */
	public Integer getEvaluateSellerVal() {
		return evaluateSellerVal;
	}
	/**
	 * 设置：evaluate_status
	 */
	public void setEvaluateStatus(Integer evaluateStatus) {
		this.evaluateStatus = evaluateStatus;
	}
	/**
	 * 获取：evaluate_status
	 */
	public Integer getEvaluateStatus() {
		return evaluateStatus;
	}
	/**
	 * 设置：evaluate_type
	 */
	public void setEvaluateType(String evaluateType) {
		this.evaluateType = evaluateType;
	}
	/**
	 * 获取：evaluate_type
	 */
	public String getEvaluateType() {
		return evaluateType;
	}
	/**
	 * 设置：goods_spec
	 */
	public void setGoodsSpec(String goodsSpec) {
		this.goodsSpec = goodsSpec;
	}
	/**
	 * 获取：goods_spec
	 */
	public String getGoodsSpec() {
		return goodsSpec;
	}
	/**
	 * 设置：evaluate_goods_id
	 */
	public void setEvaluateGoodsId(Long evaluateGoodsId) {
		this.evaluateGoodsId = evaluateGoodsId;
	}
	/**
	 * 获取：evaluate_goods_id
	 */
	public Long getEvaluateGoodsId() {
		return evaluateGoodsId;
	}
	/**
	 * 设置：evaluate_seller_user_id
	 */
	public void setEvaluateSellerUserId(Long evaluateSellerUserId) {
		this.evaluateSellerUserId = evaluateSellerUserId;
	}
	/**
	 * 获取：evaluate_seller_user_id
	 */
	public Long getEvaluateSellerUserId() {
		return evaluateSellerUserId;
	}
	/**
	 * 设置：evaluate_user_id
	 */
	public void setEvaluateUserId(Long evaluateUserId) {
		this.evaluateUserId = evaluateUserId;
	}
	/**
	 * 获取：evaluate_user_id
	 */
	public Long getEvaluateUserId() {
		return evaluateUserId;
	}
	/**
	 * 设置：of_id
	 */
	public void setOfId(Long ofId) {
		this.ofId = ofId;
	}
	/**
	 * 获取：of_id
	 */
	public Long getOfId() {
		return ofId;
	}
	/**
	 * 设置：description_evaluate
	 */
	public void setDescriptionEvaluate(BigDecimal descriptionEvaluate) {
		this.descriptionEvaluate = descriptionEvaluate;
	}
	/**
	 * 获取：description_evaluate
	 */
	public BigDecimal getDescriptionEvaluate() {
		return descriptionEvaluate;
	}
	/**
	 * 设置：service_evaluate
	 */
	public void setServiceEvaluate(BigDecimal serviceEvaluate) {
		this.serviceEvaluate = serviceEvaluate;
	}
	/**
	 * 获取：service_evaluate
	 */
	public BigDecimal getServiceEvaluate() {
		return serviceEvaluate;
	}
	/**
	 * 设置：ship_evaluate
	 */
	public void setShipEvaluate(BigDecimal shipEvaluate) {
		this.shipEvaluate = shipEvaluate;
	}
	/**
	 * 获取：ship_evaluate
	 */
	public BigDecimal getShipEvaluate() {
		return shipEvaluate;
	}
}

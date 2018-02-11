package com.zscat.shop.domain;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;



/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public class StorePointDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//description_evaluate
	private BigDecimal descriptionEvaluate;
	//description_evaluate_halfyear
	private BigDecimal descriptionEvaluateHalfyear;
	//description_evaluate_halfyear_count1
	private Integer descriptionEvaluateHalfyearCount1;
	//description_evaluate_halfyear_count2
	private Integer descriptionEvaluateHalfyearCount2;
	//description_evaluate_halfyear_count3
	private Integer descriptionEvaluateHalfyearCount3;
	//description_evaluate_halfyear_count4
	private Integer descriptionEvaluateHalfyearCount4;
	//description_evaluate_halfyear_count5
	private Integer descriptionEvaluateHalfyearCount5;
	//service_evaluate
	private BigDecimal serviceEvaluate;
	//service_evaluate_halfyear
	private BigDecimal serviceEvaluateHalfyear;
	//service_evaluate_halfyear_count1
	private Integer serviceEvaluateHalfyearCount1;
	//service_evaluate_halfyear_count2
	private Integer serviceEvaluateHalfyearCount2;
	//service_evaluate_halfyear_count3
	private Integer serviceEvaluateHalfyearCount3;
	//service_evaluate_halfyear_count4
	private Integer serviceEvaluateHalfyearCount4;
	//service_evaluate_halfyear_count5
	private Integer serviceEvaluateHalfyearCount5;
	//ship_evaluate
	private BigDecimal shipEvaluate;
	//ship_evaluate_halfyear
	private BigDecimal shipEvaluateHalfyear;
	//ship_evaluate_halfyear_count1
	private Integer shipEvaluateHalfyearCount1;
	//ship_evaluate_halfyear_count2
	private Integer shipEvaluateHalfyearCount2;
	//ship_evaluate_halfyear_count3
	private Integer shipEvaluateHalfyearCount3;
	//ship_evaluate_halfyear_count4
	private Integer shipEvaluateHalfyearCount4;
	//ship_evaluate_halfyear_count5
	private Integer shipEvaluateHalfyearCount5;
	//store_evaluate1
	private BigDecimal storeEvaluate1;
	//store_id
	private Long storeId;
	//statTime
	private Date stattime;

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
	 * 设置：description_evaluate_halfyear
	 */
	public void setDescriptionEvaluateHalfyear(BigDecimal descriptionEvaluateHalfyear) {
		this.descriptionEvaluateHalfyear = descriptionEvaluateHalfyear;
	}
	/**
	 * 获取：description_evaluate_halfyear
	 */
	public BigDecimal getDescriptionEvaluateHalfyear() {
		return descriptionEvaluateHalfyear;
	}
	/**
	 * 设置：description_evaluate_halfyear_count1
	 */
	public void setDescriptionEvaluateHalfyearCount1(Integer descriptionEvaluateHalfyearCount1) {
		this.descriptionEvaluateHalfyearCount1 = descriptionEvaluateHalfyearCount1;
	}
	/**
	 * 获取：description_evaluate_halfyear_count1
	 */
	public Integer getDescriptionEvaluateHalfyearCount1() {
		return descriptionEvaluateHalfyearCount1;
	}
	/**
	 * 设置：description_evaluate_halfyear_count2
	 */
	public void setDescriptionEvaluateHalfyearCount2(Integer descriptionEvaluateHalfyearCount2) {
		this.descriptionEvaluateHalfyearCount2 = descriptionEvaluateHalfyearCount2;
	}
	/**
	 * 获取：description_evaluate_halfyear_count2
	 */
	public Integer getDescriptionEvaluateHalfyearCount2() {
		return descriptionEvaluateHalfyearCount2;
	}
	/**
	 * 设置：description_evaluate_halfyear_count3
	 */
	public void setDescriptionEvaluateHalfyearCount3(Integer descriptionEvaluateHalfyearCount3) {
		this.descriptionEvaluateHalfyearCount3 = descriptionEvaluateHalfyearCount3;
	}
	/**
	 * 获取：description_evaluate_halfyear_count3
	 */
	public Integer getDescriptionEvaluateHalfyearCount3() {
		return descriptionEvaluateHalfyearCount3;
	}
	/**
	 * 设置：description_evaluate_halfyear_count4
	 */
	public void setDescriptionEvaluateHalfyearCount4(Integer descriptionEvaluateHalfyearCount4) {
		this.descriptionEvaluateHalfyearCount4 = descriptionEvaluateHalfyearCount4;
	}
	/**
	 * 获取：description_evaluate_halfyear_count4
	 */
	public Integer getDescriptionEvaluateHalfyearCount4() {
		return descriptionEvaluateHalfyearCount4;
	}
	/**
	 * 设置：description_evaluate_halfyear_count5
	 */
	public void setDescriptionEvaluateHalfyearCount5(Integer descriptionEvaluateHalfyearCount5) {
		this.descriptionEvaluateHalfyearCount5 = descriptionEvaluateHalfyearCount5;
	}
	/**
	 * 获取：description_evaluate_halfyear_count5
	 */
	public Integer getDescriptionEvaluateHalfyearCount5() {
		return descriptionEvaluateHalfyearCount5;
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
	 * 设置：service_evaluate_halfyear
	 */
	public void setServiceEvaluateHalfyear(BigDecimal serviceEvaluateHalfyear) {
		this.serviceEvaluateHalfyear = serviceEvaluateHalfyear;
	}
	/**
	 * 获取：service_evaluate_halfyear
	 */
	public BigDecimal getServiceEvaluateHalfyear() {
		return serviceEvaluateHalfyear;
	}
	/**
	 * 设置：service_evaluate_halfyear_count1
	 */
	public void setServiceEvaluateHalfyearCount1(Integer serviceEvaluateHalfyearCount1) {
		this.serviceEvaluateHalfyearCount1 = serviceEvaluateHalfyearCount1;
	}
	/**
	 * 获取：service_evaluate_halfyear_count1
	 */
	public Integer getServiceEvaluateHalfyearCount1() {
		return serviceEvaluateHalfyearCount1;
	}
	/**
	 * 设置：service_evaluate_halfyear_count2
	 */
	public void setServiceEvaluateHalfyearCount2(Integer serviceEvaluateHalfyearCount2) {
		this.serviceEvaluateHalfyearCount2 = serviceEvaluateHalfyearCount2;
	}
	/**
	 * 获取：service_evaluate_halfyear_count2
	 */
	public Integer getServiceEvaluateHalfyearCount2() {
		return serviceEvaluateHalfyearCount2;
	}
	/**
	 * 设置：service_evaluate_halfyear_count3
	 */
	public void setServiceEvaluateHalfyearCount3(Integer serviceEvaluateHalfyearCount3) {
		this.serviceEvaluateHalfyearCount3 = serviceEvaluateHalfyearCount3;
	}
	/**
	 * 获取：service_evaluate_halfyear_count3
	 */
	public Integer getServiceEvaluateHalfyearCount3() {
		return serviceEvaluateHalfyearCount3;
	}
	/**
	 * 设置：service_evaluate_halfyear_count4
	 */
	public void setServiceEvaluateHalfyearCount4(Integer serviceEvaluateHalfyearCount4) {
		this.serviceEvaluateHalfyearCount4 = serviceEvaluateHalfyearCount4;
	}
	/**
	 * 获取：service_evaluate_halfyear_count4
	 */
	public Integer getServiceEvaluateHalfyearCount4() {
		return serviceEvaluateHalfyearCount4;
	}
	/**
	 * 设置：service_evaluate_halfyear_count5
	 */
	public void setServiceEvaluateHalfyearCount5(Integer serviceEvaluateHalfyearCount5) {
		this.serviceEvaluateHalfyearCount5 = serviceEvaluateHalfyearCount5;
	}
	/**
	 * 获取：service_evaluate_halfyear_count5
	 */
	public Integer getServiceEvaluateHalfyearCount5() {
		return serviceEvaluateHalfyearCount5;
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
	/**
	 * 设置：ship_evaluate_halfyear
	 */
	public void setShipEvaluateHalfyear(BigDecimal shipEvaluateHalfyear) {
		this.shipEvaluateHalfyear = shipEvaluateHalfyear;
	}
	/**
	 * 获取：ship_evaluate_halfyear
	 */
	public BigDecimal getShipEvaluateHalfyear() {
		return shipEvaluateHalfyear;
	}
	/**
	 * 设置：ship_evaluate_halfyear_count1
	 */
	public void setShipEvaluateHalfyearCount1(Integer shipEvaluateHalfyearCount1) {
		this.shipEvaluateHalfyearCount1 = shipEvaluateHalfyearCount1;
	}
	/**
	 * 获取：ship_evaluate_halfyear_count1
	 */
	public Integer getShipEvaluateHalfyearCount1() {
		return shipEvaluateHalfyearCount1;
	}
	/**
	 * 设置：ship_evaluate_halfyear_count2
	 */
	public void setShipEvaluateHalfyearCount2(Integer shipEvaluateHalfyearCount2) {
		this.shipEvaluateHalfyearCount2 = shipEvaluateHalfyearCount2;
	}
	/**
	 * 获取：ship_evaluate_halfyear_count2
	 */
	public Integer getShipEvaluateHalfyearCount2() {
		return shipEvaluateHalfyearCount2;
	}
	/**
	 * 设置：ship_evaluate_halfyear_count3
	 */
	public void setShipEvaluateHalfyearCount3(Integer shipEvaluateHalfyearCount3) {
		this.shipEvaluateHalfyearCount3 = shipEvaluateHalfyearCount3;
	}
	/**
	 * 获取：ship_evaluate_halfyear_count3
	 */
	public Integer getShipEvaluateHalfyearCount3() {
		return shipEvaluateHalfyearCount3;
	}
	/**
	 * 设置：ship_evaluate_halfyear_count4
	 */
	public void setShipEvaluateHalfyearCount4(Integer shipEvaluateHalfyearCount4) {
		this.shipEvaluateHalfyearCount4 = shipEvaluateHalfyearCount4;
	}
	/**
	 * 获取：ship_evaluate_halfyear_count4
	 */
	public Integer getShipEvaluateHalfyearCount4() {
		return shipEvaluateHalfyearCount4;
	}
	/**
	 * 设置：ship_evaluate_halfyear_count5
	 */
	public void setShipEvaluateHalfyearCount5(Integer shipEvaluateHalfyearCount5) {
		this.shipEvaluateHalfyearCount5 = shipEvaluateHalfyearCount5;
	}
	/**
	 * 获取：ship_evaluate_halfyear_count5
	 */
	public Integer getShipEvaluateHalfyearCount5() {
		return shipEvaluateHalfyearCount5;
	}
	/**
	 * 设置：store_evaluate1
	 */
	public void setStoreEvaluate1(BigDecimal storeEvaluate1) {
		this.storeEvaluate1 = storeEvaluate1;
	}
	/**
	 * 获取：store_evaluate1
	 */
	public BigDecimal getStoreEvaluate1() {
		return storeEvaluate1;
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
	 * 设置：statTime
	 */
	public void setStattime(Date stattime) {
		this.stattime = stattime;
	}
	/**
	 * 获取：statTime
	 */
	public Date getStattime() {
		return stattime;
	}
}

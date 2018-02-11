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
public class GoodsDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//goods_click
	private Integer goodsClick;
	//goods_details
	private String goodsDetails;
	//goods_fee
	private String goodsFee;
	//goods_inventory
	private Integer goodsInventory;
	//goods_inventory_detail
	private String goodsInventoryDetail;
	//goods_name
	private String goodsName;
	//goods_price
	private BigDecimal goodsPrice;
	//goods_property
	private String goodsProperty;
	//goods_recommend
	private Boolean goodsRecommend;
	//goods_salenum
	private Integer goodsSalenum;
	//goods_seller_time
	private Date goodsSellerTime;
	//goods_serial
	private String goodsSerial;
	//goods_status
	private Integer goodsStatus;
	//goods_transfee
	private Integer goodsTransfee;
	//goods_weight
	private BigDecimal goodsWeight;
	//inventory_type
	private String inventoryType;
	//seo_description
	private String seoDescription;
	//seo_keywords
	private String seoKeywords;
	//store_price
	private BigDecimal storePrice;
	//store_recommend
	private Boolean storeRecommend;
	//store_recommend_time
	private Date storeRecommendTime;
	//ztc_admin_content
	private String ztcAdminContent;
	//ztc_apply_time
	private Date ztcApplyTime;
	//ztc_begin_time
	private Date ztcBeginTime;
	//ztc_click_num
	private Integer ztcClickNum;
	//ztc_dredge_price
	private Integer ztcDredgePrice;
	//ztc_gold
	private Integer ztcGold;
	//ztc_pay_status
	private Integer ztcPayStatus;
	//ztc_price
	private Integer ztcPrice;
	//ztc_status
	private Integer ztcStatus;
	//gc_id
	private Long gcId;
	//goods_brand_id
	private Long goodsBrandId;
	//goods_main_photo_id
	private Long goodsMainPhotoId;
	//goods_store_id
	private Long goodsStoreId;
	//ztc_admin_id
	private Long ztcAdminId;
	//goods_collect
	private Integer goodsCollect;
	//group_buy
	private Integer groupBuy;
	//goods_choice_type
	private Integer goodsChoiceType;
	//group_id
	private Long groupId;
	//activity_status
	private Integer activityStatus;
	//bargain_status
	private Integer bargainStatus;
	//delivery_status
	private Integer deliveryStatus;
	//goods_current_price
	private BigDecimal goodsCurrentPrice;
	//goods_volume
	private BigDecimal goodsVolume;
	//ems_trans_fee
	private BigDecimal emsTransFee;
	//express_trans_fee
	private BigDecimal expressTransFee;
	//mail_trans_fee
	private BigDecimal mailTransFee;
	//transport_id
	private Long transportId;
	//combin_status
	private Integer combinStatus;
	//combin_begin_time
	private Date combinBeginTime;
	//combin_end_time
	private Date combinEndTime;
	//combin_price
	private BigDecimal combinPrice;
	//description_evaluate
	private BigDecimal descriptionEvaluate;
	//weixin_shop_hot
	private Boolean weixinShopHot;
	//weixin_shop_hotTime
	private Date weixinShopHottime;
	//weixin_shop_recommend
	private Boolean weixinShopRecommend;
	//weixin_shop_recommendTime
	private Date weixinShopRecommendtime;

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
	 * 设置：goods_click
	 */
	public void setGoodsClick(Integer goodsClick) {
		this.goodsClick = goodsClick;
	}
	/**
	 * 获取：goods_click
	 */
	public Integer getGoodsClick() {
		return goodsClick;
	}
	/**
	 * 设置：goods_details
	 */
	public void setGoodsDetails(String goodsDetails) {
		this.goodsDetails = goodsDetails;
	}
	/**
	 * 获取：goods_details
	 */
	public String getGoodsDetails() {
		return goodsDetails;
	}
	/**
	 * 设置：goods_fee
	 */
	public void setGoodsFee(String goodsFee) {
		this.goodsFee = goodsFee;
	}
	/**
	 * 获取：goods_fee
	 */
	public String getGoodsFee() {
		return goodsFee;
	}
	/**
	 * 设置：goods_inventory
	 */
	public void setGoodsInventory(Integer goodsInventory) {
		this.goodsInventory = goodsInventory;
	}
	/**
	 * 获取：goods_inventory
	 */
	public Integer getGoodsInventory() {
		return goodsInventory;
	}
	/**
	 * 设置：goods_inventory_detail
	 */
	public void setGoodsInventoryDetail(String goodsInventoryDetail) {
		this.goodsInventoryDetail = goodsInventoryDetail;
	}
	/**
	 * 获取：goods_inventory_detail
	 */
	public String getGoodsInventoryDetail() {
		return goodsInventoryDetail;
	}
	/**
	 * 设置：goods_name
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	/**
	 * 获取：goods_name
	 */
	public String getGoodsName() {
		return goodsName;
	}
	/**
	 * 设置：goods_price
	 */
	public void setGoodsPrice(BigDecimal goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	/**
	 * 获取：goods_price
	 */
	public BigDecimal getGoodsPrice() {
		return goodsPrice;
	}
	/**
	 * 设置：goods_property
	 */
	public void setGoodsProperty(String goodsProperty) {
		this.goodsProperty = goodsProperty;
	}
	/**
	 * 获取：goods_property
	 */
	public String getGoodsProperty() {
		return goodsProperty;
	}
	/**
	 * 设置：goods_recommend
	 */
	public void setGoodsRecommend(Boolean goodsRecommend) {
		this.goodsRecommend = goodsRecommend;
	}
	/**
	 * 获取：goods_recommend
	 */
	public Boolean getGoodsRecommend() {
		return goodsRecommend;
	}
	/**
	 * 设置：goods_salenum
	 */
	public void setGoodsSalenum(Integer goodsSalenum) {
		this.goodsSalenum = goodsSalenum;
	}
	/**
	 * 获取：goods_salenum
	 */
	public Integer getGoodsSalenum() {
		return goodsSalenum;
	}
	/**
	 * 设置：goods_seller_time
	 */
	public void setGoodsSellerTime(Date goodsSellerTime) {
		this.goodsSellerTime = goodsSellerTime;
	}
	/**
	 * 获取：goods_seller_time
	 */
	public Date getGoodsSellerTime() {
		return goodsSellerTime;
	}
	/**
	 * 设置：goods_serial
	 */
	public void setGoodsSerial(String goodsSerial) {
		this.goodsSerial = goodsSerial;
	}
	/**
	 * 获取：goods_serial
	 */
	public String getGoodsSerial() {
		return goodsSerial;
	}
	/**
	 * 设置：goods_status
	 */
	public void setGoodsStatus(Integer goodsStatus) {
		this.goodsStatus = goodsStatus;
	}
	/**
	 * 获取：goods_status
	 */
	public Integer getGoodsStatus() {
		return goodsStatus;
	}
	/**
	 * 设置：goods_transfee
	 */
	public void setGoodsTransfee(Integer goodsTransfee) {
		this.goodsTransfee = goodsTransfee;
	}
	/**
	 * 获取：goods_transfee
	 */
	public Integer getGoodsTransfee() {
		return goodsTransfee;
	}
	/**
	 * 设置：goods_weight
	 */
	public void setGoodsWeight(BigDecimal goodsWeight) {
		this.goodsWeight = goodsWeight;
	}
	/**
	 * 获取：goods_weight
	 */
	public BigDecimal getGoodsWeight() {
		return goodsWeight;
	}
	/**
	 * 设置：inventory_type
	 */
	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}
	/**
	 * 获取：inventory_type
	 */
	public String getInventoryType() {
		return inventoryType;
	}
	/**
	 * 设置：seo_description
	 */
	public void setSeoDescription(String seoDescription) {
		this.seoDescription = seoDescription;
	}
	/**
	 * 获取：seo_description
	 */
	public String getSeoDescription() {
		return seoDescription;
	}
	/**
	 * 设置：seo_keywords
	 */
	public void setSeoKeywords(String seoKeywords) {
		this.seoKeywords = seoKeywords;
	}
	/**
	 * 获取：seo_keywords
	 */
	public String getSeoKeywords() {
		return seoKeywords;
	}
	/**
	 * 设置：store_price
	 */
	public void setStorePrice(BigDecimal storePrice) {
		this.storePrice = storePrice;
	}
	/**
	 * 获取：store_price
	 */
	public BigDecimal getStorePrice() {
		return storePrice;
	}
	/**
	 * 设置：store_recommend
	 */
	public void setStoreRecommend(Boolean storeRecommend) {
		this.storeRecommend = storeRecommend;
	}
	/**
	 * 获取：store_recommend
	 */
	public Boolean getStoreRecommend() {
		return storeRecommend;
	}
	/**
	 * 设置：store_recommend_time
	 */
	public void setStoreRecommendTime(Date storeRecommendTime) {
		this.storeRecommendTime = storeRecommendTime;
	}
	/**
	 * 获取：store_recommend_time
	 */
	public Date getStoreRecommendTime() {
		return storeRecommendTime;
	}
	/**
	 * 设置：ztc_admin_content
	 */
	public void setZtcAdminContent(String ztcAdminContent) {
		this.ztcAdminContent = ztcAdminContent;
	}
	/**
	 * 获取：ztc_admin_content
	 */
	public String getZtcAdminContent() {
		return ztcAdminContent;
	}
	/**
	 * 设置：ztc_apply_time
	 */
	public void setZtcApplyTime(Date ztcApplyTime) {
		this.ztcApplyTime = ztcApplyTime;
	}
	/**
	 * 获取：ztc_apply_time
	 */
	public Date getZtcApplyTime() {
		return ztcApplyTime;
	}
	/**
	 * 设置：ztc_begin_time
	 */
	public void setZtcBeginTime(Date ztcBeginTime) {
		this.ztcBeginTime = ztcBeginTime;
	}
	/**
	 * 获取：ztc_begin_time
	 */
	public Date getZtcBeginTime() {
		return ztcBeginTime;
	}
	/**
	 * 设置：ztc_click_num
	 */
	public void setZtcClickNum(Integer ztcClickNum) {
		this.ztcClickNum = ztcClickNum;
	}
	/**
	 * 获取：ztc_click_num
	 */
	public Integer getZtcClickNum() {
		return ztcClickNum;
	}
	/**
	 * 设置：ztc_dredge_price
	 */
	public void setZtcDredgePrice(Integer ztcDredgePrice) {
		this.ztcDredgePrice = ztcDredgePrice;
	}
	/**
	 * 获取：ztc_dredge_price
	 */
	public Integer getZtcDredgePrice() {
		return ztcDredgePrice;
	}
	/**
	 * 设置：ztc_gold
	 */
	public void setZtcGold(Integer ztcGold) {
		this.ztcGold = ztcGold;
	}
	/**
	 * 获取：ztc_gold
	 */
	public Integer getZtcGold() {
		return ztcGold;
	}
	/**
	 * 设置：ztc_pay_status
	 */
	public void setZtcPayStatus(Integer ztcPayStatus) {
		this.ztcPayStatus = ztcPayStatus;
	}
	/**
	 * 获取：ztc_pay_status
	 */
	public Integer getZtcPayStatus() {
		return ztcPayStatus;
	}
	/**
	 * 设置：ztc_price
	 */
	public void setZtcPrice(Integer ztcPrice) {
		this.ztcPrice = ztcPrice;
	}
	/**
	 * 获取：ztc_price
	 */
	public Integer getZtcPrice() {
		return ztcPrice;
	}
	/**
	 * 设置：ztc_status
	 */
	public void setZtcStatus(Integer ztcStatus) {
		this.ztcStatus = ztcStatus;
	}
	/**
	 * 获取：ztc_status
	 */
	public Integer getZtcStatus() {
		return ztcStatus;
	}
	/**
	 * 设置：gc_id
	 */
	public void setGcId(Long gcId) {
		this.gcId = gcId;
	}
	/**
	 * 获取：gc_id
	 */
	public Long getGcId() {
		return gcId;
	}
	/**
	 * 设置：goods_brand_id
	 */
	public void setGoodsBrandId(Long goodsBrandId) {
		this.goodsBrandId = goodsBrandId;
	}
	/**
	 * 获取：goods_brand_id
	 */
	public Long getGoodsBrandId() {
		return goodsBrandId;
	}
	/**
	 * 设置：goods_main_photo_id
	 */
	public void setGoodsMainPhotoId(Long goodsMainPhotoId) {
		this.goodsMainPhotoId = goodsMainPhotoId;
	}
	/**
	 * 获取：goods_main_photo_id
	 */
	public Long getGoodsMainPhotoId() {
		return goodsMainPhotoId;
	}
	/**
	 * 设置：goods_store_id
	 */
	public void setGoodsStoreId(Long goodsStoreId) {
		this.goodsStoreId = goodsStoreId;
	}
	/**
	 * 获取：goods_store_id
	 */
	public Long getGoodsStoreId() {
		return goodsStoreId;
	}
	/**
	 * 设置：ztc_admin_id
	 */
	public void setZtcAdminId(Long ztcAdminId) {
		this.ztcAdminId = ztcAdminId;
	}
	/**
	 * 获取：ztc_admin_id
	 */
	public Long getZtcAdminId() {
		return ztcAdminId;
	}
	/**
	 * 设置：goods_collect
	 */
	public void setGoodsCollect(Integer goodsCollect) {
		this.goodsCollect = goodsCollect;
	}
	/**
	 * 获取：goods_collect
	 */
	public Integer getGoodsCollect() {
		return goodsCollect;
	}
	/**
	 * 设置：group_buy
	 */
	public void setGroupBuy(Integer groupBuy) {
		this.groupBuy = groupBuy;
	}
	/**
	 * 获取：group_buy
	 */
	public Integer getGroupBuy() {
		return groupBuy;
	}
	/**
	 * 设置：goods_choice_type
	 */
	public void setGoodsChoiceType(Integer goodsChoiceType) {
		this.goodsChoiceType = goodsChoiceType;
	}
	/**
	 * 获取：goods_choice_type
	 */
	public Integer getGoodsChoiceType() {
		return goodsChoiceType;
	}
	/**
	 * 设置：group_id
	 */
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	/**
	 * 获取：group_id
	 */
	public Long getGroupId() {
		return groupId;
	}
	/**
	 * 设置：activity_status
	 */
	public void setActivityStatus(Integer activityStatus) {
		this.activityStatus = activityStatus;
	}
	/**
	 * 获取：activity_status
	 */
	public Integer getActivityStatus() {
		return activityStatus;
	}
	/**
	 * 设置：bargain_status
	 */
	public void setBargainStatus(Integer bargainStatus) {
		this.bargainStatus = bargainStatus;
	}
	/**
	 * 获取：bargain_status
	 */
	public Integer getBargainStatus() {
		return bargainStatus;
	}
	/**
	 * 设置：delivery_status
	 */
	public void setDeliveryStatus(Integer deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	/**
	 * 获取：delivery_status
	 */
	public Integer getDeliveryStatus() {
		return deliveryStatus;
	}
	/**
	 * 设置：goods_current_price
	 */
	public void setGoodsCurrentPrice(BigDecimal goodsCurrentPrice) {
		this.goodsCurrentPrice = goodsCurrentPrice;
	}
	/**
	 * 获取：goods_current_price
	 */
	public BigDecimal getGoodsCurrentPrice() {
		return goodsCurrentPrice;
	}
	/**
	 * 设置：goods_volume
	 */
	public void setGoodsVolume(BigDecimal goodsVolume) {
		this.goodsVolume = goodsVolume;
	}
	/**
	 * 获取：goods_volume
	 */
	public BigDecimal getGoodsVolume() {
		return goodsVolume;
	}
	/**
	 * 设置：ems_trans_fee
	 */
	public void setEmsTransFee(BigDecimal emsTransFee) {
		this.emsTransFee = emsTransFee;
	}
	/**
	 * 获取：ems_trans_fee
	 */
	public BigDecimal getEmsTransFee() {
		return emsTransFee;
	}
	/**
	 * 设置：express_trans_fee
	 */
	public void setExpressTransFee(BigDecimal expressTransFee) {
		this.expressTransFee = expressTransFee;
	}
	/**
	 * 获取：express_trans_fee
	 */
	public BigDecimal getExpressTransFee() {
		return expressTransFee;
	}
	/**
	 * 设置：mail_trans_fee
	 */
	public void setMailTransFee(BigDecimal mailTransFee) {
		this.mailTransFee = mailTransFee;
	}
	/**
	 * 获取：mail_trans_fee
	 */
	public BigDecimal getMailTransFee() {
		return mailTransFee;
	}
	/**
	 * 设置：transport_id
	 */
	public void setTransportId(Long transportId) {
		this.transportId = transportId;
	}
	/**
	 * 获取：transport_id
	 */
	public Long getTransportId() {
		return transportId;
	}
	/**
	 * 设置：combin_status
	 */
	public void setCombinStatus(Integer combinStatus) {
		this.combinStatus = combinStatus;
	}
	/**
	 * 获取：combin_status
	 */
	public Integer getCombinStatus() {
		return combinStatus;
	}
	/**
	 * 设置：combin_begin_time
	 */
	public void setCombinBeginTime(Date combinBeginTime) {
		this.combinBeginTime = combinBeginTime;
	}
	/**
	 * 获取：combin_begin_time
	 */
	public Date getCombinBeginTime() {
		return combinBeginTime;
	}
	/**
	 * 设置：combin_end_time
	 */
	public void setCombinEndTime(Date combinEndTime) {
		this.combinEndTime = combinEndTime;
	}
	/**
	 * 获取：combin_end_time
	 */
	public Date getCombinEndTime() {
		return combinEndTime;
	}
	/**
	 * 设置：combin_price
	 */
	public void setCombinPrice(BigDecimal combinPrice) {
		this.combinPrice = combinPrice;
	}
	/**
	 * 获取：combin_price
	 */
	public BigDecimal getCombinPrice() {
		return combinPrice;
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
	 * 设置：weixin_shop_hot
	 */
	public void setWeixinShopHot(Boolean weixinShopHot) {
		this.weixinShopHot = weixinShopHot;
	}
	/**
	 * 获取：weixin_shop_hot
	 */
	public Boolean getWeixinShopHot() {
		return weixinShopHot;
	}
	/**
	 * 设置：weixin_shop_hotTime
	 */
	public void setWeixinShopHottime(Date weixinShopHottime) {
		this.weixinShopHottime = weixinShopHottime;
	}
	/**
	 * 获取：weixin_shop_hotTime
	 */
	public Date getWeixinShopHottime() {
		return weixinShopHottime;
	}
	/**
	 * 设置：weixin_shop_recommend
	 */
	public void setWeixinShopRecommend(Boolean weixinShopRecommend) {
		this.weixinShopRecommend = weixinShopRecommend;
	}
	/**
	 * 获取：weixin_shop_recommend
	 */
	public Boolean getWeixinShopRecommend() {
		return weixinShopRecommend;
	}
	/**
	 * 设置：weixin_shop_recommendTime
	 */
	public void setWeixinShopRecommendtime(Date weixinShopRecommendtime) {
		this.weixinShopRecommendtime = weixinShopRecommendtime;
	}
	/**
	 * 获取：weixin_shop_recommendTime
	 */
	public Date getWeixinShopRecommendtime() {
		return weixinShopRecommendtime;
	}
}

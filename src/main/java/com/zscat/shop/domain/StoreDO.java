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
public class StoreDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//card_approve
	private Boolean cardApprove;
	//realstore_approve
	private Boolean realstoreApprove;
	//store_address
	private String storeAddress;
	//store_credit
	private Integer storeCredit;
	//store_info
	private String storeInfo;
	//store_msn
	private String storeMsn;
	//store_name
	private String storeName;
	//store_ower
	private String storeOwer;
	//store_ower_card
	private String storeOwerCard;
	//store_qq
	private String storeQq;
	//store_recommend
	private Boolean storeRecommend;
	//store_recommend_time
	private Date storeRecommendTime;
	//store_seo_description
	private String storeSeoDescription;
	//store_seo_keywords
	private String storeSeoKeywords;
	//store_status
	private Integer storeStatus;
	//store_telephone
	private String storeTelephone;
	//store_zip
	private String storeZip;
	//template
	private String template;
	//validity
	private Date validity;
	//violation_reseaon
	private String violationReseaon;
	//area_id
	private Long areaId;
	//card_id
	private Long cardId;
	//grade_id
	private Long gradeId;
	//sc_id
	private Long scId;
	//store_banner_id
	private Long storeBannerId;
	//store_license_id
	private Long storeLicenseId;
	//store_logo_id
	private Long storeLogoId;
	//update_grade_id
	private Long updateGradeId;
	//domain_modify_count
	private Integer domainModifyCount;
	//store_second_domain
	private String storeSecondDomain;
	//favorite_count
	private Integer favoriteCount;
	//store_lat
	private BigDecimal storeLat;
	//store_lng
	private BigDecimal storeLng;
	//store_ww
	private String storeWw;
	//map_type
	private String mapType;
	//delivery_begin_time
	private Date deliveryBeginTime;
	//delivery_end_time
	private Date deliveryEndTime;
	//combin_begin_time
	private Date combinBeginTime;
	//combin_end_time
	private Date combinEndTime;
	//weixin_begin_time
	private Date weixinBeginTime;
	//weixin_end_time
	private Date weixinEndTime;
	//weixin_status
	private Integer weixinStatus;
	//weixin_appId
	private String weixinAppid;
	//weixin_appSecret
	private String weixinAppsecret;
	//weixin_token
	private String weixinToken;
	//weixin_welecome_content
	private String weixinWelecomeContent;
	//weixin_qr_img_id
	private Long weixinQrImgId;
	//weixin_account
	private String weixinAccount;
	//store_weixin_logo_id
	private Long storeWeixinLogoId;
	//weixin_store_name
	private String weixinStoreName;

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
	 * 设置：card_approve
	 */
	public void setCardApprove(Boolean cardApprove) {
		this.cardApprove = cardApprove;
	}
	/**
	 * 获取：card_approve
	 */
	public Boolean getCardApprove() {
		return cardApprove;
	}
	/**
	 * 设置：realstore_approve
	 */
	public void setRealstoreApprove(Boolean realstoreApprove) {
		this.realstoreApprove = realstoreApprove;
	}
	/**
	 * 获取：realstore_approve
	 */
	public Boolean getRealstoreApprove() {
		return realstoreApprove;
	}
	/**
	 * 设置：store_address
	 */
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}
	/**
	 * 获取：store_address
	 */
	public String getStoreAddress() {
		return storeAddress;
	}
	/**
	 * 设置：store_credit
	 */
	public void setStoreCredit(Integer storeCredit) {
		this.storeCredit = storeCredit;
	}
	/**
	 * 获取：store_credit
	 */
	public Integer getStoreCredit() {
		return storeCredit;
	}
	/**
	 * 设置：store_info
	 */
	public void setStoreInfo(String storeInfo) {
		this.storeInfo = storeInfo;
	}
	/**
	 * 获取：store_info
	 */
	public String getStoreInfo() {
		return storeInfo;
	}
	/**
	 * 设置：store_msn
	 */
	public void setStoreMsn(String storeMsn) {
		this.storeMsn = storeMsn;
	}
	/**
	 * 获取：store_msn
	 */
	public String getStoreMsn() {
		return storeMsn;
	}
	/**
	 * 设置：store_name
	 */
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	/**
	 * 获取：store_name
	 */
	public String getStoreName() {
		return storeName;
	}
	/**
	 * 设置：store_ower
	 */
	public void setStoreOwer(String storeOwer) {
		this.storeOwer = storeOwer;
	}
	/**
	 * 获取：store_ower
	 */
	public String getStoreOwer() {
		return storeOwer;
	}
	/**
	 * 设置：store_ower_card
	 */
	public void setStoreOwerCard(String storeOwerCard) {
		this.storeOwerCard = storeOwerCard;
	}
	/**
	 * 获取：store_ower_card
	 */
	public String getStoreOwerCard() {
		return storeOwerCard;
	}
	/**
	 * 设置：store_qq
	 */
	public void setStoreQq(String storeQq) {
		this.storeQq = storeQq;
	}
	/**
	 * 获取：store_qq
	 */
	public String getStoreQq() {
		return storeQq;
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
	 * 设置：store_seo_description
	 */
	public void setStoreSeoDescription(String storeSeoDescription) {
		this.storeSeoDescription = storeSeoDescription;
	}
	/**
	 * 获取：store_seo_description
	 */
	public String getStoreSeoDescription() {
		return storeSeoDescription;
	}
	/**
	 * 设置：store_seo_keywords
	 */
	public void setStoreSeoKeywords(String storeSeoKeywords) {
		this.storeSeoKeywords = storeSeoKeywords;
	}
	/**
	 * 获取：store_seo_keywords
	 */
	public String getStoreSeoKeywords() {
		return storeSeoKeywords;
	}
	/**
	 * 设置：store_status
	 */
	public void setStoreStatus(Integer storeStatus) {
		this.storeStatus = storeStatus;
	}
	/**
	 * 获取：store_status
	 */
	public Integer getStoreStatus() {
		return storeStatus;
	}
	/**
	 * 设置：store_telephone
	 */
	public void setStoreTelephone(String storeTelephone) {
		this.storeTelephone = storeTelephone;
	}
	/**
	 * 获取：store_telephone
	 */
	public String getStoreTelephone() {
		return storeTelephone;
	}
	/**
	 * 设置：store_zip
	 */
	public void setStoreZip(String storeZip) {
		this.storeZip = storeZip;
	}
	/**
	 * 获取：store_zip
	 */
	public String getStoreZip() {
		return storeZip;
	}
	/**
	 * 设置：template
	 */
	public void setTemplate(String template) {
		this.template = template;
	}
	/**
	 * 获取：template
	 */
	public String getTemplate() {
		return template;
	}
	/**
	 * 设置：validity
	 */
	public void setValidity(Date validity) {
		this.validity = validity;
	}
	/**
	 * 获取：validity
	 */
	public Date getValidity() {
		return validity;
	}
	/**
	 * 设置：violation_reseaon
	 */
	public void setViolationReseaon(String violationReseaon) {
		this.violationReseaon = violationReseaon;
	}
	/**
	 * 获取：violation_reseaon
	 */
	public String getViolationReseaon() {
		return violationReseaon;
	}
	/**
	 * 设置：area_id
	 */
	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}
	/**
	 * 获取：area_id
	 */
	public Long getAreaId() {
		return areaId;
	}
	/**
	 * 设置：card_id
	 */
	public void setCardId(Long cardId) {
		this.cardId = cardId;
	}
	/**
	 * 获取：card_id
	 */
	public Long getCardId() {
		return cardId;
	}
	/**
	 * 设置：grade_id
	 */
	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}
	/**
	 * 获取：grade_id
	 */
	public Long getGradeId() {
		return gradeId;
	}
	/**
	 * 设置：sc_id
	 */
	public void setScId(Long scId) {
		this.scId = scId;
	}
	/**
	 * 获取：sc_id
	 */
	public Long getScId() {
		return scId;
	}
	/**
	 * 设置：store_banner_id
	 */
	public void setStoreBannerId(Long storeBannerId) {
		this.storeBannerId = storeBannerId;
	}
	/**
	 * 获取：store_banner_id
	 */
	public Long getStoreBannerId() {
		return storeBannerId;
	}
	/**
	 * 设置：store_license_id
	 */
	public void setStoreLicenseId(Long storeLicenseId) {
		this.storeLicenseId = storeLicenseId;
	}
	/**
	 * 获取：store_license_id
	 */
	public Long getStoreLicenseId() {
		return storeLicenseId;
	}
	/**
	 * 设置：store_logo_id
	 */
	public void setStoreLogoId(Long storeLogoId) {
		this.storeLogoId = storeLogoId;
	}
	/**
	 * 获取：store_logo_id
	 */
	public Long getStoreLogoId() {
		return storeLogoId;
	}
	/**
	 * 设置：update_grade_id
	 */
	public void setUpdateGradeId(Long updateGradeId) {
		this.updateGradeId = updateGradeId;
	}
	/**
	 * 获取：update_grade_id
	 */
	public Long getUpdateGradeId() {
		return updateGradeId;
	}
	/**
	 * 设置：domain_modify_count
	 */
	public void setDomainModifyCount(Integer domainModifyCount) {
		this.domainModifyCount = domainModifyCount;
	}
	/**
	 * 获取：domain_modify_count
	 */
	public Integer getDomainModifyCount() {
		return domainModifyCount;
	}
	/**
	 * 设置：store_second_domain
	 */
	public void setStoreSecondDomain(String storeSecondDomain) {
		this.storeSecondDomain = storeSecondDomain;
	}
	/**
	 * 获取：store_second_domain
	 */
	public String getStoreSecondDomain() {
		return storeSecondDomain;
	}
	/**
	 * 设置：favorite_count
	 */
	public void setFavoriteCount(Integer favoriteCount) {
		this.favoriteCount = favoriteCount;
	}
	/**
	 * 获取：favorite_count
	 */
	public Integer getFavoriteCount() {
		return favoriteCount;
	}
	/**
	 * 设置：store_lat
	 */
	public void setStoreLat(BigDecimal storeLat) {
		this.storeLat = storeLat;
	}
	/**
	 * 获取：store_lat
	 */
	public BigDecimal getStoreLat() {
		return storeLat;
	}
	/**
	 * 设置：store_lng
	 */
	public void setStoreLng(BigDecimal storeLng) {
		this.storeLng = storeLng;
	}
	/**
	 * 获取：store_lng
	 */
	public BigDecimal getStoreLng() {
		return storeLng;
	}
	/**
	 * 设置：store_ww
	 */
	public void setStoreWw(String storeWw) {
		this.storeWw = storeWw;
	}
	/**
	 * 获取：store_ww
	 */
	public String getStoreWw() {
		return storeWw;
	}
	/**
	 * 设置：map_type
	 */
	public void setMapType(String mapType) {
		this.mapType = mapType;
	}
	/**
	 * 获取：map_type
	 */
	public String getMapType() {
		return mapType;
	}
	/**
	 * 设置：delivery_begin_time
	 */
	public void setDeliveryBeginTime(Date deliveryBeginTime) {
		this.deliveryBeginTime = deliveryBeginTime;
	}
	/**
	 * 获取：delivery_begin_time
	 */
	public Date getDeliveryBeginTime() {
		return deliveryBeginTime;
	}
	/**
	 * 设置：delivery_end_time
	 */
	public void setDeliveryEndTime(Date deliveryEndTime) {
		this.deliveryEndTime = deliveryEndTime;
	}
	/**
	 * 获取：delivery_end_time
	 */
	public Date getDeliveryEndTime() {
		return deliveryEndTime;
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
	 * 设置：weixin_begin_time
	 */
	public void setWeixinBeginTime(Date weixinBeginTime) {
		this.weixinBeginTime = weixinBeginTime;
	}
	/**
	 * 获取：weixin_begin_time
	 */
	public Date getWeixinBeginTime() {
		return weixinBeginTime;
	}
	/**
	 * 设置：weixin_end_time
	 */
	public void setWeixinEndTime(Date weixinEndTime) {
		this.weixinEndTime = weixinEndTime;
	}
	/**
	 * 获取：weixin_end_time
	 */
	public Date getWeixinEndTime() {
		return weixinEndTime;
	}
	/**
	 * 设置：weixin_status
	 */
	public void setWeixinStatus(Integer weixinStatus) {
		this.weixinStatus = weixinStatus;
	}
	/**
	 * 获取：weixin_status
	 */
	public Integer getWeixinStatus() {
		return weixinStatus;
	}
	/**
	 * 设置：weixin_appId
	 */
	public void setWeixinAppid(String weixinAppid) {
		this.weixinAppid = weixinAppid;
	}
	/**
	 * 获取：weixin_appId
	 */
	public String getWeixinAppid() {
		return weixinAppid;
	}
	/**
	 * 设置：weixin_appSecret
	 */
	public void setWeixinAppsecret(String weixinAppsecret) {
		this.weixinAppsecret = weixinAppsecret;
	}
	/**
	 * 获取：weixin_appSecret
	 */
	public String getWeixinAppsecret() {
		return weixinAppsecret;
	}
	/**
	 * 设置：weixin_token
	 */
	public void setWeixinToken(String weixinToken) {
		this.weixinToken = weixinToken;
	}
	/**
	 * 获取：weixin_token
	 */
	public String getWeixinToken() {
		return weixinToken;
	}
	/**
	 * 设置：weixin_welecome_content
	 */
	public void setWeixinWelecomeContent(String weixinWelecomeContent) {
		this.weixinWelecomeContent = weixinWelecomeContent;
	}
	/**
	 * 获取：weixin_welecome_content
	 */
	public String getWeixinWelecomeContent() {
		return weixinWelecomeContent;
	}
	/**
	 * 设置：weixin_qr_img_id
	 */
	public void setWeixinQrImgId(Long weixinQrImgId) {
		this.weixinQrImgId = weixinQrImgId;
	}
	/**
	 * 获取：weixin_qr_img_id
	 */
	public Long getWeixinQrImgId() {
		return weixinQrImgId;
	}
	/**
	 * 设置：weixin_account
	 */
	public void setWeixinAccount(String weixinAccount) {
		this.weixinAccount = weixinAccount;
	}
	/**
	 * 获取：weixin_account
	 */
	public String getWeixinAccount() {
		return weixinAccount;
	}
	/**
	 * 设置：store_weixin_logo_id
	 */
	public void setStoreWeixinLogoId(Long storeWeixinLogoId) {
		this.storeWeixinLogoId = storeWeixinLogoId;
	}
	/**
	 * 获取：store_weixin_logo_id
	 */
	public Long getStoreWeixinLogoId() {
		return storeWeixinLogoId;
	}
	/**
	 * 设置：weixin_store_name
	 */
	public void setWeixinStoreName(String weixinStoreName) {
		this.weixinStoreName = weixinStoreName;
	}
	/**
	 * 获取：weixin_store_name
	 */
	public String getWeixinStoreName() {
		return weixinStoreName;
	}
}

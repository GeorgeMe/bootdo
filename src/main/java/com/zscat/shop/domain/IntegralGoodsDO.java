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
public class IntegralGoodsDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//ig_begin_time
	private Date igBeginTime;
	//ig_click_count
	private Integer igClickCount;
	//ig_content
	private String igContent;
	//ig_end_time
	private Date igEndTime;
	//ig_exchange_count
	private Integer igExchangeCount;
	//ig_goods_count
	private Integer igGoodsCount;
	//ig_goods_integral
	private Integer igGoodsIntegral;
	//ig_goods_name
	private String igGoodsName;
	//ig_goods_price
	private BigDecimal igGoodsPrice;
	//ig_goods_sn
	private String igGoodsSn;
	//ig_goods_tag
	private String igGoodsTag;
	//ig_limit_count
	private Integer igLimitCount;
	//ig_limit_type
	private Boolean igLimitType;
	//ig_recommend
	private Boolean igRecommend;
	//ig_seo_description
	private String igSeoDescription;
	//ig_seo_keywords
	private String igSeoKeywords;
	//ig_sequence
	private Integer igSequence;
	//ig_show
	private Boolean igShow;
	//ig_time_type
	private Boolean igTimeType;
	//ig_transfee
	private BigDecimal igTransfee;
	//ig_transfee_type
	private Integer igTransfeeType;
	//ig_goods_img_id
	private Long igGoodsImgId;

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
	 * 设置：ig_begin_time
	 */
	public void setIgBeginTime(Date igBeginTime) {
		this.igBeginTime = igBeginTime;
	}
	/**
	 * 获取：ig_begin_time
	 */
	public Date getIgBeginTime() {
		return igBeginTime;
	}
	/**
	 * 设置：ig_click_count
	 */
	public void setIgClickCount(Integer igClickCount) {
		this.igClickCount = igClickCount;
	}
	/**
	 * 获取：ig_click_count
	 */
	public Integer getIgClickCount() {
		return igClickCount;
	}
	/**
	 * 设置：ig_content
	 */
	public void setIgContent(String igContent) {
		this.igContent = igContent;
	}
	/**
	 * 获取：ig_content
	 */
	public String getIgContent() {
		return igContent;
	}
	/**
	 * 设置：ig_end_time
	 */
	public void setIgEndTime(Date igEndTime) {
		this.igEndTime = igEndTime;
	}
	/**
	 * 获取：ig_end_time
	 */
	public Date getIgEndTime() {
		return igEndTime;
	}
	/**
	 * 设置：ig_exchange_count
	 */
	public void setIgExchangeCount(Integer igExchangeCount) {
		this.igExchangeCount = igExchangeCount;
	}
	/**
	 * 获取：ig_exchange_count
	 */
	public Integer getIgExchangeCount() {
		return igExchangeCount;
	}
	/**
	 * 设置：ig_goods_count
	 */
	public void setIgGoodsCount(Integer igGoodsCount) {
		this.igGoodsCount = igGoodsCount;
	}
	/**
	 * 获取：ig_goods_count
	 */
	public Integer getIgGoodsCount() {
		return igGoodsCount;
	}
	/**
	 * 设置：ig_goods_integral
	 */
	public void setIgGoodsIntegral(Integer igGoodsIntegral) {
		this.igGoodsIntegral = igGoodsIntegral;
	}
	/**
	 * 获取：ig_goods_integral
	 */
	public Integer getIgGoodsIntegral() {
		return igGoodsIntegral;
	}
	/**
	 * 设置：ig_goods_name
	 */
	public void setIgGoodsName(String igGoodsName) {
		this.igGoodsName = igGoodsName;
	}
	/**
	 * 获取：ig_goods_name
	 */
	public String getIgGoodsName() {
		return igGoodsName;
	}
	/**
	 * 设置：ig_goods_price
	 */
	public void setIgGoodsPrice(BigDecimal igGoodsPrice) {
		this.igGoodsPrice = igGoodsPrice;
	}
	/**
	 * 获取：ig_goods_price
	 */
	public BigDecimal getIgGoodsPrice() {
		return igGoodsPrice;
	}
	/**
	 * 设置：ig_goods_sn
	 */
	public void setIgGoodsSn(String igGoodsSn) {
		this.igGoodsSn = igGoodsSn;
	}
	/**
	 * 获取：ig_goods_sn
	 */
	public String getIgGoodsSn() {
		return igGoodsSn;
	}
	/**
	 * 设置：ig_goods_tag
	 */
	public void setIgGoodsTag(String igGoodsTag) {
		this.igGoodsTag = igGoodsTag;
	}
	/**
	 * 获取：ig_goods_tag
	 */
	public String getIgGoodsTag() {
		return igGoodsTag;
	}
	/**
	 * 设置：ig_limit_count
	 */
	public void setIgLimitCount(Integer igLimitCount) {
		this.igLimitCount = igLimitCount;
	}
	/**
	 * 获取：ig_limit_count
	 */
	public Integer getIgLimitCount() {
		return igLimitCount;
	}
	/**
	 * 设置：ig_limit_type
	 */
	public void setIgLimitType(Boolean igLimitType) {
		this.igLimitType = igLimitType;
	}
	/**
	 * 获取：ig_limit_type
	 */
	public Boolean getIgLimitType() {
		return igLimitType;
	}
	/**
	 * 设置：ig_recommend
	 */
	public void setIgRecommend(Boolean igRecommend) {
		this.igRecommend = igRecommend;
	}
	/**
	 * 获取：ig_recommend
	 */
	public Boolean getIgRecommend() {
		return igRecommend;
	}
	/**
	 * 设置：ig_seo_description
	 */
	public void setIgSeoDescription(String igSeoDescription) {
		this.igSeoDescription = igSeoDescription;
	}
	/**
	 * 获取：ig_seo_description
	 */
	public String getIgSeoDescription() {
		return igSeoDescription;
	}
	/**
	 * 设置：ig_seo_keywords
	 */
	public void setIgSeoKeywords(String igSeoKeywords) {
		this.igSeoKeywords = igSeoKeywords;
	}
	/**
	 * 获取：ig_seo_keywords
	 */
	public String getIgSeoKeywords() {
		return igSeoKeywords;
	}
	/**
	 * 设置：ig_sequence
	 */
	public void setIgSequence(Integer igSequence) {
		this.igSequence = igSequence;
	}
	/**
	 * 获取：ig_sequence
	 */
	public Integer getIgSequence() {
		return igSequence;
	}
	/**
	 * 设置：ig_show
	 */
	public void setIgShow(Boolean igShow) {
		this.igShow = igShow;
	}
	/**
	 * 获取：ig_show
	 */
	public Boolean getIgShow() {
		return igShow;
	}
	/**
	 * 设置：ig_time_type
	 */
	public void setIgTimeType(Boolean igTimeType) {
		this.igTimeType = igTimeType;
	}
	/**
	 * 获取：ig_time_type
	 */
	public Boolean getIgTimeType() {
		return igTimeType;
	}
	/**
	 * 设置：ig_transfee
	 */
	public void setIgTransfee(BigDecimal igTransfee) {
		this.igTransfee = igTransfee;
	}
	/**
	 * 获取：ig_transfee
	 */
	public BigDecimal getIgTransfee() {
		return igTransfee;
	}
	/**
	 * 设置：ig_transfee_type
	 */
	public void setIgTransfeeType(Integer igTransfeeType) {
		this.igTransfeeType = igTransfeeType;
	}
	/**
	 * 获取：ig_transfee_type
	 */
	public Integer getIgTransfeeType() {
		return igTransfeeType;
	}
	/**
	 * 设置：ig_goods_img_id
	 */
	public void setIgGoodsImgId(Long igGoodsImgId) {
		this.igGoodsImgId = igGoodsImgId;
	}
	/**
	 * 获取：ig_goods_img_id
	 */
	public Long getIgGoodsImgId() {
		return igGoodsImgId;
	}
}

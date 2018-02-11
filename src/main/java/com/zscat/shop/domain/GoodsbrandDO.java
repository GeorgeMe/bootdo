package com.zscat.shop.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
public class GoodsbrandDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//audit
	private Boolean audit;
	//name
	private String name;
	//recommend
	private Boolean recommend;
	//sequence
	private Integer sequence;
	//brandLogo_id
	private Long brandlogoId;
	//category_id
	private Long categoryId;
	//remark
	private String remark;
	//userStatus
	private Integer userstatus;
	//user_id
	private Long userId;
	//weixin_shop_recommend
	private Boolean weixinShopRecommend;
	//weixin_shop_recommendTime
	private Date weixinShopRecommendtime;
	//first_word
	private String firstWord;

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
	 * 设置：audit
	 */
	public void setAudit(Boolean audit) {
		this.audit = audit;
	}
	/**
	 * 获取：audit
	 */
	public Boolean getAudit() {
		return audit;
	}
	/**
	 * 设置：name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：name
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：recommend
	 */
	public void setRecommend(Boolean recommend) {
		this.recommend = recommend;
	}
	/**
	 * 获取：recommend
	 */
	public Boolean getRecommend() {
		return recommend;
	}
	/**
	 * 设置：sequence
	 */
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}
	/**
	 * 获取：sequence
	 */
	public Integer getSequence() {
		return sequence;
	}
	/**
	 * 设置：brandLogo_id
	 */
	public void setBrandlogoId(Long brandlogoId) {
		this.brandlogoId = brandlogoId;
	}
	/**
	 * 获取：brandLogo_id
	 */
	public Long getBrandlogoId() {
		return brandlogoId;
	}
	/**
	 * 设置：category_id
	 */
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * 获取：category_id
	 */
	public Long getCategoryId() {
		return categoryId;
	}
	/**
	 * 设置：remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * 设置：userStatus
	 */
	public void setUserstatus(Integer userstatus) {
		this.userstatus = userstatus;
	}
	/**
	 * 获取：userStatus
	 */
	public Integer getUserstatus() {
		return userstatus;
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
	/**
	 * 设置：first_word
	 */
	public void setFirstWord(String firstWord) {
		this.firstWord = firstWord;
	}
	/**
	 * 获取：first_word
	 */
	public String getFirstWord() {
		return firstWord;
	}
}

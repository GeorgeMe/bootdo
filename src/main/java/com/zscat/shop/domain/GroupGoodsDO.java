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
public class GroupGoodsDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//gg_audit_time
	private Date ggAuditTime;
	//gg_content
	private String ggContent;
	//gg_count
	private Integer ggCount;
	//gg_def_count
	private Integer ggDefCount;
	//gg_group_count
	private Integer ggGroupCount;
	//gg_max_count
	private Integer ggMaxCount;
	//gg_min_count
	private Integer ggMinCount;
	//gg_name
	private String ggName;
	//gg_price
	private BigDecimal ggPrice;
	//gg_rebate
	private BigDecimal ggRebate;
	//gg_recommend
	private Integer ggRecommend;
	//gg_recommend_time
	private Date ggRecommendTime;
	//gg_status
	private Integer ggStatus;
	//gg_vir_count
	private Integer ggVirCount;
	//gg_ga_id
	private Long ggGaId;
	//gg_gc_id
	private Long ggGcId;
	//gg_goods_id
	private Long ggGoodsId;
	//gg_img_id
	private Long ggImgId;
	//group_id
	private Long groupId;
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
	 * 设置：gg_audit_time
	 */
	public void setGgAuditTime(Date ggAuditTime) {
		this.ggAuditTime = ggAuditTime;
	}
	/**
	 * 获取：gg_audit_time
	 */
	public Date getGgAuditTime() {
		return ggAuditTime;
	}
	/**
	 * 设置：gg_content
	 */
	public void setGgContent(String ggContent) {
		this.ggContent = ggContent;
	}
	/**
	 * 获取：gg_content
	 */
	public String getGgContent() {
		return ggContent;
	}
	/**
	 * 设置：gg_count
	 */
	public void setGgCount(Integer ggCount) {
		this.ggCount = ggCount;
	}
	/**
	 * 获取：gg_count
	 */
	public Integer getGgCount() {
		return ggCount;
	}
	/**
	 * 设置：gg_def_count
	 */
	public void setGgDefCount(Integer ggDefCount) {
		this.ggDefCount = ggDefCount;
	}
	/**
	 * 获取：gg_def_count
	 */
	public Integer getGgDefCount() {
		return ggDefCount;
	}
	/**
	 * 设置：gg_group_count
	 */
	public void setGgGroupCount(Integer ggGroupCount) {
		this.ggGroupCount = ggGroupCount;
	}
	/**
	 * 获取：gg_group_count
	 */
	public Integer getGgGroupCount() {
		return ggGroupCount;
	}
	/**
	 * 设置：gg_max_count
	 */
	public void setGgMaxCount(Integer ggMaxCount) {
		this.ggMaxCount = ggMaxCount;
	}
	/**
	 * 获取：gg_max_count
	 */
	public Integer getGgMaxCount() {
		return ggMaxCount;
	}
	/**
	 * 设置：gg_min_count
	 */
	public void setGgMinCount(Integer ggMinCount) {
		this.ggMinCount = ggMinCount;
	}
	/**
	 * 获取：gg_min_count
	 */
	public Integer getGgMinCount() {
		return ggMinCount;
	}
	/**
	 * 设置：gg_name
	 */
	public void setGgName(String ggName) {
		this.ggName = ggName;
	}
	/**
	 * 获取：gg_name
	 */
	public String getGgName() {
		return ggName;
	}
	/**
	 * 设置：gg_price
	 */
	public void setGgPrice(BigDecimal ggPrice) {
		this.ggPrice = ggPrice;
	}
	/**
	 * 获取：gg_price
	 */
	public BigDecimal getGgPrice() {
		return ggPrice;
	}
	/**
	 * 设置：gg_rebate
	 */
	public void setGgRebate(BigDecimal ggRebate) {
		this.ggRebate = ggRebate;
	}
	/**
	 * 获取：gg_rebate
	 */
	public BigDecimal getGgRebate() {
		return ggRebate;
	}
	/**
	 * 设置：gg_recommend
	 */
	public void setGgRecommend(Integer ggRecommend) {
		this.ggRecommend = ggRecommend;
	}
	/**
	 * 获取：gg_recommend
	 */
	public Integer getGgRecommend() {
		return ggRecommend;
	}
	/**
	 * 设置：gg_recommend_time
	 */
	public void setGgRecommendTime(Date ggRecommendTime) {
		this.ggRecommendTime = ggRecommendTime;
	}
	/**
	 * 获取：gg_recommend_time
	 */
	public Date getGgRecommendTime() {
		return ggRecommendTime;
	}
	/**
	 * 设置：gg_status
	 */
	public void setGgStatus(Integer ggStatus) {
		this.ggStatus = ggStatus;
	}
	/**
	 * 获取：gg_status
	 */
	public Integer getGgStatus() {
		return ggStatus;
	}
	/**
	 * 设置：gg_vir_count
	 */
	public void setGgVirCount(Integer ggVirCount) {
		this.ggVirCount = ggVirCount;
	}
	/**
	 * 获取：gg_vir_count
	 */
	public Integer getGgVirCount() {
		return ggVirCount;
	}
	/**
	 * 设置：gg_ga_id
	 */
	public void setGgGaId(Long ggGaId) {
		this.ggGaId = ggGaId;
	}
	/**
	 * 获取：gg_ga_id
	 */
	public Long getGgGaId() {
		return ggGaId;
	}
	/**
	 * 设置：gg_gc_id
	 */
	public void setGgGcId(Long ggGcId) {
		this.ggGcId = ggGcId;
	}
	/**
	 * 获取：gg_gc_id
	 */
	public Long getGgGcId() {
		return ggGcId;
	}
	/**
	 * 设置：gg_goods_id
	 */
	public void setGgGoodsId(Long ggGoodsId) {
		this.ggGoodsId = ggGoodsId;
	}
	/**
	 * 获取：gg_goods_id
	 */
	public Long getGgGoodsId() {
		return ggGoodsId;
	}
	/**
	 * 设置：gg_img_id
	 */
	public void setGgImgId(Long ggImgId) {
		this.ggImgId = ggImgId;
	}
	/**
	 * 获取：gg_img_id
	 */
	public Long getGgImgId() {
		return ggImgId;
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

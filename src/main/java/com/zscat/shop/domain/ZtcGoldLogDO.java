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
public class ZtcGoldLogDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//zgl_content
	private String zglContent;
	//zgl_gold
	private Integer zglGold;
	//zgl_type
	private Integer zglType;
	//zgl_goods_id
	private Long zglGoodsId;

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
	 * 设置：zgl_content
	 */
	public void setZglContent(String zglContent) {
		this.zglContent = zglContent;
	}
	/**
	 * 获取：zgl_content
	 */
	public String getZglContent() {
		return zglContent;
	}
	/**
	 * 设置：zgl_gold
	 */
	public void setZglGold(Integer zglGold) {
		this.zglGold = zglGold;
	}
	/**
	 * 获取：zgl_gold
	 */
	public Integer getZglGold() {
		return zglGold;
	}
	/**
	 * 设置：zgl_type
	 */
	public void setZglType(Integer zglType) {
		this.zglType = zglType;
	}
	/**
	 * 获取：zgl_type
	 */
	public Integer getZglType() {
		return zglType;
	}
	/**
	 * 设置：zgl_goods_id
	 */
	public void setZglGoodsId(Long zglGoodsId) {
		this.zglGoodsId = zglGoodsId;
	}
	/**
	 * 获取：zgl_goods_id
	 */
	public Long getZglGoodsId() {
		return zglGoodsId;
	}
}

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
public class HomeAttentionDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//attention_homepage_id
	private Long attentionHomepageId;
	//attentioned_id
	private Long attentionedId;

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
	 * 设置：attention_homepage_id
	 */
	public void setAttentionHomepageId(Long attentionHomepageId) {
		this.attentionHomepageId = attentionHomepageId;
	}
	/**
	 * 获取：attention_homepage_id
	 */
	public Long getAttentionHomepageId() {
		return attentionHomepageId;
	}
	/**
	 * 设置：attentioned_id
	 */
	public void setAttentionedId(Long attentionedId) {
		this.attentionedId = attentionedId;
	}
	/**
	 * 获取：attentioned_id
	 */
	public Long getAttentionedId() {
		return attentionedId;
	}
}

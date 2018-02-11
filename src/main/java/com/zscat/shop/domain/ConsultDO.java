package com.zscat.shop.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:36
 */
public class ConsultDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//consult_content
	private String consultContent;
	//consult_email
	private String consultEmail;
	//consult_reply
	private String consultReply;
	//reply
	private Boolean reply;
	//reply_time
	private Date replyTime;
	//consult_user_id
	private Long consultUserId;
	//goods_id
	private Long goodsId;
	//reply_user_id
	private Long replyUserId;

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
	 * 设置：consult_content
	 */
	public void setConsultContent(String consultContent) {
		this.consultContent = consultContent;
	}
	/**
	 * 获取：consult_content
	 */
	public String getConsultContent() {
		return consultContent;
	}
	/**
	 * 设置：consult_email
	 */
	public void setConsultEmail(String consultEmail) {
		this.consultEmail = consultEmail;
	}
	/**
	 * 获取：consult_email
	 */
	public String getConsultEmail() {
		return consultEmail;
	}
	/**
	 * 设置：consult_reply
	 */
	public void setConsultReply(String consultReply) {
		this.consultReply = consultReply;
	}
	/**
	 * 获取：consult_reply
	 */
	public String getConsultReply() {
		return consultReply;
	}
	/**
	 * 设置：reply
	 */
	public void setReply(Boolean reply) {
		this.reply = reply;
	}
	/**
	 * 获取：reply
	 */
	public Boolean getReply() {
		return reply;
	}
	/**
	 * 设置：reply_time
	 */
	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}
	/**
	 * 获取：reply_time
	 */
	public Date getReplyTime() {
		return replyTime;
	}
	/**
	 * 设置：consult_user_id
	 */
	public void setConsultUserId(Long consultUserId) {
		this.consultUserId = consultUserId;
	}
	/**
	 * 获取：consult_user_id
	 */
	public Long getConsultUserId() {
		return consultUserId;
	}
	/**
	 * 设置：goods_id
	 */
	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}
	/**
	 * 获取：goods_id
	 */
	public Long getGoodsId() {
		return goodsId;
	}
	/**
	 * 设置：reply_user_id
	 */
	public void setReplyUserId(Long replyUserId) {
		this.replyUserId = replyUserId;
	}
	/**
	 * 获取：reply_user_id
	 */
	public Long getReplyUserId() {
		return replyUserId;
	}
}

package com.zscat.shop.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public class SpareGoodsDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//contact
	private String contact;
	//content
	private String content;
	//errorMessage
	private String errormessage;
	//goods_old_price
	private Integer goodsOldPrice;
	//goods_price
	private Integer goodsPrice;
	//name
	private String name;
	//oldAndnew
	private Integer oldandnew;
	//sellMethod
	private Integer sellmethod;
	//seodescribe
	private String seodescribe;
	//seokeyword
	private String seokeyword;
	//status
	private Integer status;
	//title
	private String title;
	//area_id
	private Long areaId;
	//img_id
	private Long imgId;
	//spareGoodsClass_id
	private Long sparegoodsclassId;
	//user_id
	private Long userId;
	//phone
	private String phone;
	//img1_id
	private Long img1Id;
	//img2_id
	private Long img2Id;
	//img3_id
	private Long img3Id;
	//img4_id
	private Long img4Id;
	//main_img_id
	private Long mainImgId;
	//img5_id
	private Long img5Id;
	//viewInFloor
	private Boolean viewinfloor;
	//sgf_id
	private Long sgfId;
	//QQ
	private String qq;
	//recommend
	private Boolean recommend;
	//down
	private Integer down;

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
	 * 设置：contact
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}
	/**
	 * 获取：contact
	 */
	public String getContact() {
		return contact;
	}
	/**
	 * 设置：content
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 设置：errorMessage
	 */
	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}
	/**
	 * 获取：errorMessage
	 */
	public String getErrormessage() {
		return errormessage;
	}
	/**
	 * 设置：goods_old_price
	 */
	public void setGoodsOldPrice(Integer goodsOldPrice) {
		this.goodsOldPrice = goodsOldPrice;
	}
	/**
	 * 获取：goods_old_price
	 */
	public Integer getGoodsOldPrice() {
		return goodsOldPrice;
	}
	/**
	 * 设置：goods_price
	 */
	public void setGoodsPrice(Integer goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	/**
	 * 获取：goods_price
	 */
	public Integer getGoodsPrice() {
		return goodsPrice;
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
	 * 设置：oldAndnew
	 */
	public void setOldandnew(Integer oldandnew) {
		this.oldandnew = oldandnew;
	}
	/**
	 * 获取：oldAndnew
	 */
	public Integer getOldandnew() {
		return oldandnew;
	}
	/**
	 * 设置：sellMethod
	 */
	public void setSellmethod(Integer sellmethod) {
		this.sellmethod = sellmethod;
	}
	/**
	 * 获取：sellMethod
	 */
	public Integer getSellmethod() {
		return sellmethod;
	}
	/**
	 * 设置：seodescribe
	 */
	public void setSeodescribe(String seodescribe) {
		this.seodescribe = seodescribe;
	}
	/**
	 * 获取：seodescribe
	 */
	public String getSeodescribe() {
		return seodescribe;
	}
	/**
	 * 设置：seokeyword
	 */
	public void setSeokeyword(String seokeyword) {
		this.seokeyword = seokeyword;
	}
	/**
	 * 获取：seokeyword
	 */
	public String getSeokeyword() {
		return seokeyword;
	}
	/**
	 * 设置：status
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：status
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：title
	 */
	public String getTitle() {
		return title;
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
	 * 设置：img_id
	 */
	public void setImgId(Long imgId) {
		this.imgId = imgId;
	}
	/**
	 * 获取：img_id
	 */
	public Long getImgId() {
		return imgId;
	}
	/**
	 * 设置：spareGoodsClass_id
	 */
	public void setSparegoodsclassId(Long sparegoodsclassId) {
		this.sparegoodsclassId = sparegoodsclassId;
	}
	/**
	 * 获取：spareGoodsClass_id
	 */
	public Long getSparegoodsclassId() {
		return sparegoodsclassId;
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
	 * 设置：phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：img1_id
	 */
	public void setImg1Id(Long img1Id) {
		this.img1Id = img1Id;
	}
	/**
	 * 获取：img1_id
	 */
	public Long getImg1Id() {
		return img1Id;
	}
	/**
	 * 设置：img2_id
	 */
	public void setImg2Id(Long img2Id) {
		this.img2Id = img2Id;
	}
	/**
	 * 获取：img2_id
	 */
	public Long getImg2Id() {
		return img2Id;
	}
	/**
	 * 设置：img3_id
	 */
	public void setImg3Id(Long img3Id) {
		this.img3Id = img3Id;
	}
	/**
	 * 获取：img3_id
	 */
	public Long getImg3Id() {
		return img3Id;
	}
	/**
	 * 设置：img4_id
	 */
	public void setImg4Id(Long img4Id) {
		this.img4Id = img4Id;
	}
	/**
	 * 获取：img4_id
	 */
	public Long getImg4Id() {
		return img4Id;
	}
	/**
	 * 设置：main_img_id
	 */
	public void setMainImgId(Long mainImgId) {
		this.mainImgId = mainImgId;
	}
	/**
	 * 获取：main_img_id
	 */
	public Long getMainImgId() {
		return mainImgId;
	}
	/**
	 * 设置：img5_id
	 */
	public void setImg5Id(Long img5Id) {
		this.img5Id = img5Id;
	}
	/**
	 * 获取：img5_id
	 */
	public Long getImg5Id() {
		return img5Id;
	}
	/**
	 * 设置：viewInFloor
	 */
	public void setViewinfloor(Boolean viewinfloor) {
		this.viewinfloor = viewinfloor;
	}
	/**
	 * 获取：viewInFloor
	 */
	public Boolean getViewinfloor() {
		return viewinfloor;
	}
	/**
	 * 设置：sgf_id
	 */
	public void setSgfId(Long sgfId) {
		this.sgfId = sgfId;
	}
	/**
	 * 获取：sgf_id
	 */
	public Long getSgfId() {
		return sgfId;
	}
	/**
	 * 设置：QQ
	 */
	public void setQq(String qq) {
		this.qq = qq;
	}
	/**
	 * 获取：QQ
	 */
	public String getQq() {
		return qq;
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
	 * 设置：down
	 */
	public void setDown(Integer down) {
		this.down = down;
	}
	/**
	 * 获取：down
	 */
	public Integer getDown() {
		return down;
	}
}

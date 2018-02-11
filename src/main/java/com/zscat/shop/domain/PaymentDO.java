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
public class PaymentDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//chinabank_account
	private String chinabankAccount;
	//chinabank_key
	private String chinabankKey;
	//content
	private String content;
	//install
	private Boolean install;
	//interfaceType
	private Integer interfacetype;
	//mark
	private String mark;
	//merchantAcctId
	private String merchantacctid;
	//name
	private String name;
	//partner
	private String partner;
	//pid
	private String pid;
	//rmbKey
	private String rmbkey;
	//safeKey
	private String safekey;
	//seller_email
	private String sellerEmail;
	//spname
	private String spname;
	//tenpay_key
	private String tenpayKey;
	//tenpay_partner
	private String tenpayPartner;
	//trade_mode
	private Integer tradeMode;
	//type
	private String type;
	//store_id
	private Long storeId;
	//alipay_divide_rate
	private BigDecimal alipayDivideRate;
	//alipay_rate
	private BigDecimal alipayRate;
	//balance_divide_rate
	private BigDecimal balanceDivideRate;
	//currency_code
	private String currencyCode;
	//paypal_userId
	private String paypalUserid;
	//poundage
	private BigDecimal poundage;
	//lzbank_key
	private String lzbankKey;
	//lzbank_partner
	private String lzbankPartner;
	//lzbank_trade_mode
	private String lzbankTradeMode;
	//weixin_appId
	private String weixinAppid;
	//weixin_appSecret
	private String weixinAppsecret;
	//weixin_partnerId
	private String weixinPartnerid;
	//weixin_partnerKey
	private String weixinPartnerkey;
	//weixin_paySignKey
	private String weixinPaysignkey;

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
	 * 设置：chinabank_account
	 */
	public void setChinabankAccount(String chinabankAccount) {
		this.chinabankAccount = chinabankAccount;
	}
	/**
	 * 获取：chinabank_account
	 */
	public String getChinabankAccount() {
		return chinabankAccount;
	}
	/**
	 * 设置：chinabank_key
	 */
	public void setChinabankKey(String chinabankKey) {
		this.chinabankKey = chinabankKey;
	}
	/**
	 * 获取：chinabank_key
	 */
	public String getChinabankKey() {
		return chinabankKey;
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
	 * 设置：install
	 */
	public void setInstall(Boolean install) {
		this.install = install;
	}
	/**
	 * 获取：install
	 */
	public Boolean getInstall() {
		return install;
	}
	/**
	 * 设置：interfaceType
	 */
	public void setInterfacetype(Integer interfacetype) {
		this.interfacetype = interfacetype;
	}
	/**
	 * 获取：interfaceType
	 */
	public Integer getInterfacetype() {
		return interfacetype;
	}
	/**
	 * 设置：mark
	 */
	public void setMark(String mark) {
		this.mark = mark;
	}
	/**
	 * 获取：mark
	 */
	public String getMark() {
		return mark;
	}
	/**
	 * 设置：merchantAcctId
	 */
	public void setMerchantacctid(String merchantacctid) {
		this.merchantacctid = merchantacctid;
	}
	/**
	 * 获取：merchantAcctId
	 */
	public String getMerchantacctid() {
		return merchantacctid;
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
	 * 设置：partner
	 */
	public void setPartner(String partner) {
		this.partner = partner;
	}
	/**
	 * 获取：partner
	 */
	public String getPartner() {
		return partner;
	}
	/**
	 * 设置：pid
	 */
	public void setPid(String pid) {
		this.pid = pid;
	}
	/**
	 * 获取：pid
	 */
	public String getPid() {
		return pid;
	}
	/**
	 * 设置：rmbKey
	 */
	public void setRmbkey(String rmbkey) {
		this.rmbkey = rmbkey;
	}
	/**
	 * 获取：rmbKey
	 */
	public String getRmbkey() {
		return rmbkey;
	}
	/**
	 * 设置：safeKey
	 */
	public void setSafekey(String safekey) {
		this.safekey = safekey;
	}
	/**
	 * 获取：safeKey
	 */
	public String getSafekey() {
		return safekey;
	}
	/**
	 * 设置：seller_email
	 */
	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}
	/**
	 * 获取：seller_email
	 */
	public String getSellerEmail() {
		return sellerEmail;
	}
	/**
	 * 设置：spname
	 */
	public void setSpname(String spname) {
		this.spname = spname;
	}
	/**
	 * 获取：spname
	 */
	public String getSpname() {
		return spname;
	}
	/**
	 * 设置：tenpay_key
	 */
	public void setTenpayKey(String tenpayKey) {
		this.tenpayKey = tenpayKey;
	}
	/**
	 * 获取：tenpay_key
	 */
	public String getTenpayKey() {
		return tenpayKey;
	}
	/**
	 * 设置：tenpay_partner
	 */
	public void setTenpayPartner(String tenpayPartner) {
		this.tenpayPartner = tenpayPartner;
	}
	/**
	 * 获取：tenpay_partner
	 */
	public String getTenpayPartner() {
		return tenpayPartner;
	}
	/**
	 * 设置：trade_mode
	 */
	public void setTradeMode(Integer tradeMode) {
		this.tradeMode = tradeMode;
	}
	/**
	 * 获取：trade_mode
	 */
	public Integer getTradeMode() {
		return tradeMode;
	}
	/**
	 * 设置：type
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：type
	 */
	public String getType() {
		return type;
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
	 * 设置：alipay_divide_rate
	 */
	public void setAlipayDivideRate(BigDecimal alipayDivideRate) {
		this.alipayDivideRate = alipayDivideRate;
	}
	/**
	 * 获取：alipay_divide_rate
	 */
	public BigDecimal getAlipayDivideRate() {
		return alipayDivideRate;
	}
	/**
	 * 设置：alipay_rate
	 */
	public void setAlipayRate(BigDecimal alipayRate) {
		this.alipayRate = alipayRate;
	}
	/**
	 * 获取：alipay_rate
	 */
	public BigDecimal getAlipayRate() {
		return alipayRate;
	}
	/**
	 * 设置：balance_divide_rate
	 */
	public void setBalanceDivideRate(BigDecimal balanceDivideRate) {
		this.balanceDivideRate = balanceDivideRate;
	}
	/**
	 * 获取：balance_divide_rate
	 */
	public BigDecimal getBalanceDivideRate() {
		return balanceDivideRate;
	}
	/**
	 * 设置：currency_code
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	/**
	 * 获取：currency_code
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}
	/**
	 * 设置：paypal_userId
	 */
	public void setPaypalUserid(String paypalUserid) {
		this.paypalUserid = paypalUserid;
	}
	/**
	 * 获取：paypal_userId
	 */
	public String getPaypalUserid() {
		return paypalUserid;
	}
	/**
	 * 设置：poundage
	 */
	public void setPoundage(BigDecimal poundage) {
		this.poundage = poundage;
	}
	/**
	 * 获取：poundage
	 */
	public BigDecimal getPoundage() {
		return poundage;
	}
	/**
	 * 设置：lzbank_key
	 */
	public void setLzbankKey(String lzbankKey) {
		this.lzbankKey = lzbankKey;
	}
	/**
	 * 获取：lzbank_key
	 */
	public String getLzbankKey() {
		return lzbankKey;
	}
	/**
	 * 设置：lzbank_partner
	 */
	public void setLzbankPartner(String lzbankPartner) {
		this.lzbankPartner = lzbankPartner;
	}
	/**
	 * 获取：lzbank_partner
	 */
	public String getLzbankPartner() {
		return lzbankPartner;
	}
	/**
	 * 设置：lzbank_trade_mode
	 */
	public void setLzbankTradeMode(String lzbankTradeMode) {
		this.lzbankTradeMode = lzbankTradeMode;
	}
	/**
	 * 获取：lzbank_trade_mode
	 */
	public String getLzbankTradeMode() {
		return lzbankTradeMode;
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
	 * 设置：weixin_partnerId
	 */
	public void setWeixinPartnerid(String weixinPartnerid) {
		this.weixinPartnerid = weixinPartnerid;
	}
	/**
	 * 获取：weixin_partnerId
	 */
	public String getWeixinPartnerid() {
		return weixinPartnerid;
	}
	/**
	 * 设置：weixin_partnerKey
	 */
	public void setWeixinPartnerkey(String weixinPartnerkey) {
		this.weixinPartnerkey = weixinPartnerkey;
	}
	/**
	 * 获取：weixin_partnerKey
	 */
	public String getWeixinPartnerkey() {
		return weixinPartnerkey;
	}
	/**
	 * 设置：weixin_paySignKey
	 */
	public void setWeixinPaysignkey(String weixinPaysignkey) {
		this.weixinPaysignkey = weixinPaysignkey;
	}
	/**
	 * 获取：weixin_paySignKey
	 */
	public String getWeixinPaysignkey() {
		return weixinPaysignkey;
	}
}

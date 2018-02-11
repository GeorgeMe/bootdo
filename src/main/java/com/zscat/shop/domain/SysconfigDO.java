package com.zscat.shop.domain;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;



/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:39
 */
public class SysconfigDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//address
	private String address;
	//bigHeight
	private Integer bigheight;
	//bigWidth
	private Integer bigwidth;
	//closeReason
	private String closereason;
	//codeStat
	private String codestat;
	//complaint_time
	private Integer complaintTime;
	//consumptionRatio
	private Integer consumptionratio;
	//copyRight
	private String copyright;
	//creditrule
	private String creditrule;
	//deposit
	private Boolean deposit;
	//description
	private String description;
	//emailEnable
	private Boolean emailenable;
	//emailHost
	private String emailhost;
	//emailPort
	private Integer emailport;
	//emailPws
	private String emailpws;
	//emailTest
	private String emailtest;
	//emailUser
	private String emailuser;
	//emailUserName
	private String emailusername;
	//everyIndentLimit
	private Integer everyindentlimit;
	//gold
	private Boolean gold;
	//goldMarketValue
	private Integer goldmarketvalue;
	//groupBuy
	private Boolean groupbuy;
	//hotSearch
	private String hotsearch;
	//imageFilesize
	private Integer imagefilesize;
	//imageSaveType
	private String imagesavetype;
	//imageSuffix
	private String imagesuffix;
	//indentComment
	private Integer indentcomment;
	//integral
	private Boolean integral;
	//integralRate
	private Integer integralrate;
	//integralStore
	private Boolean integralstore;
	//keywords
	private String keywords;
	//memberDayLogin
	private Integer memberdaylogin;
	//memberRegister
	private Integer memberregister;
	//middleHeight
	private Integer middleheight;
	//middleWidth
	private Integer middlewidth;
	//securityCodeConsult
	private Boolean securitycodeconsult;
	//securityCodeLogin
	private Boolean securitycodelogin;
	//securityCodeRegister
	private Boolean securitycoderegister;
	//securityCodeType
	private String securitycodetype;
	//share_code
	private String shareCode;
	//smallHeight
	private Integer smallheight;
	//smallWidth
	private Integer smallwidth;
	//smsEnbale
	private Boolean smsenbale;
	//smsPassword
	private String smspassword;
	//smsTest
	private String smstest;
	//smsURL
	private String smsurl;
	//smsUserName
	private String smsusername;
	//store_allow
	private Boolean storeAllow;
	//store_payment
	private String storePayment;
	//sysLanguage
	private String syslanguage;
	//templates
	private String templates;
	//title
	private String title;
	//uploadFilePath
	private String uploadfilepath;
	//user_creditrule
	private String userCreditrule;
	//visitorConsult
	private Boolean visitorconsult;
	//voucher
	private Boolean voucher;
	//websiteName
	private String websitename;
	//websiteState
	private Boolean websitestate;
	//ztc_price
	private Integer ztcPrice;
	//ztc_status
	private Boolean ztcStatus;
	//goodsImage_id
	private Long goodsimageId;
	//memberIcon_id
	private Long membericonId;
	//storeImage_id
	private Long storeimageId;
	//websiteLogo_id
	private Long websitelogoId;
	//domain_allow_count
	private Integer domainAllowCount;
	//second_domain_open
	private Boolean secondDomainOpen;
	//sys_domain
	private String sysDomain;
	//qq_login
	private Boolean qqLogin;
	//qq_login_id
	private String qqLoginId;
	//qq_login_key
	private String qqLoginKey;
	//qq_domain_code
	private String qqDomainCode;
	//sina_domain_code
	private String sinaDomainCode;
	//sina_login
	private Boolean sinaLogin;
	//sina_login_id
	private String sinaLoginId;
	//sina_login_key
	private String sinaLoginKey;
	//imageWebServer
	private String imagewebserver;
	//lucene_update
	private Date luceneUpdate;
	//alipay_fenrun
	private Integer alipayFenrun;
	//balance_fenrun
	private Integer balanceFenrun;
	//auto_order_confirm
	private Integer autoOrderConfirm;
	//auto_order_notice
	private Integer autoOrderNotice;
	//bargain_maximum
	private Integer bargainMaximum;
	//bargain_rebate
	private BigDecimal bargainRebate;
	//bargain_state
	private String bargainState;
	//bargain_status
	private Integer bargainStatus;
	//bargain_title
	private String bargainTitle;
	//service_qq_list
	private String serviceQqList;
	//service_telphone_list
	private String serviceTelphoneList;
	//sys_delivery_maximum
	private Integer sysDeliveryMaximum;
	//uc_bbs
	private Boolean ucBbs;
	//kuaidi_id
	private String kuaidiId;
	//uc_api
	private String ucApi;
	//uc_appid
	private String ucAppid;
	//uc_database
	private String ucDatabase;
	//uc_database_port
	private String ucDatabasePort;
	//uc_database_pws
	private String ucDatabasePws;
	//uc_database_url
	private String ucDatabaseUrl;
	//uc_database_username
	private String ucDatabaseUsername;
	//uc_ip
	private String ucIp;
	//uc_key
	private String ucKey;
	//uc_table_preffix
	private String ucTablePreffix;
	//currency_code
	private String currencyCode;
	//bargain_validity
	private Integer bargainValidity;
	//delivery_amount
	private Integer deliveryAmount;
	//delivery_status
	private Integer deliveryStatus;
	//delivery_title
	private String deliveryTitle;
	//websiteCss
	private String websitecss;
	//combin_amount
	private Integer combinAmount;
	//combin_count
	private Integer combinCount;
	//ztc_goods_view
	private Integer ztcGoodsView;
	//auto_order_evaluate
	private Integer autoOrderEvaluate;
	//auto_order_return
	private Integer autoOrderReturn;
	//weixin_store
	private Boolean weixinStore;
	//weixin_amount
	private Integer weixinAmount;
	//config_payment_type
	private Integer configPaymentType;
	//weixin_account
	private String weixinAccount;
	//weixin_appId
	private String weixinAppid;
	//weixin_appSecret
	private String weixinAppsecret;
	//weixin_token
	private String weixinToken;
	//weixin_welecome_content
	private String weixinWelecomeContent;
	//store_weixin_logo_id
	private Long storeWeixinLogoId;
	//weixin_qr_img_id
	private Long weixinQrImgId;
	//site_url
	private String siteUrl;

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
	 * 设置：address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置：bigHeight
	 */
	public void setBigheight(Integer bigheight) {
		this.bigheight = bigheight;
	}
	/**
	 * 获取：bigHeight
	 */
	public Integer getBigheight() {
		return bigheight;
	}
	/**
	 * 设置：bigWidth
	 */
	public void setBigwidth(Integer bigwidth) {
		this.bigwidth = bigwidth;
	}
	/**
	 * 获取：bigWidth
	 */
	public Integer getBigwidth() {
		return bigwidth;
	}
	/**
	 * 设置：closeReason
	 */
	public void setClosereason(String closereason) {
		this.closereason = closereason;
	}
	/**
	 * 获取：closeReason
	 */
	public String getClosereason() {
		return closereason;
	}
	/**
	 * 设置：codeStat
	 */
	public void setCodestat(String codestat) {
		this.codestat = codestat;
	}
	/**
	 * 获取：codeStat
	 */
	public String getCodestat() {
		return codestat;
	}
	/**
	 * 设置：complaint_time
	 */
	public void setComplaintTime(Integer complaintTime) {
		this.complaintTime = complaintTime;
	}
	/**
	 * 获取：complaint_time
	 */
	public Integer getComplaintTime() {
		return complaintTime;
	}
	/**
	 * 设置：consumptionRatio
	 */
	public void setConsumptionratio(Integer consumptionratio) {
		this.consumptionratio = consumptionratio;
	}
	/**
	 * 获取：consumptionRatio
	 */
	public Integer getConsumptionratio() {
		return consumptionratio;
	}
	/**
	 * 设置：copyRight
	 */
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}
	/**
	 * 获取：copyRight
	 */
	public String getCopyright() {
		return copyright;
	}
	/**
	 * 设置：creditrule
	 */
	public void setCreditrule(String creditrule) {
		this.creditrule = creditrule;
	}
	/**
	 * 获取：creditrule
	 */
	public String getCreditrule() {
		return creditrule;
	}
	/**
	 * 设置：deposit
	 */
	public void setDeposit(Boolean deposit) {
		this.deposit = deposit;
	}
	/**
	 * 获取：deposit
	 */
	public Boolean getDeposit() {
		return deposit;
	}
	/**
	 * 设置：description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 获取：description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 设置：emailEnable
	 */
	public void setEmailenable(Boolean emailenable) {
		this.emailenable = emailenable;
	}
	/**
	 * 获取：emailEnable
	 */
	public Boolean getEmailenable() {
		return emailenable;
	}
	/**
	 * 设置：emailHost
	 */
	public void setEmailhost(String emailhost) {
		this.emailhost = emailhost;
	}
	/**
	 * 获取：emailHost
	 */
	public String getEmailhost() {
		return emailhost;
	}
	/**
	 * 设置：emailPort
	 */
	public void setEmailport(Integer emailport) {
		this.emailport = emailport;
	}
	/**
	 * 获取：emailPort
	 */
	public Integer getEmailport() {
		return emailport;
	}
	/**
	 * 设置：emailPws
	 */
	public void setEmailpws(String emailpws) {
		this.emailpws = emailpws;
	}
	/**
	 * 获取：emailPws
	 */
	public String getEmailpws() {
		return emailpws;
	}
	/**
	 * 设置：emailTest
	 */
	public void setEmailtest(String emailtest) {
		this.emailtest = emailtest;
	}
	/**
	 * 获取：emailTest
	 */
	public String getEmailtest() {
		return emailtest;
	}
	/**
	 * 设置：emailUser
	 */
	public void setEmailuser(String emailuser) {
		this.emailuser = emailuser;
	}
	/**
	 * 获取：emailUser
	 */
	public String getEmailuser() {
		return emailuser;
	}
	/**
	 * 设置：emailUserName
	 */
	public void setEmailusername(String emailusername) {
		this.emailusername = emailusername;
	}
	/**
	 * 获取：emailUserName
	 */
	public String getEmailusername() {
		return emailusername;
	}
	/**
	 * 设置：everyIndentLimit
	 */
	public void setEveryindentlimit(Integer everyindentlimit) {
		this.everyindentlimit = everyindentlimit;
	}
	/**
	 * 获取：everyIndentLimit
	 */
	public Integer getEveryindentlimit() {
		return everyindentlimit;
	}
	/**
	 * 设置：gold
	 */
	public void setGold(Boolean gold) {
		this.gold = gold;
	}
	/**
	 * 获取：gold
	 */
	public Boolean getGold() {
		return gold;
	}
	/**
	 * 设置：goldMarketValue
	 */
	public void setGoldmarketvalue(Integer goldmarketvalue) {
		this.goldmarketvalue = goldmarketvalue;
	}
	/**
	 * 获取：goldMarketValue
	 */
	public Integer getGoldmarketvalue() {
		return goldmarketvalue;
	}
	/**
	 * 设置：groupBuy
	 */
	public void setGroupbuy(Boolean groupbuy) {
		this.groupbuy = groupbuy;
	}
	/**
	 * 获取：groupBuy
	 */
	public Boolean getGroupbuy() {
		return groupbuy;
	}
	/**
	 * 设置：hotSearch
	 */
	public void setHotsearch(String hotsearch) {
		this.hotsearch = hotsearch;
	}
	/**
	 * 获取：hotSearch
	 */
	public String getHotsearch() {
		return hotsearch;
	}
	/**
	 * 设置：imageFilesize
	 */
	public void setImagefilesize(Integer imagefilesize) {
		this.imagefilesize = imagefilesize;
	}
	/**
	 * 获取：imageFilesize
	 */
	public Integer getImagefilesize() {
		return imagefilesize;
	}
	/**
	 * 设置：imageSaveType
	 */
	public void setImagesavetype(String imagesavetype) {
		this.imagesavetype = imagesavetype;
	}
	/**
	 * 获取：imageSaveType
	 */
	public String getImagesavetype() {
		return imagesavetype;
	}
	/**
	 * 设置：imageSuffix
	 */
	public void setImagesuffix(String imagesuffix) {
		this.imagesuffix = imagesuffix;
	}
	/**
	 * 获取：imageSuffix
	 */
	public String getImagesuffix() {
		return imagesuffix;
	}
	/**
	 * 设置：indentComment
	 */
	public void setIndentcomment(Integer indentcomment) {
		this.indentcomment = indentcomment;
	}
	/**
	 * 获取：indentComment
	 */
	public Integer getIndentcomment() {
		return indentcomment;
	}
	/**
	 * 设置：integral
	 */
	public void setIntegral(Boolean integral) {
		this.integral = integral;
	}
	/**
	 * 获取：integral
	 */
	public Boolean getIntegral() {
		return integral;
	}
	/**
	 * 设置：integralRate
	 */
	public void setIntegralrate(Integer integralrate) {
		this.integralrate = integralrate;
	}
	/**
	 * 获取：integralRate
	 */
	public Integer getIntegralrate() {
		return integralrate;
	}
	/**
	 * 设置：integralStore
	 */
	public void setIntegralstore(Boolean integralstore) {
		this.integralstore = integralstore;
	}
	/**
	 * 获取：integralStore
	 */
	public Boolean getIntegralstore() {
		return integralstore;
	}
	/**
	 * 设置：keywords
	 */
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	/**
	 * 获取：keywords
	 */
	public String getKeywords() {
		return keywords;
	}
	/**
	 * 设置：memberDayLogin
	 */
	public void setMemberdaylogin(Integer memberdaylogin) {
		this.memberdaylogin = memberdaylogin;
	}
	/**
	 * 获取：memberDayLogin
	 */
	public Integer getMemberdaylogin() {
		return memberdaylogin;
	}
	/**
	 * 设置：memberRegister
	 */
	public void setMemberregister(Integer memberregister) {
		this.memberregister = memberregister;
	}
	/**
	 * 获取：memberRegister
	 */
	public Integer getMemberregister() {
		return memberregister;
	}
	/**
	 * 设置：middleHeight
	 */
	public void setMiddleheight(Integer middleheight) {
		this.middleheight = middleheight;
	}
	/**
	 * 获取：middleHeight
	 */
	public Integer getMiddleheight() {
		return middleheight;
	}
	/**
	 * 设置：middleWidth
	 */
	public void setMiddlewidth(Integer middlewidth) {
		this.middlewidth = middlewidth;
	}
	/**
	 * 获取：middleWidth
	 */
	public Integer getMiddlewidth() {
		return middlewidth;
	}
	/**
	 * 设置：securityCodeConsult
	 */
	public void setSecuritycodeconsult(Boolean securitycodeconsult) {
		this.securitycodeconsult = securitycodeconsult;
	}
	/**
	 * 获取：securityCodeConsult
	 */
	public Boolean getSecuritycodeconsult() {
		return securitycodeconsult;
	}
	/**
	 * 设置：securityCodeLogin
	 */
	public void setSecuritycodelogin(Boolean securitycodelogin) {
		this.securitycodelogin = securitycodelogin;
	}
	/**
	 * 获取：securityCodeLogin
	 */
	public Boolean getSecuritycodelogin() {
		return securitycodelogin;
	}
	/**
	 * 设置：securityCodeRegister
	 */
	public void setSecuritycoderegister(Boolean securitycoderegister) {
		this.securitycoderegister = securitycoderegister;
	}
	/**
	 * 获取：securityCodeRegister
	 */
	public Boolean getSecuritycoderegister() {
		return securitycoderegister;
	}
	/**
	 * 设置：securityCodeType
	 */
	public void setSecuritycodetype(String securitycodetype) {
		this.securitycodetype = securitycodetype;
	}
	/**
	 * 获取：securityCodeType
	 */
	public String getSecuritycodetype() {
		return securitycodetype;
	}
	/**
	 * 设置：share_code
	 */
	public void setShareCode(String shareCode) {
		this.shareCode = shareCode;
	}
	/**
	 * 获取：share_code
	 */
	public String getShareCode() {
		return shareCode;
	}
	/**
	 * 设置：smallHeight
	 */
	public void setSmallheight(Integer smallheight) {
		this.smallheight = smallheight;
	}
	/**
	 * 获取：smallHeight
	 */
	public Integer getSmallheight() {
		return smallheight;
	}
	/**
	 * 设置：smallWidth
	 */
	public void setSmallwidth(Integer smallwidth) {
		this.smallwidth = smallwidth;
	}
	/**
	 * 获取：smallWidth
	 */
	public Integer getSmallwidth() {
		return smallwidth;
	}
	/**
	 * 设置：smsEnbale
	 */
	public void setSmsenbale(Boolean smsenbale) {
		this.smsenbale = smsenbale;
	}
	/**
	 * 获取：smsEnbale
	 */
	public Boolean getSmsenbale() {
		return smsenbale;
	}
	/**
	 * 设置：smsPassword
	 */
	public void setSmspassword(String smspassword) {
		this.smspassword = smspassword;
	}
	/**
	 * 获取：smsPassword
	 */
	public String getSmspassword() {
		return smspassword;
	}
	/**
	 * 设置：smsTest
	 */
	public void setSmstest(String smstest) {
		this.smstest = smstest;
	}
	/**
	 * 获取：smsTest
	 */
	public String getSmstest() {
		return smstest;
	}
	/**
	 * 设置：smsURL
	 */
	public void setSmsurl(String smsurl) {
		this.smsurl = smsurl;
	}
	/**
	 * 获取：smsURL
	 */
	public String getSmsurl() {
		return smsurl;
	}
	/**
	 * 设置：smsUserName
	 */
	public void setSmsusername(String smsusername) {
		this.smsusername = smsusername;
	}
	/**
	 * 获取：smsUserName
	 */
	public String getSmsusername() {
		return smsusername;
	}
	/**
	 * 设置：store_allow
	 */
	public void setStoreAllow(Boolean storeAllow) {
		this.storeAllow = storeAllow;
	}
	/**
	 * 获取：store_allow
	 */
	public Boolean getStoreAllow() {
		return storeAllow;
	}
	/**
	 * 设置：store_payment
	 */
	public void setStorePayment(String storePayment) {
		this.storePayment = storePayment;
	}
	/**
	 * 获取：store_payment
	 */
	public String getStorePayment() {
		return storePayment;
	}
	/**
	 * 设置：sysLanguage
	 */
	public void setSyslanguage(String syslanguage) {
		this.syslanguage = syslanguage;
	}
	/**
	 * 获取：sysLanguage
	 */
	public String getSyslanguage() {
		return syslanguage;
	}
	/**
	 * 设置：templates
	 */
	public void setTemplates(String templates) {
		this.templates = templates;
	}
	/**
	 * 获取：templates
	 */
	public String getTemplates() {
		return templates;
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
	 * 设置：uploadFilePath
	 */
	public void setUploadfilepath(String uploadfilepath) {
		this.uploadfilepath = uploadfilepath;
	}
	/**
	 * 获取：uploadFilePath
	 */
	public String getUploadfilepath() {
		return uploadfilepath;
	}
	/**
	 * 设置：user_creditrule
	 */
	public void setUserCreditrule(String userCreditrule) {
		this.userCreditrule = userCreditrule;
	}
	/**
	 * 获取：user_creditrule
	 */
	public String getUserCreditrule() {
		return userCreditrule;
	}
	/**
	 * 设置：visitorConsult
	 */
	public void setVisitorconsult(Boolean visitorconsult) {
		this.visitorconsult = visitorconsult;
	}
	/**
	 * 获取：visitorConsult
	 */
	public Boolean getVisitorconsult() {
		return visitorconsult;
	}
	/**
	 * 设置：voucher
	 */
	public void setVoucher(Boolean voucher) {
		this.voucher = voucher;
	}
	/**
	 * 获取：voucher
	 */
	public Boolean getVoucher() {
		return voucher;
	}
	/**
	 * 设置：websiteName
	 */
	public void setWebsitename(String websitename) {
		this.websitename = websitename;
	}
	/**
	 * 获取：websiteName
	 */
	public String getWebsitename() {
		return websitename;
	}
	/**
	 * 设置：websiteState
	 */
	public void setWebsitestate(Boolean websitestate) {
		this.websitestate = websitestate;
	}
	/**
	 * 获取：websiteState
	 */
	public Boolean getWebsitestate() {
		return websitestate;
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
	public void setZtcStatus(Boolean ztcStatus) {
		this.ztcStatus = ztcStatus;
	}
	/**
	 * 获取：ztc_status
	 */
	public Boolean getZtcStatus() {
		return ztcStatus;
	}
	/**
	 * 设置：goodsImage_id
	 */
	public void setGoodsimageId(Long goodsimageId) {
		this.goodsimageId = goodsimageId;
	}
	/**
	 * 获取：goodsImage_id
	 */
	public Long getGoodsimageId() {
		return goodsimageId;
	}
	/**
	 * 设置：memberIcon_id
	 */
	public void setMembericonId(Long membericonId) {
		this.membericonId = membericonId;
	}
	/**
	 * 获取：memberIcon_id
	 */
	public Long getMembericonId() {
		return membericonId;
	}
	/**
	 * 设置：storeImage_id
	 */
	public void setStoreimageId(Long storeimageId) {
		this.storeimageId = storeimageId;
	}
	/**
	 * 获取：storeImage_id
	 */
	public Long getStoreimageId() {
		return storeimageId;
	}
	/**
	 * 设置：websiteLogo_id
	 */
	public void setWebsitelogoId(Long websitelogoId) {
		this.websitelogoId = websitelogoId;
	}
	/**
	 * 获取：websiteLogo_id
	 */
	public Long getWebsitelogoId() {
		return websitelogoId;
	}
	/**
	 * 设置：domain_allow_count
	 */
	public void setDomainAllowCount(Integer domainAllowCount) {
		this.domainAllowCount = domainAllowCount;
	}
	/**
	 * 获取：domain_allow_count
	 */
	public Integer getDomainAllowCount() {
		return domainAllowCount;
	}
	/**
	 * 设置：second_domain_open
	 */
	public void setSecondDomainOpen(Boolean secondDomainOpen) {
		this.secondDomainOpen = secondDomainOpen;
	}
	/**
	 * 获取：second_domain_open
	 */
	public Boolean getSecondDomainOpen() {
		return secondDomainOpen;
	}
	/**
	 * 设置：sys_domain
	 */
	public void setSysDomain(String sysDomain) {
		this.sysDomain = sysDomain;
	}
	/**
	 * 获取：sys_domain
	 */
	public String getSysDomain() {
		return sysDomain;
	}
	/**
	 * 设置：qq_login
	 */
	public void setQqLogin(Boolean qqLogin) {
		this.qqLogin = qqLogin;
	}
	/**
	 * 获取：qq_login
	 */
	public Boolean getQqLogin() {
		return qqLogin;
	}
	/**
	 * 设置：qq_login_id
	 */
	public void setQqLoginId(String qqLoginId) {
		this.qqLoginId = qqLoginId;
	}
	/**
	 * 获取：qq_login_id
	 */
	public String getQqLoginId() {
		return qqLoginId;
	}
	/**
	 * 设置：qq_login_key
	 */
	public void setQqLoginKey(String qqLoginKey) {
		this.qqLoginKey = qqLoginKey;
	}
	/**
	 * 获取：qq_login_key
	 */
	public String getQqLoginKey() {
		return qqLoginKey;
	}
	/**
	 * 设置：qq_domain_code
	 */
	public void setQqDomainCode(String qqDomainCode) {
		this.qqDomainCode = qqDomainCode;
	}
	/**
	 * 获取：qq_domain_code
	 */
	public String getQqDomainCode() {
		return qqDomainCode;
	}
	/**
	 * 设置：sina_domain_code
	 */
	public void setSinaDomainCode(String sinaDomainCode) {
		this.sinaDomainCode = sinaDomainCode;
	}
	/**
	 * 获取：sina_domain_code
	 */
	public String getSinaDomainCode() {
		return sinaDomainCode;
	}
	/**
	 * 设置：sina_login
	 */
	public void setSinaLogin(Boolean sinaLogin) {
		this.sinaLogin = sinaLogin;
	}
	/**
	 * 获取：sina_login
	 */
	public Boolean getSinaLogin() {
		return sinaLogin;
	}
	/**
	 * 设置：sina_login_id
	 */
	public void setSinaLoginId(String sinaLoginId) {
		this.sinaLoginId = sinaLoginId;
	}
	/**
	 * 获取：sina_login_id
	 */
	public String getSinaLoginId() {
		return sinaLoginId;
	}
	/**
	 * 设置：sina_login_key
	 */
	public void setSinaLoginKey(String sinaLoginKey) {
		this.sinaLoginKey = sinaLoginKey;
	}
	/**
	 * 获取：sina_login_key
	 */
	public String getSinaLoginKey() {
		return sinaLoginKey;
	}
	/**
	 * 设置：imageWebServer
	 */
	public void setImagewebserver(String imagewebserver) {
		this.imagewebserver = imagewebserver;
	}
	/**
	 * 获取：imageWebServer
	 */
	public String getImagewebserver() {
		return imagewebserver;
	}
	/**
	 * 设置：lucene_update
	 */
	public void setLuceneUpdate(Date luceneUpdate) {
		this.luceneUpdate = luceneUpdate;
	}
	/**
	 * 获取：lucene_update
	 */
	public Date getLuceneUpdate() {
		return luceneUpdate;
	}
	/**
	 * 设置：alipay_fenrun
	 */
	public void setAlipayFenrun(Integer alipayFenrun) {
		this.alipayFenrun = alipayFenrun;
	}
	/**
	 * 获取：alipay_fenrun
	 */
	public Integer getAlipayFenrun() {
		return alipayFenrun;
	}
	/**
	 * 设置：balance_fenrun
	 */
	public void setBalanceFenrun(Integer balanceFenrun) {
		this.balanceFenrun = balanceFenrun;
	}
	/**
	 * 获取：balance_fenrun
	 */
	public Integer getBalanceFenrun() {
		return balanceFenrun;
	}
	/**
	 * 设置：auto_order_confirm
	 */
	public void setAutoOrderConfirm(Integer autoOrderConfirm) {
		this.autoOrderConfirm = autoOrderConfirm;
	}
	/**
	 * 获取：auto_order_confirm
	 */
	public Integer getAutoOrderConfirm() {
		return autoOrderConfirm;
	}
	/**
	 * 设置：auto_order_notice
	 */
	public void setAutoOrderNotice(Integer autoOrderNotice) {
		this.autoOrderNotice = autoOrderNotice;
	}
	/**
	 * 获取：auto_order_notice
	 */
	public Integer getAutoOrderNotice() {
		return autoOrderNotice;
	}
	/**
	 * 设置：bargain_maximum
	 */
	public void setBargainMaximum(Integer bargainMaximum) {
		this.bargainMaximum = bargainMaximum;
	}
	/**
	 * 获取：bargain_maximum
	 */
	public Integer getBargainMaximum() {
		return bargainMaximum;
	}
	/**
	 * 设置：bargain_rebate
	 */
	public void setBargainRebate(BigDecimal bargainRebate) {
		this.bargainRebate = bargainRebate;
	}
	/**
	 * 获取：bargain_rebate
	 */
	public BigDecimal getBargainRebate() {
		return bargainRebate;
	}
	/**
	 * 设置：bargain_state
	 */
	public void setBargainState(String bargainState) {
		this.bargainState = bargainState;
	}
	/**
	 * 获取：bargain_state
	 */
	public String getBargainState() {
		return bargainState;
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
	 * 设置：bargain_title
	 */
	public void setBargainTitle(String bargainTitle) {
		this.bargainTitle = bargainTitle;
	}
	/**
	 * 获取：bargain_title
	 */
	public String getBargainTitle() {
		return bargainTitle;
	}
	/**
	 * 设置：service_qq_list
	 */
	public void setServiceQqList(String serviceQqList) {
		this.serviceQqList = serviceQqList;
	}
	/**
	 * 获取：service_qq_list
	 */
	public String getServiceQqList() {
		return serviceQqList;
	}
	/**
	 * 设置：service_telphone_list
	 */
	public void setServiceTelphoneList(String serviceTelphoneList) {
		this.serviceTelphoneList = serviceTelphoneList;
	}
	/**
	 * 获取：service_telphone_list
	 */
	public String getServiceTelphoneList() {
		return serviceTelphoneList;
	}
	/**
	 * 设置：sys_delivery_maximum
	 */
	public void setSysDeliveryMaximum(Integer sysDeliveryMaximum) {
		this.sysDeliveryMaximum = sysDeliveryMaximum;
	}
	/**
	 * 获取：sys_delivery_maximum
	 */
	public Integer getSysDeliveryMaximum() {
		return sysDeliveryMaximum;
	}
	/**
	 * 设置：uc_bbs
	 */
	public void setUcBbs(Boolean ucBbs) {
		this.ucBbs = ucBbs;
	}
	/**
	 * 获取：uc_bbs
	 */
	public Boolean getUcBbs() {
		return ucBbs;
	}
	/**
	 * 设置：kuaidi_id
	 */
	public void setKuaidiId(String kuaidiId) {
		this.kuaidiId = kuaidiId;
	}
	/**
	 * 获取：kuaidi_id
	 */
	public String getKuaidiId() {
		return kuaidiId;
	}
	/**
	 * 设置：uc_api
	 */
	public void setUcApi(String ucApi) {
		this.ucApi = ucApi;
	}
	/**
	 * 获取：uc_api
	 */
	public String getUcApi() {
		return ucApi;
	}
	/**
	 * 设置：uc_appid
	 */
	public void setUcAppid(String ucAppid) {
		this.ucAppid = ucAppid;
	}
	/**
	 * 获取：uc_appid
	 */
	public String getUcAppid() {
		return ucAppid;
	}
	/**
	 * 设置：uc_database
	 */
	public void setUcDatabase(String ucDatabase) {
		this.ucDatabase = ucDatabase;
	}
	/**
	 * 获取：uc_database
	 */
	public String getUcDatabase() {
		return ucDatabase;
	}
	/**
	 * 设置：uc_database_port
	 */
	public void setUcDatabasePort(String ucDatabasePort) {
		this.ucDatabasePort = ucDatabasePort;
	}
	/**
	 * 获取：uc_database_port
	 */
	public String getUcDatabasePort() {
		return ucDatabasePort;
	}
	/**
	 * 设置：uc_database_pws
	 */
	public void setUcDatabasePws(String ucDatabasePws) {
		this.ucDatabasePws = ucDatabasePws;
	}
	/**
	 * 获取：uc_database_pws
	 */
	public String getUcDatabasePws() {
		return ucDatabasePws;
	}
	/**
	 * 设置：uc_database_url
	 */
	public void setUcDatabaseUrl(String ucDatabaseUrl) {
		this.ucDatabaseUrl = ucDatabaseUrl;
	}
	/**
	 * 获取：uc_database_url
	 */
	public String getUcDatabaseUrl() {
		return ucDatabaseUrl;
	}
	/**
	 * 设置：uc_database_username
	 */
	public void setUcDatabaseUsername(String ucDatabaseUsername) {
		this.ucDatabaseUsername = ucDatabaseUsername;
	}
	/**
	 * 获取：uc_database_username
	 */
	public String getUcDatabaseUsername() {
		return ucDatabaseUsername;
	}
	/**
	 * 设置：uc_ip
	 */
	public void setUcIp(String ucIp) {
		this.ucIp = ucIp;
	}
	/**
	 * 获取：uc_ip
	 */
	public String getUcIp() {
		return ucIp;
	}
	/**
	 * 设置：uc_key
	 */
	public void setUcKey(String ucKey) {
		this.ucKey = ucKey;
	}
	/**
	 * 获取：uc_key
	 */
	public String getUcKey() {
		return ucKey;
	}
	/**
	 * 设置：uc_table_preffix
	 */
	public void setUcTablePreffix(String ucTablePreffix) {
		this.ucTablePreffix = ucTablePreffix;
	}
	/**
	 * 获取：uc_table_preffix
	 */
	public String getUcTablePreffix() {
		return ucTablePreffix;
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
	 * 设置：bargain_validity
	 */
	public void setBargainValidity(Integer bargainValidity) {
		this.bargainValidity = bargainValidity;
	}
	/**
	 * 获取：bargain_validity
	 */
	public Integer getBargainValidity() {
		return bargainValidity;
	}
	/**
	 * 设置：delivery_amount
	 */
	public void setDeliveryAmount(Integer deliveryAmount) {
		this.deliveryAmount = deliveryAmount;
	}
	/**
	 * 获取：delivery_amount
	 */
	public Integer getDeliveryAmount() {
		return deliveryAmount;
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
	 * 设置：delivery_title
	 */
	public void setDeliveryTitle(String deliveryTitle) {
		this.deliveryTitle = deliveryTitle;
	}
	/**
	 * 获取：delivery_title
	 */
	public String getDeliveryTitle() {
		return deliveryTitle;
	}
	/**
	 * 设置：websiteCss
	 */
	public void setWebsitecss(String websitecss) {
		this.websitecss = websitecss;
	}
	/**
	 * 获取：websiteCss
	 */
	public String getWebsitecss() {
		return websitecss;
	}
	/**
	 * 设置：combin_amount
	 */
	public void setCombinAmount(Integer combinAmount) {
		this.combinAmount = combinAmount;
	}
	/**
	 * 获取：combin_amount
	 */
	public Integer getCombinAmount() {
		return combinAmount;
	}
	/**
	 * 设置：combin_count
	 */
	public void setCombinCount(Integer combinCount) {
		this.combinCount = combinCount;
	}
	/**
	 * 获取：combin_count
	 */
	public Integer getCombinCount() {
		return combinCount;
	}
	/**
	 * 设置：ztc_goods_view
	 */
	public void setZtcGoodsView(Integer ztcGoodsView) {
		this.ztcGoodsView = ztcGoodsView;
	}
	/**
	 * 获取：ztc_goods_view
	 */
	public Integer getZtcGoodsView() {
		return ztcGoodsView;
	}
	/**
	 * 设置：auto_order_evaluate
	 */
	public void setAutoOrderEvaluate(Integer autoOrderEvaluate) {
		this.autoOrderEvaluate = autoOrderEvaluate;
	}
	/**
	 * 获取：auto_order_evaluate
	 */
	public Integer getAutoOrderEvaluate() {
		return autoOrderEvaluate;
	}
	/**
	 * 设置：auto_order_return
	 */
	public void setAutoOrderReturn(Integer autoOrderReturn) {
		this.autoOrderReturn = autoOrderReturn;
	}
	/**
	 * 获取：auto_order_return
	 */
	public Integer getAutoOrderReturn() {
		return autoOrderReturn;
	}
	/**
	 * 设置：weixin_store
	 */
	public void setWeixinStore(Boolean weixinStore) {
		this.weixinStore = weixinStore;
	}
	/**
	 * 获取：weixin_store
	 */
	public Boolean getWeixinStore() {
		return weixinStore;
	}
	/**
	 * 设置：weixin_amount
	 */
	public void setWeixinAmount(Integer weixinAmount) {
		this.weixinAmount = weixinAmount;
	}
	/**
	 * 获取：weixin_amount
	 */
	public Integer getWeixinAmount() {
		return weixinAmount;
	}
	/**
	 * 设置：config_payment_type
	 */
	public void setConfigPaymentType(Integer configPaymentType) {
		this.configPaymentType = configPaymentType;
	}
	/**
	 * 获取：config_payment_type
	 */
	public Integer getConfigPaymentType() {
		return configPaymentType;
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
	 * 设置：site_url
	 */
	public void setSiteUrl(String siteUrl) {
		this.siteUrl = siteUrl;
	}
	/**
	 * 获取：site_url
	 */
	public String getSiteUrl() {
		return siteUrl;
	}
}

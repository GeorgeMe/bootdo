
var prefix = "/shop/sysconfig"
$(function() {
	load();
});

function load() {
	$('#exampleTable')
			.bootstrapTable(
					{
						method : 'get', // 服务器数据的请求方式 get or post
						url : prefix + "/list", // 服务器数据的加载地址
					//	showRefresh : true,
					//	showToggle : true,
					//	showColumns : true,
						iconSize : 'outline',
						toolbar : '#exampleToolbar',
						striped : true, // 设置为true会有隔行变色效果
						dataType : "json", // 服务器返回的数据类型
						pagination : true, // 设置为true会在底部显示分页条
						// queryParamsType : "limit",
						// //设置为limit则会发送符合RESTFull格式的参数
						singleSelect : false, // 设置为true将禁止多选
						// contentType : "application/x-www-form-urlencoded",
						// //发送到服务器的数据编码类型
						pageSize : 10, // 如果设置了分页，每页数据条数
						pageNumber : 1, // 如果设置了分布，首页页码
						//search : true, // 是否显示搜索框
						showColumns : false, // 是否显示内容下拉框（选择显示的列）
						sidePagination : "server", // 设置在哪里进行分页，可选值为"client" 或者 "server"
						queryParams : function(params) {
							return {
								//说明：传入后台的参数包括offset开始索引，limit步长，sort排序列，order：desc或者,以及所有列的键值对
								limit: params.limit,
								offset:params.offset
					           // name:$('#searchName').val(),
					           // username:$('#searchName').val()
							};
						},
						// //请求服务器数据时，你可以通过重写参数的方式添加一些额外的参数，例如 toolbar 中的参数 如果
						// queryParamsType = 'limit' ,返回参数必须包含
						// limit, offset, search, sort, order 否则, 需要包含:
						// pageSize, pageNumber, searchText, sortName,
						// sortOrder.
						// 返回false将会终止请求
						columns : [
								{
									checkbox : true
								},
																{
									field : 'id', 
									title : 'id' 
								},
																{
									field : 'addtime', 
									title : 'addTime' 
								},
																{
									field : 'deletestatus', 
									title : 'deleteStatus' 
								},
																{
									field : 'address', 
									title : 'address' 
								},
																{
									field : 'bigheight', 
									title : 'bigHeight' 
								},
																{
									field : 'bigwidth', 
									title : 'bigWidth' 
								},
																{
									field : 'closereason', 
									title : 'closeReason' 
								},
																{
									field : 'codestat', 
									title : 'codeStat' 
								},
																{
									field : 'complaintTime', 
									title : 'complaint_time' 
								},
																{
									field : 'consumptionratio', 
									title : 'consumptionRatio' 
								},
																{
									field : 'copyright', 
									title : 'copyRight' 
								},
																{
									field : 'creditrule', 
									title : 'creditrule' 
								},
																{
									field : 'deposit', 
									title : 'deposit' 
								},
																{
									field : 'description', 
									title : 'description' 
								},
																{
									field : 'emailenable', 
									title : 'emailEnable' 
								},
																{
									field : 'emailhost', 
									title : 'emailHost' 
								},
																{
									field : 'emailport', 
									title : 'emailPort' 
								},
																{
									field : 'emailpws', 
									title : 'emailPws' 
								},
																{
									field : 'emailtest', 
									title : 'emailTest' 
								},
																{
									field : 'emailuser', 
									title : 'emailUser' 
								},
																{
									field : 'emailusername', 
									title : 'emailUserName' 
								},
																{
									field : 'everyindentlimit', 
									title : 'everyIndentLimit' 
								},
																{
									field : 'gold', 
									title : 'gold' 
								},
																{
									field : 'goldmarketvalue', 
									title : 'goldMarketValue' 
								},
																{
									field : 'groupbuy', 
									title : 'groupBuy' 
								},
																{
									field : 'hotsearch', 
									title : 'hotSearch' 
								},
																{
									field : 'imagefilesize', 
									title : 'imageFilesize' 
								},
																{
									field : 'imagesavetype', 
									title : 'imageSaveType' 
								},
																{
									field : 'imagesuffix', 
									title : 'imageSuffix' 
								},
																{
									field : 'indentcomment', 
									title : 'indentComment' 
								},
																{
									field : 'integral', 
									title : 'integral' 
								},
																{
									field : 'integralrate', 
									title : 'integralRate' 
								},
																{
									field : 'integralstore', 
									title : 'integralStore' 
								},
																{
									field : 'keywords', 
									title : 'keywords' 
								},
																{
									field : 'memberdaylogin', 
									title : 'memberDayLogin' 
								},
																{
									field : 'memberregister', 
									title : 'memberRegister' 
								},
																{
									field : 'middleheight', 
									title : 'middleHeight' 
								},
																{
									field : 'middlewidth', 
									title : 'middleWidth' 
								},
																{
									field : 'securitycodeconsult', 
									title : 'securityCodeConsult' 
								},
																{
									field : 'securitycodelogin', 
									title : 'securityCodeLogin' 
								},
																{
									field : 'securitycoderegister', 
									title : 'securityCodeRegister' 
								},
																{
									field : 'securitycodetype', 
									title : 'securityCodeType' 
								},
																{
									field : 'shareCode', 
									title : 'share_code' 
								},
																{
									field : 'smallheight', 
									title : 'smallHeight' 
								},
																{
									field : 'smallwidth', 
									title : 'smallWidth' 
								},
																{
									field : 'smsenbale', 
									title : 'smsEnbale' 
								},
																{
									field : 'smspassword', 
									title : 'smsPassword' 
								},
																{
									field : 'smstest', 
									title : 'smsTest' 
								},
																{
									field : 'smsurl', 
									title : 'smsURL' 
								},
																{
									field : 'smsusername', 
									title : 'smsUserName' 
								},
																{
									field : 'storeAllow', 
									title : 'store_allow' 
								},
																{
									field : 'storePayment', 
									title : 'store_payment' 
								},
																{
									field : 'syslanguage', 
									title : 'sysLanguage' 
								},
																{
									field : 'templates', 
									title : 'templates' 
								},
																{
									field : 'title', 
									title : 'title' 
								},
																{
									field : 'uploadfilepath', 
									title : 'uploadFilePath' 
								},
																{
									field : 'userCreditrule', 
									title : 'user_creditrule' 
								},
																{
									field : 'visitorconsult', 
									title : 'visitorConsult' 
								},
																{
									field : 'voucher', 
									title : 'voucher' 
								},
																{
									field : 'websitename', 
									title : 'websiteName' 
								},
																{
									field : 'websitestate', 
									title : 'websiteState' 
								},
																{
									field : 'ztcPrice', 
									title : 'ztc_price' 
								},
																{
									field : 'ztcStatus', 
									title : 'ztc_status' 
								},
																{
									field : 'goodsimageId', 
									title : 'goodsImage_id' 
								},
																{
									field : 'membericonId', 
									title : 'memberIcon_id' 
								},
																{
									field : 'storeimageId', 
									title : 'storeImage_id' 
								},
																{
									field : 'websitelogoId', 
									title : 'websiteLogo_id' 
								},
																{
									field : 'domainAllowCount', 
									title : 'domain_allow_count' 
								},
																{
									field : 'secondDomainOpen', 
									title : 'second_domain_open' 
								},
																{
									field : 'sysDomain', 
									title : 'sys_domain' 
								},
																{
									field : 'qqLogin', 
									title : 'qq_login' 
								},
																{
									field : 'qqLoginId', 
									title : 'qq_login_id' 
								},
																{
									field : 'qqLoginKey', 
									title : 'qq_login_key' 
								},
																{
									field : 'qqDomainCode', 
									title : 'qq_domain_code' 
								},
																{
									field : 'sinaDomainCode', 
									title : 'sina_domain_code' 
								},
																{
									field : 'sinaLogin', 
									title : 'sina_login' 
								},
																{
									field : 'sinaLoginId', 
									title : 'sina_login_id' 
								},
																{
									field : 'sinaLoginKey', 
									title : 'sina_login_key' 
								},
																{
									field : 'imagewebserver', 
									title : 'imageWebServer' 
								},
																{
									field : 'luceneUpdate', 
									title : 'lucene_update' 
								},
																{
									field : 'alipayFenrun', 
									title : 'alipay_fenrun' 
								},
																{
									field : 'balanceFenrun', 
									title : 'balance_fenrun' 
								},
																{
									field : 'autoOrderConfirm', 
									title : 'auto_order_confirm' 
								},
																{
									field : 'autoOrderNotice', 
									title : 'auto_order_notice' 
								},
																{
									field : 'bargainMaximum', 
									title : 'bargain_maximum' 
								},
																{
									field : 'bargainRebate', 
									title : 'bargain_rebate' 
								},
																{
									field : 'bargainState', 
									title : 'bargain_state' 
								},
																{
									field : 'bargainStatus', 
									title : 'bargain_status' 
								},
																{
									field : 'bargainTitle', 
									title : 'bargain_title' 
								},
																{
									field : 'serviceQqList', 
									title : 'service_qq_list' 
								},
																{
									field : 'serviceTelphoneList', 
									title : 'service_telphone_list' 
								},
																{
									field : 'sysDeliveryMaximum', 
									title : 'sys_delivery_maximum' 
								},
																{
									field : 'ucBbs', 
									title : 'uc_bbs' 
								},
																{
									field : 'kuaidiId', 
									title : 'kuaidi_id' 
								},
																{
									field : 'ucApi', 
									title : 'uc_api' 
								},
																{
									field : 'ucAppid', 
									title : 'uc_appid' 
								},
																{
									field : 'ucDatabase', 
									title : 'uc_database' 
								},
																{
									field : 'ucDatabasePort', 
									title : 'uc_database_port' 
								},
																{
									field : 'ucDatabasePws', 
									title : 'uc_database_pws' 
								},
																{
									field : 'ucDatabaseUrl', 
									title : 'uc_database_url' 
								},
																{
									field : 'ucDatabaseUsername', 
									title : 'uc_database_username' 
								},
																{
									field : 'ucIp', 
									title : 'uc_ip' 
								},
																{
									field : 'ucKey', 
									title : 'uc_key' 
								},
																{
									field : 'ucTablePreffix', 
									title : 'uc_table_preffix' 
								},
																{
									field : 'currencyCode', 
									title : 'currency_code' 
								},
																{
									field : 'bargainValidity', 
									title : 'bargain_validity' 
								},
																{
									field : 'deliveryAmount', 
									title : 'delivery_amount' 
								},
																{
									field : 'deliveryStatus', 
									title : 'delivery_status' 
								},
																{
									field : 'deliveryTitle', 
									title : 'delivery_title' 
								},
																{
									field : 'websitecss', 
									title : 'websiteCss' 
								},
																{
									field : 'combinAmount', 
									title : 'combin_amount' 
								},
																{
									field : 'combinCount', 
									title : 'combin_count' 
								},
																{
									field : 'ztcGoodsView', 
									title : 'ztc_goods_view' 
								},
																{
									field : 'autoOrderEvaluate', 
									title : 'auto_order_evaluate' 
								},
																{
									field : 'autoOrderReturn', 
									title : 'auto_order_return' 
								},
																{
									field : 'weixinStore', 
									title : 'weixin_store' 
								},
																{
									field : 'weixinAmount', 
									title : 'weixin_amount' 
								},
																{
									field : 'configPaymentType', 
									title : 'config_payment_type' 
								},
																{
									field : 'weixinAccount', 
									title : 'weixin_account' 
								},
																{
									field : 'weixinAppid', 
									title : 'weixin_appId' 
								},
																{
									field : 'weixinAppsecret', 
									title : 'weixin_appSecret' 
								},
																{
									field : 'weixinToken', 
									title : 'weixin_token' 
								},
																{
									field : 'weixinWelecomeContent', 
									title : 'weixin_welecome_content' 
								},
																{
									field : 'storeWeixinLogoId', 
									title : 'store_weixin_logo_id' 
								},
																{
									field : 'weixinQrImgId', 
									title : 'weixin_qr_img_id' 
								},
																{
									field : 'siteUrl', 
									title : 'site_url' 
								},
																{
									title : '操作',
									field : 'id',
									align : 'center',
									formatter : function(value, row, index) {
										var e = '<a class="btn btn-primary btn-sm '+s_edit_h+'" href="#" mce_href="#" title="编辑" onclick="edit(\''
												+ row.id
												+ '\')"><i class="fa fa-edit"></i></a> ';
										var d = '<a class="btn btn-warning btn-sm '+s_remove_h+'" href="#" title="删除"  mce_href="#" onclick="remove(\''
												+ row.id
												+ '\')"><i class="fa fa-remove"></i></a> ';
										var f = '<a class="btn btn-success btn-sm" href="#" title="备用"  mce_href="#" onclick="resetPwd(\''
												+ row.id
												+ '\')"><i class="fa fa-key"></i></a> ';
										return e + d ;
									}
								} ]
					});
}
function reLoad() {
	$('#exampleTable').bootstrapTable('refresh');
}
function add() {
	layer.open({
		type : 2,
		title : '增加',
		maxmin : true,
		shadeClose : false, // 点击遮罩关闭层
		area : [ '800px', '520px' ],
		content : prefix + '/add' // iframe的url
	});
}
function edit(id) {
	layer.open({
		type : 2,
		title : '编辑',
		maxmin : true,
		shadeClose : false, // 点击遮罩关闭层
		area : [ '800px', '520px' ],
		content : prefix + '/edit/' + id // iframe的url
	});
}
function remove(id) {
	layer.confirm('确定要删除选中的记录？', {
		btn : [ '确定', '取消' ]
	}, function() {
		$.ajax({
			url : prefix+"/remove",
			type : "post",
			data : {
				'id' : id
			},
			success : function(r) {
				if (r.code==0) {
					layer.msg(r.msg);
					reLoad();
				}else{
					layer.msg(r.msg);
				}
			}
		});
	})
}

function resetPwd(id) {
}
function batchRemove() {
	var rows = $('#exampleTable').bootstrapTable('getSelections'); // 返回所有选择的行，当没有选择的记录时，返回一个空数组
	if (rows.length == 0) {
		layer.msg("请选择要删除的数据");
		return;
	}
	layer.confirm("确认要删除选中的'" + rows.length + "'条数据吗?", {
		btn : [ '确定', '取消' ]
	// 按钮
	}, function() {
		var ids = new Array();
		// 遍历所有选择的行数据，取每条数据对应的ID
		$.each(rows, function(i, row) {
			ids[i] = row['id'];
		});
		$.ajax({
			type : 'POST',
			data : {
				"ids" : ids
			},
			url : prefix + '/batchRemove',
			success : function(r) {
				if (r.code == 0) {
					layer.msg(r.msg);
					reLoad();
				} else {
					layer.msg(r.msg);
				}
			}
		});
	}, function() {

	});
}
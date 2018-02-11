package com.zscat.shop.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zscat.shop.domain.PredepositCashDO;
import com.zscat.shop.service.PredepositCashService;
import com.zscat.common.utils.PageUtils;
import com.zscat.common.utils.Query;
import com.zscat.common.utils.R;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
 
@Controller
@RequestMapping("/shop/predepositCash")
public class PredepositCashController {
	@Autowired
	private PredepositCashService predepositCashService;
	
	@GetMapping()
	@RequiresPermissions("shop:predepositCash:predepositCash")
	String PredepositCash(){
	    return "shop/predepositCash/predepositCash";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:predepositCash:predepositCash")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<PredepositCashDO> predepositCashList = predepositCashService.list(query);
		int total = predepositCashService.count(query);
		PageUtils pageUtils = new PageUtils(predepositCashList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:predepositCash:add")
	String add(){
	    return "shop/predepositCash/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:predepositCash:edit")
	String edit(@PathVariable("id") Long id,Model model){
		PredepositCashDO predepositCash = predepositCashService.get(id);
		model.addAttribute("predepositCash", predepositCash);
	    return "shop/predepositCash/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:predepositCash:add")
	public R save( PredepositCashDO predepositCash){
		if(predepositCashService.save(predepositCash)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:predepositCash:edit")
	public R update( PredepositCashDO predepositCash){
		predepositCashService.update(predepositCash);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:predepositCash:remove")
	public R remove( Long id){
		if(predepositCashService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:predepositCash:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		predepositCashService.batchRemove(ids);
		return R.ok();
	}
	
}

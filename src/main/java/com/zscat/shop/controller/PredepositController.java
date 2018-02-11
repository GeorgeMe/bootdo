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

import com.zscat.shop.domain.PredepositDO;
import com.zscat.shop.service.PredepositService;
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
@RequestMapping("/shop/predeposit")
public class PredepositController {
	@Autowired
	private PredepositService predepositService;
	
	@GetMapping()
	@RequiresPermissions("shop:predeposit:predeposit")
	String Predeposit(){
	    return "shop/predeposit/predeposit";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:predeposit:predeposit")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<PredepositDO> predepositList = predepositService.list(query);
		int total = predepositService.count(query);
		PageUtils pageUtils = new PageUtils(predepositList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:predeposit:add")
	String add(){
	    return "shop/predeposit/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:predeposit:edit")
	String edit(@PathVariable("id") Long id,Model model){
		PredepositDO predeposit = predepositService.get(id);
		model.addAttribute("predeposit", predeposit);
	    return "shop/predeposit/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:predeposit:add")
	public R save( PredepositDO predeposit){
		if(predepositService.save(predeposit)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:predeposit:edit")
	public R update( PredepositDO predeposit){
		predepositService.update(predeposit);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:predeposit:remove")
	public R remove( Long id){
		if(predepositService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:predeposit:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		predepositService.batchRemove(ids);
		return R.ok();
	}
	
}

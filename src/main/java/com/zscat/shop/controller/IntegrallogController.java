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

import com.zscat.shop.domain.IntegrallogDO;
import com.zscat.shop.service.IntegrallogService;
import com.zscat.common.utils.PageUtils;
import com.zscat.common.utils.Query;
import com.zscat.common.utils.R;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:37
 */
 
@Controller
@RequestMapping("/shop/integrallog")
public class IntegrallogController {
	@Autowired
	private IntegrallogService integrallogService;
	
	@GetMapping()
	@RequiresPermissions("shop:integrallog:integrallog")
	String Integrallog(){
	    return "shop/integrallog/integrallog";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:integrallog:integrallog")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<IntegrallogDO> integrallogList = integrallogService.list(query);
		int total = integrallogService.count(query);
		PageUtils pageUtils = new PageUtils(integrallogList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:integrallog:add")
	String add(){
	    return "shop/integrallog/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:integrallog:edit")
	String edit(@PathVariable("id") Long id,Model model){
		IntegrallogDO integrallog = integrallogService.get(id);
		model.addAttribute("integrallog", integrallog);
	    return "shop/integrallog/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:integrallog:add")
	public R save( IntegrallogDO integrallog){
		if(integrallogService.save(integrallog)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:integrallog:edit")
	public R update( IntegrallogDO integrallog){
		integrallogService.update(integrallog);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:integrallog:remove")
	public R remove( Long id){
		if(integrallogService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:integrallog:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		integrallogService.batchRemove(ids);
		return R.ok();
	}
	
}

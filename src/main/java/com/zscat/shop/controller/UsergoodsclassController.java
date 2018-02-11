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

import com.zscat.shop.domain.UsergoodsclassDO;
import com.zscat.shop.service.UsergoodsclassService;
import com.zscat.common.utils.PageUtils;
import com.zscat.common.utils.Query;
import com.zscat.common.utils.R;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:39
 */
 
@Controller
@RequestMapping("/shop/usergoodsclass")
public class UsergoodsclassController {
	@Autowired
	private UsergoodsclassService usergoodsclassService;
	
	@GetMapping()
	@RequiresPermissions("shop:usergoodsclass:usergoodsclass")
	String Usergoodsclass(){
	    return "shop/usergoodsclass/usergoodsclass";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:usergoodsclass:usergoodsclass")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<UsergoodsclassDO> usergoodsclassList = usergoodsclassService.list(query);
		int total = usergoodsclassService.count(query);
		PageUtils pageUtils = new PageUtils(usergoodsclassList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:usergoodsclass:add")
	String add(){
	    return "shop/usergoodsclass/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:usergoodsclass:edit")
	String edit(@PathVariable("id") Long id,Model model){
		UsergoodsclassDO usergoodsclass = usergoodsclassService.get(id);
		model.addAttribute("usergoodsclass", usergoodsclass);
	    return "shop/usergoodsclass/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:usergoodsclass:add")
	public R save( UsergoodsclassDO usergoodsclass){
		if(usergoodsclassService.save(usergoodsclass)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:usergoodsclass:edit")
	public R update( UsergoodsclassDO usergoodsclass){
		usergoodsclassService.update(usergoodsclass);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:usergoodsclass:remove")
	public R remove( Long id){
		if(usergoodsclassService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:usergoodsclass:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		usergoodsclassService.batchRemove(ids);
		return R.ok();
	}
	
}

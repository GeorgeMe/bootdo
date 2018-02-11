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

import com.zscat.shop.domain.GroupDO;
import com.zscat.shop.service.GroupService;
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
@RequestMapping("/shop/group")
public class GroupController {
	@Autowired
	private GroupService groupService;
	
	@GetMapping()
	@RequiresPermissions("shop:group:group")
	String Group(){
	    return "shop/group/group";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:group:group")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GroupDO> groupList = groupService.list(query);
		int total = groupService.count(query);
		PageUtils pageUtils = new PageUtils(groupList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:group:add")
	String add(){
	    return "shop/group/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:group:edit")
	String edit(@PathVariable("id") Long id,Model model){
		GroupDO group = groupService.get(id);
		model.addAttribute("group", group);
	    return "shop/group/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:group:add")
	public R save( GroupDO group){
		if(groupService.save(group)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:group:edit")
	public R update( GroupDO group){
		groupService.update(group);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:group:remove")
	public R remove( Long id){
		if(groupService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:group:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		groupService.batchRemove(ids);
		return R.ok();
	}
	
}

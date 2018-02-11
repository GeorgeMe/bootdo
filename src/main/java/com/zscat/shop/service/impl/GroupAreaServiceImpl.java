package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.GroupAreaDao;
import com.zscat.shop.domain.GroupAreaDO;
import com.zscat.shop.service.GroupAreaService;



@Service
public class GroupAreaServiceImpl implements GroupAreaService {
	@Autowired
	private GroupAreaDao groupAreaDao;
	
	@Override
	public GroupAreaDO get(Long id){
		return groupAreaDao.get(id);
	}
	
	@Override
	public List<GroupAreaDO> list(Map<String, Object> map){
		return groupAreaDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return groupAreaDao.count(map);
	}
	
	@Override
	public int save(GroupAreaDO groupArea){
		return groupAreaDao.save(groupArea);
	}
	
	@Override
	public int update(GroupAreaDO groupArea){
		return groupAreaDao.update(groupArea);
	}
	
	@Override
	public int remove(Long id){
		return groupAreaDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return groupAreaDao.batchRemove(ids);
	}
    @Override
    public GroupAreaDO selectOne(Map<String, Object> params) {
        List<GroupAreaDO> list = groupAreaDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<GroupAreaDO> resList = groupAreaDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

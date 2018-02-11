package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.GroupClassDao;
import com.zscat.shop.domain.GroupClassDO;
import com.zscat.shop.service.GroupClassService;



@Service
public class GroupClassServiceImpl implements GroupClassService {
	@Autowired
	private GroupClassDao groupClassDao;
	
	@Override
	public GroupClassDO get(Long id){
		return groupClassDao.get(id);
	}
	
	@Override
	public List<GroupClassDO> list(Map<String, Object> map){
		return groupClassDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return groupClassDao.count(map);
	}
	
	@Override
	public int save(GroupClassDO groupClass){
		return groupClassDao.save(groupClass);
	}
	
	@Override
	public int update(GroupClassDO groupClass){
		return groupClassDao.update(groupClass);
	}
	
	@Override
	public int remove(Long id){
		return groupClassDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return groupClassDao.batchRemove(ids);
	}
    @Override
    public GroupClassDO selectOne(Map<String, Object> params) {
        List<GroupClassDO> list = groupClassDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<GroupClassDO> resList = groupClassDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

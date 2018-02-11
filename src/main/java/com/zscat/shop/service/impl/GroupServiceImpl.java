package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.GroupDao;
import com.zscat.shop.domain.GroupDO;
import com.zscat.shop.service.GroupService;



@Service
public class GroupServiceImpl implements GroupService {
	@Autowired
	private GroupDao groupDao;
	
	@Override
	public GroupDO get(Long id){
		return groupDao.get(id);
	}
	
	@Override
	public List<GroupDO> list(Map<String, Object> map){
		return groupDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return groupDao.count(map);
	}
	
	@Override
	public int save(GroupDO group){
		return groupDao.save(group);
	}
	
	@Override
	public int update(GroupDO group){
		return groupDao.update(group);
	}
	
	@Override
	public int remove(Long id){
		return groupDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return groupDao.batchRemove(ids);
	}
    @Override
    public GroupDO selectOne(Map<String, Object> params) {
        List<GroupDO> list = groupDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<GroupDO> resList = groupDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.ActivityDao;
import com.zscat.shop.domain.ActivityDO;
import com.zscat.shop.service.ActivityService;



@Service
public class ActivityServiceImpl implements ActivityService {
	@Autowired
	private ActivityDao activityDao;
	
	@Override
	public ActivityDO get(Long id){
		return activityDao.get(id);
	}
	
	@Override
	public List<ActivityDO> list(Map<String, Object> map){
		return activityDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return activityDao.count(map);
	}
	
	@Override
	public int save(ActivityDO activity){
		return activityDao.save(activity);
	}
	
	@Override
	public int update(ActivityDO activity){
		return activityDao.update(activity);
	}
	
	@Override
	public int remove(Long id){
		return activityDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return activityDao.batchRemove(ids);
	}
    @Override
    public ActivityDO selectOne(Map<String, Object> params) {
        List<ActivityDO> list = activityDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<ActivityDO> resList = activityDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

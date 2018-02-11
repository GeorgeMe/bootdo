package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.ActivityGoodsDao;
import com.zscat.shop.domain.ActivityGoodsDO;
import com.zscat.shop.service.ActivityGoodsService;



@Service
public class ActivityGoodsServiceImpl implements ActivityGoodsService {
	@Autowired
	private ActivityGoodsDao activityGoodsDao;
	
	@Override
	public ActivityGoodsDO get(Long id){
		return activityGoodsDao.get(id);
	}
	
	@Override
	public List<ActivityGoodsDO> list(Map<String, Object> map){
		return activityGoodsDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return activityGoodsDao.count(map);
	}
	
	@Override
	public int save(ActivityGoodsDO activityGoods){
		return activityGoodsDao.save(activityGoods);
	}
	
	@Override
	public int update(ActivityGoodsDO activityGoods){
		return activityGoodsDao.update(activityGoods);
	}
	
	@Override
	public int remove(Long id){
		return activityGoodsDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return activityGoodsDao.batchRemove(ids);
	}
    @Override
    public ActivityGoodsDO selectOne(Map<String, Object> params) {
        List<ActivityGoodsDO> list = activityGoodsDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<ActivityGoodsDO> resList = activityGoodsDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

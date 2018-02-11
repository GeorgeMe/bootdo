package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.StorePointDao;
import com.zscat.shop.domain.StorePointDO;
import com.zscat.shop.service.StorePointService;



@Service
public class StorePointServiceImpl implements StorePointService {
	@Autowired
	private StorePointDao storePointDao;
	
	@Override
	public StorePointDO get(Long id){
		return storePointDao.get(id);
	}
	
	@Override
	public List<StorePointDO> list(Map<String, Object> map){
		return storePointDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return storePointDao.count(map);
	}
	
	@Override
	public int save(StorePointDO storePoint){
		return storePointDao.save(storePoint);
	}
	
	@Override
	public int update(StorePointDO storePoint){
		return storePointDao.update(storePoint);
	}
	
	@Override
	public int remove(Long id){
		return storePointDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return storePointDao.batchRemove(ids);
	}
    @Override
    public StorePointDO selectOne(Map<String, Object> params) {
        List<StorePointDO> list = storePointDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<StorePointDO> resList = storePointDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

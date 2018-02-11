package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.StoreDao;
import com.zscat.shop.domain.StoreDO;
import com.zscat.shop.service.StoreService;



@Service
public class StoreServiceImpl implements StoreService {
	@Autowired
	private StoreDao storeDao;
	
	@Override
	public StoreDO get(Long id){
		return storeDao.get(id);
	}
	
	@Override
	public List<StoreDO> list(Map<String, Object> map){
		return storeDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return storeDao.count(map);
	}
	
	@Override
	public int save(StoreDO store){
		return storeDao.save(store);
	}
	
	@Override
	public int update(StoreDO store){
		return storeDao.update(store);
	}
	
	@Override
	public int remove(Long id){
		return storeDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return storeDao.batchRemove(ids);
	}
    @Override
    public StoreDO selectOne(Map<String, Object> params) {
        List<StoreDO> list = storeDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<StoreDO> resList = storeDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

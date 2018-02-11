package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.StoreStatDao;
import com.zscat.shop.domain.StoreStatDO;
import com.zscat.shop.service.StoreStatService;



@Service
public class StoreStatServiceImpl implements StoreStatService {
	@Autowired
	private StoreStatDao storeStatDao;
	
	@Override
	public StoreStatDO get(Long id){
		return storeStatDao.get(id);
	}
	
	@Override
	public List<StoreStatDO> list(Map<String, Object> map){
		return storeStatDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return storeStatDao.count(map);
	}
	
	@Override
	public int save(StoreStatDO storeStat){
		return storeStatDao.save(storeStat);
	}
	
	@Override
	public int update(StoreStatDO storeStat){
		return storeStatDao.update(storeStat);
	}
	
	@Override
	public int remove(Long id){
		return storeStatDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return storeStatDao.batchRemove(ids);
	}
    @Override
    public StoreStatDO selectOne(Map<String, Object> params) {
        List<StoreStatDO> list = storeStatDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<StoreStatDO> resList = storeStatDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

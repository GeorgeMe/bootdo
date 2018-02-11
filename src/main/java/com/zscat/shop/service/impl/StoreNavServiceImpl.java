package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.StoreNavDao;
import com.zscat.shop.domain.StoreNavDO;
import com.zscat.shop.service.StoreNavService;



@Service
public class StoreNavServiceImpl implements StoreNavService {
	@Autowired
	private StoreNavDao storeNavDao;
	
	@Override
	public StoreNavDO get(Long id){
		return storeNavDao.get(id);
	}
	
	@Override
	public List<StoreNavDO> list(Map<String, Object> map){
		return storeNavDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return storeNavDao.count(map);
	}
	
	@Override
	public int save(StoreNavDO storeNav){
		return storeNavDao.save(storeNav);
	}
	
	@Override
	public int update(StoreNavDO storeNav){
		return storeNavDao.update(storeNav);
	}
	
	@Override
	public int remove(Long id){
		return storeNavDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return storeNavDao.batchRemove(ids);
	}
    @Override
    public StoreNavDO selectOne(Map<String, Object> params) {
        List<StoreNavDO> list = storeNavDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<StoreNavDO> resList = storeNavDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

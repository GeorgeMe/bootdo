package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.StoreSlideDao;
import com.zscat.shop.domain.StoreSlideDO;
import com.zscat.shop.service.StoreSlideService;



@Service
public class StoreSlideServiceImpl implements StoreSlideService {
	@Autowired
	private StoreSlideDao storeSlideDao;
	
	@Override
	public StoreSlideDO get(Long id){
		return storeSlideDao.get(id);
	}
	
	@Override
	public List<StoreSlideDO> list(Map<String, Object> map){
		return storeSlideDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return storeSlideDao.count(map);
	}
	
	@Override
	public int save(StoreSlideDO storeSlide){
		return storeSlideDao.save(storeSlide);
	}
	
	@Override
	public int update(StoreSlideDO storeSlide){
		return storeSlideDao.update(storeSlide);
	}
	
	@Override
	public int remove(Long id){
		return storeSlideDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return storeSlideDao.batchRemove(ids);
	}
    @Override
    public StoreSlideDO selectOne(Map<String, Object> params) {
        List<StoreSlideDO> list = storeSlideDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<StoreSlideDO> resList = storeSlideDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

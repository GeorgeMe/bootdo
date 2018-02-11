package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.StorePartnerDao;
import com.zscat.shop.domain.StorePartnerDO;
import com.zscat.shop.service.StorePartnerService;



@Service
public class StorePartnerServiceImpl implements StorePartnerService {
	@Autowired
	private StorePartnerDao storePartnerDao;
	
	@Override
	public StorePartnerDO get(Long id){
		return storePartnerDao.get(id);
	}
	
	@Override
	public List<StorePartnerDO> list(Map<String, Object> map){
		return storePartnerDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return storePartnerDao.count(map);
	}
	
	@Override
	public int save(StorePartnerDO storePartner){
		return storePartnerDao.save(storePartner);
	}
	
	@Override
	public int update(StorePartnerDO storePartner){
		return storePartnerDao.update(storePartner);
	}
	
	@Override
	public int remove(Long id){
		return storePartnerDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return storePartnerDao.batchRemove(ids);
	}
    @Override
    public StorePartnerDO selectOne(Map<String, Object> params) {
        List<StorePartnerDO> list = storePartnerDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<StorePartnerDO> resList = storePartnerDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

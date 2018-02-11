package com.zscat.shop.service.impl;

 import com.zscat.common.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.AccessoryDao;
import com.zscat.shop.domain.AccessoryDO;
import com.zscat.shop.service.AccessoryService;



@Service
public class AccessoryServiceImpl implements AccessoryService {
	@Autowired
	private AccessoryDao accessoryDao;
	
	@Override
	public AccessoryDO get(Long id){
		return accessoryDao.get(id);
	}
	
	@Override
	public List<AccessoryDO> list(Map<String, Object> map){
		return accessoryDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return accessoryDao.count(map);
	}
	
	@Override
	public int save(AccessoryDO accessory){
		return accessoryDao.save(accessory);
	}
	
	@Override
	public int update(AccessoryDO accessory){
		return accessoryDao.update(accessory);
	}
	
	@Override
	public int remove(Long id){
		return accessoryDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return accessoryDao.batchRemove(ids);
	}
    @Override
    public AccessoryDO selectOne(Map<String, Object> params) {
        List<AccessoryDO> list = accessoryDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<AccessoryDO> resList = accessoryDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

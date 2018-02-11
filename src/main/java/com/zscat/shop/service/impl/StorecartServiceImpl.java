package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.StorecartDao;
import com.zscat.shop.domain.StorecartDO;
import com.zscat.shop.service.StorecartService;



@Service
public class StorecartServiceImpl implements StorecartService {
	@Autowired
	private StorecartDao storecartDao;
	
	@Override
	public StorecartDO get(Long id){
		return storecartDao.get(id);
	}
	
	@Override
	public List<StorecartDO> list(Map<String, Object> map){
		return storecartDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return storecartDao.count(map);
	}
	
	@Override
	public int save(StorecartDO storecart){
		return storecartDao.save(storecart);
	}
	
	@Override
	public int update(StorecartDO storecart){
		return storecartDao.update(storecart);
	}
	
	@Override
	public int remove(Long id){
		return storecartDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return storecartDao.batchRemove(ids);
	}
    @Override
    public StorecartDO selectOne(Map<String, Object> params) {
        List<StorecartDO> list = storecartDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<StorecartDO> resList = storecartDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

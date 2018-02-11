package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.StoregradeDao;
import com.zscat.shop.domain.StoregradeDO;
import com.zscat.shop.service.StoregradeService;



@Service
public class StoregradeServiceImpl implements StoregradeService {
	@Autowired
	private StoregradeDao storegradeDao;
	
	@Override
	public StoregradeDO get(Long id){
		return storegradeDao.get(id);
	}
	
	@Override
	public List<StoregradeDO> list(Map<String, Object> map){
		return storegradeDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return storegradeDao.count(map);
	}
	
	@Override
	public int save(StoregradeDO storegrade){
		return storegradeDao.save(storegrade);
	}
	
	@Override
	public int update(StoregradeDO storegrade){
		return storegradeDao.update(storegrade);
	}
	
	@Override
	public int remove(Long id){
		return storegradeDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return storegradeDao.batchRemove(ids);
	}
    @Override
    public StoregradeDO selectOne(Map<String, Object> params) {
        List<StoregradeDO> list = storegradeDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<StoregradeDO> resList = storegradeDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

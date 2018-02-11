package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.StoreclassDao;
import com.zscat.shop.domain.StoreclassDO;
import com.zscat.shop.service.StoreclassService;



@Service
public class StoreclassServiceImpl implements StoreclassService {
	@Autowired
	private StoreclassDao storeclassDao;
	
	@Override
	public StoreclassDO get(Long id){
		return storeclassDao.get(id);
	}
	
	@Override
	public List<StoreclassDO> list(Map<String, Object> map){
		return storeclassDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return storeclassDao.count(map);
	}
	
	@Override
	public int save(StoreclassDO storeclass){
		return storeclassDao.save(storeclass);
	}
	
	@Override
	public int update(StoreclassDO storeclass){
		return storeclassDao.update(storeclass);
	}
	
	@Override
	public int remove(Long id){
		return storeclassDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return storeclassDao.batchRemove(ids);
	}
    @Override
    public StoreclassDO selectOne(Map<String, Object> params) {
        List<StoreclassDO> list = storeclassDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<StoreclassDO> resList = storeclassDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

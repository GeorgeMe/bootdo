package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.StoregradeLogDao;
import com.zscat.shop.domain.StoregradeLogDO;
import com.zscat.shop.service.StoregradeLogService;



@Service
public class StoregradeLogServiceImpl implements StoregradeLogService {
	@Autowired
	private StoregradeLogDao storegradeLogDao;
	
	@Override
	public StoregradeLogDO get(Long id){
		return storegradeLogDao.get(id);
	}
	
	@Override
	public List<StoregradeLogDO> list(Map<String, Object> map){
		return storegradeLogDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return storegradeLogDao.count(map);
	}
	
	@Override
	public int save(StoregradeLogDO storegradeLog){
		return storegradeLogDao.save(storegradeLog);
	}
	
	@Override
	public int update(StoregradeLogDO storegradeLog){
		return storegradeLogDao.update(storegradeLog);
	}
	
	@Override
	public int remove(Long id){
		return storegradeLogDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return storegradeLogDao.batchRemove(ids);
	}
    @Override
    public StoregradeLogDO selectOne(Map<String, Object> params) {
        List<StoregradeLogDO> list = storegradeLogDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<StoregradeLogDO> resList = storegradeLogDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.CombinLogDao;
import com.zscat.shop.domain.CombinLogDO;
import com.zscat.shop.service.CombinLogService;



@Service
public class CombinLogServiceImpl implements CombinLogService {
	@Autowired
	private CombinLogDao combinLogDao;
	
	@Override
	public CombinLogDO get(Long id){
		return combinLogDao.get(id);
	}
	
	@Override
	public List<CombinLogDO> list(Map<String, Object> map){
		return combinLogDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return combinLogDao.count(map);
	}
	
	@Override
	public int save(CombinLogDO combinLog){
		return combinLogDao.save(combinLog);
	}
	
	@Override
	public int update(CombinLogDO combinLog){
		return combinLogDao.update(combinLog);
	}
	
	@Override
	public int remove(Long id){
		return combinLogDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return combinLogDao.batchRemove(ids);
	}
    @Override
    public CombinLogDO selectOne(Map<String, Object> params) {
        List<CombinLogDO> list = combinLogDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<CombinLogDO> resList = combinLogDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

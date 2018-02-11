package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.PredepositLogDao;
import com.zscat.shop.domain.PredepositLogDO;
import com.zscat.shop.service.PredepositLogService;



@Service
public class PredepositLogServiceImpl implements PredepositLogService {
	@Autowired
	private PredepositLogDao predepositLogDao;
	
	@Override
	public PredepositLogDO get(Long id){
		return predepositLogDao.get(id);
	}
	
	@Override
	public List<PredepositLogDO> list(Map<String, Object> map){
		return predepositLogDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return predepositLogDao.count(map);
	}
	
	@Override
	public int save(PredepositLogDO predepositLog){
		return predepositLogDao.save(predepositLog);
	}
	
	@Override
	public int update(PredepositLogDO predepositLog){
		return predepositLogDao.update(predepositLog);
	}
	
	@Override
	public int remove(Long id){
		return predepositLogDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return predepositLogDao.batchRemove(ids);
	}
    @Override
    public PredepositLogDO selectOne(Map<String, Object> params) {
        List<PredepositLogDO> list = predepositLogDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<PredepositLogDO> resList = predepositLogDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

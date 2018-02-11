package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.TransAreaDao;
import com.zscat.shop.domain.TransAreaDO;
import com.zscat.shop.service.TransAreaService;



@Service
public class TransAreaServiceImpl implements TransAreaService {
	@Autowired
	private TransAreaDao transAreaDao;
	
	@Override
	public TransAreaDO get(Long id){
		return transAreaDao.get(id);
	}
	
	@Override
	public List<TransAreaDO> list(Map<String, Object> map){
		return transAreaDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return transAreaDao.count(map);
	}
	
	@Override
	public int save(TransAreaDO transArea){
		return transAreaDao.save(transArea);
	}
	
	@Override
	public int update(TransAreaDO transArea){
		return transAreaDao.update(transArea);
	}
	
	@Override
	public int remove(Long id){
		return transAreaDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return transAreaDao.batchRemove(ids);
	}
    @Override
    public TransAreaDO selectOne(Map<String, Object> params) {
        List<TransAreaDO> list = transAreaDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<TransAreaDO> resList = transAreaDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

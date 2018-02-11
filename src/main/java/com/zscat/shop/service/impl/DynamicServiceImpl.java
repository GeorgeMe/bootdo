package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.DynamicDao;
import com.zscat.shop.domain.DynamicDO;
import com.zscat.shop.service.DynamicService;



@Service
public class DynamicServiceImpl implements DynamicService {
	@Autowired
	private DynamicDao dynamicDao;
	
	@Override
	public DynamicDO get(Long id){
		return dynamicDao.get(id);
	}
	
	@Override
	public List<DynamicDO> list(Map<String, Object> map){
		return dynamicDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return dynamicDao.count(map);
	}
	
	@Override
	public int save(DynamicDO dynamic){
		return dynamicDao.save(dynamic);
	}
	
	@Override
	public int update(DynamicDO dynamic){
		return dynamicDao.update(dynamic);
	}
	
	@Override
	public int remove(Long id){
		return dynamicDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return dynamicDao.batchRemove(ids);
	}
    @Override
    public DynamicDO selectOne(Map<String, Object> params) {
        List<DynamicDO> list = dynamicDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<DynamicDO> resList = dynamicDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

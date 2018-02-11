package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.GoldRecordDao;
import com.zscat.shop.domain.GoldRecordDO;
import com.zscat.shop.service.GoldRecordService;



@Service
public class GoldRecordServiceImpl implements GoldRecordService {
	@Autowired
	private GoldRecordDao goldRecordDao;
	
	@Override
	public GoldRecordDO get(Long id){
		return goldRecordDao.get(id);
	}
	
	@Override
	public List<GoldRecordDO> list(Map<String, Object> map){
		return goldRecordDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return goldRecordDao.count(map);
	}
	
	@Override
	public int save(GoldRecordDO goldRecord){
		return goldRecordDao.save(goldRecord);
	}
	
	@Override
	public int update(GoldRecordDO goldRecord){
		return goldRecordDao.update(goldRecord);
	}
	
	@Override
	public int remove(Long id){
		return goldRecordDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return goldRecordDao.batchRemove(ids);
	}
    @Override
    public GoldRecordDO selectOne(Map<String, Object> params) {
        List<GoldRecordDO> list = goldRecordDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<GoldRecordDO> resList = goldRecordDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

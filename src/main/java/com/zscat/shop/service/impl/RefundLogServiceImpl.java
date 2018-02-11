package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.RefundLogDao;
import com.zscat.shop.domain.RefundLogDO;
import com.zscat.shop.service.RefundLogService;



@Service
public class RefundLogServiceImpl implements RefundLogService {
	@Autowired
	private RefundLogDao refundLogDao;
	
	@Override
	public RefundLogDO get(Long id){
		return refundLogDao.get(id);
	}
	
	@Override
	public List<RefundLogDO> list(Map<String, Object> map){
		return refundLogDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return refundLogDao.count(map);
	}
	
	@Override
	public int save(RefundLogDO refundLog){
		return refundLogDao.save(refundLog);
	}
	
	@Override
	public int update(RefundLogDO refundLog){
		return refundLogDao.update(refundLog);
	}
	
	@Override
	public int remove(Long id){
		return refundLogDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return refundLogDao.batchRemove(ids);
	}
    @Override
    public RefundLogDO selectOne(Map<String, Object> params) {
        List<RefundLogDO> list = refundLogDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<RefundLogDO> resList = refundLogDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

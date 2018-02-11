package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.OrderLogDao;
import com.zscat.shop.domain.OrderLogDO;
import com.zscat.shop.service.OrderLogService;



@Service
public class OrderLogServiceImpl implements OrderLogService {
	@Autowired
	private OrderLogDao orderLogDao;
	
	@Override
	public OrderLogDO get(Long id){
		return orderLogDao.get(id);
	}
	
	@Override
	public List<OrderLogDO> list(Map<String, Object> map){
		return orderLogDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return orderLogDao.count(map);
	}
	
	@Override
	public int save(OrderLogDO orderLog){
		return orderLogDao.save(orderLog);
	}
	
	@Override
	public int update(OrderLogDO orderLog){
		return orderLogDao.update(orderLog);
	}
	
	@Override
	public int remove(Long id){
		return orderLogDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return orderLogDao.batchRemove(ids);
	}
    @Override
    public OrderLogDO selectOne(Map<String, Object> params) {
        List<OrderLogDO> list = orderLogDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<OrderLogDO> resList = orderLogDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

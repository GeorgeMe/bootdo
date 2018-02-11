package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.OrderformDao;
import com.zscat.shop.domain.OrderformDO;
import com.zscat.shop.service.OrderformService;



@Service
public class OrderformServiceImpl implements OrderformService {
	@Autowired
	private OrderformDao orderformDao;
	
	@Override
	public OrderformDO get(Long id){
		return orderformDao.get(id);
	}
	
	@Override
	public List<OrderformDO> list(Map<String, Object> map){
		return orderformDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return orderformDao.count(map);
	}
	
	@Override
	public int save(OrderformDO orderform){
		return orderformDao.save(orderform);
	}
	
	@Override
	public int update(OrderformDO orderform){
		return orderformDao.update(orderform);
	}
	
	@Override
	public int remove(Long id){
		return orderformDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return orderformDao.batchRemove(ids);
	}
    @Override
    public OrderformDO selectOne(Map<String, Object> params) {
        List<OrderformDO> list = orderformDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<OrderformDO> resList = orderformDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

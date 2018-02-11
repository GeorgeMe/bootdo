package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.DeliveryLogDao;
import com.zscat.shop.domain.DeliveryLogDO;
import com.zscat.shop.service.DeliveryLogService;



@Service
public class DeliveryLogServiceImpl implements DeliveryLogService {
	@Autowired
	private DeliveryLogDao deliveryLogDao;
	
	@Override
	public DeliveryLogDO get(Long id){
		return deliveryLogDao.get(id);
	}
	
	@Override
	public List<DeliveryLogDO> list(Map<String, Object> map){
		return deliveryLogDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return deliveryLogDao.count(map);
	}
	
	@Override
	public int save(DeliveryLogDO deliveryLog){
		return deliveryLogDao.save(deliveryLog);
	}
	
	@Override
	public int update(DeliveryLogDO deliveryLog){
		return deliveryLogDao.update(deliveryLog);
	}
	
	@Override
	public int remove(Long id){
		return deliveryLogDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return deliveryLogDao.batchRemove(ids);
	}
    @Override
    public DeliveryLogDO selectOne(Map<String, Object> params) {
        List<DeliveryLogDO> list = deliveryLogDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<DeliveryLogDO> resList = deliveryLogDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

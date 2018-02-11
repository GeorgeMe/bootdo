package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.ShippingDao;
import com.zscat.shop.domain.ShippingDO;
import com.zscat.shop.service.ShippingService;



@Service
public class ShippingServiceImpl implements ShippingService {
	@Autowired
	private ShippingDao shippingDao;
	
	@Override
	public ShippingDO get(Long id){
		return shippingDao.get(id);
	}
	
	@Override
	public List<ShippingDO> list(Map<String, Object> map){
		return shippingDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return shippingDao.count(map);
	}
	
	@Override
	public int save(ShippingDO shipping){
		return shippingDao.save(shipping);
	}
	
	@Override
	public int update(ShippingDO shipping){
		return shippingDao.update(shipping);
	}
	
	@Override
	public int remove(Long id){
		return shippingDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return shippingDao.batchRemove(ids);
	}
    @Override
    public ShippingDO selectOne(Map<String, Object> params) {
        List<ShippingDO> list = shippingDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<ShippingDO> resList = shippingDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

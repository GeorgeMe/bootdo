package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.DeliveryGoodsDao;
import com.zscat.shop.domain.DeliveryGoodsDO;
import com.zscat.shop.service.DeliveryGoodsService;



@Service
public class DeliveryGoodsServiceImpl implements DeliveryGoodsService {
	@Autowired
	private DeliveryGoodsDao deliveryGoodsDao;
	
	@Override
	public DeliveryGoodsDO get(Long id){
		return deliveryGoodsDao.get(id);
	}
	
	@Override
	public List<DeliveryGoodsDO> list(Map<String, Object> map){
		return deliveryGoodsDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return deliveryGoodsDao.count(map);
	}
	
	@Override
	public int save(DeliveryGoodsDO deliveryGoods){
		return deliveryGoodsDao.save(deliveryGoods);
	}
	
	@Override
	public int update(DeliveryGoodsDO deliveryGoods){
		return deliveryGoodsDao.update(deliveryGoods);
	}
	
	@Override
	public int remove(Long id){
		return deliveryGoodsDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return deliveryGoodsDao.batchRemove(ids);
	}
    @Override
    public DeliveryGoodsDO selectOne(Map<String, Object> params) {
        List<DeliveryGoodsDO> list = deliveryGoodsDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<DeliveryGoodsDO> resList = deliveryGoodsDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

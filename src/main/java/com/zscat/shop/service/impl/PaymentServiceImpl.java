package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.PaymentDao;
import com.zscat.shop.domain.PaymentDO;
import com.zscat.shop.service.PaymentService;



@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	private PaymentDao paymentDao;
	
	@Override
	public PaymentDO get(Long id){
		return paymentDao.get(id);
	}
	
	@Override
	public List<PaymentDO> list(Map<String, Object> map){
		return paymentDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return paymentDao.count(map);
	}
	
	@Override
	public int save(PaymentDO payment){
		return paymentDao.save(payment);
	}
	
	@Override
	public int update(PaymentDO payment){
		return paymentDao.update(payment);
	}
	
	@Override
	public int remove(Long id){
		return paymentDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return paymentDao.batchRemove(ids);
	}
    @Override
    public PaymentDO selectOne(Map<String, Object> params) {
        List<PaymentDO> list = paymentDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<PaymentDO> resList = paymentDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.CouponDao;
import com.zscat.shop.domain.CouponDO;
import com.zscat.shop.service.CouponService;



@Service
public class CouponServiceImpl implements CouponService {
	@Autowired
	private CouponDao couponDao;
	
	@Override
	public CouponDO get(Long id){
		return couponDao.get(id);
	}
	
	@Override
	public List<CouponDO> list(Map<String, Object> map){
		return couponDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return couponDao.count(map);
	}
	
	@Override
	public int save(CouponDO coupon){
		return couponDao.save(coupon);
	}
	
	@Override
	public int update(CouponDO coupon){
		return couponDao.update(coupon);
	}
	
	@Override
	public int remove(Long id){
		return couponDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return couponDao.batchRemove(ids);
	}
    @Override
    public CouponDO selectOne(Map<String, Object> params) {
        List<CouponDO> list = couponDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<CouponDO> resList = couponDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

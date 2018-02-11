package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.CouponInfoDao;
import com.zscat.shop.domain.CouponInfoDO;
import com.zscat.shop.service.CouponInfoService;



@Service
public class CouponInfoServiceImpl implements CouponInfoService {
	@Autowired
	private CouponInfoDao couponInfoDao;
	
	@Override
	public CouponInfoDO get(Long id){
		return couponInfoDao.get(id);
	}
	
	@Override
	public List<CouponInfoDO> list(Map<String, Object> map){
		return couponInfoDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return couponInfoDao.count(map);
	}
	
	@Override
	public int save(CouponInfoDO couponInfo){
		return couponInfoDao.save(couponInfo);
	}
	
	@Override
	public int update(CouponInfoDO couponInfo){
		return couponInfoDao.update(couponInfo);
	}
	
	@Override
	public int remove(Long id){
		return couponInfoDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return couponInfoDao.batchRemove(ids);
	}
    @Override
    public CouponInfoDO selectOne(Map<String, Object> params) {
        List<CouponInfoDO> list = couponInfoDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<CouponInfoDO> resList = couponInfoDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

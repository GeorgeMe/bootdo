package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.IntegralGoodscartDao;
import com.zscat.shop.domain.IntegralGoodscartDO;
import com.zscat.shop.service.IntegralGoodscartService;



@Service
public class IntegralGoodscartServiceImpl implements IntegralGoodscartService {
	@Autowired
	private IntegralGoodscartDao integralGoodscartDao;
	
	@Override
	public IntegralGoodscartDO get(Long id){
		return integralGoodscartDao.get(id);
	}
	
	@Override
	public List<IntegralGoodscartDO> list(Map<String, Object> map){
		return integralGoodscartDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return integralGoodscartDao.count(map);
	}
	
	@Override
	public int save(IntegralGoodscartDO integralGoodscart){
		return integralGoodscartDao.save(integralGoodscart);
	}
	
	@Override
	public int update(IntegralGoodscartDO integralGoodscart){
		return integralGoodscartDao.update(integralGoodscart);
	}
	
	@Override
	public int remove(Long id){
		return integralGoodscartDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return integralGoodscartDao.batchRemove(ids);
	}
    @Override
    public IntegralGoodscartDO selectOne(Map<String, Object> params) {
        List<IntegralGoodscartDO> list = integralGoodscartDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<IntegralGoodscartDO> resList = integralGoodscartDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

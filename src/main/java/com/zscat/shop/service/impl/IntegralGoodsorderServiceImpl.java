package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.IntegralGoodsorderDao;
import com.zscat.shop.domain.IntegralGoodsorderDO;
import com.zscat.shop.service.IntegralGoodsorderService;



@Service
public class IntegralGoodsorderServiceImpl implements IntegralGoodsorderService {
	@Autowired
	private IntegralGoodsorderDao integralGoodsorderDao;
	
	@Override
	public IntegralGoodsorderDO get(Long id){
		return integralGoodsorderDao.get(id);
	}
	
	@Override
	public List<IntegralGoodsorderDO> list(Map<String, Object> map){
		return integralGoodsorderDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return integralGoodsorderDao.count(map);
	}
	
	@Override
	public int save(IntegralGoodsorderDO integralGoodsorder){
		return integralGoodsorderDao.save(integralGoodsorder);
	}
	
	@Override
	public int update(IntegralGoodsorderDO integralGoodsorder){
		return integralGoodsorderDao.update(integralGoodsorder);
	}
	
	@Override
	public int remove(Long id){
		return integralGoodsorderDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return integralGoodsorderDao.batchRemove(ids);
	}
    @Override
    public IntegralGoodsorderDO selectOne(Map<String, Object> params) {
        List<IntegralGoodsorderDO> list = integralGoodsorderDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<IntegralGoodsorderDO> resList = integralGoodsorderDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

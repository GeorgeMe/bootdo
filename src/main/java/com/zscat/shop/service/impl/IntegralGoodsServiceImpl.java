package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.IntegralGoodsDao;
import com.zscat.shop.domain.IntegralGoodsDO;
import com.zscat.shop.service.IntegralGoodsService;



@Service
public class IntegralGoodsServiceImpl implements IntegralGoodsService {
	@Autowired
	private IntegralGoodsDao integralGoodsDao;
	
	@Override
	public IntegralGoodsDO get(Long id){
		return integralGoodsDao.get(id);
	}
	
	@Override
	public List<IntegralGoodsDO> list(Map<String, Object> map){
		return integralGoodsDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return integralGoodsDao.count(map);
	}
	
	@Override
	public int save(IntegralGoodsDO integralGoods){
		return integralGoodsDao.save(integralGoods);
	}
	
	@Override
	public int update(IntegralGoodsDO integralGoods){
		return integralGoodsDao.update(integralGoods);
	}
	
	@Override
	public int remove(Long id){
		return integralGoodsDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return integralGoodsDao.batchRemove(ids);
	}
    @Override
    public IntegralGoodsDO selectOne(Map<String, Object> params) {
        List<IntegralGoodsDO> list = integralGoodsDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<IntegralGoodsDO> resList = integralGoodsDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

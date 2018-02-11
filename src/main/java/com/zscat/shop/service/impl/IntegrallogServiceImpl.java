package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.IntegrallogDao;
import com.zscat.shop.domain.IntegrallogDO;
import com.zscat.shop.service.IntegrallogService;



@Service
public class IntegrallogServiceImpl implements IntegrallogService {
	@Autowired
	private IntegrallogDao integrallogDao;
	
	@Override
	public IntegrallogDO get(Long id){
		return integrallogDao.get(id);
	}
	
	@Override
	public List<IntegrallogDO> list(Map<String, Object> map){
		return integrallogDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return integrallogDao.count(map);
	}
	
	@Override
	public int save(IntegrallogDO integrallog){
		return integrallogDao.save(integrallog);
	}
	
	@Override
	public int update(IntegrallogDO integrallog){
		return integrallogDao.update(integrallog);
	}
	
	@Override
	public int remove(Long id){
		return integrallogDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return integrallogDao.batchRemove(ids);
	}
    @Override
    public IntegrallogDO selectOne(Map<String, Object> params) {
        List<IntegrallogDO> list = integrallogDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<IntegrallogDO> resList = integrallogDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.EvaluateDao;
import com.zscat.shop.domain.EvaluateDO;
import com.zscat.shop.service.EvaluateService;



@Service
public class EvaluateServiceImpl implements EvaluateService {
	@Autowired
	private EvaluateDao evaluateDao;
	
	@Override
	public EvaluateDO get(Long id){
		return evaluateDao.get(id);
	}
	
	@Override
	public List<EvaluateDO> list(Map<String, Object> map){
		return evaluateDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return evaluateDao.count(map);
	}
	
	@Override
	public int save(EvaluateDO evaluate){
		return evaluateDao.save(evaluate);
	}
	
	@Override
	public int update(EvaluateDO evaluate){
		return evaluateDao.update(evaluate);
	}
	
	@Override
	public int remove(Long id){
		return evaluateDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return evaluateDao.batchRemove(ids);
	}
    @Override
    public EvaluateDO selectOne(Map<String, Object> params) {
        List<EvaluateDO> list = evaluateDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<EvaluateDO> resList = evaluateDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

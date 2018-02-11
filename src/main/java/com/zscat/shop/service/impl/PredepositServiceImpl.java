package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.PredepositDao;
import com.zscat.shop.domain.PredepositDO;
import com.zscat.shop.service.PredepositService;



@Service
public class PredepositServiceImpl implements PredepositService {
	@Autowired
	private PredepositDao predepositDao;
	
	@Override
	public PredepositDO get(Long id){
		return predepositDao.get(id);
	}
	
	@Override
	public List<PredepositDO> list(Map<String, Object> map){
		return predepositDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return predepositDao.count(map);
	}
	
	@Override
	public int save(PredepositDO predeposit){
		return predepositDao.save(predeposit);
	}
	
	@Override
	public int update(PredepositDO predeposit){
		return predepositDao.update(predeposit);
	}
	
	@Override
	public int remove(Long id){
		return predepositDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return predepositDao.batchRemove(ids);
	}
    @Override
    public PredepositDO selectOne(Map<String, Object> params) {
        List<PredepositDO> list = predepositDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<PredepositDO> resList = predepositDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

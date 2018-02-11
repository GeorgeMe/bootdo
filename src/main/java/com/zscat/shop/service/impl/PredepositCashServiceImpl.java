package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.PredepositCashDao;
import com.zscat.shop.domain.PredepositCashDO;
import com.zscat.shop.service.PredepositCashService;



@Service
public class PredepositCashServiceImpl implements PredepositCashService {
	@Autowired
	private PredepositCashDao predepositCashDao;
	
	@Override
	public PredepositCashDO get(Long id){
		return predepositCashDao.get(id);
	}
	
	@Override
	public List<PredepositCashDO> list(Map<String, Object> map){
		return predepositCashDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return predepositCashDao.count(map);
	}
	
	@Override
	public int save(PredepositCashDO predepositCash){
		return predepositCashDao.save(predepositCash);
	}
	
	@Override
	public int update(PredepositCashDO predepositCash){
		return predepositCashDao.update(predepositCash);
	}
	
	@Override
	public int remove(Long id){
		return predepositCashDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return predepositCashDao.batchRemove(ids);
	}
    @Override
    public PredepositCashDO selectOne(Map<String, Object> params) {
        List<PredepositCashDO> list = predepositCashDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<PredepositCashDO> resList = predepositCashDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

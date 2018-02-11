package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.BargainDao;
import com.zscat.shop.domain.BargainDO;
import com.zscat.shop.service.BargainService;



@Service
public class BargainServiceImpl implements BargainService {
	@Autowired
	private BargainDao bargainDao;
	
	@Override
	public BargainDO get(Long id){
		return bargainDao.get(id);
	}
	
	@Override
	public List<BargainDO> list(Map<String, Object> map){
		return bargainDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return bargainDao.count(map);
	}
	
	@Override
	public int save(BargainDO bargain){
		return bargainDao.save(bargain);
	}
	
	@Override
	public int update(BargainDO bargain){
		return bargainDao.update(bargain);
	}
	
	@Override
	public int remove(Long id){
		return bargainDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return bargainDao.batchRemove(ids);
	}
    @Override
    public BargainDO selectOne(Map<String, Object> params) {
        List<BargainDO> list = bargainDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<BargainDO> resList = bargainDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

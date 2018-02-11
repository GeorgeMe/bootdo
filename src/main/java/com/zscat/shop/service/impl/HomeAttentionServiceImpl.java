package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.HomeAttentionDao;
import com.zscat.shop.domain.HomeAttentionDO;
import com.zscat.shop.service.HomeAttentionService;



@Service
public class HomeAttentionServiceImpl implements HomeAttentionService {
	@Autowired
	private HomeAttentionDao homeAttentionDao;
	
	@Override
	public HomeAttentionDO get(Long id){
		return homeAttentionDao.get(id);
	}
	
	@Override
	public List<HomeAttentionDO> list(Map<String, Object> map){
		return homeAttentionDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return homeAttentionDao.count(map);
	}
	
	@Override
	public int save(HomeAttentionDO homeAttention){
		return homeAttentionDao.save(homeAttention);
	}
	
	@Override
	public int update(HomeAttentionDO homeAttention){
		return homeAttentionDao.update(homeAttention);
	}
	
	@Override
	public int remove(Long id){
		return homeAttentionDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return homeAttentionDao.batchRemove(ids);
	}
    @Override
    public HomeAttentionDO selectOne(Map<String, Object> params) {
        List<HomeAttentionDO> list = homeAttentionDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<HomeAttentionDO> resList = homeAttentionDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

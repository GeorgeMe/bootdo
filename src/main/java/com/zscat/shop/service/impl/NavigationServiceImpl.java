package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.NavigationDao;
import com.zscat.shop.domain.NavigationDO;
import com.zscat.shop.service.NavigationService;



@Service
public class NavigationServiceImpl implements NavigationService {
	@Autowired
	private NavigationDao navigationDao;
	
	@Override
	public NavigationDO get(Long id){
		return navigationDao.get(id);
	}
	
	@Override
	public List<NavigationDO> list(Map<String, Object> map){
		return navigationDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return navigationDao.count(map);
	}
	
	@Override
	public int save(NavigationDO navigation){
		return navigationDao.save(navigation);
	}
	
	@Override
	public int update(NavigationDO navigation){
		return navigationDao.update(navigation);
	}
	
	@Override
	public int remove(Long id){
		return navigationDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return navigationDao.batchRemove(ids);
	}
    @Override
    public NavigationDO selectOne(Map<String, Object> params) {
        List<NavigationDO> list = navigationDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<NavigationDO> resList = navigationDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.HomepageDao;
import com.zscat.shop.domain.HomepageDO;
import com.zscat.shop.service.HomepageService;



@Service
public class HomepageServiceImpl implements HomepageService {
	@Autowired
	private HomepageDao homepageDao;
	
	@Override
	public HomepageDO get(Long id){
		return homepageDao.get(id);
	}
	
	@Override
	public List<HomepageDO> list(Map<String, Object> map){
		return homepageDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return homepageDao.count(map);
	}
	
	@Override
	public int save(HomepageDO homepage){
		return homepageDao.save(homepage);
	}
	
	@Override
	public int update(HomepageDO homepage){
		return homepageDao.update(homepage);
	}
	
	@Override
	public int remove(Long id){
		return homepageDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return homepageDao.batchRemove(ids);
	}
    @Override
    public HomepageDO selectOne(Map<String, Object> params) {
        List<HomepageDO> list = homepageDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<HomepageDO> resList = homepageDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

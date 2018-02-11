package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.AdvertDao;
import com.zscat.shop.domain.AdvertDO;
import com.zscat.shop.service.AdvertService;



@Service
public class AdvertServiceImpl implements AdvertService {
	@Autowired
	private AdvertDao advertDao;
	
	@Override
	public AdvertDO get(Long id){
		return advertDao.get(id);
	}
	
	@Override
	public List<AdvertDO> list(Map<String, Object> map){
		return advertDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return advertDao.count(map);
	}
	
	@Override
	public int save(AdvertDO advert){
		return advertDao.save(advert);
	}
	
	@Override
	public int update(AdvertDO advert){
		return advertDao.update(advert);
	}
	
	@Override
	public int remove(Long id){
		return advertDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return advertDao.batchRemove(ids);
	}
    @Override
    public AdvertDO selectOne(Map<String, Object> params) {
        List<AdvertDO> list = advertDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<AdvertDO> resList = advertDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.GoodstypepropertyDao;
import com.zscat.shop.domain.GoodstypepropertyDO;
import com.zscat.shop.service.GoodstypepropertyService;



@Service
public class GoodstypepropertyServiceImpl implements GoodstypepropertyService {
	@Autowired
	private GoodstypepropertyDao goodstypepropertyDao;
	
	@Override
	public GoodstypepropertyDO get(Long id){
		return goodstypepropertyDao.get(id);
	}
	
	@Override
	public List<GoodstypepropertyDO> list(Map<String, Object> map){
		return goodstypepropertyDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return goodstypepropertyDao.count(map);
	}
	
	@Override
	public int save(GoodstypepropertyDO goodstypeproperty){
		return goodstypepropertyDao.save(goodstypeproperty);
	}
	
	@Override
	public int update(GoodstypepropertyDO goodstypeproperty){
		return goodstypepropertyDao.update(goodstypeproperty);
	}
	
	@Override
	public int remove(Long id){
		return goodstypepropertyDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return goodstypepropertyDao.batchRemove(ids);
	}
    @Override
    public GoodstypepropertyDO selectOne(Map<String, Object> params) {
        List<GoodstypepropertyDO> list = goodstypepropertyDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<GoodstypepropertyDO> resList = goodstypepropertyDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

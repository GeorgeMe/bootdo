package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.GoodstypeSpecDao;
import com.zscat.shop.domain.GoodstypeSpecDO;
import com.zscat.shop.service.GoodstypeSpecService;



@Service
public class GoodstypeSpecServiceImpl implements GoodstypeSpecService {
	@Autowired
	private GoodstypeSpecDao goodstypeSpecDao;
	
	@Override
	public GoodstypeSpecDO get(Long typeId){
		return goodstypeSpecDao.get(typeId);
	}
	
	@Override
	public List<GoodstypeSpecDO> list(Map<String, Object> map){
		return goodstypeSpecDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return goodstypeSpecDao.count(map);
	}
	
	@Override
	public int save(GoodstypeSpecDO goodstypeSpec){
		return goodstypeSpecDao.save(goodstypeSpec);
	}
	
	@Override
	public int update(GoodstypeSpecDO goodstypeSpec){
		return goodstypeSpecDao.update(goodstypeSpec);
	}
	
	@Override
	public int remove(Long typeId){
		return goodstypeSpecDao.remove(typeId);
	}
	
	@Override
	public int batchRemove(Long[] typeIds){
		return goodstypeSpecDao.batchRemove(typeIds);
	}
    @Override
    public GoodstypeSpecDO selectOne(Map<String, Object> params) {
        List<GoodstypeSpecDO> list = goodstypeSpecDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<GoodstypeSpecDO> resList = goodstypeSpecDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.GoodstypeDao;
import com.zscat.shop.domain.GoodstypeDO;
import com.zscat.shop.service.GoodstypeService;



@Service
public class GoodstypeServiceImpl implements GoodstypeService {
	@Autowired
	private GoodstypeDao goodstypeDao;
	
	@Override
	public GoodstypeDO get(Long id){
		return goodstypeDao.get(id);
	}
	
	@Override
	public List<GoodstypeDO> list(Map<String, Object> map){
		return goodstypeDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return goodstypeDao.count(map);
	}
	
	@Override
	public int save(GoodstypeDO goodstype){
		return goodstypeDao.save(goodstype);
	}
	
	@Override
	public int update(GoodstypeDO goodstype){
		return goodstypeDao.update(goodstype);
	}
	
	@Override
	public int remove(Long id){
		return goodstypeDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return goodstypeDao.batchRemove(ids);
	}
    @Override
    public GoodstypeDO selectOne(Map<String, Object> params) {
        List<GoodstypeDO> list = goodstypeDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<GoodstypeDO> resList = goodstypeDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

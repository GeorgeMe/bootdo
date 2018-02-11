package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.GoodsbrandDao;
import com.zscat.shop.domain.GoodsbrandDO;
import com.zscat.shop.service.GoodsbrandService;



@Service
public class GoodsbrandServiceImpl implements GoodsbrandService {
	@Autowired
	private GoodsbrandDao goodsbrandDao;
	
	@Override
	public GoodsbrandDO get(Long id){
		return goodsbrandDao.get(id);
	}
	
	@Override
	public List<GoodsbrandDO> list(Map<String, Object> map){
		return goodsbrandDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return goodsbrandDao.count(map);
	}
	
	@Override
	public int save(GoodsbrandDO goodsbrand){
		return goodsbrandDao.save(goodsbrand);
	}
	
	@Override
	public int update(GoodsbrandDO goodsbrand){
		return goodsbrandDao.update(goodsbrand);
	}
	
	@Override
	public int remove(Long id){
		return goodsbrandDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return goodsbrandDao.batchRemove(ids);
	}
    @Override
    public GoodsbrandDO selectOne(Map<String, Object> params) {
        List<GoodsbrandDO> list = goodsbrandDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<GoodsbrandDO> resList = goodsbrandDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

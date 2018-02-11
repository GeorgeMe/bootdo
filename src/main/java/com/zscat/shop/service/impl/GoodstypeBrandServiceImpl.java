package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.GoodstypeBrandDao;
import com.zscat.shop.domain.GoodstypeBrandDO;
import com.zscat.shop.service.GoodstypeBrandService;



@Service
public class GoodstypeBrandServiceImpl implements GoodstypeBrandService {
	@Autowired
	private GoodstypeBrandDao goodstypeBrandDao;
	
	@Override
	public GoodstypeBrandDO get(Long typeId){
		return goodstypeBrandDao.get(typeId);
	}
	
	@Override
	public List<GoodstypeBrandDO> list(Map<String, Object> map){
		return goodstypeBrandDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return goodstypeBrandDao.count(map);
	}
	
	@Override
	public int save(GoodstypeBrandDO goodstypeBrand){
		return goodstypeBrandDao.save(goodstypeBrand);
	}
	
	@Override
	public int update(GoodstypeBrandDO goodstypeBrand){
		return goodstypeBrandDao.update(goodstypeBrand);
	}
	
	@Override
	public int remove(Long typeId){
		return goodstypeBrandDao.remove(typeId);
	}
	
	@Override
	public int batchRemove(Long[] typeIds){
		return goodstypeBrandDao.batchRemove(typeIds);
	}
    @Override
    public GoodstypeBrandDO selectOne(Map<String, Object> params) {
        List<GoodstypeBrandDO> list = goodstypeBrandDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<GoodstypeBrandDO> resList = goodstypeBrandDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

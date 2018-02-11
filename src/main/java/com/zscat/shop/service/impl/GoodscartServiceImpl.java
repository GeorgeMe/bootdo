package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.GoodscartDao;
import com.zscat.shop.domain.GoodscartDO;
import com.zscat.shop.service.GoodscartService;



@Service
public class GoodscartServiceImpl implements GoodscartService {
	@Autowired
	private GoodscartDao goodscartDao;
	
	@Override
	public GoodscartDO get(Long id){
		return goodscartDao.get(id);
	}
	
	@Override
	public List<GoodscartDO> list(Map<String, Object> map){
		return goodscartDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return goodscartDao.count(map);
	}
	
	@Override
	public int save(GoodscartDO goodscart){
		return goodscartDao.save(goodscart);
	}
	
	@Override
	public int update(GoodscartDO goodscart){
		return goodscartDao.update(goodscart);
	}
	
	@Override
	public int remove(Long id){
		return goodscartDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return goodscartDao.batchRemove(ids);
	}
    @Override
    public GoodscartDO selectOne(Map<String, Object> params) {
        List<GoodscartDO> list = goodscartDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<GoodscartDO> resList = goodscartDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

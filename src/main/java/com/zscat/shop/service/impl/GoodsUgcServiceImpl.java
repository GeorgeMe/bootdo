package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.GoodsUgcDao;
import com.zscat.shop.domain.GoodsUgcDO;
import com.zscat.shop.service.GoodsUgcService;



@Service
public class GoodsUgcServiceImpl implements GoodsUgcService {
	@Autowired
	private GoodsUgcDao goodsUgcDao;
	
	@Override
	public GoodsUgcDO get(Long goodsId){
		return goodsUgcDao.get(goodsId);
	}
	
	@Override
	public List<GoodsUgcDO> list(Map<String, Object> map){
		return goodsUgcDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return goodsUgcDao.count(map);
	}
	
	@Override
	public int save(GoodsUgcDO goodsUgc){
		return goodsUgcDao.save(goodsUgc);
	}
	
	@Override
	public int update(GoodsUgcDO goodsUgc){
		return goodsUgcDao.update(goodsUgc);
	}
	
	@Override
	public int remove(Long goodsId){
		return goodsUgcDao.remove(goodsId);
	}
	
	@Override
	public int batchRemove(Long[] goodsIds){
		return goodsUgcDao.batchRemove(goodsIds);
	}
    @Override
    public GoodsUgcDO selectOne(Map<String, Object> params) {
        List<GoodsUgcDO> list = goodsUgcDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<GoodsUgcDO> resList = goodsUgcDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

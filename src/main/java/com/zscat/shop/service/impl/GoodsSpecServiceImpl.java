package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.GoodsSpecDao;
import com.zscat.shop.domain.GoodsSpecDO;
import com.zscat.shop.service.GoodsSpecService;



@Service
public class GoodsSpecServiceImpl implements GoodsSpecService {
	@Autowired
	private GoodsSpecDao goodsSpecDao;
	
	@Override
	public GoodsSpecDO get(Long goodsId){
		return goodsSpecDao.get(goodsId);
	}
	
	@Override
	public List<GoodsSpecDO> list(Map<String, Object> map){
		return goodsSpecDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return goodsSpecDao.count(map);
	}
	
	@Override
	public int save(GoodsSpecDO goodsSpec){
		return goodsSpecDao.save(goodsSpec);
	}
	
	@Override
	public int update(GoodsSpecDO goodsSpec){
		return goodsSpecDao.update(goodsSpec);
	}
	
	@Override
	public int remove(Long goodsId){
		return goodsSpecDao.remove(goodsId);
	}
	
	@Override
	public int batchRemove(Long[] goodsIds){
		return goodsSpecDao.batchRemove(goodsIds);
	}
    @Override
    public GoodsSpecDO selectOne(Map<String, Object> params) {
        List<GoodsSpecDO> list = goodsSpecDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<GoodsSpecDO> resList = goodsSpecDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

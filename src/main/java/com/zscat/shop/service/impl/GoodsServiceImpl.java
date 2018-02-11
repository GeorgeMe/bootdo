package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.GoodsDao;
import com.zscat.shop.domain.GoodsDO;
import com.zscat.shop.service.GoodsService;



@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsDao goodsDao;
	
	@Override
	public GoodsDO get(Long id){
		return goodsDao.get(id);
	}
	
	@Override
	public List<GoodsDO> list(Map<String, Object> map){
		return goodsDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return goodsDao.count(map);
	}
	
	@Override
	public int save(GoodsDO goods){
		return goodsDao.save(goods);
	}
	
	@Override
	public int update(GoodsDO goods){
		return goodsDao.update(goods);
	}
	
	@Override
	public int remove(Long id){
		return goodsDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return goodsDao.batchRemove(ids);
	}
    @Override
    public GoodsDO selectOne(Map<String, Object> params) {
        List<GoodsDO> list = goodsDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<GoodsDO> resList = goodsDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

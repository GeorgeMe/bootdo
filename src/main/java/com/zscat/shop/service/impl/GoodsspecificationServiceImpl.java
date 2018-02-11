package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.GoodsspecificationDao;
import com.zscat.shop.domain.GoodsspecificationDO;
import com.zscat.shop.service.GoodsspecificationService;



@Service
public class GoodsspecificationServiceImpl implements GoodsspecificationService {
	@Autowired
	private GoodsspecificationDao goodsspecificationDao;
	
	@Override
	public GoodsspecificationDO get(Long id){
		return goodsspecificationDao.get(id);
	}
	
	@Override
	public List<GoodsspecificationDO> list(Map<String, Object> map){
		return goodsspecificationDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return goodsspecificationDao.count(map);
	}
	
	@Override
	public int save(GoodsspecificationDO goodsspecification){
		return goodsspecificationDao.save(goodsspecification);
	}
	
	@Override
	public int update(GoodsspecificationDO goodsspecification){
		return goodsspecificationDao.update(goodsspecification);
	}
	
	@Override
	public int remove(Long id){
		return goodsspecificationDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return goodsspecificationDao.batchRemove(ids);
	}
    @Override
    public GoodsspecificationDO selectOne(Map<String, Object> params) {
        List<GoodsspecificationDO> list = goodsspecificationDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<GoodsspecificationDO> resList = goodsspecificationDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

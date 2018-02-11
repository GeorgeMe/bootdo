package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.GoodsspecpropertyDao;
import com.zscat.shop.domain.GoodsspecpropertyDO;
import com.zscat.shop.service.GoodsspecpropertyService;



@Service
public class GoodsspecpropertyServiceImpl implements GoodsspecpropertyService {
	@Autowired
	private GoodsspecpropertyDao goodsspecpropertyDao;
	
	@Override
	public GoodsspecpropertyDO get(Long id){
		return goodsspecpropertyDao.get(id);
	}
	
	@Override
	public List<GoodsspecpropertyDO> list(Map<String, Object> map){
		return goodsspecpropertyDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return goodsspecpropertyDao.count(map);
	}
	
	@Override
	public int save(GoodsspecpropertyDO goodsspecproperty){
		return goodsspecpropertyDao.save(goodsspecproperty);
	}
	
	@Override
	public int update(GoodsspecpropertyDO goodsspecproperty){
		return goodsspecpropertyDao.update(goodsspecproperty);
	}
	
	@Override
	public int remove(Long id){
		return goodsspecpropertyDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return goodsspecpropertyDao.batchRemove(ids);
	}
    @Override
    public GoodsspecpropertyDO selectOne(Map<String, Object> params) {
        List<GoodsspecpropertyDO> list = goodsspecpropertyDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<GoodsspecpropertyDO> resList = goodsspecpropertyDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

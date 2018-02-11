package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.GoodsReturnlogDao;
import com.zscat.shop.domain.GoodsReturnlogDO;
import com.zscat.shop.service.GoodsReturnlogService;



@Service
public class GoodsReturnlogServiceImpl implements GoodsReturnlogService {
	@Autowired
	private GoodsReturnlogDao goodsReturnlogDao;
	
	@Override
	public GoodsReturnlogDO get(Long id){
		return goodsReturnlogDao.get(id);
	}
	
	@Override
	public List<GoodsReturnlogDO> list(Map<String, Object> map){
		return goodsReturnlogDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return goodsReturnlogDao.count(map);
	}
	
	@Override
	public int save(GoodsReturnlogDO goodsReturnlog){
		return goodsReturnlogDao.save(goodsReturnlog);
	}
	
	@Override
	public int update(GoodsReturnlogDO goodsReturnlog){
		return goodsReturnlogDao.update(goodsReturnlog);
	}
	
	@Override
	public int remove(Long id){
		return goodsReturnlogDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return goodsReturnlogDao.batchRemove(ids);
	}
    @Override
    public GoodsReturnlogDO selectOne(Map<String, Object> params) {
        List<GoodsReturnlogDO> list = goodsReturnlogDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<GoodsReturnlogDO> resList = goodsReturnlogDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

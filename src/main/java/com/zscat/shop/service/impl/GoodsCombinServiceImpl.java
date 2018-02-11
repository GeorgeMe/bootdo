package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.GoodsCombinDao;
import com.zscat.shop.domain.GoodsCombinDO;
import com.zscat.shop.service.GoodsCombinService;



@Service
public class GoodsCombinServiceImpl implements GoodsCombinService {
	@Autowired
	private GoodsCombinDao goodsCombinDao;
	
	@Override
	public GoodsCombinDO get(Long wemallGoodsId){
		return goodsCombinDao.get(wemallGoodsId);
	}
	
	@Override
	public List<GoodsCombinDO> list(Map<String, Object> map){
		return goodsCombinDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return goodsCombinDao.count(map);
	}
	
	@Override
	public int save(GoodsCombinDO goodsCombin){
		return goodsCombinDao.save(goodsCombin);
	}
	
	@Override
	public int update(GoodsCombinDO goodsCombin){
		return goodsCombinDao.update(goodsCombin);
	}
	
	@Override
	public int remove(Long wemallGoodsId){
		return goodsCombinDao.remove(wemallGoodsId);
	}
	
	@Override
	public int batchRemove(Long[] wemallGoodsIds){
		return goodsCombinDao.batchRemove(wemallGoodsIds);
	}
    @Override
    public GoodsCombinDO selectOne(Map<String, Object> params) {
        List<GoodsCombinDO> list = goodsCombinDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<GoodsCombinDO> resList = goodsCombinDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

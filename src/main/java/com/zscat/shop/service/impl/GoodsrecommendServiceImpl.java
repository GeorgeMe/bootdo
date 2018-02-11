package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.GoodsrecommendDao;
import com.zscat.shop.domain.GoodsrecommendDO;
import com.zscat.shop.service.GoodsrecommendService;



@Service
public class GoodsrecommendServiceImpl implements GoodsrecommendService {
	@Autowired
	private GoodsrecommendDao goodsrecommendDao;
	
	@Override
	public GoodsrecommendDO get(Long id){
		return goodsrecommendDao.get(id);
	}
	
	@Override
	public List<GoodsrecommendDO> list(Map<String, Object> map){
		return goodsrecommendDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return goodsrecommendDao.count(map);
	}
	
	@Override
	public int save(GoodsrecommendDO goodsrecommend){
		return goodsrecommendDao.save(goodsrecommend);
	}
	
	@Override
	public int update(GoodsrecommendDO goodsrecommend){
		return goodsrecommendDao.update(goodsrecommend);
	}
	
	@Override
	public int remove(Long id){
		return goodsrecommendDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return goodsrecommendDao.batchRemove(ids);
	}
    @Override
    public GoodsrecommendDO selectOne(Map<String, Object> params) {
        List<GoodsrecommendDO> list = goodsrecommendDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<GoodsrecommendDO> resList = goodsrecommendDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

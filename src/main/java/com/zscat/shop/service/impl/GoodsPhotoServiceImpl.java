package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.GoodsPhotoDao;
import com.zscat.shop.domain.GoodsPhotoDO;
import com.zscat.shop.service.GoodsPhotoService;



@Service
public class GoodsPhotoServiceImpl implements GoodsPhotoService {
	@Autowired
	private GoodsPhotoDao goodsPhotoDao;
	
	@Override
	public GoodsPhotoDO get(Long goodsId){
		return goodsPhotoDao.get(goodsId);
	}
	
	@Override
	public List<GoodsPhotoDO> list(Map<String, Object> map){
		return goodsPhotoDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return goodsPhotoDao.count(map);
	}
	
	@Override
	public int save(GoodsPhotoDO goodsPhoto){
		return goodsPhotoDao.save(goodsPhoto);
	}
	
	@Override
	public int update(GoodsPhotoDO goodsPhoto){
		return goodsPhotoDao.update(goodsPhoto);
	}
	
	@Override
	public int remove(Long goodsId){
		return goodsPhotoDao.remove(goodsId);
	}
	
	@Override
	public int batchRemove(Long[] goodsIds){
		return goodsPhotoDao.batchRemove(goodsIds);
	}
    @Override
    public GoodsPhotoDO selectOne(Map<String, Object> params) {
        List<GoodsPhotoDO> list = goodsPhotoDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<GoodsPhotoDO> resList = goodsPhotoDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

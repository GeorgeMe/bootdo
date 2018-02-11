package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.GoodsReturnitemDao;
import com.zscat.shop.domain.GoodsReturnitemDO;
import com.zscat.shop.service.GoodsReturnitemService;



@Service
public class GoodsReturnitemServiceImpl implements GoodsReturnitemService {
	@Autowired
	private GoodsReturnitemDao goodsReturnitemDao;
	
	@Override
	public GoodsReturnitemDO get(Long id){
		return goodsReturnitemDao.get(id);
	}
	
	@Override
	public List<GoodsReturnitemDO> list(Map<String, Object> map){
		return goodsReturnitemDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return goodsReturnitemDao.count(map);
	}
	
	@Override
	public int save(GoodsReturnitemDO goodsReturnitem){
		return goodsReturnitemDao.save(goodsReturnitem);
	}
	
	@Override
	public int update(GoodsReturnitemDO goodsReturnitem){
		return goodsReturnitemDao.update(goodsReturnitem);
	}
	
	@Override
	public int remove(Long id){
		return goodsReturnitemDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return goodsReturnitemDao.batchRemove(ids);
	}
    @Override
    public GoodsReturnitemDO selectOne(Map<String, Object> params) {
        List<GoodsReturnitemDO> list = goodsReturnitemDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<GoodsReturnitemDO> resList = goodsReturnitemDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

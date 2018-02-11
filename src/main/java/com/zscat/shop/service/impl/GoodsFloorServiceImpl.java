package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.GoodsFloorDao;
import com.zscat.shop.domain.GoodsFloorDO;
import com.zscat.shop.service.GoodsFloorService;



@Service
public class GoodsFloorServiceImpl implements GoodsFloorService {
	@Autowired
	private GoodsFloorDao goodsFloorDao;
	
	@Override
	public GoodsFloorDO get(Long id){
		return goodsFloorDao.get(id);
	}
	
	@Override
	public List<GoodsFloorDO> list(Map<String, Object> map){
		return goodsFloorDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return goodsFloorDao.count(map);
	}
	
	@Override
	public int save(GoodsFloorDO goodsFloor){
		return goodsFloorDao.save(goodsFloor);
	}
	
	@Override
	public int update(GoodsFloorDO goodsFloor){
		return goodsFloorDao.update(goodsFloor);
	}
	
	@Override
	public int remove(Long id){
		return goodsFloorDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return goodsFloorDao.batchRemove(ids);
	}
    @Override
    public GoodsFloorDO selectOne(Map<String, Object> params) {
        List<GoodsFloorDO> list = goodsFloorDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<GoodsFloorDO> resList = goodsFloorDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

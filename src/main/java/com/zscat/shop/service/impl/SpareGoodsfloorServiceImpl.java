package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.SpareGoodsfloorDao;
import com.zscat.shop.domain.SpareGoodsfloorDO;
import com.zscat.shop.service.SpareGoodsfloorService;



@Service
public class SpareGoodsfloorServiceImpl implements SpareGoodsfloorService {
	@Autowired
	private SpareGoodsfloorDao spareGoodsfloorDao;
	
	@Override
	public SpareGoodsfloorDO get(Long id){
		return spareGoodsfloorDao.get(id);
	}
	
	@Override
	public List<SpareGoodsfloorDO> list(Map<String, Object> map){
		return spareGoodsfloorDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return spareGoodsfloorDao.count(map);
	}
	
	@Override
	public int save(SpareGoodsfloorDO spareGoodsfloor){
		return spareGoodsfloorDao.save(spareGoodsfloor);
	}
	
	@Override
	public int update(SpareGoodsfloorDO spareGoodsfloor){
		return spareGoodsfloorDao.update(spareGoodsfloor);
	}
	
	@Override
	public int remove(Long id){
		return spareGoodsfloorDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return spareGoodsfloorDao.batchRemove(ids);
	}
    @Override
    public SpareGoodsfloorDO selectOne(Map<String, Object> params) {
        List<SpareGoodsfloorDO> list = spareGoodsfloorDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<SpareGoodsfloorDO> resList = spareGoodsfloorDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

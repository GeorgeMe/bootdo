package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.SpareGoodsDao;
import com.zscat.shop.domain.SpareGoodsDO;
import com.zscat.shop.service.SpareGoodsService;



@Service
public class SpareGoodsServiceImpl implements SpareGoodsService {
	@Autowired
	private SpareGoodsDao spareGoodsDao;
	
	@Override
	public SpareGoodsDO get(Long id){
		return spareGoodsDao.get(id);
	}
	
	@Override
	public List<SpareGoodsDO> list(Map<String, Object> map){
		return spareGoodsDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return spareGoodsDao.count(map);
	}
	
	@Override
	public int save(SpareGoodsDO spareGoods){
		return spareGoodsDao.save(spareGoods);
	}
	
	@Override
	public int update(SpareGoodsDO spareGoods){
		return spareGoodsDao.update(spareGoods);
	}
	
	@Override
	public int remove(Long id){
		return spareGoodsDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return spareGoodsDao.batchRemove(ids);
	}
    @Override
    public SpareGoodsDO selectOne(Map<String, Object> params) {
        List<SpareGoodsDO> list = spareGoodsDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<SpareGoodsDO> resList = spareGoodsDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

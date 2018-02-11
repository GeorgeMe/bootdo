package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.BargainGoodsDao;
import com.zscat.shop.domain.BargainGoodsDO;
import com.zscat.shop.service.BargainGoodsService;



@Service
public class BargainGoodsServiceImpl implements BargainGoodsService {
	@Autowired
	private BargainGoodsDao bargainGoodsDao;
	
	@Override
	public BargainGoodsDO get(Long id){
		return bargainGoodsDao.get(id);
	}
	
	@Override
	public List<BargainGoodsDO> list(Map<String, Object> map){
		return bargainGoodsDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return bargainGoodsDao.count(map);
	}
	
	@Override
	public int save(BargainGoodsDO bargainGoods){
		return bargainGoodsDao.save(bargainGoods);
	}
	
	@Override
	public int update(BargainGoodsDO bargainGoods){
		return bargainGoodsDao.update(bargainGoods);
	}
	
	@Override
	public int remove(Long id){
		return bargainGoodsDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return bargainGoodsDao.batchRemove(ids);
	}
    @Override
    public BargainGoodsDO selectOne(Map<String, Object> params) {
        List<BargainGoodsDO> list = bargainGoodsDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<BargainGoodsDO> resList = bargainGoodsDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.GoodsReturnDao;
import com.zscat.shop.domain.GoodsReturnDO;
import com.zscat.shop.service.GoodsReturnService;



@Service
public class GoodsReturnServiceImpl implements GoodsReturnService {
	@Autowired
	private GoodsReturnDao goodsReturnDao;
	
	@Override
	public GoodsReturnDO get(Long id){
		return goodsReturnDao.get(id);
	}
	
	@Override
	public List<GoodsReturnDO> list(Map<String, Object> map){
		return goodsReturnDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return goodsReturnDao.count(map);
	}
	
	@Override
	public int save(GoodsReturnDO goodsReturn){
		return goodsReturnDao.save(goodsReturn);
	}
	
	@Override
	public int update(GoodsReturnDO goodsReturn){
		return goodsReturnDao.update(goodsReturn);
	}
	
	@Override
	public int remove(Long id){
		return goodsReturnDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return goodsReturnDao.batchRemove(ids);
	}
    @Override
    public GoodsReturnDO selectOne(Map<String, Object> params) {
        List<GoodsReturnDO> list = goodsReturnDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<GoodsReturnDO> resList = goodsReturnDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

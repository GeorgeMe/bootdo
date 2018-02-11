package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.GoodsclassstapleDao;
import com.zscat.shop.domain.GoodsclassstapleDO;
import com.zscat.shop.service.GoodsclassstapleService;



@Service
public class GoodsclassstapleServiceImpl implements GoodsclassstapleService {
	@Autowired
	private GoodsclassstapleDao goodsclassstapleDao;
	
	@Override
	public GoodsclassstapleDO get(Long id){
		return goodsclassstapleDao.get(id);
	}
	
	@Override
	public List<GoodsclassstapleDO> list(Map<String, Object> map){
		return goodsclassstapleDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return goodsclassstapleDao.count(map);
	}
	
	@Override
	public int save(GoodsclassstapleDO goodsclassstaple){
		return goodsclassstapleDao.save(goodsclassstaple);
	}
	
	@Override
	public int update(GoodsclassstapleDO goodsclassstaple){
		return goodsclassstapleDao.update(goodsclassstaple);
	}
	
	@Override
	public int remove(Long id){
		return goodsclassstapleDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return goodsclassstapleDao.batchRemove(ids);
	}
    @Override
    public GoodsclassstapleDO selectOne(Map<String, Object> params) {
        List<GoodsclassstapleDO> list = goodsclassstapleDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<GoodsclassstapleDO> resList = goodsclassstapleDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

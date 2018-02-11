package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.GroupGoodsDao;
import com.zscat.shop.domain.GroupGoodsDO;
import com.zscat.shop.service.GroupGoodsService;



@Service
public class GroupGoodsServiceImpl implements GroupGoodsService {
	@Autowired
	private GroupGoodsDao groupGoodsDao;
	
	@Override
	public GroupGoodsDO get(Long id){
		return groupGoodsDao.get(id);
	}
	
	@Override
	public List<GroupGoodsDO> list(Map<String, Object> map){
		return groupGoodsDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return groupGoodsDao.count(map);
	}
	
	@Override
	public int save(GroupGoodsDO groupGoods){
		return groupGoodsDao.save(groupGoods);
	}
	
	@Override
	public int update(GroupGoodsDO groupGoods){
		return groupGoodsDao.update(groupGoods);
	}
	
	@Override
	public int remove(Long id){
		return groupGoodsDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return groupGoodsDao.batchRemove(ids);
	}
    @Override
    public GroupGoodsDO selectOne(Map<String, Object> params) {
        List<GroupGoodsDO> list = groupGoodsDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<GroupGoodsDO> resList = groupGoodsDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.GroupPriceRangeDao;
import com.zscat.shop.domain.GroupPriceRangeDO;
import com.zscat.shop.service.GroupPriceRangeService;



@Service
public class GroupPriceRangeServiceImpl implements GroupPriceRangeService {
	@Autowired
	private GroupPriceRangeDao groupPriceRangeDao;
	
	@Override
	public GroupPriceRangeDO get(Long id){
		return groupPriceRangeDao.get(id);
	}
	
	@Override
	public List<GroupPriceRangeDO> list(Map<String, Object> map){
		return groupPriceRangeDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return groupPriceRangeDao.count(map);
	}
	
	@Override
	public int save(GroupPriceRangeDO groupPriceRange){
		return groupPriceRangeDao.save(groupPriceRange);
	}
	
	@Override
	public int update(GroupPriceRangeDO groupPriceRange){
		return groupPriceRangeDao.update(groupPriceRange);
	}
	
	@Override
	public int remove(Long id){
		return groupPriceRangeDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return groupPriceRangeDao.batchRemove(ids);
	}
    @Override
    public GroupPriceRangeDO selectOne(Map<String, Object> params) {
        List<GroupPriceRangeDO> list = groupPriceRangeDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<GroupPriceRangeDO> resList = groupPriceRangeDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

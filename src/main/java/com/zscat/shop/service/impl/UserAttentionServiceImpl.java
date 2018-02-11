package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.UserAttentionDao;
import com.zscat.shop.domain.UserAttentionDO;
import com.zscat.shop.service.UserAttentionService;



@Service
public class UserAttentionServiceImpl implements UserAttentionService {
	@Autowired
	private UserAttentionDao userAttentionDao;
	
	@Override
	public UserAttentionDO get(Long id){
		return userAttentionDao.get(id);
	}
	
	@Override
	public List<UserAttentionDO> list(Map<String, Object> map){
		return userAttentionDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return userAttentionDao.count(map);
	}
	
	@Override
	public int save(UserAttentionDO userAttention){
		return userAttentionDao.save(userAttention);
	}
	
	@Override
	public int update(UserAttentionDO userAttention){
		return userAttentionDao.update(userAttention);
	}
	
	@Override
	public int remove(Long id){
		return userAttentionDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return userAttentionDao.batchRemove(ids);
	}
    @Override
    public UserAttentionDO selectOne(Map<String, Object> params) {
        List<UserAttentionDO> list = userAttentionDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<UserAttentionDO> resList = userAttentionDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

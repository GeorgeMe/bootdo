package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.UserFriendDao;
import com.zscat.shop.domain.UserFriendDO;
import com.zscat.shop.service.UserFriendService;



@Service
public class UserFriendServiceImpl implements UserFriendService {
	@Autowired
	private UserFriendDao userFriendDao;
	
	@Override
	public UserFriendDO get(Long id){
		return userFriendDao.get(id);
	}
	
	@Override
	public List<UserFriendDO> list(Map<String, Object> map){
		return userFriendDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return userFriendDao.count(map);
	}
	
	@Override
	public int save(UserFriendDO userFriend){
		return userFriendDao.save(userFriend);
	}
	
	@Override
	public int update(UserFriendDO userFriend){
		return userFriendDao.update(userFriend);
	}
	
	@Override
	public int remove(Long id){
		return userFriendDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return userFriendDao.batchRemove(ids);
	}
    @Override
    public UserFriendDO selectOne(Map<String, Object> params) {
        List<UserFriendDO> list = userFriendDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<UserFriendDO> resList = userFriendDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

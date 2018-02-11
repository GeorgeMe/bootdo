package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.ChattingfriendDao;
import com.zscat.shop.domain.ChattingfriendDO;
import com.zscat.shop.service.ChattingfriendService;



@Service
public class ChattingfriendServiceImpl implements ChattingfriendService {
	@Autowired
	private ChattingfriendDao chattingfriendDao;
	
	@Override
	public ChattingfriendDO get(Long id){
		return chattingfriendDao.get(id);
	}
	
	@Override
	public List<ChattingfriendDO> list(Map<String, Object> map){
		return chattingfriendDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return chattingfriendDao.count(map);
	}
	
	@Override
	public int save(ChattingfriendDO chattingfriend){
		return chattingfriendDao.save(chattingfriend);
	}
	
	@Override
	public int update(ChattingfriendDO chattingfriend){
		return chattingfriendDao.update(chattingfriend);
	}
	
	@Override
	public int remove(Long id){
		return chattingfriendDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return chattingfriendDao.batchRemove(ids);
	}
    @Override
    public ChattingfriendDO selectOne(Map<String, Object> params) {
        List<ChattingfriendDO> list = chattingfriendDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<ChattingfriendDO> resList = chattingfriendDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

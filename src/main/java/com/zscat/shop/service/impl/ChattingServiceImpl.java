package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.ChattingDao;
import com.zscat.shop.domain.ChattingDO;
import com.zscat.shop.service.ChattingService;



@Service
public class ChattingServiceImpl implements ChattingService {
	@Autowired
	private ChattingDao chattingDao;
	
	@Override
	public ChattingDO get(Long id){
		return chattingDao.get(id);
	}
	
	@Override
	public List<ChattingDO> list(Map<String, Object> map){
		return chattingDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return chattingDao.count(map);
	}
	
	@Override
	public int save(ChattingDO chatting){
		return chattingDao.save(chatting);
	}
	
	@Override
	public int update(ChattingDO chatting){
		return chattingDao.update(chatting);
	}
	
	@Override
	public int remove(Long id){
		return chattingDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return chattingDao.batchRemove(ids);
	}
    @Override
    public ChattingDO selectOne(Map<String, Object> params) {
        List<ChattingDO> list = chattingDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<ChattingDO> resList = chattingDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

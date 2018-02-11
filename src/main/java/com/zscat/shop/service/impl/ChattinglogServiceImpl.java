package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.ChattinglogDao;
import com.zscat.shop.domain.ChattinglogDO;
import com.zscat.shop.service.ChattinglogService;



@Service
public class ChattinglogServiceImpl implements ChattinglogService {
	@Autowired
	private ChattinglogDao chattinglogDao;
	
	@Override
	public ChattinglogDO get(Long id){
		return chattinglogDao.get(id);
	}
	
	@Override
	public List<ChattinglogDO> list(Map<String, Object> map){
		return chattinglogDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return chattinglogDao.count(map);
	}
	
	@Override
	public int save(ChattinglogDO chattinglog){
		return chattinglogDao.save(chattinglog);
	}
	
	@Override
	public int update(ChattinglogDO chattinglog){
		return chattinglogDao.update(chattinglog);
	}
	
	@Override
	public int remove(Long id){
		return chattinglogDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return chattinglogDao.batchRemove(ids);
	}
    @Override
    public ChattinglogDO selectOne(Map<String, Object> params) {
        List<ChattinglogDO> list = chattinglogDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<ChattinglogDO> resList = chattinglogDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

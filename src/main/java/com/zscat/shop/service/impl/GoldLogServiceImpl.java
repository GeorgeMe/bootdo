package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.GoldLogDao;
import com.zscat.shop.domain.GoldLogDO;
import com.zscat.shop.service.GoldLogService;



@Service
public class GoldLogServiceImpl implements GoldLogService {
	@Autowired
	private GoldLogDao goldLogDao;
	
	@Override
	public GoldLogDO get(Long id){
		return goldLogDao.get(id);
	}
	
	@Override
	public List<GoldLogDO> list(Map<String, Object> map){
		return goldLogDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return goldLogDao.count(map);
	}
	
	@Override
	public int save(GoldLogDO goldLog){
		return goldLogDao.save(goldLog);
	}
	
	@Override
	public int update(GoldLogDO goldLog){
		return goldLogDao.update(goldLog);
	}
	
	@Override
	public int remove(Long id){
		return goldLogDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return goldLogDao.batchRemove(ids);
	}
    @Override
    public GoldLogDO selectOne(Map<String, Object> params) {
        List<GoldLogDO> list = goldLogDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<GoldLogDO> resList = goldLogDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.ZtcGoldLogDao;
import com.zscat.shop.domain.ZtcGoldLogDO;
import com.zscat.shop.service.ZtcGoldLogService;



@Service
public class ZtcGoldLogServiceImpl implements ZtcGoldLogService {
	@Autowired
	private ZtcGoldLogDao ztcGoldLogDao;
	
	@Override
	public ZtcGoldLogDO get(Long id){
		return ztcGoldLogDao.get(id);
	}
	
	@Override
	public List<ZtcGoldLogDO> list(Map<String, Object> map){
		return ztcGoldLogDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return ztcGoldLogDao.count(map);
	}
	
	@Override
	public int save(ZtcGoldLogDO ztcGoldLog){
		return ztcGoldLogDao.save(ztcGoldLog);
	}
	
	@Override
	public int update(ZtcGoldLogDO ztcGoldLog){
		return ztcGoldLogDao.update(ztcGoldLog);
	}
	
	@Override
	public int remove(Long id){
		return ztcGoldLogDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return ztcGoldLogDao.batchRemove(ids);
	}
    @Override
    public ZtcGoldLogDO selectOne(Map<String, Object> params) {
        List<ZtcGoldLogDO> list = ztcGoldLogDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<ZtcGoldLogDO> resList = ztcGoldLogDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

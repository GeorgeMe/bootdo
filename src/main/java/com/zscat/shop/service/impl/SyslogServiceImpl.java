package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.SyslogDao;
import com.zscat.shop.domain.SyslogDO;
import com.zscat.shop.service.SyslogService;



@Service
public class SyslogServiceImpl implements SyslogService {
	@Autowired
	private SyslogDao syslogDao;
	
	@Override
	public SyslogDO get(Long id){
		return syslogDao.get(id);
	}
	
	@Override
	public List<SyslogDO> list(Map<String, Object> map){
		return syslogDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return syslogDao.count(map);
	}
	
	@Override
	public int save(SyslogDO syslog){
		return syslogDao.save(syslog);
	}
	
	@Override
	public int update(SyslogDO syslog){
		return syslogDao.update(syslog);
	}
	
	@Override
	public int remove(Long id){
		return syslogDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return syslogDao.batchRemove(ids);
	}
    @Override
    public SyslogDO selectOne(Map<String, Object> params) {
        List<SyslogDO> list = syslogDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<SyslogDO> resList = syslogDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

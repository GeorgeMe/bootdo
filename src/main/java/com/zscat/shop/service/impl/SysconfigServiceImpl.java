package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.SysconfigDao;
import com.zscat.shop.domain.SysconfigDO;
import com.zscat.shop.service.SysconfigService;



@Service
public class SysconfigServiceImpl implements SysconfigService {
	@Autowired
	private SysconfigDao sysconfigDao;
	
	@Override
	public SysconfigDO get(Long id){
		return sysconfigDao.get(id);
	}
	
	@Override
	public List<SysconfigDO> list(Map<String, Object> map){
		return sysconfigDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return sysconfigDao.count(map);
	}
	
	@Override
	public int save(SysconfigDO sysconfig){
		return sysconfigDao.save(sysconfig);
	}
	
	@Override
	public int update(SysconfigDO sysconfig){
		return sysconfigDao.update(sysconfig);
	}
	
	@Override
	public int remove(Long id){
		return sysconfigDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return sysconfigDao.batchRemove(ids);
	}
    @Override
    public SysconfigDO selectOne(Map<String, Object> params) {
        List<SysconfigDO> list = sysconfigDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<SysconfigDO> resList = sysconfigDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

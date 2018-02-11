package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.UserconfigDao;
import com.zscat.shop.domain.UserconfigDO;
import com.zscat.shop.service.UserconfigService;



@Service
public class UserconfigServiceImpl implements UserconfigService {
	@Autowired
	private UserconfigDao userconfigDao;
	
	@Override
	public UserconfigDO get(Long id){
		return userconfigDao.get(id);
	}
	
	@Override
	public List<UserconfigDO> list(Map<String, Object> map){
		return userconfigDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return userconfigDao.count(map);
	}
	
	@Override
	public int save(UserconfigDO userconfig){
		return userconfigDao.save(userconfig);
	}
	
	@Override
	public int update(UserconfigDO userconfig){
		return userconfigDao.update(userconfig);
	}
	
	@Override
	public int remove(Long id){
		return userconfigDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return userconfigDao.batchRemove(ids);
	}
    @Override
    public UserconfigDO selectOne(Map<String, Object> params) {
        List<UserconfigDO> list = userconfigDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<UserconfigDO> resList = userconfigDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

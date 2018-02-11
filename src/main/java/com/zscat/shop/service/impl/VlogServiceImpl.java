package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.VlogDao;
import com.zscat.shop.domain.VlogDO;
import com.zscat.shop.service.VlogService;



@Service
public class VlogServiceImpl implements VlogService {
	@Autowired
	private VlogDao vlogDao;
	
	@Override
	public VlogDO get(Long id){
		return vlogDao.get(id);
	}
	
	@Override
	public List<VlogDO> list(Map<String, Object> map){
		return vlogDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return vlogDao.count(map);
	}
	
	@Override
	public int save(VlogDO vlog){
		return vlogDao.save(vlog);
	}
	
	@Override
	public int update(VlogDO vlog){
		return vlogDao.update(vlog);
	}
	
	@Override
	public int remove(Long id){
		return vlogDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return vlogDao.batchRemove(ids);
	}
    @Override
    public VlogDO selectOne(Map<String, Object> params) {
        List<VlogDO> list = vlogDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<VlogDO> resList = vlogDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

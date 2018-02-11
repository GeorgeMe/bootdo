package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.MobileverifycodeDao;
import com.zscat.shop.domain.MobileverifycodeDO;
import com.zscat.shop.service.MobileverifycodeService;



@Service
public class MobileverifycodeServiceImpl implements MobileverifycodeService {
	@Autowired
	private MobileverifycodeDao mobileverifycodeDao;
	
	@Override
	public MobileverifycodeDO get(Long id){
		return mobileverifycodeDao.get(id);
	}
	
	@Override
	public List<MobileverifycodeDO> list(Map<String, Object> map){
		return mobileverifycodeDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return mobileverifycodeDao.count(map);
	}
	
	@Override
	public int save(MobileverifycodeDO mobileverifycode){
		return mobileverifycodeDao.save(mobileverifycode);
	}
	
	@Override
	public int update(MobileverifycodeDO mobileverifycode){
		return mobileverifycodeDao.update(mobileverifycode);
	}
	
	@Override
	public int remove(Long id){
		return mobileverifycodeDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return mobileverifycodeDao.batchRemove(ids);
	}
    @Override
    public MobileverifycodeDO selectOne(Map<String, Object> params) {
        List<MobileverifycodeDO> list = mobileverifycodeDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<MobileverifycodeDO> resList = mobileverifycodeDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

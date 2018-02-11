package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.VmessageDao;
import com.zscat.shop.domain.VmessageDO;
import com.zscat.shop.service.VmessageService;



@Service
public class VmessageServiceImpl implements VmessageService {
	@Autowired
	private VmessageDao vmessageDao;
	
	@Override
	public VmessageDO get(Long id){
		return vmessageDao.get(id);
	}
	
	@Override
	public List<VmessageDO> list(Map<String, Object> map){
		return vmessageDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return vmessageDao.count(map);
	}
	
	@Override
	public int save(VmessageDO vmessage){
		return vmessageDao.save(vmessage);
	}
	
	@Override
	public int update(VmessageDO vmessage){
		return vmessageDao.update(vmessage);
	}
	
	@Override
	public int remove(Long id){
		return vmessageDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return vmessageDao.batchRemove(ids);
	}
    @Override
    public VmessageDO selectOne(Map<String, Object> params) {
        List<VmessageDO> list = vmessageDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<VmessageDO> resList = vmessageDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

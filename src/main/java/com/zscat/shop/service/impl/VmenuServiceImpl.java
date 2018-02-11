package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.VmenuDao;
import com.zscat.shop.domain.VmenuDO;
import com.zscat.shop.service.VmenuService;



@Service
public class VmenuServiceImpl implements VmenuService {
	@Autowired
	private VmenuDao vmenuDao;
	
	@Override
	public VmenuDO get(Long id){
		return vmenuDao.get(id);
	}
	
	@Override
	public List<VmenuDO> list(Map<String, Object> map){
		return vmenuDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return vmenuDao.count(map);
	}
	
	@Override
	public int save(VmenuDO vmenu){
		return vmenuDao.save(vmenu);
	}
	
	@Override
	public int update(VmenuDO vmenu){
		return vmenuDao.update(vmenu);
	}
	
	@Override
	public int remove(Long id){
		return vmenuDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return vmenuDao.batchRemove(ids);
	}
    @Override
    public VmenuDO selectOne(Map<String, Object> params) {
        List<VmenuDO> list = vmenuDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<VmenuDO> resList = vmenuDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

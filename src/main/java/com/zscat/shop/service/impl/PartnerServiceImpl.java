package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.PartnerDao;
import com.zscat.shop.domain.PartnerDO;
import com.zscat.shop.service.PartnerService;



@Service
public class PartnerServiceImpl implements PartnerService {
	@Autowired
	private PartnerDao partnerDao;
	
	@Override
	public PartnerDO get(Long id){
		return partnerDao.get(id);
	}
	
	@Override
	public List<PartnerDO> list(Map<String, Object> map){
		return partnerDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return partnerDao.count(map);
	}
	
	@Override
	public int save(PartnerDO partner){
		return partnerDao.save(partner);
	}
	
	@Override
	public int update(PartnerDO partner){
		return partnerDao.update(partner);
	}
	
	@Override
	public int remove(Long id){
		return partnerDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return partnerDao.batchRemove(ids);
	}
    @Override
    public PartnerDO selectOne(Map<String, Object> params) {
        List<PartnerDO> list = partnerDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<PartnerDO> resList = partnerDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

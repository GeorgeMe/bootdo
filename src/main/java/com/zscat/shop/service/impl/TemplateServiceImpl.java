package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.TemplateDao;
import com.zscat.shop.domain.TemplateDO;
import com.zscat.shop.service.TemplateService;



@Service
public class TemplateServiceImpl implements TemplateService {
	@Autowired
	private TemplateDao templateDao;
	
	@Override
	public TemplateDO get(Long id){
		return templateDao.get(id);
	}
	
	@Override
	public List<TemplateDO> list(Map<String, Object> map){
		return templateDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return templateDao.count(map);
	}
	
	@Override
	public int save(TemplateDO template){
		return templateDao.save(template);
	}
	
	@Override
	public int update(TemplateDO template){
		return templateDao.update(template);
	}
	
	@Override
	public int remove(Long id){
		return templateDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return templateDao.batchRemove(ids);
	}
    @Override
    public TemplateDO selectOne(Map<String, Object> params) {
        List<TemplateDO> list = templateDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<TemplateDO> resList = templateDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

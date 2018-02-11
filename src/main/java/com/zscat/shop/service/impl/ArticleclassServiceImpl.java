package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.ArticleclassDao;
import com.zscat.shop.domain.ArticleclassDO;
import com.zscat.shop.service.ArticleclassService;



@Service
public class ArticleclassServiceImpl implements ArticleclassService {
	@Autowired
	private ArticleclassDao articleclassDao;
	
	@Override
	public ArticleclassDO get(Long id){
		return articleclassDao.get(id);
	}
	
	@Override
	public List<ArticleclassDO> list(Map<String, Object> map){
		return articleclassDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return articleclassDao.count(map);
	}
	
	@Override
	public int save(ArticleclassDO articleclass){
		return articleclassDao.save(articleclass);
	}
	
	@Override
	public int update(ArticleclassDO articleclass){
		return articleclassDao.update(articleclass);
	}
	
	@Override
	public int remove(Long id){
		return articleclassDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return articleclassDao.batchRemove(ids);
	}
    @Override
    public ArticleclassDO selectOne(Map<String, Object> params) {
        List<ArticleclassDO> list = articleclassDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<ArticleclassDO> resList = articleclassDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

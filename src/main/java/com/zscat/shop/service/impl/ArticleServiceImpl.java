package com.zscat.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.zscat.common.utils.*;import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zscat.shop.dao.ArticleDao;
import com.zscat.shop.domain.ArticleDO;
import com.zscat.shop.service.ArticleService;



@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleDao articleDao;
	
	@Override
	public ArticleDO get(Long id){
		return articleDao.get(id);
	}
	
	@Override
	public List<ArticleDO> list(Map<String, Object> map){
		return articleDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return articleDao.count(map);
	}
	
	@Override
	public int save(ArticleDO article){
		return articleDao.save(article);
	}
	
	@Override
	public int update(ArticleDO article){
		return articleDao.update(article);
	}
	
	@Override
	public int remove(Long id){
		return articleDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return articleDao.batchRemove(ids);
	}
    @Override
    public ArticleDO selectOne(Map<String, Object> params) {
        List<ArticleDO> list = articleDao.list(params);
        if (list!=null && list.size()>0){
            return  list.get(0);
        }
        return null;
    }
    @Override
    public PageUtils listPage(Map<String, Object> map) {
        Query query = new Query(map);
        List<ArticleDO> resList = articleDao.list(query);
        int total = resList.size();
        PageUtils pageUtils = new PageUtils(resList, total);
        return pageUtils;
    }
}

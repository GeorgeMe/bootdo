package com.zscat.common.service;

import org.springframework.stereotype.Service;

import com.zscat.common.domain.LogDO;
import com.zscat.common.domain.PageDO;
import com.zscat.common.utils.Query;
@Service
public interface LogService {
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}

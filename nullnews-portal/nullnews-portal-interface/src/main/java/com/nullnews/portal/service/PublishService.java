package com.nullnews.portal.service;

import com.nullnews.pojo.Passage;

public interface PublishService {
	/**
	 * 发布文章
	 * 
	 * @param passage
	 * @return
	 */
	boolean addPublish(Passage passage, String userId);

	/**
	 * 获取文章数据
	 * 
	 * @param id
	 * @return
	 */
	Passage getPassage(String id);

	/**
	 * 更新文章数据，比如增加浏览数量或者点赞数量之类的
	 * 
	 * @param passage
	 * @return
	 */
	boolean updatePassage(Passage passage);
}

package com.nullnews.manager.service;

import com.github.pagehelper.PageInfo;
import com.nullnews.pojo.Passage;
import com.nullnews.pojo.UserInfoAndPassage;

public interface PassageService {
    	
		
	/**
	 * 查询小编的文章
	 * @param start
	 * @param pageSize
	 * @return
	 */
		PageInfo<UserInfoAndPassage> selectAllEditPassageByPublishTime(String start,String pageSize);
		
		/**
		 * 查询用户的文章
		 * @param start
		 * @param pageSize
		 * @return
		 */
		PageInfo<UserInfoAndPassage> selectAllUserPassageByPublishTime1(String start,String pageSize);
}

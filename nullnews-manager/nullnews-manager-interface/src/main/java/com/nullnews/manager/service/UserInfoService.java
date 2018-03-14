package com.nullnews.manager.service;

import com.github.pagehelper.PageInfo;
import com.nullnews.pojo.UserInfo;

public interface UserInfoService {
		
	/**
	 * 得到用户信息
	 * @param start
	 * @param pageSize
	 * @return
	 */
	PageInfo<UserInfo> selectUserByaddTime(String start,String pageSize);
	
	/**
	 * 得到小编信息
	 * @param start
	 * @param pageSize
	 * @return
	 */
	PageInfo<UserInfo> selectEditByaddTime(String start,String pageSize);
	
}

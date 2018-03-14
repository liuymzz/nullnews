package com.nullnews.portal.service;

import com.nullnews.pojo.UserInfo;

public interface PersonalCenterService {
	/**
	 * 获取用户数据
	 * @param id
	 * @return
	 */
	UserInfo  GetUserInfo(String id);
}

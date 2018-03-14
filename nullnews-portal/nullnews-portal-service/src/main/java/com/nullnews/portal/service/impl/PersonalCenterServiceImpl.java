package com.nullnews.portal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nullnews.mapper.UserInfoMapper;
import com.nullnews.pojo.UserInfo;
import com.nullnews.pojo.UserInfoExample;
import com.nullnews.pojo.UserInfoExample.Criteria;
import com.nullnews.portal.service.PersonalCenterService;

@Service
public class PersonalCenterServiceImpl implements PersonalCenterService {
	@Autowired
	private UserInfoMapper userInfoMapper;

	@Override
	public UserInfo GetUserInfo(String id) {
		UserInfoExample userInfoExample = new UserInfoExample();
		Criteria criteria = userInfoExample.createCriteria();
		criteria.andUserIdEqualTo(id);
		return userInfoMapper.selectByPrimaryKey(id);
	}
}

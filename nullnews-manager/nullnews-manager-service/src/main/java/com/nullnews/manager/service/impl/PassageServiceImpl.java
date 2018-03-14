package com.nullnews.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nullnews.manager.service.PassageService;
import com.nullnews.mapper.PassageMapper;
import com.nullnews.pojo.Passage;
import com.nullnews.pojo.UserInfoAndPassage;
@Service
public class PassageServiceImpl implements PassageService {

	@Autowired
	private PassageMapper passageMapper;
	@Override
	public PageInfo<UserInfoAndPassage> selectAllEditPassageByPublishTime(String start, String pageSize) {
		int s = Integer.parseInt(start);
		int p = Integer.parseInt(pageSize);
		PageHelper.startPage(s, p);
		List<UserInfoAndPassage> list=passageMapper.selectAllEditPassageByPublishTime();
		PageInfo<UserInfoAndPassage> pageInfo=new PageInfo<>(list);
		return pageInfo;
	}
	@Override
	public PageInfo<UserInfoAndPassage> selectAllUserPassageByPublishTime1(String start, String pageSize) {
		int s = Integer.parseInt(start);
		int p = Integer.parseInt(pageSize);
		PageHelper.startPage(s, p);
		List<UserInfoAndPassage> list=passageMapper.selectAllUserPassageByPublishTime1();
		PageInfo<UserInfoAndPassage> pageInfo=new PageInfo<>(list);
		return pageInfo;
	}

}

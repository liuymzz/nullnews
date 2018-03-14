package com.nullnews.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nullnews.mapper.Ad1Mapper;
import com.nullnews.mapper.PassageMapper;
import com.nullnews.mapper.UserInfoMapper;
import com.nullnews.pojo.Ad1;
import com.nullnews.pojo.Passage;
import com.nullnews.pojo.UserInfo;
import com.nullnews.portal.service.IndexService;

@Service
public class IndexServiceImpl implements IndexService {

	@Autowired
	private Ad1Mapper ad1Mapper;

	@Autowired
	private PassageMapper passageMapper;

	@Autowired
	private UserInfoMapper userInfoMapper;

	@Override
	public List<Ad1> getAllAd() {
		return ad1Mapper.selectByExample(null);
	}

	@Override
	public List<Passage> selectPassageByPublisTime(int start, int pageSize) {
		PageHelper.startPage(start, pageSize);
		return passageMapper.selectPassageByPublisTime();
	}

	@Override
	public List<Passage> selectPassageByLookCount() {
		return passageMapper.selectPassageByLookCount();
	}

	@Override
	public List<Passage> selectPassageByLookCountAll() {
		return passageMapper.selectPassageByLookCountAll();
	}

	@Override
	public List<Passage> selectPassageByLikeCount() {
		return passageMapper.selectPassageByLikeCount();
	}

	@Override
	public List<Passage> selectPassageByLikeCountAll() {
		return passageMapper.selectPassageByLikeCountAll();
	}

	@Override
	public PageInfo<Passage> selectUserPassageByPublishTime(int start, int pageSize, String userId) {
		PageHelper.startPage(start, pageSize);
		List<Passage> list = passageMapper.selectUserPassageByPublishTime(userId);
		PageInfo<Passage> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}

	@Override
	public List<UserInfo> selectUserByAllLikeCount() {
		return userInfoMapper.selectUserByAllLikeCount();
	}

	@Override
	public List<UserInfo> selectUserByFollowCount() {
		return userInfoMapper.selectUserByFollowCount();
	}

}

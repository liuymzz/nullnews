package com.nullnews.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nullnews.mapper.PassageMapper;
import com.nullnews.pojo.Passage;
import com.nullnews.portal.service.QuanziService;

@Service
public class QuanziServiceImpl implements QuanziService {

	@Autowired
	private PassageMapper passageMapper;

	@Override
	public PageInfo<Passage> getAllUserPassageByPublishTime(int start, int pageSize) {
		PageHelper.startPage(start, pageSize);
		List<Passage> list = passageMapper.selectAllUserPassageByPublishTime();
		PageInfo<Passage> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}

}

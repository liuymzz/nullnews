package com.nullnews.portal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nullnews.mapper.PassageMapper;
import com.nullnews.pojo.Passage;
import com.nullnews.portal.service.NewsService;

@Service
public class NewsServiceImpl implements NewsService {

	@Autowired
	private PassageMapper passageMapper;

	@Override
	public boolean like(String passageId) {
		try {

			// 点赞功能实现，需要先获取文章内容
			Passage passage = passageMapper.selectByPrimaryKey(passageId);
			Passage newPassage = new Passage();
			newPassage.setPassageId(passageId);
			newPassage.setPassageLikeCount(passage.getPassageLikeCount() + 1);

			passageMapper.updateByPrimaryKeySelective(newPassage);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}

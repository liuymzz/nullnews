package com.nullnews.portal.service.impl;

import java.util.Date;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nullnews.mapper.PassageMapper;
import com.nullnews.mapper.UserInfoMapper;
import com.nullnews.pojo.Passage;
import com.nullnews.pojo.PassageExample;
import com.nullnews.pojo.PassageExample.Criteria;
import com.nullnews.pojo.UserInfo;
import com.nullnews.portal.service.PublishService;

@Service
public class PublishServiceImpl implements PublishService {

	@Autowired
	private PassageMapper passageMapper;
	@Autowired
	private UserInfoMapper userInfoMapper;

	@Override
	public boolean addPublish(Passage passage, String userId) {

		try {

			// 在保存至数据库之前需要先设置必须要的一些值
			System.out.println(userId);
			passage.setPassageId(StringUtils.replace(UUID.randomUUID().toString(), "-", ""));
			passage.setPassageTime(new Date());
			passage.setPassageLikeCount(0); // 默认喜欢数量0
			passage.setPassageLookCount(0); // 默认阅读数量0
			passage.setPassageState(0); // 文章默认状态0，正常

			passageMapper.insert(passage);

			// 用户的文章数加1
			int num = userInfoMapper.selectUserPassageNum(userId);
			UserInfo newUser = new UserInfo();
			newUser.setUserId(userId);
			newUser.setUserPassageNum(num + 1);
			userInfoMapper.updateByPrimaryKeySelective(newUser);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public Passage getPassage(String id) {
		PassageExample example = new PassageExample();
		Criteria criteria = example.createCriteria();
		criteria.andPassageIdEqualTo(id);
		return passageMapper.selectByExampleWithBLOBs(example).get(0);
	}

	@Override
	public boolean updatePassage(Passage passage) {
		passageMapper.updateByPrimaryKeySelective(passage);

		return true;
	}

}

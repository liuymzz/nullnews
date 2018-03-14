package com.nullnews.portal.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.nullnews.pojo.Ad1;
import com.nullnews.pojo.Passage;
import com.nullnews.pojo.UserInfo;

public interface IndexService {
	/**
	 * 查询首页上的所有广告
	 * 
	 * @return
	 */
	List<Ad1> getAllAd();

	PageInfo<Passage> selectUserPassageByPublishTime(int start, int pageSize, String userId);

	/**
	 * 查询小编最新的文章
	 * 
	 * @param
	 * @param
	 * @return
	 */
	List<Passage> selectPassageByPublisTime(int pageSize, int pageNo);

	/**
	 * 查询文章根据一天的浏览量
	 * 
	 * @return
	 */
	List<Passage> selectPassageByLookCount();

	/**
	 * 查询文章根据历史浏览量
	 * 
	 * @return
	 */
	List<Passage> selectPassageByLookCountAll();

	/**
	 * 查询文章根据一天内的点赞数
	 * 
	 * @return
	 */
	List<Passage> selectPassageByLikeCount();

	/**
	 * 查询文章根据（单个文章）点赞数高低
	 * 
	 * @return
	 */
	List<Passage> selectPassageByLikeCountAll();

	/**
	 * 查询用户发表的所有文章的点赞数的高低
	 * 
	 * @return
	 */

	List<UserInfo> selectUserByAllLikeCount();

	/**
	 * 根据关注人数的高低
	 * 
	 * @return
	 */

	List<UserInfo> selectUserByFollowCount();

}

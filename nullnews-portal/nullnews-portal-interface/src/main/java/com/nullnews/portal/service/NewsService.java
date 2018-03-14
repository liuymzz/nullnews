package com.nullnews.portal.service;

public interface NewsService {

	/**
	 * 给文章点赞，成功返回true，否则返回false，需要传入文章id
	 * 
	 * @param passageId
	 * @return
	 */
	boolean like(String passageId);
}

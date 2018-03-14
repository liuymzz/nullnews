package com.nullnews.portal.service;

import com.github.pagehelper.PageInfo;
import com.nullnews.pojo.Passage;

public interface QuanziService {

	PageInfo<Passage> getAllUserPassageByPublishTime(int start, int paseSize);

}

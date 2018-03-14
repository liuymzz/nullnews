package com.nullnews.manager.service;

import com.github.pagehelper.PageInfo;
import com.nullnews.pojo.UserComment;

public interface UserCommentService {

	PageInfo<UserComment> getUserComment(String start, String pageSize);

}

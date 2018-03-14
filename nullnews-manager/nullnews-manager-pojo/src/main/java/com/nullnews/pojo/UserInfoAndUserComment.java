package com.nullnews.pojo;

import java.io.Serializable;

public class UserInfoAndUserComment implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3420133656838514704L;
	private UserInfo userInfo;
	private UserComment userComment;

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public UserComment getUserComment() {
		return userComment;
	}

	public void setUserComment(UserComment userComment) {
		this.userComment = userComment;
	}

}

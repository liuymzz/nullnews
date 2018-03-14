package com.nullnews.pojo;

import java.io.Serializable;

public class UserInfoAndPassage implements Serializable{
	
	
	
	private UserInfo userInfo;
	private Passage passage;
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public Passage getPassage() {
		return passage;
	}
	public void setPassage(Passage passage) {
		this.passage = passage;
	}
	@Override
	public String toString() {
		return "UserInfoAndPassage [userInfo=" + userInfo + ", passage=" + passage + "]";
	}

	
}

package com.nullnews.pojo;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {
	private String userId;

	private String userName;

	private String userPassword;

	private String userPhone;

	private String userSecureCode;

	private Integer userState;

	private Integer userType;

	private String userUri;

	private Date userAddtime;

	private Integer userSex;

	private String userBrief;

	private Integer userPassageNum;

	private static final long serialVersionUID = 1L;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserSecureCode() {
		return userSecureCode;
	}

	public void setUserSecureCode(String userSecureCode) {
		this.userSecureCode = userSecureCode;
	}

	public Integer getUserState() {
		return userState;
	}

	public void setUserState(Integer userState) {
		this.userState = userState;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public String getUserUri() {
		return userUri;
	}

	public void setUserUri(String userUri) {
		this.userUri = userUri;
	}

	public Date getUserAddtime() {
		return userAddtime;
	}

	public void setUserAddtime(Date userAddtime) {
		this.userAddtime = userAddtime;
	}

	public Integer getUserSex() {
		return userSex;
	}

	public void setUserSex(Integer userSex) {
		this.userSex = userSex;
	}

	public String getUserBrief() {
		return userBrief;
	}

	public void setUserBrief(String userBrief) {
		this.userBrief = userBrief;
	}

	public Integer getUserPassageNum() {
		return userPassageNum;
	}

	public void setUserPassageNum(Integer userPassageNum) {
		this.userPassageNum = userPassageNum;
	}

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userPhone=" + userPhone + ", userSecureCode=" + userSecureCode + ", userState=" + userState
				+ ", userType=" + userType + ", userUri=" + userUri + ", userAddtime=" + userAddtime + ", userSex="
				+ userSex + ", userBrief=" + userBrief + ", userPassageNum=" + userPassageNum + "]";
	}

}
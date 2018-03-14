package com.nullnews.pojo;

import java.io.Serializable;
import java.util.Date;

public class Passage implements Serializable {
	private String passageId;

	private String userId;

	private String passageTitle;

	private String passagePicture;

	private Date passageTime;

	private Integer passageLikeCount;

	private Integer passageLookCount;

	private Integer passageState;

	private String passageContent;

	private static final long serialVersionUID = 1L;

	public String getPassageId() {
		return passageId;
	}

	public void setPassageId(String passageId) {
		this.passageId = passageId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassageTitle() {
		return passageTitle;
	}

	public void setPassageTitle(String passageTitle) {
		this.passageTitle = passageTitle;
	}

	public String getPassagePicture() {
		return passagePicture;
	}

	public void setPassagePicture(String passagePicture) {
		this.passagePicture = passagePicture;
	}

	public Date getPassageTime() {
		return passageTime;
	}

	public void setPassageTime(Date passageTime) {
		this.passageTime = passageTime;
	}

	public Integer getPassageLikeCount() {
		return passageLikeCount;
	}

	public void setPassageLikeCount(Integer passageLikeCount) {
		this.passageLikeCount = passageLikeCount;
	}

	public Integer getPassageLookCount() {
		return passageLookCount;
	}

	public void setPassageLookCount(Integer passageLookCount) {
		this.passageLookCount = passageLookCount;
	}

	public Integer getPassageState() {
		return passageState;
	}

	public void setPassageState(Integer passageState) {
		this.passageState = passageState;
	}

	public String getPassageContent() {
		return passageContent;
	}

	public void setPassageContent(String passageContent) {
		this.passageContent = passageContent;
	}

	@Override
	public String toString() {
		return "Passage [passageId=" + passageId + ", userId=" + userId + ", passageTitle=" + passageTitle
				+ ", passagePicture=" + passagePicture + ", passageTime=" + passageTime + ", passageLikeCount="
				+ passageLikeCount + ", passageLookCount=" + passageLookCount + ", passageState=" + passageState
				+ ", passageContent=" + passageContent + "]";
	}

}
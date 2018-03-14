package com.nullnews.pojo;

import java.io.Serializable;
import java.util.Date;

public class UserComment implements Serializable {
    private String commentId;

    private String userId;

    private String passageId;

    private Date commentTime;

    private String commentParentId;

    private Integer commentLike;

    private Integer commentDislike;

    private String commentContent;

    private Integer commentState;

    private static final long serialVersionUID = 1L;

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassageId() {
        return passageId;
    }

    public void setPassageId(String passageId) {
        this.passageId = passageId;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public String getCommentParentId() {
        return commentParentId;
    }

    public void setCommentParentId(String commentParentId) {
        this.commentParentId = commentParentId;
    }

    public Integer getCommentLike() {
        return commentLike;
    }

    public void setCommentLike(Integer commentLike) {
        this.commentLike = commentLike;
    }

    public Integer getCommentDislike() {
        return commentDislike;
    }

    public void setCommentDislike(Integer commentDislike) {
        this.commentDislike = commentDislike;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Integer getCommentState() {
        return commentState;
    }

    public void setCommentState(Integer commentState) {
        this.commentState = commentState;
    }
}
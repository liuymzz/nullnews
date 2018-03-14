package com.nullnews.pojo;

import java.io.Serializable;

public class UserAdmin implements Serializable {
    private String userAdminId;

    private String userAdminName;

    private String userAdminPassword;

    private static final long serialVersionUID = 1L;

    public String getUserAdminId() {
        return userAdminId;
    }

    public void setUserAdminId(String userAdminId) {
        this.userAdminId = userAdminId;
    }

    public String getUserAdminName() {
        return userAdminName;
    }

    public void setUserAdminName(String userAdminName) {
        this.userAdminName = userAdminName;
    }

    public String getUserAdminPassword() {
        return userAdminPassword;
    }

    public void setUserAdminPassword(String userAdminPassword) {
        this.userAdminPassword = userAdminPassword;
    }
}
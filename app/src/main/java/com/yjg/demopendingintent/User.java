package com.yjg.demopendingintent;

import java.io.Serializable;

/**
 * Created by Hello on 2017/11/25.
 */

public class User implements Serializable {
    public String userId;
    public String userName;
    public String userInfo;
    public User(String userId, String userName, String userInfo) {
        this.userId = userId;
        this.userName = userName;
        this.userInfo = userInfo;
    }

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

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userInfo='" + userInfo + '\'' +
                '}';
    }
}

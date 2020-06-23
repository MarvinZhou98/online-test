package com.test.entity;

public class User {
    private String	UserID;
    private String UserPassword;
    private String UserName;
    private String UserType;

    public User(String userID, String userPassword, String userName, String userType) {
        UserID = userID;
        UserPassword = userPassword;
        UserName = userName;
        UserType = userType;
    }

    public User() {
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String userType) {
        UserType = userType;
    }
}

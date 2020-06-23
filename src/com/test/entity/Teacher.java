package com.test.entity;

public class Teacher extends User{
    private Test[]	Tests;

    public Teacher(String userID, String userPassword, String userName, String userType, Test[] tests) {
        super(userID, userPassword, userName, userType);
        Tests = tests;
    }

    public Teacher() {
    }

    public Test[] getTests() {
        return Tests;
    }

    public void setTests(Test[] tests) {
        Tests = tests;
    }
}

package com.test.entity;

public class Student extends User{
    private Test[]	Tests;

    public Student(String userID, String userPassword, String userName, char userType, Test[] tests) {
        super(userID, userPassword, userName, userType);
        Tests = tests;
    }

    public Student() {
    }

    public Test[] getTests() {
        return Tests;
    }

    public void setTests(Test[] tests) {
        Tests = tests;
    }
}

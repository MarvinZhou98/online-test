package com.test.entity;

public class Grade {
    private String Name;
    private String TestName;
    private int Grade;

    public Grade(String name, String testName, int grade) {
        Name = name;
        TestName = testName;
        Grade = grade;
    }

    public Grade() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTestName() {
        return TestName;
    }

    public void setTestName(String testName) {
        TestName = testName;
    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int grade) {
        Grade = grade;
    }
}

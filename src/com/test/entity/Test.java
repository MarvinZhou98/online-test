package com.test.entity;

public class Test {
    private String	Name;
    private int	Time;
    private SelectQuestion[] Questions;
    private int	TestID;

    public Test() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getTime() {
        return Time;
    }

    public void setTime(int time) {
        Time = time;
    }

    public SelectQuestion[] getQuestions() {
        return Questions;
    }

    public void setQuestions(SelectQuestion[] questions) {
        Questions = questions;
    }

    public int getTestID() {
        return TestID;
    }

    public void setTestID(int testID) {
        TestID = testID;
    }
}

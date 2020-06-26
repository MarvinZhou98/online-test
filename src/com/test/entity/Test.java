package com.test.entity;

import java.util.List;

public class Test {
    private String	Name;
    private int	Time;
    private List<SelectQuestion> Questions;
    private String TestID;

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

    public List<SelectQuestion> getQuestions() {
        return Questions;
    }

    public void setQuestions(List<SelectQuestion> questions) {
        Questions = questions;
    }

    public String getTestID() {
        return TestID;
    }

    public void setTestID(String testID) {
        TestID = testID;
    }
}

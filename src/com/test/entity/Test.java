package com.test.entity;

public class Test {
    private String	Name;
    private int	Grade;
    private int	Time;
    private Question Questions;
    private int	ID;

    public Test(String name, int grade, int time, Question questions, int ID) {
        Name = name;
        Grade = grade;
        Time = time;
        Questions = questions;
        this.ID = ID;
    }

    public Test() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int grade) {
        Grade = grade;
    }

    public int getTime() {
        return Time;
    }

    public void setTime(int time) {
        Time = time;
    }

    public Question getQuestions() {
        return Questions;
    }

    public void setQuestions(Question questions) {
        Questions = questions;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}

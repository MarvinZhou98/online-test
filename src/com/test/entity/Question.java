package com.test.entity;

public class Question {
    private int	Num;
    private char Type;
    private String Answer;
    private String Content;
    private int	ID;

    public Question() {
    }

    public Question(int num, char type, String answer, String content, int ID) {
        Num = num;
        Type = type;
        Answer = answer;
        Content = content;
        this.ID = ID;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int num) {
        Num = num;
    }

    public char getType() {
        return Type;
    }

    public void setType(char type) {
        Type = type;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}

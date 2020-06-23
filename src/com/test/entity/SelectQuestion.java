package com.test.entity;

public class SelectQuestion extends Question {
    private String SelectA;
    private String SelectB;
    private String SelectC;
    private String SelectD;

    public SelectQuestion(int num, String type, String answer, String content, int ID, String selectA, String selectB, String selectC, String selectD) {
        super(num, type, answer, content, ID);
        SelectA = selectA;
        SelectB = selectB;
        SelectC = selectC;
        SelectD = selectD;
    }

    public SelectQuestion() {
    }

    public String getSelectA() {
        return SelectA;
    }

    public void setSelectA(String selectA) {
        SelectA = selectA;
    }

    public String getSelectB() {
        return SelectB;
    }

    public void setSelectB(String selectB) {
        SelectB = selectB;
    }

    public String getSelectC() {
        return SelectC;
    }

    public void setSelectC(String selectC) {
        SelectC = selectC;
    }

    public String getSelectD() {
        return SelectD;
    }

    public void setSelectD(String selectD) {
        SelectD = selectD;
    }
}

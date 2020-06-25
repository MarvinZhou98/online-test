package com.test.entity;

public class Student extends User{
    private Grade[]	Gardes;

    public Student() {
    }

    public Grade[] getGardes() {
        return Gardes;
    }

    public void setGardes(Grade[] gardes) {
        Gardes = gardes;
    }
}

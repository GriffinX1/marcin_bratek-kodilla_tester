package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int lengthA;

    public void setLengthA(int lengthA) {
        this.lengthA = lengthA;
    }

    public Shape(int lenghtA) {
        this.lengthA = lenghtA;
    }

    public int getLengthA() {
        return lengthA;
    }

    public abstract void squareArea();

    public abstract void squarePerimeter();

    public abstract void giveName();


}


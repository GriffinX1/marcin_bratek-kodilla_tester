package com.kodilla.abstracts.homework;

public abstract class BigSquare extends Shape{
    public BigSquare(int lenghtA) {
        super(lenghtA);
    }

    @Override
    public void giveName() {
        System.out.println("Big square");
    }
}

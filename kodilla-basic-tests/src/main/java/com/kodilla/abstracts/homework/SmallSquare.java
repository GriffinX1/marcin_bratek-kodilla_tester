package com.kodilla.abstracts.homework;

public abstract class SmallSquare extends Shape{
    public SmallSquare(int lenghtA) {
        super(lenghtA);
    }

    @Override
    public void giveName() {
        System.out.println("Small square");

    }
}

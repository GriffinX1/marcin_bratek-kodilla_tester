package com.kodilla.abstracts.homework;

public abstract class HugeSquare extends Shape{

    public HugeSquare(int lenghtA) {
        super(lenghtA);
    }

    @Override
    public void giveName() {
        System.out.println("Huge square");
    }
}

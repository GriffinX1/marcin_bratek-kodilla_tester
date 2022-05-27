package com.kodilla.inheritance.homework;

import com.kodilla.inheritance.Car;

public class Program extends OperatingSystem {

    public void openProgram() {
        System.out.println("Opening program...");
    }

    public void closeProgram() {
        System.out.println("Closing program...");
    }

    @Override
    public void turnOnBoost() {
        System.out.println("Opening program");
    }

    public Program(int releaseYear, int endOfProject) {
        super(releaseYear, endOfProject);
    }
}

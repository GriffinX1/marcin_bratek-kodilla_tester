package com.kodilla.inheritance.homework;


public class App {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1999, 2010);
        operatingSystem.turnOnBoost();

        Program program = new Program(2014, 2019);
        program.displayEndOfProject();
    }
}

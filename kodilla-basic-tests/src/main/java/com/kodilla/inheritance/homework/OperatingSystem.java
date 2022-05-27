package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int releaseYear;
    private int endOfProject;


    public OperatingSystem(int releaseYear, int endOfProject) {
        this.releaseYear = releaseYear;
        this.endOfProject = endOfProject;
    }

    public void turnOnBoost() {
        System.out.println("Boost is on");
    }

    public void turnOffBoost() {
        System.out.println("Boost is off");

    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getEndOfProject() {
        return endOfProject;
    }

    public void displayEndOfProject() {
        System.out.println("Project ended: " + endOfProject);
    }
}


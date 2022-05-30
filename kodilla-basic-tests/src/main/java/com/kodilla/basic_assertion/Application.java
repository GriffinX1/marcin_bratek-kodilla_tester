package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        int subtractResult = calculator.subtract(a, b);
        int exponentiationResult = calculator.squared(a);
        boolean correct = ResultChecker.assertEquals(13, sumResult);

        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        boolean cor = ResultChecker.assertEquals(-3, subtractResult);

        if (cor) {
            System.out.println("Metoda odejmowania działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda odejmowania nie działa poprawnie dla liczb " + a + " i " + b);
        }
        boolean corr = ResultChecker.assertEquals(25, exponentiationResult );
        if (corr) {
            System.out.println("Metoda podnoszenia do kwadratu działa poprawnie dla liczby " + a );
        } else {
            System.out.println("Metoda podnoszenia do kwadratu nie działa poprawnie dla liczby " + a );
        }

        }
    }


package com.example.basicmodule.Test3Module1.Task8;

public class Atm {

    private double course;


    private static int count = 0;

    Atm(double course, Valute valute) {
        if (valute == Valute.RUB) {
            this.course = course;
            count++;
        }
        if (valute == Valute.USD) {
            this.course = course;
            count++;
        }
    }

    public double convertRUBInUSD(double rubles) {
        return course * rubles;
    }
    public double convertUSDinRUB(double dollars) {
        return course * dollars;
    }
    public int returnCount() {
        return count;
    }


}

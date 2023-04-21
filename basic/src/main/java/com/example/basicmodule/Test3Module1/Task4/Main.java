package com.example.basicmodule.Test3Module1.Task4;

public class Main {
    public static void main(String[] args) {

        TimeUnit time = new TimeUnit(0, 11);

        time.printTime();
        time.printTimeFormat12();

        time.addTime(25, 65, 60);

        time.printTime();

    }
}

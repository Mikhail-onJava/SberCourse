package com.example.basicmodule.Test1Part2;

/*"А логарифмическое?" - не унималась дочь.
        Напишите программу, которая проверяет, что log(e^n) == n для любого
        вещественного n.
        Ограничения:
        -500 < n < 500*/

import java.util.Scanner;

public class Test10 {
    public static final double E = 2.718281828459045;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        double n = input.nextDouble();
        // log(e^n) == n
        double result = Math.log(Math.pow(E, n));

        System.out.println(result == n);

    }
}


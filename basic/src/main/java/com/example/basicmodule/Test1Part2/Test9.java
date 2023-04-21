package com.example.basicmodule.Test1Part2;

/*Пока Петя практиковался в работе со строками, к нему подбежала его
        дочь и спросила: "А правда ли, что тригонометрическое тождество (sin^2(x)+
        cos^2(x) - 1 == 0) всегда-всегда выполняется?"
        Напишите программу, которая проверяет, что при любом x на входе
        тригонометрическое тождество будет выполняться (то есть будет выводить true
        при любом x).
        Ограничения:
        -1000 < x < 1000*/

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        final double EPSILON = 1E-14;
        double x, result;

        Scanner input = new Scanner(System.in);

        x = input.nextDouble();
        result = (Math.pow(Math.sin(x), 2) + Math.pow(Math.cos(x), 2) - 1);
        System.out.println(result <= EPSILON);
    }
}

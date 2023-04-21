package com.example.basicmodule.Test1Part2;

/*Дома дочери Пети опять нужна помощь с математикой! В этот раз ей
        нужно проверить, имеет ли предложенное квадратное уравнение решение или
        нет.
        На вход подаются три числа — коэффициенты квадратного уравнения a, b, c.
        Нужно вывести "Решение есть", если оно есть и "Решения нет", если нет.*/

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        int a, b, c, result, d;
        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        // ax^2 + bx + c = 0
        // D = b2 − 4ac
        // Если D < 0, корней нет

        d = (int) Math.pow(b, 2) - 4 * a * c;
        if (d < 0) {
            System.out.println("Решения нет");
        } else {
            System.out.println("Решение есть");
        }
    }
}





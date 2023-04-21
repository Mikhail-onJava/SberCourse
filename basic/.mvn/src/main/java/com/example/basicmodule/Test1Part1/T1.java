package com.example.basicmodule.Test1Part1;

/*Вычислите и выведите на экран объем шара, получив его радиус r с консоли.
        Подсказка: считать по формуле V = 4/3 * pi * r^3. Значение числа pi взять из
        Math.*/

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {

        double radius; // радиус круга
        double area; // площадь круга


        Scanner input = new Scanner(System.in); // создание объекта типа Scanner
        radius = input.nextDouble();

        // Найти объём шара V = 4/3 * pi * r^3
        System.out.print(area = 4.0 / 3 * Math.PI * Math.pow(radius, 3));
    }
}


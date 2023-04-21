package com.example.basicmodule.Test1Part1;

/*На вход подается два целых числа a и b. Вычислите и выведите среднее
        квадратическое a и b.*/

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        int a, b;
        double average;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();

        System.out.print(average = Math.sqrt(((a * a) + (b * b)) / 2.0));

    }
}


package com.example.basicmodule.Test1Part3;

/*Даны положительные натуральые числа m и n. Найти остаток от деления m на
        n, не выполняя операцию взятия остатка.
        Ограничения:
        0 < m, n < 10*/

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int m;

        n = scanner.nextInt();
        m = scanner.nextInt();

        while (n >= m) {
            n = n - m;
        }
        System.out.print(n);
    }
}





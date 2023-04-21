package com.example.basicmodule.Test1Part3;

// На вход подается два положительных числа m и n. Найти сумму чисел между m и n включительно.

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, m;
        int sum = 0;

        m = scan.nextInt();
        n = scan.nextInt();

        // sum = m^1+m^2+m^n;
        for (int i = m; i <= n; i++) {
            //   if (i % x == 0) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

}
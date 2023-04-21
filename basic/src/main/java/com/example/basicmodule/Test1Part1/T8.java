package com.example.basicmodule.Test1Part1;

// На вход подается баланс счета в банке – n. Рассчитайте дневной бюджет на 30  дней.

import java.util.Scanner;

public class T8 {
    public static void main(String[] args) {
        int n;
        double budget;

        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        budget = n / 30.0;

        System.out.print(budget);

    }
}


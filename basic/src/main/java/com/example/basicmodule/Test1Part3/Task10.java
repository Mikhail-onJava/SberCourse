package com.example.basicmodule.Test1Part3;

/* Вывести на экран “ёлочку” из символа звездочки (*) заданной высоты N. На N +
        1 строке у “ёлочки” должен быть отображен ствол из символа | */

import java.util.Scanner;

//ConvertAmountWithSelection
public class Task10 {

    public static void main(String args[]) {
        int N;

        Scanner input = new Scanner(System.in);

        N = input.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i * 2 + 1; j++) {
                if (i == 0) {
                    for (int k = 0; k < N - 1; k++) {
                        System.out.print(" ");
                    }
                    System.out.print("#");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println("");
            for (int l = i; l < N - 2; l++) {
                System.out.print(" ");
            }
        }
        for (int m = 0; m < N - 1; m++) {
            System.out.print(" ");
        }
        System.out.print("|");
    }
}
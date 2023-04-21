package com.example.basicmodule.Test2Part2;

/*На вход подается число N. Необходимо посчитать и вывести на экран сумму его
        цифр. Решить задачу нужно через рекурсию.*/

import java.util.Scanner;

public class Task8 {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = recursion(x);
        System.out.println(y);
    }

    public static int recursion(int y) {
        if (y / 10 >= 1) {
            int tempvar = y % 10;
            int remain = y / 10;
            return tempvar + recursion(remain);
        } else {
            return y;
        }
    }
}

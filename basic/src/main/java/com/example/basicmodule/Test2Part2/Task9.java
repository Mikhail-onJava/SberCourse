package com.example.basicmodule.Test2Part2;

/*На вход подается число N. Необходимо вывести цифры числа слева направо.
        Решить задачу нужно через рекурсию.*/

import java.util.Scanner;

public class Task9 {

    static void prints(int d) {
        int rem = d % 10;
        if (d == 0) {
            return;
        } else {
            prints(d / 10);
        }
        System.out.print(rem + " ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        prints(n);
    }
}
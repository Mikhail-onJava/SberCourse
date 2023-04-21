package com.example.basicmodule.Test2Part2;

/*На вход подается число N. Необходимо вывести цифры числа справа налево.
        Решить задачу нужно через рекурсию.*/

import java.util.Scanner;

public class Task10 {

    public static int consoleInputFirstNumber() {
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            return scan.nextInt();
        } else {
            return consoleInputFirstNumber();
        }
    }
    public static void numberReverseOrder(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.print(n % 10 + " ");
            numberReverseOrder(n / 10);
        }
    }
    public static void main(String[] args) {
        int input = consoleInputFirstNumber();
        numberReverseOrder(input);
    }
}
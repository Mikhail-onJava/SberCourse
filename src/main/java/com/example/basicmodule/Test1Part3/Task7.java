package com.example.basicmodule.Test1Part3;

// Дана строка s. Вычислить количество символов в ней, не считая пробелов (необходимо использовать цикл).

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replace(" ", "");

        // System.out.println(input.length());
        System.out.println(input.length());

    }
}

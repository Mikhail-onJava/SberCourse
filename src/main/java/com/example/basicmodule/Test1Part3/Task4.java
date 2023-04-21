package com.example.basicmodule.Test1Part3;

// Дано натуральное число n. Вывести его цифры в “столбик”.

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        char[] list = (Integer.toString(n)).toCharArray();
//        for (int i = 0; i < list.length; i++) {
//            {System.out.println(list[i]);}
        for (char c : list) {
            {
                System.out.println(c);
            }
        }
    }
}
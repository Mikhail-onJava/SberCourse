package com.example.basicmodule.Test1Part1;

/*Прочитайте из консоли имя пользователя и выведите в консоль строку:
        Привет, <имя пользователя>!*/

import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        int a, b;
        double average;
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();
        System.out.print("Привет, " + userName + "!");

    }
}


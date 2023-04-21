package com.example.basicmodule.Test1Part2;
/*Петя пришел домой и помогает дочке решать математику. Ей нужно
        определить, принадлежит ли точка с указанными координатами первому
        квадранту. Недолго думая, Петя решил автоматизировать процесс и написать
        программу: на вход нужно принимать два целых числа (координаты точки),
        выводить true, когда точка попала в квадрант и false иначе.
        Но сначала Петя вспомнил, что точка лежит в первом */

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int x, y;
        Scanner input = new Scanner(System.in);

        x = input.nextInt();
        y = input.nextInt();

        if (x > 0 && y > 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}


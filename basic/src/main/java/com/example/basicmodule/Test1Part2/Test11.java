package com.example.basicmodule.Test1Part2;

/*Разобравшись со своими (и не только) задачками, Петя уже собирался
        лечь спать и отдохнуть перед очередным тяжелым рабочим днем, но вдруг в
        тишине раздается детский шепот: "Папа, мы забыли решить ещё одну
        задачку! Давай проверим, можно ли из трех сторон составить треугольник?".
        Что ж, придется написать еще одну программу, связанную со школьной
        математикой.
        На вход подается три целых положительных числа – длины сторон
        треугольника. Нужно вывести true, если можно составить треугольник из этих
        сторон и false иначе.
        Ограничения:
        0 < a, b, c < 100*/

import java.util.Scanner;

public class Test11 {


    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);


        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

/*        if (a + b > c && a + c > b && b + c > a) {
            System.out.println(true);
        } else {
            System.out.println(false);
        } */
        System.out.println(a + b > c && a + c > b && b + c > a);
    }
}


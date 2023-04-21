package com.example.basicmodule.Test1Part2;

import java.util.Scanner;

/*За каждый год работы Петя получает на ревью оценку.
На вход подаются оценки Пети за последние три года(три целых положительных числа).
Если последовательность оценок строго монотонно убывает, то вывести"Петя, пора трудиться"
В остальных случаях вывести"Петя молодец!" */

public class Test1 {

    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if (a > b && b > c) {
            System.out.println("Петя, пора трудиться");
        } else {
            System.out.println("Петя молодец!");
        }
    }

}

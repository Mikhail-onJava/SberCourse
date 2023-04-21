package com.example.basicmodule.Test1Part1;

/*На вход подается бюджет мероприятия – n тугриков. Бюджет на одного гостя – k
  тугриков. Вычислите и выведите, сколько гостей можно пригласить на мероприятие.*/

import java.util.Scanner;

public class T9 {
    public static void main(String[] args) {
        int n, k;

        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        k = input.nextInt();

        System.out.print((n / k));

    }
}


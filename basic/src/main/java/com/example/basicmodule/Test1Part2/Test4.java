package com.example.basicmodule.Test1Part2;

/*После вкусного обеда Петя принимается за подсчет дней до выходных.
        Календаря под рукой не оказалось, а если спросить у коллеги Феди, то тот
        называет только порядковый номер дня недели, что не очень удобно. Поэтому
        Петя решил написать программу, которая по порядковому номеру дня недели
        выводит сколько осталось дней до субботы. А если же сегодня шестой
        (суббота) или седьмой (воскресенье) день, то программа выводит "Ура,
        выходные!"*/

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        int numberDay, quantityUntilSaturday;
        Scanner input = new Scanner(System.in);

        numberDay = input.nextInt();
        if (numberDay == 6 || numberDay == 7) {
            System.out.println("Ура, выходные!");
        } else {
            quantityUntilSaturday = 6 - numberDay;
            System.out.println(quantityUntilSaturday);
        }
    }

}




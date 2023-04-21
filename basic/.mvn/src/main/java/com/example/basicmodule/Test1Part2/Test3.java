package com.example.basicmodule.Test1Part2;

/*Петя снова пошел на работу. С сегодняшнего дня он решил ходить на
        обед строго после полудня. Периодически он посматривает на часы (x - час,
        который он увидел). Помогите Пете решить, пора ли ему на обед или нет. Если
        время больше полудня, то вывести "Пора". Иначе - “Рано”.*/

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int hour;
        Scanner input = new Scanner(System.in);


        hour = input.nextInt();

        if (hour <= 12) {
            System.out.println("Рано");
        } else {
            System.out.println("Пора");
        }
    }

}



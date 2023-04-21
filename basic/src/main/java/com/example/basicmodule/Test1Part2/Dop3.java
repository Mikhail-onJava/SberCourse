package com.example.basicmodule.Test1Part2;

/*Старый телефон Андрея сломался, поэтому он решил приобрести
        новый. Продавец телефонов предлагает разные варианты, но Андрея
        интересуют только модели серии samsung или iphone. Также Андрей решил
        рассматривать телефоны только от 50000 до 120000 рублей. Чтобы не тратить
        время на разговоры, Андрей хочет написать программу, которая поможет ему
        сделать выбор.
        На вход подается строка – модель телефона и число – стоимость телефона.
        Нужно вывести "Можно купить", если модель содержит слово samsung или
        iphone и стоимость от 50000 до 120000 рублей включительно. Иначе вывести
        "Не подходит".
        Гарантируется, что в модели телефона не указано одновременно несколько
        серий.*/

import java.util.Scanner;

public class Dop3 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String telepfonModel = input.nextLine();
        int cost = input.nextInt();

        if ((telepfonModel.startsWith("samsung") || telepfonModel.startsWith("iphone")) && ((cost >= 50000 && cost <= 120000))) {
            System.out.println("Можно купить");
        } else {
            System.out.println("Не подходит");
        }
    }
}












package com.example.basicmodule.Test1Part3;

/*В банкомате остались только купюры номиналом 8 4 2 1. Дано положительное
        число n - количество денег для размена. Необходимо найти минимальное
        количество купюр с помощью которых можно разменять это количество денег
        (соблюсти порядок: первым числом вывести количество купюр номиналом 8,
        вторым - 4 и т д)*/

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        int amount, number8, number4,
                number2, number1;

        Scanner input = new Scanner(System.in);

        // Получить сумму в рублях

        amount = input.nextInt();

        // Вычислить количество 5 тыс. руб. купюр и обновить оставшуюся сумму
        number8 = amount / 8;
        amount %= 8;

        // Вычислить количество 2 тыс. руб. купюр и обновить оставшуюся сумму
        number4 = amount / 4;
        amount %= 4;

        // Вычислить количество 1 тыс. руб. купюр и обновить оставшуюся сумму
        number2 = amount / 2;
        amount %= 2;

        // Вычислить количество 500 руб. купюр и обновить оставшуюся сумму
        number1 = amount;
        amount %= 1;

        // Отобразить количество купюр каждого достоинства

        System.out.print(number8 + " ");
        System.out.print(number4 + " ");
        System.out.print(number2 + " ");
        System.out.print(number1 + " ");

    }
}
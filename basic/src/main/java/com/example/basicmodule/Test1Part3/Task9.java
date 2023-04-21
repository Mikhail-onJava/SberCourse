package com.example.basicmodule.Test1Part3;

/*На вход последовательно подается возрастающая последовательность из n
        целых чисел, которая может начинаться с отрицательного числа.
        Посчитать и вывести на экран, какое количество отрицательных чисел было
        введено в начале последовательности. Помимо этого нужно прекратить
        выполнение цикла при получении первого неотрицательного числа на вход.*/

import java.util.Scanner;
//ConvertAmountWithSelection

public class Task9 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int n = scanner.nextInt();
        while (n < 0) {
            counter = counter + 1;
            n = scanner.nextInt();
        }
        System.out.println(counter);
    }
}
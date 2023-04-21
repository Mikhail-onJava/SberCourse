package com.example.basicmodule.Test2Part1;

/* На вход подается число N — длина массива. Затем передается массив
        вещественных чисел (ai) из N элементов.
        Необходимо реализовать метод, который принимает на вход полученный
        массив и возвращает среднее арифметическое всех чисел массива.
        Вывести среднее арифметическое на экран.*/

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double result;

        int n = scanner.nextInt();
        double[] massiv = new double[n];

        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = scanner.nextDouble();
            sum = sum + massiv[i];

        }
        System.out.println(sum / n);
    }
}

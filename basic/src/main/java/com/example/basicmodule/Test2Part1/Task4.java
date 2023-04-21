package com.example.basicmodule.Test2Part1;

/*На вход подается число N — длина массива. Затем передается массив
        целых чисел (ai) из N элементов, отсортированный по возрастанию.
        Необходимо вывести на экран построчно сколько встретилось различных
        элементов. Каждая строка должна содержать количество элементов и сам
        элемент через пробел.*/

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] N = new int[n]; // устанавливаю длинну массива N

        for (int i = 0; i < N.length; i++) {
            N[i] = scanner.nextInt(); // заполняю массив N
        }

        int summ = 0;
        int element = N[0];
        for (int i = 0; i < n; i++) {
            if (element == N[i]) {
                summ++;
            } else {
                System.out.println(summ + " " + element);
                summ = 1;
                element = N[i];
            }
        }
        System.out.println(summ + " " + element);
    }
}






package com.example.basicmodule.Test2Part1;

/*На вход подается число N — длина массива. Затем передается массив
        целых чисел (ai) из N элементов. После этого аналогично передается второй
        массив (aj) длины M.
        Необходимо вывести на экран true, если два массива одинаковы (то есть
        содержат одинаковое количество элементов и для каждого i == j элемент ai ==
        aj). Иначе вывести false.*/

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] N = new int[n]; // устанавливаю длину массива N
        for (int i = 0; i < N.length; i++) {
            N[i] = scanner.nextInt(); // заполняю массив N
        }

        int m = scanner.nextInt();
        int[] M = new int[m]; // устанавливаю длину массива M
        for (int j = 0; j < M.length; j++) {
            M[j] = scanner.nextInt(); // заполняю массив M
        }

        System.out.println(Arrays.equals(M,N));

    }
}

package com.example.basicmodule.Test2Part1;

/*На вход подается число N — длина массива. Затем передается массив
        целых чисел (ai) из N элементов, отсортированный по возрастанию.
        Необходимо создать массив, полученный из исходного массива возведением в квадрат
        каждого элемента, упорядочить элементы по возрастанию и вывести их на
        экран.*/

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] N = new int[n]; // устанавливаю длину массива N

        for (int i = 0; i < N.length; i++) {
            N[i] = scanner.nextInt(); // заполняю массив
        }

        double [] massive = new double [N.length];

        for (int i = 0; i < massive.length ; i++) {
                massive [i] = Math.pow (N [i], 2)  ;
            }

        Arrays.sort(massive);
//        for (int i = 0; i < massive.length; i++)
//            System.out.print((int)(massive[i]) + " ");
        for (double v : massive) System.out.print((int) v + " ");

    }
}
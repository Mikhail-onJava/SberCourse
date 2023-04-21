package com.example.basicmodule.Test2Part1;

/*На вход подается число N — длина массива. Затем передается массив
        целых чисел (ai) из N элементов. После этого передается число M — величина
        сдвига.
        Необходимо циклически сдвинуть элементы массива на M элементов вправо.*/

import java.util.Scanner;

public class Task5 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] N = new int[n]; // устанавливаю длину массива N

        for (int i = 0; i < N.length; i++) {
            N[i] = scanner.nextInt(); // заполняю массив
        }

        swapsTheElementsOfAnArray(N, 2);
//        for (int i = 0; i < N.length; i++) {
//            System.out.print(N[i] + " ");
//        }
        for (int j : N) {
            System.out.print(j + " ");
        }

    }

    public static void swapsTheElementsOfAnArray(int[] N, int position) {
        if (position > 0) {
            for (int i = 0; i < position; i++) {
                int n = N[N.length - 1];

                for (int j = N.length - 1; j > 0; j--) {
                    N[j] = N[j - 1];
                }
                N[0] = n;
            }
        }

    }
}









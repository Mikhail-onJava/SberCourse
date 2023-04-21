package com.example.basicmodule.Test2Part1;

/*На вход подается число N — длина массива. Затем передается массив
        целых чисел (ai) из N элементов. После этого передается число M.
        Необходимо найти в массиве число, максимально близкое к M (т.е. такое число,
        для которого |ai - M| минимальное). Если их несколько, то вывести
        максимальное число.*/

import java.util.Scanner;

import static java.lang.Math.abs;

public class Task8 {
    public static final Scanner scanner = new Scanner(System.in);

    public static int[] arr() {

        int n = scanner.nextInt();

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i += 1) {
            arr1[i] = scanner.nextInt();

        }

        return arr1;

    }

    public static int arrt() {
        int[] arr2 = arr();
        //   int nearest = -1;
        int M = scanner.nextInt();

        int nearest = -1;
        int N = Integer.MAX_VALUE;

        for (int i = 0; i < arr2.length; i++) {

            if (arr2[i] == M) {
                return arr2[i];
            } else {

                int d = abs(M - arr2[i]);
                if (d < N) {
                    nearest = arr2[i];
                }
            }
        }
        return nearest;
    }

    public static void main(String[] args) {


        System.out.print(arrt());

    }
}


package com.example.basicmodule.Test2Part2;

/*На вход передается N — количество столбцов в двумерном массиве и M —
        количество строк. Затем сам передается двумерный массив, состоящий из
        натуральных чисел.
        Необходимо сохранить в одномерном массиве и вывести на экран
        минимальный элемент каждой строки.*/

import java.util.Scanner;

public class Task1 {

    public static final Scanner scanner = new Scanner(System.in);
    public static final int n = scanner.nextInt(); //количество столбцов
    public static final int m = scanner.nextInt(); //количество строк

    public static void main(String[] args) {

        int[][] massive = getArray();
        getMinElement1(n,m,massive);

    }

    public static int[][] getArray() {


        int[][] k = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                k[i][j] = scanner.nextInt();
            }
        }
        return k;
    }

    private static void getMinElement1(int n, int m, int[][] massive) {

        for (int i = 0; i < massive.length; i++) {
            int min = massive[i][0];
            for (int j = 0; j < massive[i].length; j++) {
                if (min > massive[i][j]) {
                    min = massive[i][j];
                }
            }
            System.out.print(min+" ");
        }
    }
}


// вывод массива в консоль
//     void printMassive(int n, int m, int[][] k) {
//        for (int i = 0; i < Task1.n; i++) {
//            for (int j = 0; j < Task1.m; j++) {
//                System.out.print(k[i][j] + " ");
//            }
//            System.out.println();
//        }


//    int[][] matrix = new int[3][];

//        matrix[0] = new int[]{1, 2, 3, 4, 5, 6};
//        matrix[1] = new int[]{1, 2, 3};
//        matrix[2] = new int[]{1};
//        for (int i = 0; i < matrix.length; i++) {
//        for (int j = 0; j < matrix[i].length; j++)
//        System.out.print( matrix[i][j] + " " );
//        System.out.println();
//        }
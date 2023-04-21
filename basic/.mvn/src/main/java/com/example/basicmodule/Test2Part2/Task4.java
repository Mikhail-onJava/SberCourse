package com.example.basicmodule.Test2Part2;

/*На вход подается число N — количество строк и столбцов матрицы. Затем
        передается сама матрица, состоящая из натуральных чисел. После этого
        передается натуральное число P.
        Необходимо найти элемент P в матрице и удалить столбец и строку его
        содержащий (т.е. сохранить и вывести на экран массив меньшей размерности).
        Гарантируется, что искомый элемент единственный в массиве.*/

import java.util.Scanner;

public class Task4 {

    public static final Scanner scanner = new Scanner(System.in);
    public static final int n = scanner.nextInt(); //количество строк и столбцов

    public static void main(String[] args) {

        int[][] massive = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                massive[i][j] = scanner.nextInt();
            }
        }

        int P = scanner.nextInt();

        int x = 0; // [i] - индекс числа P
        int y = 0; // [j] - индекс числа P

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (massive[i][j] == P) {
                    x = i;
                    y = j;
                }
            }
        }

        //  int m = n - 1;
        int resultMassive[][] = new int[n][n];
        int a = 0, b = 0; // [i][j] - индекс для массива resultMassive
        for (int i = 0; i < n; i++) {
            if (x == i) continue;
            for (int j = 0; j < n; j++) {
                if (y == j) {
                    continue;
                } else {
                    resultMassive[a][b] = massive[i][j];
                    b++;
                }
            }
            a++;
            b = 0;
        }

        printArray(n, resultMassive);
    }

    private static void printArray(int n, int[][] massive) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (j != n - 2) {
                    System.out.print(massive[i][j] + " ");
                } else {
                    System.out.print(massive[i][j]);
                }
            }
            System.out.println();
        }
    }

}

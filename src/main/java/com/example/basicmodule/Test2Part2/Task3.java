package com.example.basicmodule.Test2Part2;

/*На вход подается число N — количество строк и столбцов матрицы. Затем
        передаются координаты X и Y расположения коня на шахматной доске.
        Необходимо заполнить матрицу размера NxN нулями, местоположение коня
        отметить символом K, а позиции, которые он может бить, символом X.*/

import java.util.Scanner;

public class Task3 {

    public static final Scanner scanner = new Scanner(System.in);
    public static final int n = scanner.nextInt(); //количество строк и столбцов

    public static void main(String[] args) {

        char[][] massive = new char[n][n];
        int x = scanner.nextInt(); // номер столбца
        int y = scanner.nextInt(); // номер строки

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                massive[i][j] = '0';
                massive[y][x] = 'K';
            }
            if ((y - 1 < n) && (x - 2 < n) && (y - 1 >= 0) && (x - 2 >= 0)) {
                massive[y - 1][x - 2] = 'X';
            }
            if ((y - 1 < n) && (x + 2 < n) && (y - 1 >= 0) && (x + 2 >= 0)) {
                massive[y - 1][x + 2] = 'X';
            }
            if ((y + 1 < n) && (x - 2 < n) && (y + 1 >= 0) && (x - 2 >= 0)) {
                massive[y + 1][x - 2] = 'X';
            }
            if ((y + 1 < n) && (x + 2 < n) && (y + 1 >= 0) && (x + 2 >= 0)) {
                massive[y + 1][x + 2] = 'X';
            }
            if ((y - 2 < n) && (x - 1 < n) && (y - 2 >= 0) && (x - 1 >= 0)) {
                massive[y - 2][x - 1] = 'X';
            }
            if ((y - 2 < n) && (x + 1 < n) && (y - 2 >= 0) && (x + 1 >= 0)) {
                massive[y - 2][x + 1] = 'X';
            }
            if ((y + 2 < n) && (x - 1 < n) && (y + 2 >= 0) && (x - 1 >= 0)) {
                massive[y + 2][x - 1] = 'X';
            }
            if ((y + 2 < n) && (x - 1 < n) && (y + 2 >= 0) && (x - 1 >= 0)) {
                massive[y + 2][x + 1] = 'X';
            }
        }

            printArray(n, massive);

        }

    private static void printArray(int n, char[][] massive) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j!=n-1) {
                    System.out.print(massive[i][j]+" ");
                }else{
                    System.out.print(massive[i][j]);
                }
            }
            System.out.println();
        }
    }
}




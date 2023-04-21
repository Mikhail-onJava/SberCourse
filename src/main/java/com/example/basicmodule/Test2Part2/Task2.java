package com.example.basicmodule.Test2Part2;

/*На вход подается число N — количество строк и столбцов матрицы. Затем в
        последующих двух строках подаются координаты X (номер столбца) и Y (номер
        строки) точек, которые задают прямоугольник.
        Необходимо отобразить прямоугольник с помощью символа 1 в матрице,
        заполненной нулями (см. пример) и вывести всю матрицу на экран.*/

import java.util.Scanner;

public class Task2 {

    public static final Scanner scanner = new Scanner(System.in);
    public static final int n = scanner.nextInt(); //количество строк и столбцов

    public static void main(String[] args) {

        int[][] massive = new int[n][n];
        int x1 = scanner.nextInt(); // номер столбца
        int y1 = scanner.nextInt(); // номер строки
        int x2 = scanner.nextInt(); // номер столбца
        int y2 = scanner.nextInt(); // номер строки

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (((i >= y1 && i <= y2)) && (j >= x1 && j <= x2)) {
                    massive[i][x1] = 1;
                    massive[i][x2] = 1;
                    massive[y1][j] = 1;
                    massive[y2][j] = 1;
                }
            }
        }

        printArray(n, massive);
    }

    private static void printArray(int n, int[][] massive) {

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






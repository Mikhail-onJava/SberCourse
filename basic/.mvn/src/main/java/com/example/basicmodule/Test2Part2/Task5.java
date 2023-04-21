package com.example.basicmodule.Test2Part2;

/*На вход подается число N — количество строк и столбцов матрицы.
        Затем передается сама матрица, состоящая из натуральных чисел.
        Необходимо вывести true, если она является симметричной относительно
        побочной диагонали, false иначе.
        Побочной диагональю называется диагональ, проходящая из верхнего правого
        угла в левый нижний.*/

import java.util.Scanner;

public class Task5 {

    public static final Scanner scanner = new Scanner(System.in);
    public static final int n = scanner.nextInt(); //количество строк и столбцов

    public static void main(String[] args) {

        int[][] massive = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                massive[i][j] = scanner.nextInt();
            }
        }
        boolean isSymmetric = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (massive[i][j] != massive[n - 1 - j][n - 1 - i]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) break;
        }
        System.out.println(isSymmetric);
    }
}







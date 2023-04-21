package com.example.basicmodule.Test1Part3;

/*На вход подается:
         целое число n,
         целое число p
         целые числа a1, a2, … an
        Необходимо вычислить сумму всех чисел a1, a2, a3 … an которые строго
        больше p.*/

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        int p;
        int i;
        n = scanner.nextInt();
        p = scanner.nextInt();
        int[] massiv = new int[n];
        for (i = 0; i < n; i++) {
            massiv[i] = scanner.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }

        int sum = 0;
        for (int j = 0; j < massiv.length; j++) {
            if (massiv[j] > p) sum = sum + massiv[j];
        }
        System.out.println(sum);

    }


}
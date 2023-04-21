package com.example.basicmodule.Test2Part1;

/*На вход подается число N — длина массива. Затем передается массив
        строк из N элементов (разделение через перевод строки). Каждая строка
        содержит только строчные символы латинского алфавита.
        Необходимо найти и вывести дубликат на экран. Гарантируется что он есть и
        только один.*/

import java.util.Scanner;

public class Task9 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int n = scanner.nextInt();
        String[] arr1 = new String[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.next();
        }

        String[] arr2 = arr1;
        String answer;
        int count = 0;
        String An = null;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (i != j && arr1[i].equals(arr1[j])) {
                    An = arr1[i];
                   // break;
                }
                }
            }
        System.out.print(An);
        }

    }

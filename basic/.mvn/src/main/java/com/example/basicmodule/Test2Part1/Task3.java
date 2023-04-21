package com.example.basicmodule.Test2Part1;

/*На вход подается число N — длина массива. Затем передается массив
        целых чисел (ai) из N элементов, отсортированный по возрастанию. После этого
        вводится число X — элемент, который нужно добавить в массив, чтобы
        сортировка в массиве сохранилась.
        Необходимо вывести на экран индекс элемента массива, куда нужно добавить
        X. Если в массиве уже есть число равное X, то X нужно поставить после уже
        существующего.*/

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] N = new int[n]; // устанавливаю длину массива N

        for (int i = 0; i < N.length; i++) {
            N[i] = scanner.nextInt(); // заполняю массив N
        }

        int x = scanner.nextInt();
        int index = 0;
        for (int j = 0; j < n; j++) { // сравниваю значение эл. массива с числом x
            if (N[j] <= x) {
                index = j + 1;
            }
        }

        System.out.println(index);
    }
}


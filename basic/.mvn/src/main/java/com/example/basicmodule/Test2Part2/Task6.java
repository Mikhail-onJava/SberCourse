package com.example.basicmodule.Test2Part2;

/*Петя решил начать следить за своей фигурой. Но все существующие
        приложения для подсчета калорий ему не понравились и он решил написать
        свое. Петя хочет каждый день записывать сколько белков, жиров, углеводов и
        калорий он съел, а в конце недели приложение должно его уведомлять,
        вписался ли он в свою норму или нет.
        На вход подаются числа A — недельная норма белков, B — недельная норма
        жиров, C — недельная норма углеводов и K — недельная норма калорий.
        Затем передаются 7 строк, в которых в том же порядке указаны сколько было
        съедено Петей нутриентов в каждый день недели. Если за неделю в сумме по
        каждому нутриенту не превышена недельная норма, то вывести “Отлично”,
        иначе вывести “Нужно есть поменьше”.
        Ограничения:
        ● 0 < A, B, C < 2000
        ● 0 < ai, bi, ci < 2000
        ● 0 < K < 20000
        ● 0 < ki < 20000*/

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        int A, B, C, K;
        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        K = input.nextInt();
        int[][] nutrients = new int[7][4];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                nutrients[i][j] = input.nextInt();
            }
        }
        int[] sum = new int[4];
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 7; i++) {
                sum[j] += nutrients[i][j];
            }
        }
        if (sum[0] <= A && sum[1] <= B && sum[2] <= C && sum[3] <= K) {
            System.out.println("Отлично");
        } else {
            System.out.println("Нужно есть поменьше");
        }
    }
}
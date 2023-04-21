package com.example.basicmodule.Test2Part1;

/*Необходимо реализовать игру. Алгоритм игры должен быть записан в
        отдельном методе. В методе main должен быть только вызов метода с
        алгоритмом игры.
        Условия следующие:
        Компьютер «загадывает» (с помощью генератора случайных чисел) целое
        число M в промежутке от 0 до 1000 включительно. Затем предлагает
        пользователю угадать это число. Пользователь вводит число с клавиатуры.
        Если пользователь угадал число M, то вывести на экран "Победа!". Если
        введенное пользователем число меньше M, то вывести на экран "Это число
        меньше загаданного." Если введенное число больше, то вывести "Это число
        больше загаданного." Продолжать игру до тех пор, пока число не будет отгадано
        или пока не будет введено любое отрицательное число.*/

import java.util.Random;
import java.util.Scanner;

public class Task10 {

    public static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println(game());
    }

    public static String game() {

        int M = getRandomNumberFrom(0, 1000);
        int userNumber;
        System.out.println(M);
        String result = "";

        do {

            System.out.println(" Угадайте число: ");
            userNumber = getUserNumber();


            if (userNumber == M) {
                result = "Победа!";
                break;
            } else if (userNumber < 0) {
                break;
            } else if (userNumber < M) {
                System.out.println("Это число меньше заданного");
            } else {
                System.out.println("Это число больше заданного");
            }
        }
        while (userNumber > 0);
        return result;
    }


    public static int getRandomNumberFrom(int min, int max) {
        Random rand = new Random();
        return min + rand.nextInt((max - min + 1));
    }

    public static int getUserNumber() {
        return scanner.nextInt();
    }
}



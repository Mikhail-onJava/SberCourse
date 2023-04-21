package com.example.basicmodule.Test2Part1;

/*Создать программу генерирующую пароль.
        На вход подается число N — длина желаемого пароля. Необходимо проверить,
        что N >= 8, иначе вывести на экран "Пароль с N количеством символов
        небезопасен" (подставить вместо N число) и предложить пользователю еще раз
        ввести число N.
        Если N >= 8 то сгенерировать пароль, удовлетворяющий условиям ниже и
        вывести его на экран. В пароле должны быть:
        ● заглавные латинские символы
        ● строчные латинские символы
        ● числа
        ● специальные знаки(_*-)*/

import java.util.Random;
import java.util.Scanner;


public class Dop1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 8) {
            count = scanner.nextInt();

            if (count >= 8)

                break;
            else
                System.out.println("Пароль из " + count + " символов небезопасен!");
            // System.out.println();
            System.out.println("Введите минимум 8 символов!");
        }

        String password = generate(count);

        System.out.println(password);
    }

    public static String generate(int count) {
        String pattern1 = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String pattern2 = pattern1.toLowerCase();
        String pattern3 = "_*-";
        String pattern4 = "0123456789";
        String collection = pattern1 + pattern2 + pattern3 + pattern4;

        StringBuilder password;
        Random rnd = new Random();
        String regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[\\-_*]).{" + count + "}";

        do {
            password = new StringBuilder();
            for (int i = 0; i < count; i++) {
                int index = rnd.nextInt(collection.length());
                char ch = collection.charAt(index);
                password.append(ch);
            }
        } while (!password.toString().matches(regexp));

        return password.toString();
    }
}
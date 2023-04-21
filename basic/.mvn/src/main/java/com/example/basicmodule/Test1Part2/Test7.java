package com.example.basicmodule.Test1Part2;

/*Петя недавно изучил строки в Java и решил попрактиковаться с ними.
        Ему хочется уметь разделять строку по первому пробелу. Для этого он может
        воспользоваться методами indexOf() и substring().
        На вход подается строка. Нужно вывести две строки, полученные из входной
        разделением по первому пробелу. */

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        int k = message.indexOf(' ', 1);

        String first = message.substring(0, k);
        String second = message.substring(k + 1);
        System.out.println(first + '\n' + second);

    }
}








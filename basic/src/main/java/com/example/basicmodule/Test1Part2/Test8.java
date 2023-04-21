package com.example.basicmodule.Test1Part2;

/*Раз так легко получается разделять по первому пробелу, Петя решил
        немного изменить предыдущую программу и теперь разделять строку по
        последнему пробелу.
        Ограничения:
        В строке гарантированно есть хотя бы один пробел
        Первый и последний символ строки гарантированно не пробел
        2 < s.length() < 100*/

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);

        String message = input.nextLine();

        k = message.lastIndexOf(' ');
        String first = message.substring(0, k);
        String second = message.substring(k + 1);
        System.out.println(first + '\n' + second);
    }
}







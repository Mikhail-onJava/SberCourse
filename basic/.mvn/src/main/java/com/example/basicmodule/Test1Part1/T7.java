package com.example.basicmodule.Test1Part1;

/*На вход подается двузначное число n. Выведите число, полученное
        перестановкой цифр в исходном числе n. Если после перестановки получается
        ведущий 0, его также надо вывести.*/

import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
        int n, t1, t2;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        t1 = n % 10;
        t2 = n / 10;
        System.out.print(t1 + "" + t2);

    }
}


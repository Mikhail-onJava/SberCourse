package com.example.basicmodule.Test1Part1;

/*На вход подается количество километров count. Переведите километры в мили
        (1 миля = 1,60934 км) и выведите количество миль.*/

import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        double count, mile;

        Scanner input = new Scanner(System.in);
        count = input.nextDouble();
        mile = count / 1.60934;

        System.out.print(mile);

    }
}


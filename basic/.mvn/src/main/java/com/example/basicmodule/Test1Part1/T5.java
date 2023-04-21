package com.example.basicmodule.Test1Part1;

/*Переведите дюймы в сантиметры (1 дюйм = 2,54 сантиметров). На вход
        подается количество дюймов, выведите количество сантиметров.*/

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        double inches, centimeters;

        Scanner input = new Scanner(System.in);
        inches = input.nextDouble();
        centimeters = inches * 2.54;

        System.out.print(centimeters);

    }
}


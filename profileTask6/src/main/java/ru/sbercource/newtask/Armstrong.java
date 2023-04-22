package ru.sbercource.newtask;

import java.util.Scanner;

//   Напишите программу для проверки, является ли введение число - числом Армстронга
//   Число Армстронга — натуральное число, которое в данной системе счисления равно сумме
//   своих цифр, возведенных в степень, равную количеству его цифр. Иногда, чтобы считать
//   число таковым, достаточно, чтобы степени, в которые возводятся цифры, были равны m.
//   Например, десятичное число
//    153— число Армстронга, потому что
//    1^3 + 5^3 + 3^3 = 153.
public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        Armstrong ob = new Armstrong();
        System.out.println( number + " : " + ob.isArmstrong(number));
    }
    public int digitsOfTheNumber(int number) {
        int n = 0;
        while (number != 0) {
            n++;
            number = number / 10;
        }
        return n;
    }
    boolean isArmstrong(int number) {
        int degree = digitsOfTheNumber(number);
        int n = number;
        int sum = 0;
        while (n != 0) {
            int p = n % 10;
            sum += Math.pow(p, degree);
            n = n / 10;
        }
        return (sum == number);
    }
}





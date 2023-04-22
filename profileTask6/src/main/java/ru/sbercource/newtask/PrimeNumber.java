package ru.sbercource.newtask;

import java.util.Scanner;
import java.util.stream.IntStream;

// Напишите программы, чтобы узнать, является ли введенное число простым или нет.
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        PrimeNumber ob = new PrimeNumber();
        System.out.println( number + " : " + ob.isPrimeNumber(number));

    }

    public boolean isPrimeNumber(int number) {
        return number > 1
               && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                       .noneMatch(n -> (number % n == 0));
    }
}

//    public boolean isPrime(int number) {
//        BigInteger bigInt = BigInteger.valueOf(number);
//        return bigInt.isProbablePrime(100);
//    }
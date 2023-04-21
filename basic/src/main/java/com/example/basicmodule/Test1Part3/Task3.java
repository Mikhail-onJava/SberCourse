package com.example.basicmodule.Test1Part3;

/*На вход подается два положительных числа m и n. Необходимо вычислить m^1
        + m^2 + ... + m^n
        Ограничения:
        0 < m, n < 10*/

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m, n;
        double sum = 0;

        m = scan.nextInt();
        n = scan.nextInt();

        // sum = m^1+m^2+m^n;
        for (int i = 1; i <= n; i++) {
            //   if (i % x == 0) {
            sum = Math.pow(m, i) + sum;

        }
        System.out.println((int) sum);
    }

}

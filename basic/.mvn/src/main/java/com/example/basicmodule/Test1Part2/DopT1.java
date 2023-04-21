package com.example.basicmodule.Test1Part2;

import java.util.Scanner;

public class DopT1 {

// пароль должен состоять из хотя бы 8 символов
/*в пароле должны быть:
 заглавные буквы
строчные символы
 числа
 специальные знаки(_*-)
 Если пароль прошел проверку, то программа должна вывести в консоль строку пароль
надежный, иначе строку: пароль не прошел проверку */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи пароль :");
        String password = scanner.nextLine();

        boolean passLength = false;
        boolean passLower = false;
        boolean passUpper = false;
        boolean passNumber = false;
        boolean passSymbol = false;

        if (password.length() < 8) {
            System.out.println("Пароль должен содержать более 8 символов");
        } else {
            passLength = true;
        }
        if ((password.equals(password.toLowerCase()))) {
            System.out.println("Пароль должен содержать заглавные буквы");
        } else {
            passLower = true;
        }
        if (password.equals(password.toUpperCase())) {
            System.out.println("Пароль должен содержать строчные буквы");
        } else {
            passUpper = true;
        }
        if (!password.matches(".*\\d+.*")) {
            System.out.println("Пароль должен содержать числа");
        } else {
            passNumber = true;
        }
        if (!password.matches("(^.*[_*-].*$)")) {
            System.out.println("Пароль должен содержать специальные знаки (_*-) ");
        } else {
            passSymbol = true;
        }

        if (passLength && passLower && passUpper && passNumber && passSymbol) {
            System.out.println("пароль надёжный");
        } else {
            System.out.println("пароль не прошёл проверку");
        }


    }
}




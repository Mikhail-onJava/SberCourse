package com.example.basicmodule.Test2Part1;

/*На вход подается строка S, состоящая только из русских заглавных
        букв (без Ё).
        Необходимо реализовать метод, который кодирует переданную строку с
        помощью азбуки Морзе и затем вывести результат на экран. Отделять коды букв
        нужно пробелом.*/

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        char[] rus = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С',
                'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};

        String[] morse = {".-", "-...", ".--", "--.", "-..", ".", "...-", "--..", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", ".-.",
                "...", "-", "..-", "..-.", "....", "-.-.", "---.", "----", "--.-", "--.--", "-.--", "-..-", "..-..", "..--", ".-.-"};


        char[] morseCod = word.toCharArray(); // перевод текста в последовательность символов
        String[] answer = new String[morseCod.length]; // создание нового массива размерностью   char[] morseCod

        for (int i = 0; i < morseCod.length; i++) {
            for (int j = 0; j < rus.length; j++) {
                if (rus[j] == morseCod[i])
                    answer[i] = morse[j] + " ";
            }
        }
//        for (int i = 0; i < answer.length; i++)
//            System.out.print(answer[i]);
        for (String s : answer) System.out.print(s);
    }
}


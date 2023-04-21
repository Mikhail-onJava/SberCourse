package com.example.basicmodule.Test1Part2;

/*На следующий день на работе Петю и его коллег попросили заполнить
        анкету. Один из вопросов был про уровень владения английского. Петя и его
        коллеги примерно представляют, сколько они знают иностранных слов. Также у
        них есть табличка перевода количества слов в уровень владения английском
        языком. Было бы здорово автоматизировать этот перевод!
        На вход подается положительное целое число count - количество выученных
        иностранных слов. Нужно вывести какому уровню соответствует это количество.*/

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        int count;
        Scanner input = new Scanner(System.in);

        count = input.nextInt();

        if (count < 500) {
            System.out.println("beginner");
            // else if (count >= 500 && count < 1500)
        } else if (count < 1500) {
            System.out.println("pre-intermediate");
            //else if (count >= 1500 && count < 2500)
        } else if (count < 2500) {
            System.out.println("intermediate");
            //else if (count >= 2500 && count < 3500)
        } else if (count < 3500) {
            System.out.println("upper-intermediate");
        } else {
            System.out.println("fluent");
        }
    }
}









package com.example.basicmodule.Test1Part3;

/*Напечатать таблицу умножения от 1 до 9. Входных данных нет. Многоточие в
        примере ниже подразумевает вывод таблицы умножения и для остальных чисел
        2, 3 и т. д.*/
public class Task1 {


    private static int multi(int i, int j) {
        return j * i;
    }

    public static void main(String[] args) {


        for (int i = 1; i < 10; i++) {
            String s = "";
            for (int j = 1; j < 10; j++) {
                //  s.append(i).append(" x ").append(j).append(" = ").append(multi(i, j)).append("\n");
                // for (int j = 1; j < 10; j++) s += (i + " x " + j + " = " + multi(i, j) + "\n");
                s += (i + " x " + j + " = " + multi(i, j) + "\n");

            }
            System.out.print(s); // Выводит таблицу
        }
    }
}

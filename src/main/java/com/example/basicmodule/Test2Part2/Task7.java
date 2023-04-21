package com.example.basicmodule.Test2Part2;

/*Раз в год Петя проводит конкурс красоты для собак. К сожалению, система
        хранения участников и оценок неудобная, а победителя определить надо. В
        первой таблице в системе хранятся имена хозяев, во второй - клички животных,
        в третьей — оценки трех судей за выступление каждой собаки. Таблицы
        связаны между собой только по индексу. То есть хозяин i-ой собаки указан в i-ой
        строке первой таблицы, а ее оценки — в i-ой строке третьей таблицы. Нужно
        помочь Пете определить топ 3 победителей конкурса.
        На вход подается число N — количество участников конкурса. Затем в N
        строках переданы имена хозяев. После этого в N строках переданы клички
        собак. Затем передается матрица с N строк, 3 вещественных числа в каждой —
        оценки судей. Победителями являются три участника, набравшие
        максимальное среднее арифметическое по оценкам 3 судей. Необходимо
        вывести трех победителей в формате “Имя хозяина: кличка, средняя оценка”.
        Гарантируется, что среднее арифметическое для всех участников будет
        различным.*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task7 {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int N = scanner.nextInt();

        String[] player = new String[N];
        for (int i = 0; i < N; i++) {
            player[i] = scanner.next();
        }
        String[] dogNames = new String[N];
        for (int i = 0; i < N; i++) {
            dogNames[i] = scanner.next();
        }
        int sum;
        String[] averageScore = new String[N];
        double[][] score = new double[N][3];
        for (int i = 0; i < N; i++) {
            sum = 0;
            for (int j = 0; j < 3; j++) {
                score[i][j] = scanner.nextInt();
                sum += score[i][j];
            }
            averageScore[i] =Math.floor((sum / 3.0) * 10) / 10.0 + "";
        }

        final String[][] finalArray = new String[N][2];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                finalArray[i][0] = player[i] + ": " + dogNames[i] + ", ";
                finalArray[i][1] = averageScore[i];
            }
        }
        Arrays.sort(finalArray, new Comparator<String[]>() {
            @Override
            public int compare(final String[] entry1, final String[] entry2) {
                final String time1 = entry1[1];
                final String time2 = entry2[1];
                return time1.compareTo(time2);
            }
        });
        for (int i = N - 1; i >= 1; i--) {
            System.out.println(finalArray[i][0] + finalArray[i][1]);
        }


    }
}




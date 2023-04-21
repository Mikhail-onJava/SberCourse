package com.example.basicmodule.Test1Part1;

/*На вход подается количество секунд, прошедших с начала текущего дня – count.
        Выведите в консоль текущее время в формате: часы и минуты.*/

import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        final long SECONDS_PER_MINUTE = 60, MINUTES_PER_HOUR = 60, HOURS_PER_DAY = 24;
        long count, totalMinutes, totalHours, currentMinute, currentHour;
        Scanner input = new Scanner(System.in);
        count = input.nextLong();
        totalMinutes = count / SECONDS_PER_MINUTE;
        totalHours = totalMinutes / MINUTES_PER_HOUR;
        currentMinute = totalMinutes % MINUTES_PER_HOUR;
        currentHour = totalHours % HOURS_PER_DAY;

        System.out.print(currentHour + " " + currentMinute);

    }
}


package ProfModulTest1;


import java.util.Arrays;
import java.util.Scanner;

public class Dop1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] massive = new int[n];

        for (int i = 0; i < massive.length; i++) {
            massive[i] = scanner.nextInt(); // заполняю массив
        }
        Arrays.sort(massive);
        System.out.print(massive[massive.length - 1] + " ");
        System.out.print(massive[massive.length - 2] + " ");
    }
}


// for (int i = massive.length - 2; i < massive.length; i++) {
//        System.out.print(massive[massive.length-1]);
//        }
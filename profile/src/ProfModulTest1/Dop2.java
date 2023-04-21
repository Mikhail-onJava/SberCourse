package ProfModulTest1;

import java.util.Arrays;
import java.util.Scanner;

public class Dop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i += 1) {
            arr[i] = scanner.nextInt();
        }
        int p = scanner.nextInt();
        int index;
        index = Arrays.binarySearch(arr, p);
        if (index < 0) {
            index = -1;
        }
        System.out.println(index);
    }
}


//   for (int i = 0; i < arr.length; i++) {
//        if (arr[i] == p) {
//           index = i;
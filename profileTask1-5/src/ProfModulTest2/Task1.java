package ProfModulTest2;

import java.util.ArrayList;
import java.util.HashSet;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(4);
        System.out.println(conversion(numbers));
    }

    public static <T> HashSet<T> conversion(ArrayList<T> st) {
        return new HashSet(st);
    }
}



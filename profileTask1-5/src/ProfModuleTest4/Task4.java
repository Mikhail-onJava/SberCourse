package ProfModuleTest4;

import java.util.Comparator;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Double> list = List.of(5.64, 34343.4, 334.3, 90000.9);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}

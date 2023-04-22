package ProfModulTest4;

import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<String> list = List.of("abc", "def", "qqq");
        String newList = list.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(newList);
    }
}

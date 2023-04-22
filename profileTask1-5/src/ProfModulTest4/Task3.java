package ProfModulTest4;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> list = List.of("abc", "", "", "def", "qqq");
        System.out.println(list.stream().filter(w -> !w.isEmpty()).count());
    }
}
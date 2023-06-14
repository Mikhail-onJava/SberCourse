package ProfModuleTest4;

import static java.util.stream.IntStream.rangeClosed;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(rangeClosed(1, 100).filter(num -> 0 == num % 2).sum());
    }
}


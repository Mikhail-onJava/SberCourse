package stream.task2;

import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    System.out.println(fact(5));
  }

  public static int fact(int n) {
    return IntStream
        .rangeClosed(1, n)  // от 1 до n включительно
        .reduce(1, (int x, int y) -> {
          System.out.println(x + " " + y);
          return x * y;
        });
//        .range(1, n) // от 1 до n не включительно
  }
}

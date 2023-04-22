package stream.task1;

import functional.task2.Square;
import java.util.ArrayList;
import java.util.List;

/*
Использовать реализованный функциональный интерфейс Square на массиве чисел, вывести на экран
 */
public class Main {

  public static void main(String[] args) {
    Square s = (int x) -> x*x;
    List<Integer> nums = new ArrayList<>();
    nums.add(2);
    nums.add(3);
    nums.add(4);
    nums.add(5);

    nums.stream()
//        .map(s::calculate)
        .map(i -> s.calculate(i))
        .forEach(System.out::println);
  }
}

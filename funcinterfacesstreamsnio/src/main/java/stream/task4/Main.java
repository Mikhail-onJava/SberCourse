package stream.task4;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Вывести количество повторений каждой строки и саму строку
 */
public class Main {

  public static void main(String[] args) {
    List<String> names = List.of("Sam", "James", "Elena", "James", "Joe", "Sam", "James");
    Set<String> unique = new HashSet<>(names);
    for (String string : unique) {
      System.out.println(string + ": " + Collections.frequency(names, string));
    }

    Map<String, Long> frequencyMap = names.stream()
        //Метод Collectors.counting применяется в Collectors.groupingBy()
        //для вычисления количества элементов в каждой группе
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    System.out.println(frequencyMap);

    Map<String, Integer> count = names.parallelStream()
        .collect(Collectors.toConcurrentMap(w-> w, w->1, Integer::sum));

    System.out.println(count);
  }
//  NIO New input output
}

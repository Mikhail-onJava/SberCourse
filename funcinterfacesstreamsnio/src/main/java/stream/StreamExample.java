package stream;

import java.sql.ResultSet;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class StreamExample {

  public static void main(String[] args) {
    List<String> myPlaces = List.of("Nepal, Kathmandu", "Nepal, Pokhara", "India, Delhi", "USA, New York", "Africa, Nigeria");

    Stream<String> stringStream = myPlaces.stream();
    stringStream.forEach(System.out::println);
    myPlaces.forEach(System.out::println);

    //фильтрация городов по названию страны с выводом на экран в верхнем регистре
    myPlaces.stream()
        .filter((p) -> p.startsWith("Nepal"))
        .map(String::toUpperCase)
        .sorted()
        .forEach(System.out::println);

    myPlaces.forEach(System.out::println);
  }
}

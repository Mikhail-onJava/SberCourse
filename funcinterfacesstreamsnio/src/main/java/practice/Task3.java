package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

//Задача 3
//Вычисление среднего возраста (age) и максимальной длины firstName (реализовать в разных методах)
public class Task3 {

  public static void main(String[] args) {
    List<SimpleClass> list = new ArrayList<>();
    list.add(new SimpleClass("test", "test", "t.test", "123", 12));
    list.add(new SimpleClass("2test", "2test", "2t.test", "test2222", 17));
    list.add(new SimpleClass("1test2222", "1test", "1t.test", "test", 17));
    System.out.println(getAverage(list));
    System.out.println(maxLengthFirstname(list));
  }

  public static Double getAverage(List<SimpleClass> list) {
    return list
        .stream()
        .mapToInt(SimpleClass::getAge)
        .summaryStatistics()
        .getAverage();
  }

  public static Integer maxLengthFirstname(List<SimpleClass> list) {
    return list
        .stream()
        .mapToInt(i -> i.getFirstName().length())
        .summaryStatistics()
        .getMax();
  }
}

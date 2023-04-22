package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//User старше 10 лет, у которых первый символ firstName не равен T.
public class Task4 {

  public static void main(String[] args) {
    List<SimpleClass> list = new ArrayList<>();
    list.add(new SimpleClass("test", "test", "t.test", "123", 12));
    list.add(new SimpleClass("2test", "2test", "2t.test", "test2222", 17));
    list.add(new SimpleClass("1test2222", "1test", "1t.test", "test", 17));
    System.out.println(example(list, 't'));

  }

  public static List<SimpleClass> example(List<SimpleClass> list, Character character) {
    return list.stream()
        .filter(x -> !x.getFirstName().startsWith(String.valueOf(character)) &&
            x.getAge() > 10)
        .collect(Collectors.toList());
  }

}

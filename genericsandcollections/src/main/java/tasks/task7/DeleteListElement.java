package tasks.task7;

import java.util.ArrayList;
import java.util.List;

/*
Удалить элемент из списка, если он нечетный.

Про итератор:
https://metanit.com/java/tutorial/5.10.php

 */
public class DeleteListElement {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    //Будет ошибка - ConcurrentModificationException
//        for (Integer elem : list) {
//            if (elem % 2 != 0) {
//                list.remove(elem);
//            }
//        }

    // 1 способ
        list.removeIf(integer -> integer % 2 != 0);
    // 2 способ - создать копию списка и работать с ним
    // 3 способ - iterator
    //Одним из ключевых методов интерфейса Collection является метод Iterator<E> iterator().
    //Он возвращает итератор - то есть объект, реализующий интерфейс Iterator.
//    Iterator<Integer> iterator = list.iterator();
//    while (iterator.hasNext()) {
//      int element = iterator.next();
//      if (element % 2 != 0) {
//        iterator.remove();
//      }
//    }

    //4 способ
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                list.remove(list.get(i));
            }
        }
    list.forEach(System.out::println);
  }

}

package stream.task3;

import java.util.ArrayList;
import java.util.List;

/*
Проверить, является ли текст палиндром.
Из исходной строки с помощью стримов убрать все символы,
не являющиеся цифрой или буквой, привести к нижнему регистру.
 */
public class Main {

  public static void main(String[] args) {
    System.out.println("is palindrome: " + isPalindrome("aB12-21ba"));
  }

  public static boolean isPalindrome(String s) {
    StringBuilder leftToRight = new StringBuilder();
    List<String> list = new ArrayList<>();
    s.chars()
        .filter(Character::isLetterOrDigit)
        .map(Character::toLowerCase)
        .forEach(leftToRight::appendCodePoint);

    System.out.println(leftToRight);
    StringBuilder rightToLeft = new StringBuilder(leftToRight).reverse();
    System.out.println(rightToLeft);
    return leftToRight.toString().equals(rightToLeft.toString());
  }
}

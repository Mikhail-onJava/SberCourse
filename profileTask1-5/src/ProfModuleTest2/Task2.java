package ProfModuleTest2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String theFirstWord = scanner.next();
        String theSecondWord = scanner.next();
        System.out.println(isAnagram(theFirstWord, theSecondWord));
    }

    public static boolean isAnagram(String theFirstWord, String theSecondWord) throws Exception {
        if (theFirstWord.equalsIgnoreCase(theSecondWord)) {
            throw new Exception("введённые слова идентичны, проверка отменяется");
        }
        if (theFirstWord.length() != theSecondWord.length()) {
            return false;
        }
        char[] c1 = theFirstWord.toCharArray();
        char[] c2 = theSecondWord.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String sc1 = new String(c1);
        String sc2 = new String(c2);
        return sc1.equalsIgnoreCase(sc2);
    }
}


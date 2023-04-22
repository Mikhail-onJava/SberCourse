package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/*
Прочитать и вывести содержимое файла с помощью NIO и streams()
 */
public class Task6 {

  public static void main(String[] args) {
    Path path = Paths.get("src/test.txt");
    try {
      List<String> contents = Files.readAllLines(path);
      contents.forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

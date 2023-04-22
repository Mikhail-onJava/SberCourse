package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
Записать строку в файл:
 */
public class Task7 {

  public static void main(String[] args) {
    Path path = Paths.get("src/testToWrite.txt");
    try {
      Files.writeString(path, "test string");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

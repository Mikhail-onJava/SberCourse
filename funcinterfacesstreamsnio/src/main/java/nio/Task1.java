package nio;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/*
Работа с файловой системой
Создать файл в src/ с названием test.txt
 */
public class Task1 {

  public static void main(String[] args) {
    Path path = Path.of("src/test.txt");

    try {
      Path createdFilePath = Files.createFile(path);
      System.out.println(createdFilePath);
      System.out.println(createdFilePath.getParent());
      System.out.println(createdFilePath.getFileSystem());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

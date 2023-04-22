package practice;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//  Получить список всех файлов и папок в папке
public class Task5 {

  public static void main(String[] args) {
    Path path = Path.of("src/main/java");

    try(DirectoryStream<Path> files = Files.newDirectoryStream(path)) {
      files.forEach(i -> {
        System.out.println(i.getFileName());
      });
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

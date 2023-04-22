package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/*
Копировать файл с контентом
 */
public class Task3 {

  public static void main(String[] args) {
    Path sourcePath = Paths.get("src/test.txt");
    Path targetPath = Paths.get("src/test1.txt");

    try {
      Path path = Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
      System.out.println("Target: " + targetPath);
      System.out.println("Content: " + new String(Files.readAllBytes(path)));
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}

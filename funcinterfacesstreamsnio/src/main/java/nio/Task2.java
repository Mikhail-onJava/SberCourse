package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
Создать папку и подпаку в src/
 */
public class Task2 {

  public static void main(String[] args) {
    Path path1 = Paths.get("src/newFolder");
//    Path path2 = Paths.get("src/newFolder/newSubFolder");

    try {
      Files.createDirectory(path1);
      Files.createDirectory(Paths.get("src/newFolder/newSubFolder"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}

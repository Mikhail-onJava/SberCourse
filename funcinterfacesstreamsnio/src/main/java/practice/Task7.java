package practice;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Удалить все файлы которые были созданы больше недели назад
public class Task7 {

  public static void main(String[] args) {
    int week = 1000 * 60 * 60 * 24 * 7;
    Path dir = Path.of("src/main/java/test");
    List<Path> paths = getAllFilesAndDirs(dir);

    paths.forEach(i -> {
//      Files.getAttribute(i, "creationTime");
      try {
        BasicFileAttributes attr = Files.readAttributes(i, BasicFileAttributes.class);
        if(attr.creationTime().toMillis() < (new Date().getTime())) {
          Files.delete(i);
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    });
  }

  public static List<Path> getAllFilesAndDirs(Path path) {
    List<Path> paths = new ArrayList<>();
    try(DirectoryStream<Path> files = Files.newDirectoryStream(path)) {
      files.forEach(paths::add);
    } catch (IOException e) {
      e.printStackTrace();
    }

    return paths;
  }

}

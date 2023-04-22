package practice;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

//Удалить все папки и файлы в которых присутствует [deleted]
public class Task6 {

  public static void main(String[] args) {
    deleteFiles(Path.of("src/main/java/practice"));
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

  public static void deleteFiles(Path path) {
    List<Path> paths = getAllFilesAndDirs(path);
    paths.forEach(i -> {
      if(i.getFileName().toString().contains("[deleted]")) {
        try {
          Files.delete(i);
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    });
  }

}

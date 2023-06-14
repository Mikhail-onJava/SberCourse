package main.tasks.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// Необходимо унаследоваться от базового класса требуемого типа исключений (например от Exception или RuntimeException).
public class MyBaseException extends RuntimeException {
  private static final String PKG_DIRECTORY = "/Users/79137/IdeaProjects/sberCourse/exception/src/main/java/tasks/exceptions";
  private static final String OUTPUT_FILE_NAME = "output.txt";
  public MyBaseException(String errorMessage) {
    super(errorMessage);
    try (Writer wr = new FileWriter(PKG_DIRECTORY + "/" + OUTPUT_FILE_NAME)) {
      wr.write("Hello!");
    } catch (IOException e) {
      System.out.println("LOG: " + e.getMessage());
    }
    System.out.println("LOG: " + errorMessage);
  }

}

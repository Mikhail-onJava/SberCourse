package main.tasks;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileOutput {
  private static final String PKG_DIRECTORY = "/Users/79137/IdeaProjects/sberCourse/exception/src/main/java";
  private static final String OUTPUT_FILE_NAME = "output.txt";

  public static void main(String[] args) throws IOException {

//    Writer wr = new FileWriter(PKG_DIRECTORY + "/" + OUTPUT_FILE_NAME);
//    wr.write("Hello!");
//    wr.close();


    try (Writer wr = new FileWriter(PKG_DIRECTORY + "/" + OUTPUT_FILE_NAME)) {
      wr.write("Hello!");
    }
    catch (IOException e) {
      System.out.println("LOG: " + e.getMessage());
    }
  }

}

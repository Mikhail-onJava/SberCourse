package tasks;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileOutput {
  private static final String PKG_DIRECTORY = "/Users/andreigavrilov/Work/Projects/СберКурсыШкола/Java1/FirstPracticeWeek/src/week8/oop/secondpart/file";
  private static final String OUTPUT_FILE_NAME = "output.txt";

  public static void main(String[] args) {

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

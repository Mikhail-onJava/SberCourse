package main.tasks;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class FileReadWrite {
  private static final String PKG_DIRECTORY = "/Users/79137/IdeaProjects/sberCourse/exception/src/main";
  private static final String OUTPUT_FILE_NAME = "output.txt";
  private static final String INPUT_FILE_NAME = "input.txt";

  public static void main(String[] args) {
    try {
      readAndWrite();
    }
    catch (IOException e) {
      System.out.println("LOG: " + e.getMessage());
    }
  }
// throws прописывается в сигнатуре метода и указывает на то, что метод потенциально может выбросить исключение с указанным типом.
  public static void readAndWrite() throws IOException {
    Scanner scanner = new Scanner(new File(PKG_DIRECTORY + "/" + INPUT_FILE_NAME));
    Writer writer = new FileWriter(PKG_DIRECTORY + "/" + OUTPUT_FILE_NAME);

    try (scanner; writer) {
      //scanner = null; - так нельзя, переменная должна быть final/effectively final, чтобы закрыть ресурс.
      while (scanner.hasNext()) {
        writer.write(scanner.nextLine() + "\n");
      }
    }
  }

}

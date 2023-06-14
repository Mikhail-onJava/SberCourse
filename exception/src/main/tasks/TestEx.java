package main.tasks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestEx {
  public static void main(String[] args) throws IOException {
//    demoSuppressedException("test");
    demoAddSuppressedException("test");
  }


  public static void demoSuppressedException(String filePath) throws IOException {
    FileInputStream fileIn = null;
    try {
      fileIn = new FileInputStream(filePath);
    } catch (FileNotFoundException e) {
      throw new IOException(e);
    } finally {
      assert fileIn != null;
      fileIn.close();
    }
  }

  public static void demoAddSuppressedException(String filePath) throws IOException {
    Throwable firstException = null;
    FileInputStream fileIn = null;
    try {
      fileIn = new FileInputStream(filePath);
    } catch (IOException e) {
      firstException = e;
    } finally {
      try {
        fileIn.close();
      } catch (NullPointerException npe) {
        if (firstException != null) {
          npe.addSuppressed(firstException);
        }
        throw npe;
      }
    }
  }
}



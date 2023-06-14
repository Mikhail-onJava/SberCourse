package ProfModuleTest1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class ReadAndWrite {
    private static final String PKG_DIRECTORY = "/Users/79137/IdeaProjects/sberCourse/profileTask1-5/src/ProfModuleTest1";
    private static final String OUTPUT_FILE_NAME = "output.txt";
    private static final String INPUT_FILE_NAME = "input.txt";

    public static void main(String[] args) {
        try {
            readAndWrite();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readAndWrite() throws IOException {
        try (Scanner scanner = new Scanner(new File(PKG_DIRECTORY + "/" + INPUT_FILE_NAME));
             Writer writer = new FileWriter(PKG_DIRECTORY + "/" + OUTPUT_FILE_NAME)) {
            String MyText = scanner.nextLine();
            while (scanner.hasNextLine()) {
                MyText = MyText + "\n" + scanner.nextLine();
            }
            char[] chars = MyText.toCharArray();
            for (int i = 0; i <= chars.length - 1; i++) {
                if ('a' <= chars[i] && chars[i] <= 'z') {
                    chars[i] = Character.toUpperCase(chars[i]);
                }
            }
            String str = String.valueOf(chars);
            writer.write(str);
        }
    }
}


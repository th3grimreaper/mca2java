import java.io.*;
import java.util.Scanner;

import myPack.info;

public class thirtyseven {
  public static void main(String[] args) {
    info.intro();
    String sourcePath = "hiFile.txt";
    String destinationPath = "byeFile.txt";
    File inputFile = new File(sourcePath);
    File outputFile = new File(destinationPath);
    try (FileInputStream fis = new FileInputStream(inputFile);
        FileOutputStream fos = new FileOutputStream(outputFile)) {
      byte[] buffer = new byte[1024];
      int length;
      while ((length = fis.read(buffer)) > 0) {
        fos.write(buffer, 0, length);
      }
      System.out.println("File copied successfully.");
    } catch (IOException e) {
      System.out.println("An error occurred: " + e.getMessage());
    }
  }
}

import java.io.*;

import myPack.info;

public class thirtyeight {
  public static void main(String[] args) {
    info.intro();
    String filePath = "hiFile.txt";
    File file = new File(filePath);
    int charCount = 0;
    try (FileReader fr = new FileReader(file)) {
      int character;
      while ((character = fr.read()) != -1) {
        charCount++;
      }
      System.out.println("Number of characters in the file: " + charCount);
    } catch (IOException e) {
      System.out.println("An error occurred: " + e.getMessage());
    }
  }
}

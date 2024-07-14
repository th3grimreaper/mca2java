import myPack.info;

public class thirtytwo {
  public static void main(String[] args) {
    info.intro();
    String str = "Hello, World!";
    System.out.println("Original String: " + str);
    // Length of the string
    System.out.println("Length: " + str.length());
    // Character at a specific index
    System.out.println("Character at index 7: " + str.charAt(7));
    // Substring
    System.out.println("Substring (7, 12): " + str.substring(7, 12));
    // Replace
    String replacedStr = str.replace("World", "Java");
    System.out.println("Replaced String: " + replacedStr);
    System.out.println("Uppercase: " + str.toUpperCase());
    System.out.println("Lowercase: " + str.toLowerCase());
    // Check if string contains a sequence
    System.out.println("Contains 'Hello': " + str.contains("Hello"));
  }
}

import java.sql.Statement;

import myPack.info;

import java.sql.Connection;
import java.sql.DriverManager;

public class fortytwo {

  public static void main(String[] args) {
    info.intro();
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sai_praveen", "qw12");

      System.out.println("Connection established.");
      con.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

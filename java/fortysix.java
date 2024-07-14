import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import myPack.info;

public class fortysix {

  public static void main(String[] args) {
    info.intro();
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sai_praveen", "qw12");
      Statement smt = con.createStatement();
      ResultSet rs = smt.executeQuery("select * from employee");

      while (rs.next()) {
        int eno = rs.getInt(1);
        String ename = rs.getString(2);
        int eage = rs.getInt(3);
        String edept = rs.getString(4);

        System.out.println("Employee no.: " + eno);
        System.out.println("Employee name: " + ename);
        System.out.println("Employee age: " + eage);
        System.out.println("Employee dept: " + edept);
        System.out.println();
      }

      con.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

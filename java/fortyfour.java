import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class fortyfour {

  public static void main(String[] args) {
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sai_praveen", "qw12");

      Statement smt = con.createStatement();
      smt.executeUpdate("create table emp(emp_no number, ename varchar(50))");

      System.out.println("Table created successfully.");

      smt.executeUpdate("drop table emp");

      System.out.println("Table dropped.");
      con.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

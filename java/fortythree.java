import java.sql.Statement;

import myPack.info;

import java.sql.Connection;
import java.sql.DriverManager;

public class fortythree {

  public static void main(String[] args) {
    info.intro();
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sai_praveen", "qw12");

      Statement smt = con.createStatement();
      smt.executeUpdate("create table employee(emp_id number, emp_name varchar(50), age number, dept varchar(50))");

      System.out.println("Table created successfully.");
      con.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

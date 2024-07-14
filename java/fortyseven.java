import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import myPack.info;

public class fortyseven {

  public static void main(String[] args) {
    info.intro();
    // Database connection parameters
    String url = "jdbc:oracle:thin:@localhost:1521:xe"; // Example URL
    String user = "sai_praveen";
    String password = "qw12";

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
      // Load the Oracle JDBC driver
      Class.forName("oracle.jdbc.driver.OracleDriver");

      // Establish the connection
      conn = DriverManager.getConnection(url, user, password);

      // Create a Statement object
      stmt = conn.createStatement(
          ResultSet.TYPE_SCROLL_INSENSITIVE,
          ResultSet.CONCUR_UPDATABLE);

      // Execute a query to get a ResultSet
      String sql = "SELECT emp_id, emp_name, age, dept FROM employee WHERE emp_id = '23'";
      rs = stmt.executeQuery(sql);

      // Loop through the ResultSet and update rows
      while (rs.next()) {
        // For example, increase salary by 10%
        String currentName = rs.getString("emp_name");
        String newName = currentName + " praveen";

        // Update the salary in the ResultSet
        rs.updateString("emp_name", newName);

        // Commit the change to the database
        rs.updateRow();
      }

      // Commit the transaction
      conn.commit();
      System.out.println("Rows updated successfully.");

    } catch (SQLException | ClassNotFoundException e) {
      e.printStackTrace();
    } finally {
      // Close the resources
      try {
        if (rs != null)
          rs.close();
        if (stmt != null)
          stmt.close();
        if (conn != null)
          conn.close();
      } catch (SQLException ex) {
        ex.printStackTrace();
      }
    }
  }
}

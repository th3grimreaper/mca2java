import java.sql.*;

public class fortyeight {

  // JDBC URL, username, and password of Oracle database
  static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:XE"; // Change this URL according to your Oracle
                                                                        // instance
  static final String USERNAME = "sai_praveen";
  static final String PASSWORD = "qw12";

  public static void main(String[] args) {
    try (Connection conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
      // Query to be executed
      String query = "SELECT * FROM employee"; // Change this query according to your requirements

      // Create a statement
      Statement statement = conn.createStatement();

      // Execute the query
      ResultSet resultSet = statement.executeQuery(query);

      // Get metadata from the result set
      ResultSetMetaData metaData = resultSet.getMetaData();

      // Get DatabaseMetaData object
      DatabaseMetaData dbmetaData = conn.getMetaData();

      // Example of using DatabaseMetaData functions
      System.out.println("Database Product Name: " + dbmetaData.getDatabaseProductName());
      System.out.println("Database Product Version: " + dbmetaData.getDatabaseProductVersion());

      // Print metadata
      int columnCount = metaData.getColumnCount();
      System.out.println("Column Count: " + columnCount);
      for (int i = 1; i <= columnCount; i++) {
        System.out.println("Column " + i + " Name: " + metaData.getColumnName(i));
        System.out.println("Column " + i + " Type: " + metaData.getColumnTypeName(i));
        System.out.println("Column " + i + " Size: " + metaData.getColumnDisplaySize(i));
        // You can print more metadata information as per your requirement
      }

      // Close resources
      resultSet.close();
      statement.close();

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}

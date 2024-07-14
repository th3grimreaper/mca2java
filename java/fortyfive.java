import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class fortyfive {

  public static void main(String[] args) {
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sai_praveen", "qw12");

      String insertSQL = "insert into employee values (?,?,?,?)";
      PreparedStatement pst = con.prepareStatement(insertSQL);

      InputStreamReader in = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(in);
      while (true) {
        System.out.println("enter employee number: ");
        int emp_no = Integer.parseInt(br.readLine());
        System.out.println("enter employee name: ");
        String ename = br.readLine();
        System.out.println("enter employee age: ");
        int eage = Integer.parseInt(br.readLine());
        System.out.println("enter employee dept: ");
        String edept = br.readLine();

        pst.setInt(1, emp_no);
        pst.setString(2, ename);
        pst.setInt(3, eage);
        pst.setString(4, edept);

        int count = pst.executeUpdate();
        if (count > 0) {
          System.out.println(count + " record inserted.");
        } else {
          System.out.println("no record inserted.");
        }

        System.out.println("insert more records? (yes/no): ");
        String ch = br.readLine();
        if (ch.equalsIgnoreCase("no")) {
          break;
        }
      }

      con.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

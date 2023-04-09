import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Scanner sc1=new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/dab";
        String user = "root";
        String password = "admin";
        System.out.println("Enter Roll Number: ");
        int roll=sc1.nextInt();
        String query = "SELECT * FROM result where roll_no="+roll;
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            System.out.println(rs.getInt("roll_no") + "\t " + rs.getString("course_name") + "\t " +
                    rs.getInt("marks_obtained"));
        }
        rs.close();
        stmt.close();
        conn.close();
    }
}

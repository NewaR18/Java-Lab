import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Scanner sc1=new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/dab";
        String user = "root";
        String password = "admin";
        PreparedStatement ps=null;
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.print("Enter Id: ");
        int id=sc1.nextInt();
        String query2="Select* from salary where emp_id=? ";
        ps= conn.prepareStatement(query2);
        ps.setInt(1,id);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt("emp_id")+" "+rs.getString("emp_name")+" "+rs.getInt("emp_salary"));
        }
        ps.close();
        conn.close();
    }
}

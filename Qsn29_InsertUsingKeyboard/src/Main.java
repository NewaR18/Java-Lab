import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Scanner sc1=new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/dab";
        String user = "root";
        String password = "admin";
        System.out.print("enter id: ");
        int id=sc1.nextInt();
        System.out.print("enter name: ");
        String name=sc1.next();
        System.out.print("enter age: ");
        int age=sc1.nextInt();
        String query = "Insert into mytable values("+id+",'"+name+"',"+age+")";
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();
        int n = stmt.executeUpdate(query);
        if(n>0){
            System.out.println("Field inserted successfully");
        }
        stmt.close();
        conn.close();
        System.out.println("\nLab no: 29 \nName: Sudip Shrestha \nRoll No/Section: 20/A");
    }
}

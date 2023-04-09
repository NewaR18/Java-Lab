import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Scanner sc1=new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/dab";
        String user = "root";
        String password = "admin";
        char switch1='y';
        int id=0;
        int age=0;
        String name="";
        String address="";
        PreparedStatement ps=null;
        Connection conn = DriverManager.getConnection(url, user, password);
        do{
            System.out.print("Enter Id: ");
            id=sc1.nextInt();
            System.out.print("Enter name: ");
            name=sc1.next();
            System.out.print("Enter Age: ");
            age=sc1.nextInt();
            System.out.print("Enter Address: ");
            address=sc1.next();
            String query2="Insert into employee values (?,?,?,?)";
            ps= conn.prepareStatement(query2);
            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setInt(3,age);
            ps.setString(4,address);
            int n=ps.executeUpdate();
            if(n>0){
                System.out.println("Inserted Successfully \n");
            }
            System.out.println("Do you want to continue(y/n): ");
            switch1=sc1.next().charAt(0);
        }while(switch1=='y');
        ps.close();
        conn.close();
    }
}

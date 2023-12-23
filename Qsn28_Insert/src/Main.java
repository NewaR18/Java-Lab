import java.sql.*;
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/dab";
        String user = "root";
        String password = "admin";
        String query = "Insert into mytable values(97,'Manisg',22)";
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();
        int n = stmt.executeUpdate(query);
        if(n>0){
            System.out.println("Field inserted successfully");
        }
        stmt.close();
        conn.close();
        System.out.println("\nLab no: 28 \nName: Manish Thapa \nSection: B");
    }
}

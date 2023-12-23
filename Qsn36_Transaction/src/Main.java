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
        conn.setAutoCommit(false);
        Statement st =null;
        try {
            st = conn.createStatement();
            String query = "Insert into salary(11,'Bill',2000";
            st.executeUpdate(query);
            String query2 = "Insert into salary(11,'Nill','feel'";
            st.executeUpdate(query2);
            String query3 = "Insert into salary(14,'Hill',2000";
            st.executeUpdate(query3);
            conn.commit();
        }catch(Exception ex){
            conn.rollback();
            System.out.println("Transaction rollback completed");
        }
        st.close();
        conn.close();
    }
}
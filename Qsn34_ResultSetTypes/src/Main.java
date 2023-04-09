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
        Statement st=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs=st.executeQuery("Select* from mytable");
        rs.absolute(1);
        System.out.println(rs.getString("uname"));
        rs.moveToInsertRow();
        rs.updateInt("id",2);
        rs.updateString("uname","Patrick");
        rs.updateInt("age",28);
        rs.insertRow();
        rs.absolute(2);
        System.out.println(rs.getString("uname"));
        rs.updateString("uname","bahadur");
        rs.updateRow();
        Statement stmt = conn.createStatement();
        String query1 = "SELECT * FROM mytable";
        String query2 = "SELECT * FROM mytable2";
        boolean hasMoreResults = stmt.execute(query1);
        int resultSetCount = 0;
        while (hasMoreResults) {
            resultSetCount++;
            System.out.println("\nResult set: " + resultSetCount);
            ResultSet rs2 = stmt.getResultSet();
            while (rs2.next()) {
                System.out.println(rs2.getString(2));
            }

            hasMoreResults = stmt.getMoreResults();
        }
        boolean hasMoreResults1 = stmt.execute(query2);
        while (hasMoreResults1) {
            resultSetCount++;
            System.out.println("\nResult set: " + resultSetCount);
            ResultSet rs2 = stmt.getResultSet();
            while (rs2.next()) {
                System.out.println(rs2.getString(2));
            }

            hasMoreResults1 = stmt.getMoreResults();
        }
        stmt.close();
        rs.close();
        st.close();
        conn.close();
    }
}
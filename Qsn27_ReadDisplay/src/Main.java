import java.sql.*;
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/dab";
        String user = "root";
        String password = "admin";
        String query = "SELECT * FROM mytable";
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            System.out.println(rs.getInt("id") + "\t " + rs.getString("uname") + "\t " +
                    rs.getInt("age"));
        }
        rs.close();
        stmt.close();
        conn.close();
        System.out.println("\nLab no: 27 \nName: Sudip Shrestha \nRoll No/Section: 20/A");
    }
}

import java.sql.*;
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/dab";
        String user = "root";
        String password = "admin";
        Connection conn = DriverManager.getConnection(url, user, password);
        String query="Insert into employee values (?,?,?,?)";
        PreparedStatement ps= conn.prepareStatement(query);
        ps.setInt(1,79);
        ps.setString(2,"Bill Gates");
        ps.setInt(3,34);
        ps.setString(4,"US");
        int n=ps.executeUpdate();
        if(n>0){
            System.out.println("Inserted Successfully \n");
        }
        String query2="Select* from employee where empid=?";
        PreparedStatement ps2= conn.prepareStatement(query2);
        ps2.setInt(1,67);
        ResultSet rs=ps2.executeQuery();
        System.out.println("Displaying Data:");
        while(rs.next()){
            System.out.println(rs.getInt("empid")+" "+rs.getString("empnme")+" "+rs.getInt("empage")+" "+rs.getString("empaddress"));
        }
        System.out.println();
        String query3="Update Employee set empnme=?,empage=?,empaddress=? where empid=?";
        PreparedStatement ps3= conn.prepareStatement(query3);
        ps3.setInt(4,67);
        ps3.setString(1,"Bill Gates");
        ps3.setInt(2,49);
        ps3.setString(3,"Nepal");
        int n2=ps3.executeUpdate();
        if(n2>0){
            System.out.println("Updated Successfully \n");
        }
        String query4="Delete from employee where empid=?";
        PreparedStatement ps4= conn.prepareStatement(query4);
        ps4.setInt(1,67);
        int n3=ps4.executeUpdate();
        if(n3>0){
            System.out.println("Deleted Successfully \n");
        }
        ps.close();
        conn.close();
    }
}

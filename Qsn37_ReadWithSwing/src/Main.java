import javax.swing.*;
import java.awt.*;
import java.sql.*;
public class Main extends JFrame{
    JLabel l1=new JLabel("");
    public Main() {
        setTitle("Lab 37");
        setLayout(new FlowLayout(1));
        setSize(500, 500);
        add(l1);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        Main m1 = new Main();
        m1.my1();
    }
    public void my1(){
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/dab";
            String uname = "root";
            String pw = "admin";
            conn = DriverManager.getConnection(url, uname, pw);
            String query = "Select * from User1";
            st = conn.createStatement();
            rs = st.executeQuery(query);
            String st1="";
            while(rs.next()){
                st1+=(rs.getInt("id")+" "+rs.getString("Uname")+" "+rs.getString("Usubject")+"     ");
            }
            l1.setText(st1);
            st.close();
            conn.close();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
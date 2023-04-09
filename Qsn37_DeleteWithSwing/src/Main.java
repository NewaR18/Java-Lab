import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class Main extends JFrame implements ActionListener {
    JLabel l1 = new JLabel("Enter id you want to delete: ");
    JTextField t1 = new JTextField(10);
    JButton b1 = new JButton("Delete");
    JLabel l4=new JLabel("");
    public Main() {
        setTitle("Lab 37");
        setLayout(new FlowLayout(1));
        setSize(500, 500);
        add(l1);
        add(t1);
        add(b1);
        add(l4);
        b1.addActionListener(this);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Main();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/dab";
            String uname = "root";
            String pw = "admin";
            conn = DriverManager.getConnection(url, uname, pw);
            int id = Integer.parseInt(t1.getText());
            String query = "Delete from User1 where id="+id;
            st = conn.createStatement();
            int a = st.executeUpdate(query);
            if (a > 0) {
                l4.setText("Data with id "+id+" Deleted successfully");
            } else {
                System.out.println("Could not Delete, Sorry :(");
            }
            st.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }
}
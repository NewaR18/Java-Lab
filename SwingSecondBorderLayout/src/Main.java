import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    JButton b1=new JButton("sub1");
    JButton b2=new JButton("sub2");
    JButton b3=new JButton("sub3");
    JButton b4=new JButton("sub4");
    JButton b5=new JButton("sub5");
    Main(){
        setTitle("myprogram");
        setLayout(new BorderLayout());
        setSize(500,500);
        add(b1,BorderLayout.EAST);
        add(b2,BorderLayout.WEST);
        add(b3,BorderLayout.NORTH);
        add(b4,BorderLayout.SOUTH);
        add(b5,BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Main();
    }
}
package JFrame;
import java.awt.*;
import javax.swing.*;


public class Main extends JFrame {
    JLabel l1=new JLabel("First Number: ");
    JTextField t1=new JTextField(20);
    JLabel l2=new JLabel("Second Number: ");
    JTextField t2=new JTextField(20);
    JButton sub=new JButton("Submit");
    Main(){
        setTitle("Yoyo");
/*        setLayout(new FlowLayout(FlowLayout.TRAILING));*/

        //Swing Text Input
         setLayout();
        l1.setBounds(20,20,100,50);
        t1.setBounds(140,20,200,50);
        l2.setBounds(350,20,100,50);
       t2.setBounds(470,20,200,50);
        sub.setBounds(20,80,90,25);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(sub);
        setSize(700,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Main();
    }
}
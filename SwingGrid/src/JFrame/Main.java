package JFrame;
import javax.swing.*;
import java.awt.*;
public class Main extends JFrame {

    JButton sub1=new JButton("O");
    JButton sub2=new JButton("X");
    JButton sub3=new JButton("O");
    JButton sub4=new JButton("X");
    JButton sub5=new JButton("O");
    JButton sub6=new JButton("X");
    JButton sub7=new JButton("X");
    JButton sub8=new JButton("X");
    JButton sub9=new JButton("O");
    Main(){

        setTitle("Aalu Plus");
        setLayout(new GridLayout(3,3,1,1));

        add(sub1);
        add(sub2);
        add(sub3);
        add(sub4);
        add(sub5);
        add(sub6);
        add(sub7);
        add(sub8);
        add(sub9);
        setSize(700,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void Paint(Graphics g){
        g.drawLine(0,0,1000,1000);
    }
    public static void main(String[] args) {
        new Main();

    }
}
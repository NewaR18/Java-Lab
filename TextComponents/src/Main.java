import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    JTextField tf=new JTextField("Type here!! ",25);
    JPasswordField pw=new JPasswordField();
    JTextArea ta=new JTextArea("Type here!! ",25,50);
    JButton b=new JButton("Click here");
    JScrollPane sp=new JScrollPane(ta);
    Main(){
        setTitle("Text Components");
        setLayout(new GridLayout(5,1));
        setSize(500,500);
        add(tf);
        add(pw);
        add(sp);
        add(b);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Main();
    }
}
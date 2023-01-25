import javax.swing.*;
import java.awt.*;
public class Main extends JFrame {
    JLabel l1=new JLabel("label A ");
    JLabel l2=new JLabel("Label B ");
    JButton btn=new JButton("Submit");
    Main(){
        setTitle("Text Components");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setSize(500,500);
        add(l1);
        add(l2);
        add(btn);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Main();
    }
}
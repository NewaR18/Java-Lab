import javax.swing.*;
import java.awt.*;
public class Main extends JFrame {
    JLabel l1=new JLabel("label A ");
    JLabel l2=new JLabel("Label B ");
    JButton btn=new JButton("Submit");
    JPanel p1=new JPanel();
    GroupLayout grp=new GroupLayout(p1);
    Main(){
        setTitle("Text Components");
        setSize(500,500);
        grp.setAutoCreateGaps(true);
        grp.setAutoCreateContainerGaps(true);
        grp.setHorizontalGroup(grp.createSequentialGroup().addComponent(l1).addComponent(l2).addComponent(btn));
        grp.setVerticalGroup(grp.createSequentialGroup().addComponent(l1).addComponent(l2).addComponent(btn));
        p1.setLayout(grp);
        add(p1);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Main();
    }
}
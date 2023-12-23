

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class AnotherClass implements ActionListener{
    private Label l4;
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Why so Serious");
    }
}
public class Main extends JFrame implements ActionListener {

    JButton b1=new JButton("Click here");
    JButton b2=new JButton("Inner button");
    JButton b3=new JButton("Anonymous button");
    JButton b4=new JButton("Another Class Button");
    JLabel l1=new JLabel("");
    JLabel l2=new JLabel("");
    JLabel l3=new JLabel("");
    class qsnB_Inner implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            l2.setText("I am from second question, nice to meet you");
        }
    }
    Main(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        b1.addActionListener(this);
        b2.addActionListener(new qsnB_Inner());
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l3.setText("Your PC is hacked");
            }
        });
        b4.addActionListener(new AnotherClass());
        add(l1);
        add(b1);
        add(b2);
        add(l2);
        add(b3);
        add(l3);
        add(b4);
        setSize(700,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        l1.setText("Hello World");
    }
    public static void main(String[] args){
        new Main();
    }
}

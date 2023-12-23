package JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event1 extends JFrame implements ActionListener {
    JButton b1=new JButton("Click here");
    JLabel l1=new JLabel("");
    Event1(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        b1.addActionListener(this);
        add(l1);
        add(b1);
        setSize(700,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        l1.setText("Hello World");
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main  {
    JFrame f=new JFrame("Dialog box");
    JButton b1=new JButton("Model Dialog");
    JButton b2=new JButton("Modelless Dialog");
    JDialog d1=new JDialog(f,"Model.Dialog",true);
    JButton b3=new JButton("Okay");
    ActionListener a1=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(b1)){
                d1.setVisible(true);
            }
        }
    };
    Main(){
        d1.add(b3);
        d1.setSize(200,200);
        d1.setLayout(new FlowLayout(FlowLayout.CENTER));
        f.setLayout(new FlowLayout(FlowLayout.CENTER));
        f.setSize(500,500);
        f.add(b1);
        f.add(b2);
        b1.addActionListener(a1);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Main();
    }
}
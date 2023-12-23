import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main  {
    JFrame f=new JFrame("Dialog box");
    JSlider s1=new JSlider();
    JLabel temp=new JLabel("");
    JLabel l1=new JLabel("Value: ");
    ChangeListener c1=new ChangeListener() {
        @Override
        public void stateChanged(ChangeEvent e) {
            if(s1.getValue()==0 || s1.getValue()==100){
                temp.setText("You are stupid ");
            }
            else{
                temp.setText("");
            }
            l1.setText("Value: "+s1.getValue());
        }
    };
    Main(){
        f.setLayout(new FlowLayout(FlowLayout.CENTER));
        f.setSize(500,500);
        f.add(temp);
        f.add(temp);
        f.add(s1);
        f.add(l1);
        s1.addChangeListener(c1);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Main();
    }
}
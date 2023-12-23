import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    JLabel l1=new JLabel("Ordering System: ");
    JCheckBox c1=new JCheckBox("Tea 10Rs");
    JCheckBox c2=new JCheckBox("Americano 15Rs");
    JCheckBox c3=new JCheckBox("Frappe 20Rs");
    JCheckBox c4=new JCheckBox("Lemon Tea 5Rs");
    JLabel l2=new JLabel("");
    JButton btn=new JButton("Submit");
    Main(){
        setTitle("Text Components");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        ActionListener al=new ActionListener() {
            double total=0;
            @Override
            public void actionPerformed(ActionEvent e) {
                total=0;
                if(c1.isSelected()){
                    total+=10;
                }
                if(c2.isSelected()){
                    total+=15;
                }
                if(c3.isSelected()){
                    total+=20;
                }
                if(c4.isSelected()){
                    total+=5;
                }
                l2.setText("The total amount of selected order is "+total);
            }
        };
        btn.addActionListener(al);
        setSize(500,500);
        add(l1);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(btn);
        add(l2);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Main();
    }
}
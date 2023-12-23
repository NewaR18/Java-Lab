package JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    JLabel l1=new JLabel("First Number: ");
    JTextField t1=new JTextField(20);
    JLabel l2=new JLabel("Second Number: ");
    JLabel l3=new JLabel("Result: ");
    JLabel l4=new JLabel();
    JTextField t2=new JTextField(20);
    JButton sub=new JButton("Add");
    JButton sub2=new JButton("Subtract");
    JButton sub3=new JButton("Multiply");

    Event2 s1=new Event2();
    Main(){
        setTitle("Yoyo");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        sub.setActionCommand("Add");
        sub2.setActionCommand("Subtract");
        sub3.setActionCommand("Multiply");
        sub.addActionListener(s1);
        sub2.addActionListener(s1);
        sub3.addActionListener(s1);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(sub);
        add(sub2);
        add(sub3);
        add(l3);
        add(l4);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    class Event2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c;
            if (e.getActionCommand().equals("Add")){
                c = a + b;
            }else if(e.getActionCommand().equals("Subtract")){
                c=a-b;
            }else if(e.getActionCommand().equals("Multiply")){
                c=a*b;
            }else{
                c=0;
            }
            l4.setText(" "+c);
        }
    }
    public static void main(String[] args) {
        new Main();
    }
}
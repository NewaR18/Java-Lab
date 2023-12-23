import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main extends JFrame{
    JLabel l1=new JLabel("Sudip Shrestha");
    JTextField tf=new JTextField(20);
    Panel p=new Panel();
    JTextArea ta=new JTextArea("Type here!! ",25,50);
    JScrollPane sp=new JScrollPane(ta);
    JPasswordField pw=new JPasswordField(5);
    JCheckBox c1=new JCheckBox("Tea 10Rs");
    JCheckBox c2=new JCheckBox("Americano 15Rs");
    ButtonGroup bg=new ButtonGroup();
    JRadioButton r1=new JRadioButton("Bsc.CSIT",true);
    JRadioButton r2=new JRadioButton("BCA");
    String[] subjects={"DBA","Java","POM","Data Mining","SPM"};
    JComboBox combo=new JComboBox(subjects);
    JButton bn=new JButton("Submit");
    Main(){
        setTitle("JFrame Window");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
        setLayout(new GridLayout(10,1));
        ImageIcon image = new ImageIcon("logo.png");
        JLabel l1=new JLabel("Sudip");
        add(l1);
        tf.setToolTipText("Don't touch me");
        p.add(tf);
        add(p);
        add(sp);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        add(c1);
        add(c2);
        add(pw);
        bg.add(r1);
        bg.add(r2);
        add(r1);
        add(r2);
        add(combo);
        add(bn);
        setSize(500,500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}
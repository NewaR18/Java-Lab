import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {
    JButton sub= new JButton("Close");
    JCheckBox c1 = new JCheckBox("Select here");
    JLabel l1 = new JLabel("Item Event: ");
    JTextField t1 = new JTextField();
    JLabel l2 = new JLabel("Focus Event: ");
    JButton sub2=new JButton("Military Zone");
    JLabel l3 = new JLabel("Mouse Event: ");
    JTextField t2 = new JTextField();
    JLabel l4 = new JLabel("Key Event: ");
    public Main() {
        setTitle("Lab19");
        setLayout(new GridLayout(10,1));
        setSize(800,800);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("Windows is closed");
            }
            public void windowOpened(WindowEvent e) {
                System.out.println("Windows is opened");
            }
        });
        sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        c1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    l1.setText("You clicked me");
                }
            }
        });
        t1.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                l2.setText("You gained my focus");
            }
            public void focusLost(FocusEvent e) {
                l2.setText("you are boring");
            }
        });
        sub2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                l3.setText("Hovering is restricted, Launch Code initiated");
            }
            public void mouseExited(MouseEvent e) {
                l3.setText("Target neutralized");
            }
        });
        t2.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                l4.setText("Leave me");
            }
            public void keyReleased(KeyEvent e) {
                l4.setText("thank you");
            }
            public void keyTyped(KeyEvent e) {
                l4.setText("Enough is enough");
            }
        });
        add(sub);
        add(c1);
        add(l1);
        add(t1);
        add(l2);
        add(sub2);
        add(l3);
        add(t2);
        add(l4);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Main();
    }
}
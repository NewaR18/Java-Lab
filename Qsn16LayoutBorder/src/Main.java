import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    JLabel l1 = new JLabel("label A ");
    JLabel l2 = new JLabel("Label B ");
    JButton btn = new JButton("Submit");

    Main() {
        setTitle("Text Components");
        setLayout(new BorderLayout());
        setSize(500, 500);
        add(l1,BorderLayout.EAST);
        add(l2,BorderLayout.WEST);
        add(btn,BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Main();
    }
}
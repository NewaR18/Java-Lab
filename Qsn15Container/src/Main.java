import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
    JLabel l1=new JLabel("Sudip",new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("here.png"))),JLabel.LEFT);
    Main(){
        setTitle("JFrame Window");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
        setLayout(new FlowLayout(FlowLayout.CENTER));
        ImageIcon image = new ImageIcon("logo.png");
        JLabel l1=new JLabel("Sudip");
        add(l1);
        setSize(500,500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}
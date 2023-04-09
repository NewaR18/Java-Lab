import javax.swing.*;
import java.awt.*;
public class Main extends JFrame {
    JButton l1=new JButton("label A ");
    JButton l2=new JButton("Label B ");
    JButton btn=new JButton("Submit");
    GridBagConstraints v1=new GridBagConstraints();
    Main(){
        setTitle("Text Components");
        setLayout(new GridBagLayout());
        setSize(600,400);
        v1.gridx=0;
        v1.gridy=0;
        add(l1, v1);
        v1.gridx=1;
        add(l2,v1);
        v1.gridx=0;
        v1.gridy=2;
        v1.gridwidth=2;
        add(btn,v1);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Main();
    }
}
import javax.swing.*;
import java.awt.*;
public class Main extends JFrame {
    JPanel p = new JPanel();
    JButton l1=new JButton("label A ");
    JButton l2=new JButton("Label B ");
    JButton btn=new JButton("Submit");
    GridBagConstraints v1=new GridBagConstraints();
    Main(){
        setTitle("Text Components");
        p.setLayout(new GridBagLayout());
        setSize(600,400);
        v1.insets = new Insets(2, 2, 2, 2);
        v1.gridx=0;
        v1.gridy=0;
        p.add(l1, v1);
        v1.gridx=1;
        p.add(l2,v1);
        v1.gridx=0;
        v1.gridy=2;
        v1.gridwidth=2;
        p.add(btn,v1);
        getContentPane().add(p);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Main();
    }
}
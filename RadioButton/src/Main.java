import javax.swing.* ;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Main extends JFrame implements ItemListener {
    JLabel j1=new JLabel("Select Course: ");
    JRadioButton r1=new JRadioButton("Bsc.CSIT",true);
    JRadioButton r2=new JRadioButton("BCA");
    JRadioButton r3=new JRadioButton("BIM");
    JRadioButton r4=new JRadioButton("BIT");
    ButtonGroup bg=new ButtonGroup();
    String[] subjects={"DBA","Java","POM","Data Mining","SPM"};
    JLabel j2=new JLabel("Select Subjects: ");
    JComboBox combo=new JComboBox(subjects);
    JLabel j3=new JLabel("");
    JButton btn=new JButton("Submit");
    Main(){
        setTitle("Radio Check");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        combo.addItemListener(this);
        add(j1);
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);
        add(r1);
        add(r2);
        add(r3);
        add(r4);
        add(j2);
        add(combo);
//        add(btn);
        add(j3);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        j3.setText("Selected Subject: "+combo.getSelectedItem());
    }
    public static void main(String[] args) {
        new Main();
    }
}
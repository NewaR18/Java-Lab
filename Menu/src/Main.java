import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Main extends JFrame {
    JMenuBar m1=new JMenuBar();
    JMenu faculties=new JMenu("Faculties");
    JMenuItem csit=new JMenuItem("Bsc.CSIT");
    JMenuItem bca=new JMenuItem("BCA");
    JMenuItem bim=new JMenuItem("BIM");
    JMenuItem bit=new JMenuItem("BIT");
    JMenu management=new JMenu("Managements");
    JMenuItem bbm=new JMenuItem("BBM");
    JMenuItem bbs= new JMenuItem("BBS");
    JMenuItem bba=new JMenuItem("BBA");
    JMenu login=new JMenu("Login");
    JMenuItem l1=new JMenuItem("Login as Admin");
    JMenu l2=new JMenu("Login as Student");
    JMenuItem l3=new JMenuItem("Login as Instructor");
    JCheckBoxMenuItem exam=new JCheckBoxMenuItem("Exam Module");
    JCheckBoxMenuItem class1=new JCheckBoxMenuItem("Class Module");
    KeyStroke k1=KeyStroke.getKeyStroke("ctrl C");
    KeyStroke k2=KeyStroke.getKeyStroke("ctrl B");
    JLabel jl1=new JLabel("");
    String ImagePath="./Images/Jiraiya-Wallpaper-56-pictures-.jpg";
    Icon icon=new ImageIcon(ImagePath);
    JLabel j1=new JLabel(icon);
    JMenuItem demo=new JMenuItem(icon);
    ActionListener a1=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            jl1.setText("CSIT rocks");
        }
    };
    ActionListener a2=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            jl1.setText("BIM rocks");
        }
    };
    Main(){
        setTitle("Hello");

        setLayout(new FlowLayout(FlowLayout.CENTER));
        bbs.setEnabled(false);
        faculties.add(csit);
        faculties.setMnemonic(KeyEvent.VK_M);
        csit.setAccelerator(k1);
        csit.addActionListener(a1);
        bim.setAccelerator(k2);
        bim.addActionListener(a2);
        faculties.add(bca);
        faculties.add(bim);
        faculties.add(bit);
        faculties.add(management);
        faculties.add(exam);
        faculties.add(class1);
        faculties.add(demo);
        management.add(bbm);
        management.add(bbs);
        management.add(bba);
        l2.add(management);
        l2.add(bba);
        login.add(l1);
        login.add(l2);
        login.add(l3);
        m1.add(faculties);
        m1.add(login);
        setJMenuBar(m1);
        add(jl1);
        add(j1);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Main();
    }
}
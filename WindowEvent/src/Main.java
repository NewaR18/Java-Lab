import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Main extends JFrame implements WindowListener {
    JLabel j1=new JLabel("Enter your name: ");
    JTextField tf=new JTextField("",50);
    JTextField tf2=new JTextField("",10);
    JButton btn=new JButton("Submit");
    Main(){
        setTitle("Events");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setSize(500,500);
        j1.setBorder(BorderFactory.createLineBorder(Color.red,10));
//        tf.setBorder(BorderFactory.createTitledBorder("Heelo"));
        tf2.setBorder(BorderFactory.createBevelBorder(0,Color.green,Color.BLUE,Color.cyan,Color.red));
        tf.setBorder(BorderFactory.createCompoundBorder());
        tf.setToolTipText("Hello");
        add(j1);
        add(tf);
        add(tf2);
        add(btn);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Windows is opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Windows is closing");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Windows is closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Windows is iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Windows is deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Windows is activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Windows is deactivated");
    }
    public static void main(String[] args) {
        new Main();
    }
}
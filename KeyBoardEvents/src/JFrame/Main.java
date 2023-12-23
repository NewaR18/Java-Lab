package JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends JFrame implements KeyListener {
    JLabel l1=new JLabel("Demonstration");
    Main(){
        setTitle("Yoyo");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        addKeyListener(this);
        add(l1);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    @Override
    public void keyTyped(KeyEvent e) {
        if(e.getKeyChar()==KeyEvent.VK_S){
            l1.setText("Key Typed: "+ e.getKeyChar());
        }
    }
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyChar()==KeyEvent.VK_ESCAPE){
            l1.setText("Key Pressed: "+ e.getKeyCode());
        }
        else{
            l1.setText("Please press Space key or Esc key");
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        l1.setText("Key Released");
    }
    public static void main(String[] args) {
        new Main();
    }
}
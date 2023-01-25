import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {
    String ImagePath= "Images/anim.png";
    Icon icon=new ImageIcon(ImagePath);
    JLabel label=new JLabel(icon);
    public int x = 0;
    public int y = 0;
    public Main() {
        setTitle("Image");
        setLayout(null);
        label.setBounds(x, y,200,200);
        add(label);
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    x -= 10;
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    x += 10;
                } else if (e.getKeyCode() == KeyEvent.VK_UP) {
                    y -= 10;
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    y += 10;
                }
                label.setBounds(x, y, 200,200);
            }
        });
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        // Requesting focus for the frame to enable key events
        requestFocus();
    }

    public static void main(String[] args) {
        new Main();
    }
}
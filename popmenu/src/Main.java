import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main  {
    JFrame f=new JFrame("popper");
    JPopupMenu j1=new JPopupMenu();
    JMenuItem i1=new JMenuItem("Copy");
    JMenuItem i2=new JMenuItem("Paste");
    JMenuItem i3=new JMenuItem(("Refresh"));
    Main(){
        f.setLayout(new FlowLayout(FlowLayout.CENTER));
        f.setSize(500,500);
        j1.add(i1);
        j1.add(i2);
        j1.add(i3);
        f.addMouseListener(new Handler());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    class Handler extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e){
            if(e.getButton()== MouseEvent.BUTTON3){
                j1.show(f,e.getX(),e.getY());
            }
        }
    }
    public static void main(String[] args) {
        new Main();
    }
}
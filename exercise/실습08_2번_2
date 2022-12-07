import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class GUIExample extends JFrame {
    public GUIExample() {
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.green);

        contentPane.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                contentPane.setBackground(Color.yellow);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                contentPane.setBackground(Color.green);
            }

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });

        setTitle("마우스 올리면");
        setSize(600,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new GUIExample();
    }
}

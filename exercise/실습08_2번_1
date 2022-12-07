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
        JLabel label = new JLabel("자바는");
        label.setSize(50,20);
        label.setBorder(new LineBorder(Color.BLACK));
        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                label.setText("재밌다");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setText("자바는");
            }
        });

        Container contentPane = getContentPane();
        contentPane.add(label);
        contentPane.setLayout(new FlowLayout());

        setTitle("마우스 올리면");
        setSize(600,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new GUIExample();
    }
}

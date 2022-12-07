import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class GUIExample extends JFrame {

    public int[] getRandomPos() {
        int xPos = (int)((Math.random() * 10000) % 500);
        int yPos = (int)((Math.random() * 10000) % 200);

        int pos[] = {xPos, yPos};
        System.out.println(xPos + " " + yPos);
        return pos;
    }

    public GUIExample() {
        JLabel label = new JLabel("C");
        label.setSize(30,30);
        label.setLocation(50,50);
        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int pos[] = getRandomPos();
                label.setLocation(pos[0],pos[1]);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        Container contentPane = getContentPane();
        contentPane.add(label);


        setTitle("클릭 연습");
        setLayout(null);
        setSize(600,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new GUIExample();
    }
}

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class GUIExample extends JFrame {

    public int getRandomNumber() {
        int number = (int)((Math.random() * 10000) % 12);
        return number;
    }
    public GUIExample() {
        Color list[] = {Color.ORANGE, Color.CYAN, Color.PINK, Color.white, Color.green, Color.RED, Color.BLUE, Color.DARK_GRAY, Color.YELLOW, Color.GRAY, Color.MAGENTA, Color.LIGHT_GRAY };
        Container contentPane = getContentPane();

        for (int i=0; i<12; i++) {
            JPanel panel = new JPanel();
            JLabel label = new JLabel();
            panel.setBorder(new LineBorder(Color.black));
            panel.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {a

                    JPanel pa = (JPanel) e.getSource();
                    pa.setBackground(list[getRandomNumber()]);
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
            label.setText(Integer.toString(i));
            panel.add(label);
            contentPane.add(panel);
        }

        setTitle("클릭 연습");
        setLayout(new GridLayout(4,3));
        setSize(600,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new GUIExample();
    }
}

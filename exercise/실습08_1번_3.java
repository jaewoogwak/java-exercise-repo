import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;

public class GUIExample extends JFrame {
    public GUIExample() {
        Color list[] = {Color.ORANGE, Color.DARK_GRAY, Color.BLACK, Color.BLUE, Color.CYAN, Color.lightGray, Color.YELLOW, Color.PINK, Color.MAGENTA, Color.red, Color.ORANGE, Color.white, Color.darkGray, Color.GRAY, Color.green, Color.PINK};
        Container contentPane = getContentPane();

        for (int i=0; i<list.length; i++) {
            JPanel la = new JPanel();
            la.add(new JLabel(Integer.toString(i)));
            la.setSize(100, 30);
            la.setBackground(list[i]);
            contentPane.add(la);
        }

        setTitle("4x4 Color Frame");
        setLayout(new GridLayout(4,4));
        setSize(600,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new GUIExample();
    }
}

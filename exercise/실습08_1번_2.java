import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;

public class GUIExample extends JFrame {
    public GUIExample() {
        Container contentPane = getContentPane();

        JLabel leftOne = new JLabel("100");
        JLabel plus = new JLabel("+");
        JLabel leftTwo = new JLabel("200");
        JButton getResult = new JButton("=");
        JLabel result = new JLabel("?");

        getResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton btn = (JButton)e.getSource();
                if (btn.getText().equals("=")) {
                    int sum = Integer.parseInt(leftOne.getText()) + Integer.parseInt(leftTwo.getText());
                    result.setText(Integer.toString(sum));
                }
            }
        });

        contentPane.add(leftOne);
        contentPane.add(plus);
        contentPane.add(leftTwo);
        contentPane.add(getResult);
        contentPane.add(result);

        setTitle("FlowLayout Practice");
        contentPane.setLayout(new FlowLayout());
        setSize(500, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GUIExample();
    }
}

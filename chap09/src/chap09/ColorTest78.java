package chap09;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorTest78 extends JFrame {

    public ColorTest78() {
        this.setTitle("3 x 4 color frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new GridLayout(3, 4));
        this.setSize(300, 300);
        this.setVisible(true);

        for (int i = 0; i < 12; i++) {
            String text = Integer.toString(i);
            JLabel label = new JLabel(text, SwingConstants.CENTER);
            label.setOpaque(true);
            label.setBackground(Color.WHITE);
            label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            c.add(label);
            label.addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent e) {
                    JLabel label = (JLabel) e.getSource();
                    int r = (int) (Math.random() * 256);
                    int g = (int) (Math.random() * 256);
                    int b = (int) (Math.random() * 256);
                    label.setBackground(new Color(r, g, b));
                }

                public void mousePressed(MouseEvent e) {}
                public void mouseReleased(MouseEvent e) {}
                public void mouseEntered(MouseEvent e) {}
                public void mouseExited(MouseEvent e) {}
            });
        }
    }

    public static void main(String[] args) {
        new ColorTest78();
    }
}

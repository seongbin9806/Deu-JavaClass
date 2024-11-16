package chap09;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoveJava78 extends JFrame {
    public LoveJava78() {
        this.setTitle("+,-키로 폰트 크기 조절");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Love Java");

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(label);

        c.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == '+') {
                    label.setFont(new Font("Arial", Font.PLAIN, label.getFont().getSize() + 5));
                } else if ((e.getKeyChar() == '-') && (label.getFont().getSize() > 10)) {
                    label.setFont(new Font("Arial", Font.PLAIN, label.getFont().getSize() - 5));
                }
            }

            public void keyReleased(KeyEvent e) {}
            public void keyTyped(KeyEvent e) {}
        });

        c.setFocusable(true);
        c.requestFocus();

        this.setSize(300, 300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new LoveJava78();
    }
}

package chap12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class VibFrameCsb extends JFrame implements Runnable {
    private Thread th;
    private Color[] colors = {Color.RED, Color.YELLOW, Color.BLUE, Color.GREEN, new Color(128, 0, 128)};
    private int colorIndex = 0;

    public VibFrameCsb() {
        setTitle("진동하는 프레임 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 200);
        setLocation(300, 300);
        setVisible(true);

        getContentPane().addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (!th.isAlive()) return;
                th.interrupt();
            }
        });

        th = new Thread(this);
        th.start();
    }

    @Override
    public void run() {
        Random r = new Random();
        while (true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                return;
            }
            int x = getX() + r.nextInt() % 5;
            int y = getY() + r.nextInt() % 5;
            setLocation(x, y);

            // 배경색 변경
            getContentPane().setBackground(colors[colorIndex]);
            colorIndex = (colorIndex + 1) % colors.length;
        }
    }

    public static void main(String[] args) {
        new VibFrameCsb();
    }
}

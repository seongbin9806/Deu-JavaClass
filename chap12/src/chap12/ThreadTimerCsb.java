package chap12;

import java.awt.*;
import javax.swing.*;

class TimerThread extends Thread {
    private JLabel timerLabel;
    private Color[] colors = {Color.RED, Color.YELLOW, Color.BLUE, Color.GREEN, new Color(128, 0, 128)};
    private int colorIndex = 0;

    public TimerThread(JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }

    @Override
    public void run() {
        int n = 0;
        while (true) {
            timerLabel.setText(Integer.toString(n));
            timerLabel.setForeground(colors[colorIndex]);
            colorIndex = (colorIndex + 1) % colors.length; // 색상 순환
            n++;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

public class ThreadTimerCsb extends JFrame {
    public ThreadTimerCsb() {
        setTitle("Thread를 상속받은 타이머 스레드 예");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
        c.add(timerLabel);

        TimerThread th = new TimerThread(timerLabel);

        setSize(300, 200);
        setVisible(true);

        th.start();
    }

    public static void main(String[] args) {
        new ThreadTimerCsb();
    }
}

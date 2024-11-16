package chap09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowLayout78 extends JFrame {
    public FlowLayout78() {
        setTitle("FlowLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 40));

        for (int i = 1; i <= 15; i++) {
            JButton button = new JButton("버튼" + i);
            button.addActionListener(new ButtonClickListener());
            contentPane.add(button);
        }

        setSize(500, 400);
        setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            System.out.println(button.getText());
        }
    }

    public static void main(String[] args) {
        new FlowLayout78();
    }
}

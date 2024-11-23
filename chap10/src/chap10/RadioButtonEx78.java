package chap10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonEx78 extends JFrame {
    private JTextField priceField;

    public RadioButtonEx78() {
        setTitle("라디오버튼 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        ButtonGroup g = new ButtonGroup();

        JRadioButton apple = new JRadioButton("사과");
        JRadioButton pear = new JRadioButton("배", true);
        JRadioButton cherry = new JRadioButton("체리");

        g.add(apple);
        g.add(pear);
        g.add(cherry);

        c.add(apple);
        c.add(pear);
        c.add(cherry);

        priceField = new JTextField(10);
        priceField.setEditable(false);
        c.add(priceField);

        apple.addItemListener(new MyItemListener());
        pear.addItemListener(new MyItemListener());
        cherry.addItemListener(new MyItemListener());

        // 초기 설정으로 배의 가격을 텍스트 필드에 출력
        priceField.setText("500원");

        setSize(250, 150);
        setVisible(true);
    }

    private class MyItemListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                JRadioButton source = (JRadioButton) e.getSource();
                String price;
                switch (source.getText()) {
                    case "사과":
                        price = "100원";
                        break;
                    case "배":
                        price = "500원";
                        break;
                    case "체리":
                        price = "20000원";
                        break;
                    default:
                        price = "";
                }
                priceField.setText(price);
            }
        }
    }

    public static void main(String[] args) {
        new RadioButtonEx78();
    }
}

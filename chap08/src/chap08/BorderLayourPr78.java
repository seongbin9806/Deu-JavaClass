package chap08;

import java.awt.*;
import javax.swing.*;

public class BorderLayourPr78 extends JFrame{

    // Constructor
    public BorderLayourPr78() {
        setTitle("BorderLayout Practice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        
        contentPane.setLayout(new BorderLayout(50, 5));
        
        contentPane.add(new JButton("North"), BorderLayout.NORTH);
        contentPane.add(new JButton("South"), BorderLayout.SOUTH);
        contentPane.add(new JButton("Center"), BorderLayout.CENTER);
        contentPane.add(new JButton("West"), BorderLayout.WEST);
        contentPane.add(new JButton("East"), BorderLayout.EAST);
        
        setSize(300, 200);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new BorderLayourPr78();
    }

}

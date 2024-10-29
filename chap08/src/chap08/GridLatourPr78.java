package chap08;

import javax.swing.*;
import java.awt.*;

public class GridLatourPr78 extends JFrame{

	public GridLatourPr78() {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Color[] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, 
				Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY };
		
		
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new GridLayout(1, 10));
		
		for(int i=0; i<10; i++) {
			JButton button = new JButton(Integer.toString(i));
			button.setOpaque(true);
			button.setBackground(color[i]);
			contentPane.add(button);
		}
		
		setSize(500, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new GridLatourPr78();
	}

}

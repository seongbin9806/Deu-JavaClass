package chap08;

import javax.swing.*;
import java.awt.*;

public class FlowLayout78 extends JFrame{

	public FlowLayout78() {
		setTitle("FlowLayout Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 40));
		
		for(int i=1; i<=15; i++) {
			contentPane.add(new JButton("버튼" + i));
		}
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayout78();
	}

}

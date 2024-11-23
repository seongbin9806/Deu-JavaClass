package chap11;

import java.awt.*;
import javax.swing.*;

public class PaintTest78_4 extends JFrame{
	
	public PaintTest78_4() {
		this.setTitle("");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(getOwner());
						
		this.setContentPane(new MyPanel());
		
		this.setSize(200, 200);
		this.setVisible(true);
	}
	
	private class MyPanel extends JPanel {
		 
		public void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			
			int x = 0;
			int y = 0;
			for(int i = 0; i < 9; i++) {
				g.drawLine(getWidth()/10 + x, 0, getWidth()/10 + x, getHeight());
				g.drawLine(0, getHeight()/10 + y, getWidth(), getHeight()/10 + y);
				x += getWidth()/10;
				y += getHeight()/10;
			}
		}
	}
	
	
	public static void main(String[] args) {
		new PaintTest78_4();
	}
}
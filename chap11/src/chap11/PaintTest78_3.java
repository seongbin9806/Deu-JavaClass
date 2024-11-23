package chap11;

import java.awt.*;
import javax.swing.*;

public class PaintTest78_3 extends JFrame{

	public PaintTest78_3() {
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
			
			int [] x = { getWidth()/2, 0, getWidth()/2, getWidth() };
			int [] y = { 0, getHeight()/2, getHeight(), getHeight()/2 };
			
			g.setColor(Color.BLUE);
			g.drawPolygon(x, y, 4);

		}
	}
	
	
	public static void main(String[] args) {
		new PaintTest78_3();
	}
}
package chap11;

import java.awt.*;
import javax.swing.*;

public class PaintTest78_2 extends JFrame{

	public PaintTest78_2() {
		this.setTitle("");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(getOwner());
		
		this.setContentPane(new MyPanel());
		
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	private class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.BLUE);
			g.drawOval(50, 20, 60, 60);
			g.setColor(Color.BLACK);
			g.drawOval(120, 20, 60, 60);
			g.setColor(Color.RED);
			g.drawOval(190, 20, 60, 60);
			g.setColor(Color.YELLOW);
			g.drawOval(85, 45, 60, 60);
			g.setColor(Color.GREEN);
			g.drawOval(155, 45, 60, 60);

		}
	}
	
	
	public static void main(String[] args) {
		new PaintTest78_2();
	}
}
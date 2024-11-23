package chap10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CheckBoxTest78 extends JFrame{
	private JCheckBox [] cb = new JCheckBox[2];
	private String [] cb_text = { "버튼 비활성화", "버튼 감추기" };
	private JButton btn = new JButton("test button");

	public CheckBoxTest78() {
		this.setTitle("CheckBox");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		for(int i = 0; i < cb.length; i++) {
			cb[i] = new JCheckBox(cb_text[i]);
			c.add(cb[i]);
			cb[i].addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange() == ItemEvent.SELECTED) {
						if(e.getItem() == cb[0]) {
							btn.setEnabled(false);
						}
						else {
							btn.setVisible(false);
						}
					}
					else {
						if(e.getItem() == cb[0]) {
							btn.setEnabled(true);
						}
						else {
							btn.setVisible(true);
						}
					}
				}
			});
		}
		
		c.add(btn);
		
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxTest78();
	}

}

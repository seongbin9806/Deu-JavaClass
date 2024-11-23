package chap10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class TextAreaTest78 extends JFrame{

	private JTextArea ta = new JTextArea(7, 28);

	public TextAreaTest78() {
		this.setTitle("파일 저장");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		
		creatMenu();
		ta.setLineWrap(true);
		c.add(new JScrollPane(ta), BorderLayout.CENTER);
		
		this.setSize(320, 200);
		this.setVisible(true);
	}
	
	public void creatMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu m = new JMenu("파일");
		JMenuItem mi = new JMenuItem("저장");
		
		mi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ta.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "입력한 텍스트가 없습니다", "에러", JOptionPane.ERROR_MESSAGE);
				}
				else {
					String fileName = JOptionPane.showInputDialog("저장할 파일명을 입력하세요");
					if(fileName == null) {
						return;
					}
					try {
						FileWriter fout = new FileWriter(fileName);
						String s = ta.getText();
						StringTokenizer st = new StringTokenizer(ta.getText(), "\n");
						
						while(st.hasMoreTokens()) {
							fout.write(st.nextToken());
							fout.write("\r\n");
						}
					}
					catch (IOException e1) {};
				}
			}
		});
		
		m.add(mi);
		mb.add(m);
		
		setJMenuBar(mb);
	}
	
	public static void main(String[] args) {
		new TextAreaTest78();
	}
}

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
public class MazeControl extends JPanel{

	private MazePanel mazePanel = new MazePanel();
	private JButton findPathBtn = new JButton("Find Path");
	private JButton cleanPathBtn = new JButton("Reset");
	
	public MazeControl() {
		
		setLayout(new BorderLayout());
		this.add(mazePanel, BorderLayout.CENTER);
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(findPathBtn);
		buttonPanel.add(cleanPathBtn);
		add(buttonPanel, BorderLayout.SOUTH);
		
		findPathBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				mazePanel.findPath();
			}
			
		});
		
		cleanPathBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mazePanel.cleanPath();
			}
		});
	}
	
}

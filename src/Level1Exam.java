import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level1Exam implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	void makeStuff() {
		frame = new JFrame("Color Teacher");
		panel = new JPanel();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		button1.setBackground(Color.YELLOW);
		button2.setBackground(Color.RED);
		button3.setBackground(Color.BLUE);
		button4.setBackground(Color.GREEN);
		button1.setOpaque(true);
		button2.setOpaque(true);
		button3.setOpaque(true);
		button4.setOpaque(true);
		frame.setVisible(true);
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
	}
	public static void main(String[] args) {
		Level1Exam exam = new Level1Exam();
		exam.makeStuff();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button1) {
			speak("Yellow");
		}
		if(e.getSource() == button2) {
			speak("Red");
		}
		if(e.getSource() == button3) {
			speak("Blue");
		}
		if(e.getSource() == button4) {
			speak("Green");
		}
	}
	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

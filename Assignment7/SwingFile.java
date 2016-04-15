import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class SwingFile extends JFrame implements ActionListener {

	private JButton button;
	private JTextArea display;

	public SwingFile() {
		createComponents();
		addComponents();
		addListener();
		makeVisible();
		setResizable(false);
		
	}

	private void createComponents() {
		button = new JButton("ReadFile");
		display = new JTextArea(5, 100);
	}

	private void addComponents() {

		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		con.add(button);
		con.add(display);
	}

	int counter = -1;

	private void addListener() {

		Listener count = new Listener();

		button.addActionListener(this);
		button.addActionListener(count);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int i = 0;

		File f = new File("/Users/khutaijashariff/Documents/a.txt");
		try {
			FileInputStream fis = new FileInputStream(f);

			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			String str;

			List<String> list = new ArrayList<String>();

			try {
				while ((str = br.readLine()) != null)
					list.add(str);

			} catch (IOException e1) {
				e1.printStackTrace();
			}
			for (int j = 0; j < list.size(); j++) {
				if ((e.getSource() == button) && (j == counter))
					display.setText(list.get(j));
			}
		} catch (FileNotFoundException fn) {

		}

	}

	private class Listener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			counter++;
		}
	}

	private void makeVisible() {
		this.setSize(800, 400);
		this.setVisible(true);
		this.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		

	}

	public static void main(String[] args) {
		SwingFile call = new SwingFile();

	}

}

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Calculator extends JFrame implements ActionListener {

	private JTextArea display;
	private JButton bclear;
	private JButton bposNeg;
	private JButton bmod;
	private JButton bdiv;
	private JButton b7;
	private JButton b8;
	private JButton b9;
	private JButton bmul;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton bsub;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton badd;
	private JButton b0;
	private JButton bdot;
	private JButton equals;

	boolean[] op = { false, false, false, false };
	double[] operand = { 0, 0 };

	public Calculator() {

		setTitle("Calculator");
		createComponents();
		addComponents();
		setResizable(false);
		// actionPerformed();
		addListeners();
		makeItVisible();

	}

	private void createComponents() {
		display = new JTextArea(1, 20);
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		badd = new JButton("+");
		bsub = new JButton("-");
		bmul = new JButton("*");
		bdiv = new JButton("/");
		bdot = new JButton(".");
		bclear = new JButton("AC");
		equals = new JButton("=");
		bposNeg = new JButton("+/-");
		bmod = new JButton("%");

	}

	private void addComponents() {
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		JPanel panel1 = new JPanel(new FlowLayout());
		JPanel panel2 = new JPanel(new FlowLayout());
		JPanel panel3 = new JPanel(new FlowLayout());
		JPanel panel4 = new JPanel(new FlowLayout());
		JPanel panel5 = new JPanel(new FlowLayout());
		JPanel panel6 = new JPanel(new FlowLayout());
		panel1.add(display);

		panel2.add(bclear);
		panel2.add(bposNeg);
		panel2.add(bmod);
		panel2.add(bdiv);

		panel3.add(b7);
		panel3.add(b8);
		panel3.add(b9);
		panel3.add(bmul);

		panel4.add(b4);
		panel4.add(b5);
		panel4.add(b6);
		panel4.add(bsub);

		panel5.add(b1);
		panel5.add(b2);
		panel5.add(b3);
		panel5.add(badd);

		panel6.add(b0);
		panel6.add(bdot);
		panel6.add(equals);

		con.add(panel1);
		con.add(panel2);
		con.add(panel3);
		con.add(panel4);
		con.add(panel5);
		con.add(panel6);

	}

	private void addListeners() {
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		bdot.addActionListener(this);
		bmod.addActionListener(this);
		bclear.addActionListener(this);
		equals.addActionListener(this);
		bposNeg.addActionListener(this);

	}

	public void clear() {
		display.setText("");
		for (int i = 0; i < 4; i++)
			op[i] = false;
		for (int i = 0; i < 2; i++)
			operand[i] = 0;

	}

	public void getModulus() {
		try {
			double value = Double.parseDouble(display.getText()) / 100;
			display.setText(Double.toString(value));
		} catch (NumberFormatException e) {
		}
	}

	public void getPosNeg() {
		try {
			double value = Double.parseDouble(display.getText());
			if (value != 0) {
				value = value * (-1);
				display.setText(Double.toString(value));
			} else {
			}
		} catch (NumberFormatException e) {
		}
	}

	public void getCalculation() {
		double result = 0;
		operand[1] = Double.parseDouble(display.getText());
		if (op[0] == true)
			result = operand[0] * operand[1];
		else if (op[1] == true)
			result = operand[0] / operand[1];
		else if (op[2] == true)
			result = operand[0] + operand[1];
		else if (op[3] == true)
			result = operand[0] - operand[1];
		display.setText(Double.toString(result));
		for (int i = 0; i < 4; i++)
			op[i] = false;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == bdiv) {
			operand[0] = Double.parseDouble(display.getText());
			op[1] = true;
			display.setText("");
		}
		if (ae.getSource() == b7)
			display.append("7");
		if (ae.getSource() == b8)
			display.append("8");
		if (ae.getSource() == b9)
			display.append("9");

		if (ae.getSource() == bmul) {
			operand[0] = Double.parseDouble(display.getText());
			op[0] = true;
			display.setText("");
		}
		if (ae.getSource() == b4)
			display.append("4");
		if (ae.getSource() == b5)
			display.append("5");
		if (ae.getSource() == b6)
			display.append("6");
		if (ae.getSource() == bsub) {
			operand[0] = Double.parseDouble(display.getText());
			op[3] = true;
			display.setText("");
		}
		if (ae.getSource() == b1)
			display.setText("1");
		if (ae.getSource() == b2)
			display.append("2");
		if (ae.getSource() == b3)
			display.append("3");
		if (ae.getSource() == badd) {
			operand[0] = Double.parseDouble(display.getText());
			op[2] = true;
			display.setText("");
		}
		if (ae.getSource() == b0)
			display.append("0");

		if (ae.getSource() == bclear)
			clear();

		if (ae.getSource() == bmod)
			getModulus();

		if (ae.getSource() == bposNeg)
			getPosNeg();

		if (ae.getSource() == equals)
			getCalculation();

		if (ae.getSource() == bdot)
			display.append(".");

	}

	private void makeItVisible() {
		this.setSize(320, 320);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		Calculator c = new Calculator();

	}

}

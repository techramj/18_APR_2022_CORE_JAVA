import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {

	JPanel panel;
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
	JButton bPlus, bMinus, bMultiply, bDivide, bReset;
	JButton bEqual;
	JTextField tx;

	public Calculator() {
		panel = new JPanel();
		panel.setLayout(new GridLayout(4, 4));
		
		b0=new JButton("0");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		bPlus=new JButton("+");
		bMinus=new JButton("-");
		bMultiply=new JButton("X");
		bDivide=new JButton("/");
		bEqual=new JButton("+");
		bReset=new JButton("R");
		
		panel.add(b0);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(bPlus);
		panel.add(bMinus);
		panel.add(bMultiply);
		panel.add(bDivide);
		panel.add(bReset);
		panel.add(bEqual);
		
		tx= new JTextField();
		
		this.getContentPane().add(tx, BorderLayout.NORTH);
		this.getContentPane().add(panel);
		
		
		this.setVisible(true);
		this.setSize(800, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

}

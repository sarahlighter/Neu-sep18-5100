package calculator;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

enum Operation {
	ADD, SUBTRACT, MULTIPLY, DIVIDE,DOT
}

public class calculator extends JFrame{
	private JTextField resultTextField;
	private JButton add, subtract, multiply, divide, compute,dot;

	private JButton numbers[];
	private Font font;

	double first = 0;

	double second = 0;

	Operation o = Operation.ADD;

	public calculator() {
		createComponents();
		setLayout();
		addComponents();
		addBehaviors();
		display();
	}

	class OperationListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {			
			first=temp; temp=0;
			ifdot=false; decimalnumber=0;
			if (e.getSource() == add) {
				o = Operation.ADD;
			}
			if (e.getSource() == subtract) {
				o = Operation.SUBTRACT;
			}
			if (e.getSource() == multiply) {
				o = Operation.MULTIPLY;
			}
			if (e.getSource() == divide) {
				o = Operation.DIVIDE;
			}

		}

	}

	class ComputeListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			second=temp;
			temp=0;
			double result = 0;
			String op="+";
			if (o == Operation.ADD) {
				result = first + second;
				op="+";
			}
			if (o == Operation.SUBTRACT) {
				result = first - second;
				op="-";
			}
			if (o == Operation.DIVIDE) {
				result = first / second;
				op="/";
			}
			if (o == Operation.MULTIPLY) {
				result = first * second;
				op="*";
			}
			
			resultTextField.setText(first+op+second+"="+result + "");
			

		}

	}
	double temp=0;
	boolean ifdot=false;
	int decimalnumber=0;
	class numberListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==dot){
				ifdot=true;
			}
			if(ifdot) decimalnumber++;
			if(e.getSource()==numbers[0]){
				getNumber(0);
			}
			if(e.getSource()==numbers[1]){
				getNumber(1);
			}			
			if(e.getSource()==numbers[2]){
				getNumber(2);
			}
			if(e.getSource()==numbers[3]){
				getNumber(3);
			}			
			if(e.getSource()==numbers[4]){
				getNumber(4);
			}
			if(e.getSource()==numbers[5]){
				getNumber(5);
			}			
			if(e.getSource()==numbers[6]){
				getNumber(6);
			}
			if(e.getSource()==numbers[7]){
				getNumber(7);
			}
			if(e.getSource()==numbers[8]){
				getNumber(8);
			}
			if(e.getSource()==numbers[9]){
				getNumber(9);
			}
			resultTextField.setText(temp + "");
		}
		public void getNumber(double number){
			if(ifdot) {
				double decimals=number;
				for(int i=1;i<decimalnumber;i++){
					decimals/=10;
				}
				temp+=decimals;
			}
			else temp=temp*10+number;
			
		}
	}


	private void addBehaviors() {
		ComputeListener cl = new ComputeListener();
		compute.addActionListener(cl);
		
		numberListener nl = new numberListener ();
		numbers[0].addActionListener(nl);
		numbers[1].addActionListener(nl);
		numbers[2].addActionListener(nl);
		numbers[3].addActionListener(nl);
		numbers[4].addActionListener(nl);
		numbers[5].addActionListener(nl);
		numbers[6].addActionListener(nl);
		numbers[7].addActionListener(nl);
		numbers[8].addActionListener(nl);
		numbers[9].addActionListener(nl);
		dot.addActionListener(nl);
		
		
		OperationListener ol = new OperationListener();
		add.addActionListener(ol);
		subtract.addActionListener(ol);
		multiply.addActionListener(ol);
		divide.addActionListener(ol);

	}

	private void display() {
		setSize(600, 600);
		setVisible(true);

	}

	private void addComponents() {
		Container c = getContentPane();
		c.add(resultTextField);

		JPanel panel = new JPanel();

		panel = new JPanel();
		
		c.add(panel);

		JPanel p = new JPanel();
		p.add(numbers[7]);
		p.add(numbers[8]);
		p.add(numbers[9]);
		p.add(add);
		

		c.add(p);

		p = new JPanel();
		p.add(numbers[4]);
		p.add(numbers[5]);
		p.add(numbers[6]);
		p.add(subtract);
		

		c.add(p);

		p = new JPanel();
		p.add(numbers[1]);
		p.add(numbers[2]);
		p.add(numbers[3]);
		p.add(multiply);
		
		

		c.add(p);
		
		p = new JPanel();
		p.add(compute);
		p.add(numbers[0]);
		p.add(dot);
		p.add(divide);
		c.add(p);

	}

	private void setLayout() {
		GridLayout gl = new GridLayout(6, 1);
		Container c = this.getContentPane();
		c.setLayout(gl);

	}

	private void createComponents() {
		font = new Font("TimesRoman", Font.PLAIN, 36);
		resultTextField = new JTextField(10);
		resultTextField.setFont(font);

		add = new JButton("+");
		add.setFont(font);
		subtract = new JButton("-");
		subtract.setFont(font);
		multiply = new JButton("x");
		multiply.setFont(font);
		divide = new JButton("/");
		divide.setFont(font);
		compute = new JButton("=");
		compute.setFont(font);
		dot= new JButton(".");
		dot.setFont(font);

		numbers = new JButton[10];
		for (int i = 0; i < 10; i++) {
			numbers[i] = new JButton(i + "");
			numbers[i].setFont(font);
		}

	}

	public static void main(String[] args) {
		calculator c = new calculator();

	}
}

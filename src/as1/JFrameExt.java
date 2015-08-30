//Assignment 1
//Vinzent Davies
//1163070


package as1;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class JFrameExt extends JFrame{
	JPanel jpMain = new JPanel();
	JPanel jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	JPanel jp3 = new JPanel();
	JPanel jp4 = new JPanel();
	
	JButton btn1 = new JButton("Add");
	JButton btn2 = new JButton("Subtract");
	JButton btn3 = new JButton("Multiply");
	JButton btn4 = new JButton("Divide");
	JButton btn5 = new JButton("Clear");
	
	JTextField txt1 = new JTextField(null, 10);
	JTextField txt2 = new JTextField(null, 10);
	JTextField txt3 = new JTextField(null, 10);
	
	JLabel lbl1= new JLabel("Num1");
	JLabel lbl2= new JLabel("Num2");
	JLabel lbl3= new JLabel("Result");
	
	public JFrameExt(){
		
		this.setContentPane(jpMain);
		GridLayout gl = new GridLayout(4,1);
		jpMain.setLayout(gl);
		//put your GUI in the jpMain 
		jpMain.setBackground(Color.red);
		//add 4 panels into the jframe
		jpMain.add(jp1);
		jpMain.add(jp2);
		jpMain.add(jp3);
		jpMain.add(jp4);
		
		jp1.setBackground(Color.red);
		jp2.setBackground(Color.green);
		jp3.setBackground(Color.blue);
		jp4.setBackground(Color.magenta);
		
		jp1.add(lbl1);
		jp2.add(lbl2);
		jp3.add(lbl3);
		
		jp1.add(txt1);
		jp2.add(txt2);
		jp3.add(txt3);
		
		jp4.add(btn1);
		jp4.add(btn2);
		jp4.add(btn3);
		jp4.add(btn4);
		jp4.add(btn5);
		
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sNum1=txt1.getText().trim();
				String sNum2=txt2.getText().trim();	
				double num1= Double.parseDouble(sNum1);
				double num2= Double.parseDouble(sNum2);
				double sRes=num1+num2;
				txt3.setText(""+sRes);	
				}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sNum1=txt1.getText().trim();
				String sNum2=txt2.getText().trim();	
				double num1= Double.parseDouble(sNum1);
				double num2= Double.parseDouble(sNum2);
				double sRes=num1-num2;
				txt3.setText(""+sRes);	
				}
		});
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sNum1=txt1.getText().trim();
				String sNum2=txt2.getText().trim();	
				double num1= Double.parseDouble(sNum1);
				double num2= Double.parseDouble(sNum2);
				double sRes=num1*num2;
				txt3.setText(""+sRes);	
				}
		});
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sNum1=txt1.getText().trim();
				String sNum2=txt2.getText().trim();	
				double num1= Double.parseDouble(sNum1);
				double num2= Double.parseDouble(sNum2);
				double sRes=num1/num2;
				txt3.setText(""+sRes);	
				}
		});
		
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt1.setText("");
				txt2.setText("");
				txt3.setText("");
				}
		});
		
		
		
		}
		
		
	
	
}

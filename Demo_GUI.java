import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Demo_GUI {

	private JFrame frame;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;
	private JButton button_15;
	private JButton button_16;
	private JButton button_17;
	private JButton button_18;
	private JTextField textField;
	private double num;
	private double num2;
	private String s = "";
	private char c ;
	private ArrayList<Integer> a;
	private JButton btnC;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo_GUI window = new Demo_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Demo_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 323, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		button_1 = new JButton("7");
		button_1.setForeground(Color.BLACK);
		button_1.setBackground(Color.GRAY);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += "7";
				textField.setText(s);
			}
		});
		button_1.setBounds(12, 147, 50, 45);
		frame.getContentPane().add(button_1);
		
		button_2 = new JButton("4");
		button_2.setForeground(Color.BLACK);
		button_2.setBackground(Color.GRAY);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				s += "4";
				textField.setText(s);
			}
		});
		button_2.setBounds(12, 197, 50, 45);
		frame.getContentPane().add(button_2);
		
		button_3 = new JButton("8");
		button_3.setForeground(Color.BLACK);
		button_3.setBackground(Color.GRAY);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += "8";
				textField.setText(s);
			}
		});
		button_3.setBounds(93, 147, 50, 45);
		frame.getContentPane().add(button_3);
		
		button_4 = new JButton("%");
		button_4.setForeground(Color.BLACK);
		button_4.setBackground(Color.GRAY);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s.charAt(s.length()-1) == '-' || s.charAt(s.length()-1) == '+' || s.charAt(s.length()-1) == '/' || s.charAt(s.length()-1) == '*'|| s.charAt(s.length()-1) == '%') {
					s = s.substring(0, s.length()-1);
					
				}
				else {
				for(int i = 0; i < s.length();i++) {
					if(s.charAt(i) == '%' || s.charAt(i) == '-' || s.charAt(i) == '/' || s.charAt(i) == '+' || s.charAt(i) == '*') {
						num = Double.parseDouble(s.substring(0,i));
						num2 = Double.parseDouble(s.substring(i+1, s.length()));
						c = s.charAt(i);
						s = function(num, num2, c);
					}
				}
				}
				s+= "%";
				textField.setText(s);
			}
		});
		button_4.setBounds(168, 89, 50, 45);
		frame.getContentPane().add(button_4);
		
		button_5 = new JButton("9");
		button_5.setForeground(Color.BLACK);
		button_5.setBackground(Color.GRAY);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += "9";
				textField.setText(s);
			}
		});
		button_5.setBounds(168, 147, 50, 45);
		frame.getContentPane().add(button_5);
		
		button_6 = new JButton("5");
		button_6.setForeground(Color.BLACK);
		button_6.setBackground(Color.GRAY);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += "5";
				textField.setText(s);
			}
		});
		button_6.setBounds(93, 197, 50, 45);
		frame.getContentPane().add(button_6);
		
		button_7 = new JButton("6");
		button_7.setForeground(Color.BLACK);
		button_7.setBackground(Color.GRAY);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				s += "6";
				textField.setText(s);
			}
		});
		button_7.setBounds(168, 197, 50, 45);
		frame.getContentPane().add(button_7);
		
		button_8 = new JButton("1");
		button_8.setForeground(Color.BLACK);
		button_8.setBackground(Color.GRAY);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				s += "1";
				textField.setText(s);
			}
		});
		button_8.setBounds(12, 255, 50, 45);
		frame.getContentPane().add(button_8);
		
		button_9 = new JButton("2");
		button_9.setForeground(Color.BLACK);
		button_9.setBackground(Color.GRAY);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += "2";
				textField.setText(s);
			}
		});
		button_9.setBounds(93, 255, 50, 45);
		frame.getContentPane().add(button_9);
		
		button_10 = new JButton("3");
		button_10.setForeground(Color.BLACK);
		button_10.setBackground(Color.GRAY);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				s += "3";
				textField.setText(s);
			}
		});
		button_10.setBounds(168, 255, 50, 45);
		frame.getContentPane().add(button_10);
		
		button_11 = new JButton("+");
		button_11.setForeground(Color.BLACK);
		button_11.setBackground(Color.GRAY);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s.charAt(s.length()-1) == '-' || s.charAt(s.length()-1) == '+' || s.charAt(s.length()-1) == '/' || s.charAt(s.length()-1) == '*'|| s.charAt(s.length()-1) == '%') {
					s = s.substring(0, s.length()-1);
					
				}
				else {
				for(int i = 0; i < s.length();i++) {
					if(s.charAt(i) == '%' || s.charAt(i) == '-' || s.charAt(i) == '/' || s.charAt(i) == '+' || s.charAt(i) == '*') {
						num = Double.parseDouble(s.substring(0,i));
						num2 = Double.parseDouble(s.substring(i+1, s.length()));
						c = s.charAt(i);
						s = function(num, num2, c);
					}
				}
				}
				s+= "+";
				textField.setText(s);
			}
		});
		button_11.setBounds(246, 89, 50, 45);
		frame.getContentPane().add(button_11);
		
		button_12 = new JButton("-");
		button_12.setForeground(Color.BLACK);
		button_12.setBackground(Color.GRAY);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s.charAt(s.length()-1) == '-' || s.charAt(s.length()-1) == '+' || s.charAt(s.length()-1) == '/' || s.charAt(s.length()-1) == '*'|| s.charAt(s.length()-1) == '%') {
					s = s.substring(0, s.length()-1);
					
				}
				else {
				for(int i = 1; i < s.length();i++) {
					if(s.charAt(i) == '%' || s.charAt(i) == '-' || s.charAt(i) == '/' || s.charAt(i) == '+' || s.charAt(i) == '*') {
						num = Double.parseDouble(s.substring(0,i));
						num2 = Double.parseDouble(s.substring(i+1, s.length()));
						c = s.charAt(i);
						s = function(num, num2, c);
					}
				}
				}
				s+= "-";
				textField.setText(s);
			}
		});
		button_12.setBounds(246, 147, 50, 45);
		frame.getContentPane().add(button_12);
		
		button_13 = new JButton("*");
		button_13.setForeground(Color.BLACK);
		button_13.setBackground(Color.GRAY);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s.charAt(s.length()-1) == '-' || s.charAt(s.length()-1) == '+' || s.charAt(s.length()-1) == '/' || s.charAt(s.length()-1) == '*'|| s.charAt(s.length()-1) == '%') {
					s = s.substring(0, s.length()-1);
					
				}
				else {
				for(int i = 1; i < s.length();i++) {
					if(s.charAt(i) == '%' || s.charAt(i) == '-' || s.charAt(i) == '/' || s.charAt(i) == '+' || s.charAt(i) == '*') {
						num = Double.parseDouble(s.substring(0,i));
						num2 = Double.parseDouble(s.substring(i+1, s.length()));
						c = s.charAt(i);
						s = function(num, num2, c);
					}
				}
				}
				s+= "*";
				textField.setText(s);
			}
		});
		button_13.setBounds(246, 197, 50, 45);
		frame.getContentPane().add(button_13);
		
		button_14 = new JButton("/");
		button_14.setForeground(Color.BLACK);
		button_14.setBackground(Color.GRAY);
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s.charAt(s.length()-1) == '-' || s.charAt(s.length()-1) == '+' || s.charAt(s.length()-1) == '/' || s.charAt(s.length()-1) == '*'|| s.charAt(s.length()-1) == '%') {
					s = s.substring(0, s.length()-1);
					
				}
				else {
				for(int i = 0; i < s.length();i++) {
					if(s.charAt(i) == '%' || s.charAt(i) == '-' || s.charAt(i) == '/' || s.charAt(i) == '+' || s.charAt(i) == '*') {
						num = Double.parseDouble(s.substring(0,i));
						num2 = Double.parseDouble(s.substring(i+1, s.length()));
						c = s.charAt(i);
						s = function(num, num2, c);
					}
				}
				}
				s+= "/";
				textField.setText(s);
			}
		});
		button_14.setBounds(246, 255, 50, 45);
		frame.getContentPane().add(button_14);
		
		button_15 = new JButton("0");
		button_15.setForeground(Color.BLACK);
		button_15.setBackground(Color.GRAY);
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += "0";
				textField.setText(s);
			}
		});
		button_15.setBounds(12, 313, 50, 45);
		frame.getContentPane().add(button_15);
		
		button_16 = new JButton(".");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += ".";
				textField.setText(s);
			}
		});
		button_16.setForeground(Color.BLACK);
		button_16.setBackground(Color.GRAY);
		button_16.setBounds(93, 313, 50, 45);
		frame.getContentPane().add(button_16);
		
		button_17 = new JButton("\u00B1");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s.charAt(0) == '-') {
					s = s.substring(1, s.length());
				}else {
					String temp = s;
					s= "";
					s  = "-" + temp;
				}
				textField.setText(s);
			}
		});
		button_17.setForeground(Color.BLACK);
		button_17.setBackground(Color.GRAY);
		button_17.setBounds(168, 313, 50, 45);
		frame.getContentPane().add(button_17);
		
		button_18 = new JButton("=");
		button_18.setForeground(Color.BLACK);
		button_18.setBackground(Color.GRAY);
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 1; i < s.length();i++) {
					if(s.charAt(i) == '%' || s.charAt(i) == '-' || s.charAt(i) == '/' || s.charAt(i) == '+' || s.charAt(i) == '*') {
						num = Double.parseDouble(s.substring(0,i));
						num2 = Double.parseDouble(s.substring(i+1, s.length()));
						c = s.charAt(i);
						s = function(num, num2, c);
					}
				}
				textField.setText(s);
			}
		});
		button_18.setBounds(246, 313, 50, 45);
		frame.getContentPane().add(button_18);
		
		textField = new JTextField();
		textField.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 30));
		textField.setBackground(Color.WHITE);
		textField.setBounds(27, 24, 248, 42);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("<-");
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button.setForeground(Color.BLACK);
		button.setBackground(Color.GRAY);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s = s.substring(0, s.length()-1);
				textField.setText(s);
			}
		});
		button.setBounds(12, 89, 50, 45);
		frame.getContentPane().add(button);
		
		btnC = new JButton("C");
		btnC.setForeground(Color.BLACK);
		btnC.setBackground(Color.GRAY);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s = "";
				textField.setText(s);
			}
		});
		btnC.setBounds(93, 89, 50, 45);
		frame.getContentPane().add(btnC);
		
	}
	public String function(double num, double num1, char c) {
		String s = "";
		if(c == '+') {
			s = num + num1 + "";
		}
		else if(c == '-') {
			s = num - num1 + "";
		}
		else if(c == '/') {
			s = num / num1 + "";
		}
		else if(c == '*') {
			s = num * num1 + "";
		}
		else if(c == '%') {
			s = num % num1 + "";
		}
		return s;
	}
	
	}

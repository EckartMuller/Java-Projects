import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField input;
	private double answer, number;
	int operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public void addInput(String str) {
		input.setText(input.getText() + str);
	}
	
	public void calculate() {
		switch(operation)
		{
			case 1:
				answer = number + Double.parseDouble(input.getText());
				input.setText(Double.toString(answer));
				break;
			case 2:
				answer = number - Double.parseDouble(input.getText());
				input.setText(Double.toString(answer));
				break;
			case 3:
				answer = number * Double.parseDouble(input.getText());
				input.setText(Double.toString(answer));
				break;
			case 4:
				answer = number / Double.parseDouble(input.getText());
				input.setText(Double.toString(answer));
				break;
		}
	}
	
	/**
	 * Create the frame.
	 */
	public Calculator() {
		setType(Type.UTILITY);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\MSI\\OneDrive\\Masaüstü\\Eclipse_Java\\Calculator\\src\\calcu.png"));
		setTitle("Calculator");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Screen = new JPanel();
		Screen.setBounds(10, 11, 364, 60);
		contentPane.add(Screen);
		Screen.setLayout(null);
		
		input = new JTextField();
		input.setEditable(false);
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setFont(new Font("Segoe UI", Font.BOLD, 22));
		input.setText("12+12");
		input.setToolTipText("");
		input.setBounds(10, 20, 344, 40);
		Screen.add(input);
		input.setColumns(10);
		
		JLabel lbl = new JLabel("New label");
		lbl.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl.setBounds(10, 10, 344, 13);
		Screen.add(lbl);
		
		JPanel Control = new JPanel();
		Control.setBounds(10, 81, 366, 372);
		contentPane.add(Control);
		Control.setLayout(new GridLayout(0, 4, 20, 20));
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());

			}
		});
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 22));
		Control.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("8");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());

			}
		});
		btnNewButton_2.setFont(new Font("Segoe UI", Font.BOLD, 22));
		Control.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("9");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());

			}
		});
		btnNewButton_2_1.setFont(new Font("Segoe UI", Font.BOLD, 22));
		Control.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("+");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 1;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_2_1_1.setFont(new Font("Segoe UI", Font.BOLD, 22));
		Control.add(btnNewButton_2_1_1);
		
		JButton btnNewButton = new JButton("4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());

			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 22));
		Control.add(btnNewButton);
		
		JButton btnNewButton_2_1_1_5 = new JButton("5");
		btnNewButton_2_1_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());

			}
		});
		btnNewButton_2_1_1_5.setFont(new Font("Segoe UI", Font.BOLD, 22));
		Control.add(btnNewButton_2_1_1_5);
		
		JButton btnNewButton_2_1_1_2 = new JButton("6");
		btnNewButton_2_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());

			}
		});
		btnNewButton_2_1_1_2.setFont(new Font("Segoe UI", Font.BOLD, 22));
		Control.add(btnNewButton_2_1_1_2);
		
		JButton btnNewButton_2_1_1_1 = new JButton("-");
		btnNewButton_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 2;
				input.setText("");
				lbl.setText(number + e.getActionCommand());

			}
		});
		btnNewButton_2_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 22));
		Control.add(btnNewButton_2_1_1_1);
		
		JButton btnNewButton_2_1_1_3 = new JButton("1");
		btnNewButton_2_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());

			}
		});
		btnNewButton_2_1_1_3.setFont(new Font("Segoe UI", Font.BOLD, 22));
		Control.add(btnNewButton_2_1_1_3);
		
		JButton btnNewButton_2_1_1_4 = new JButton("2");
		btnNewButton_2_1_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());

			}
		});
		btnNewButton_2_1_1_4.setFont(new Font("Segoe UI", Font.BOLD, 22));
		Control.add(btnNewButton_2_1_1_4);
		
		JButton btnNewButton_2_1_1_5_1 = new JButton("3");
		btnNewButton_2_1_1_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());

			}
		});
		btnNewButton_2_1_1_5_1.setFont(new Font("Segoe UI", Font.BOLD, 22));
		Control.add(btnNewButton_2_1_1_5_1);
		
		JButton btnNewButton_2_1_1_6 = new JButton("*");
		btnNewButton_2_1_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 3;
				input.setText("");
				lbl.setText(number + e.getActionCommand());

			}
		});
		btnNewButton_2_1_1_6.setFont(new Font("Segoe UI", Font.BOLD, 22));
		Control.add(btnNewButton_2_1_1_6);
		
		JButton btnNewButton_2_1_1_7 = new JButton("0");
		btnNewButton_2_1_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_2_1_1_7.setFont(new Font("Segoe UI", Font.BOLD, 22));
		Control.add(btnNewButton_2_1_1_7);
		
		JButton btnNewButton_2_1_1_5_2 = new JButton("=");
		btnNewButton_2_1_1_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				lbl.setText("");
			}
		});
		btnNewButton_2_1_1_5_2.setFont(new Font("Segoe UI", Font.BOLD, 22));
		Control.add(btnNewButton_2_1_1_5_2);
		
		JButton btnNewButton_2_1_1_5_3 = new JButton("C");
		btnNewButton_2_1_1_5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText("");
				lbl.setText("");
			}
		});
		btnNewButton_2_1_1_5_3.setFont(new Font("Segoe UI", Font.BOLD, 22));
		Control.add(btnNewButton_2_1_1_5_3);
		
		JButton btnNewButton_2_1_1_5_4 = new JButton("/");
		btnNewButton_2_1_1_5_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 4;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_2_1_1_5_4.setFont(new Font("Segoe UI", Font.BOLD, 22));
		Control.add(btnNewButton_2_1_1_5_4);
	}
}

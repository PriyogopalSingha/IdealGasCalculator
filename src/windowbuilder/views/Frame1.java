package windowbuilder.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Frame1 {

	private JFrame frame;
	private JComboBox cbPres;
	private JComboBox cbVol;
	private JComboBox cbTemp;
	private JComboBox cbGas;
	private JTextField txtVol;
	private JTextField txtTemp;
	private JTextField txtMol;
	private JTextField txtGas;
	private JTextField txtAns;
	private JTextField txtPres;
	private JLabel lblAns;
	private JLabel lblGas;
	private JLabel lblTemp;
	private JLabel lblVol;
	private JLabel lblPres;
	private JLabel lblMol;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 14));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Frame1.class.getResource("/windowbuilder/resources/calc128.png")));
		frame.setTitle("Ideal Gas Formula Calculator");
		frame.setBounds(100, 100, 669, 479);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("     Pressure");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 76, 26);
		frame.getContentPane().add(lblNewLabel);
		
		txtPres = new JTextField();
		txtPres.setBounds(33, 42, 198, 26);
		frame.getContentPane().add(txtPres);
		txtPres.setColumns(10);
		
		String pressure[] = {"Pascal","Pascal to Atm","Atm to Pascal","Atm"}; 
		cbPres = new JComboBox(pressure);
		
		cbPres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedPres =(String) cbPres.getSelectedItem();
				if(selectedPres.equals("Pascal")) {
					lblPres.setText("Pa");
				}
				else if(selectedPres.equals("Atm to Pascal")) {
					double atm = Double.parseDouble(txtPres.getText());
					double pa = 101325*atm;
					txtPres.setText(Double.toString(pa));
					lblPres.setText("Pa");
					
					
					
				}
				else if(selectedPres.equals("Pascal to Atm")) {
					double pa = Double.parseDouble(txtPres.getText());
					double atm = (double)pa/101325;
					
					txtPres.setText(Double.toString(atm));
					lblPres.setText("Atm");
					
				}
				else if(selectedPres.equals("Atm")) {
					lblPres.setText("Atm");
				}
				
			}
		});
		cbPres.setBounds(294, 44, 98, 22);
		frame.getContentPane().add(cbPres);
		
		txtVol = new JTextField();
		txtVol.setBounds(33, 118, 198, 30);
		frame.getContentPane().add(txtVol);
		txtVol.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("   Volume");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(21, 85, 76, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("   Temperature");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 159, 98, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtTemp = new JTextField();
		txtTemp.setBounds(33, 184, 198, 30);
		frame.getContentPane().add(txtTemp);
		txtTemp.setColumns(10);
		
		txtMol = new JTextField();
		txtMol.setBounds(33, 256, 198, 30);
		frame.getContentPane().add(txtMol);
		txtMol.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("No. of moles");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(21, 231, 88, 22);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtGas = new JTextField();
		txtGas.setBounds(33, 329, 198, 30);
		frame.getContentPane().add(txtGas);
		txtGas.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Universal Gas Const.");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(26, 297, 136, 29);
		frame.getContentPane().add(lblNewLabel_4);
		
		String volm[] = {"Litre(s)","cm cube","m cube","Litre to metre cube","Litre to cm cube", "cm cube to Litre","metre cube to Litre","cm cube to metre cube", "metre cube to cm cube"}; 
		cbVol = new JComboBox(volm);
		
		cbVol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				
						String selectedVol =(String) cbVol.getSelectedItem();
						if(selectedVol.equals("Litre(s)")) {
							lblVol.setText("Litre(s)");
							
						}
						else if(selectedVol.equals("cm cube")) {
							lblVol.setText("cm cube");
							
						}else if(selectedVol.equals("m cube")) {
							lblVol.setText("m cube");
							
						}
						else if(selectedVol.equals("Litre to metre cube")) {
							double l = Double.parseDouble(txtVol.getText());
							double m = (double)l*0.001;
							txtVol.setText(Double.toString(m));
							lblVol.setText("cubic meter(s)");
							
						}
						else if(selectedVol.equals("Litre to cm cube")) {
							double l = Double.parseDouble(txtVol.getText());
							double cm = (double)l*1000;
							
							txtVol.setText(Double.toString(cm));
							lblVol.setText("cubic cm(s)");
							
						}
						else if(selectedVol.equals("cm cube to Litre")) {
							
							double cm = Double.parseDouble(txtVol.getText());
							double l = (double)cm/1000;
							
							txtVol.setText(Double.toString(l));
							lblVol.setText("cubic cm(s)");
							
							
						}
						else if(selectedVol.equals("metre cube to Litre")) {

							double m = Double.parseDouble(txtVol.getText());
							double l = (double)m*1000;
							
							txtVol.setText(Double.toString(l));
							lblVol.setText("Litre(s)");
							
						}
						else if(selectedVol.equals("cm cube to metre cube")) {

							double cm = Double.parseDouble(txtVol.getText());
							double m = (double)cm/1000000;
							
							txtVol.setText(Double.toString(m));
							lblVol.setText("cubic meter(s)");
							
							
						}
						else if(selectedVol.equals("metre cube to cm cube")) {

							double m = Double.parseDouble(txtVol.getText());
							double cm = (double)m*1000000;
							
							txtVol.setText(Double.toString(cm));
							lblVol.setText("cubic cm(s)");
							
						}
						
						}
						
						
					
				
				
			
		});
		cbVol.setBounds(296, 122, 136, 22);
		frame.getContentPane().add(cbVol);
		
		
		String temp[] = {"Celsius","Kelvin","Fahrenheit","Celsius to Kelvin", "Kelvin to Celsius", "Celsius to Fahrenheit", "Kelvin to Fahrenheit", "Fahrenheit to Kelvin","Fahrenheit to Celsius"};
		cbTemp = new JComboBox(temp);
		cbTemp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String selectedTemp =(String) cbTemp.getSelectedItem();
				if(selectedTemp.equals("Celsius")){
					lblTemp.setText("Celsius");
				}
				else if(selectedTemp.equals("Kelvin")){
					lblTemp.setText("Kelvin");
				}
				else if(selectedTemp.equals("Fahrenheit")){
					lblTemp.setText("Fahrenheit");
				}
				else if(selectedTemp.equals("Celsius to Kelvin")) {
					double c = Double.parseDouble(txtTemp.getText());
					double k = (double)c + 273.15;
					txtTemp.setText(Double.toString(k));
					lblTemp.setText("K"); 
					
				}
				else if(selectedTemp.equals("Kelvin to Celsius")) {
					double k = Double.parseDouble(txtTemp.getText());
					double c = (double)k - 273.15;
					txtTemp.setText(Double.toString(c));
					lblTemp.setText("C");
					
				}
				else if(selectedTemp.equals("Celsius to Fahrenheit")) {
					double c = Double.parseDouble(txtTemp.getText());
					double f = (double)(9/5)*c + 32;
					txtTemp.setText(Double.toString(f));
					lblTemp.setText("F");
					
					
				}
				else if(selectedTemp.equals("Kelvin to Fahrenheit")) {

					double k = Double.parseDouble(txtVol.getText());
					double f = (double)(9/5)*(k-273.15)+32;
					
					txtTemp.setText(Double.toString(f));
					lblTemp.setText("F");
				}
				else if(selectedTemp.equals("Fahrenheit to Kelvin")) {

					double f = Double.parseDouble(txtTemp.getText());
					double k = (double)(f-32)*(5/9)+273.15;
					txtTemp.setText(Double.toString(k));
					lblTemp.setText("K");
					
				}
				else if(selectedTemp.equals("Fahrenheit to Celsius")) {

					double f = Double.parseDouble(txtTemp.getText());
					double c = (double)(f-32)*(5/9);
					txtTemp.setText(Double.toString(c));
					lblTemp.setText("C");
					
				}
				
				}
			
		});
		cbTemp.setBounds(296, 188, 136, 22);
		frame.getContentPane().add(cbTemp);
		
		String gas[] = {"8.314 J/mol.K","0.0821 L.atm/mol/K"};
		cbGas = new JComboBox(gas);
		
		
		cbGas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedConst = (String) cbGas.getSelectedItem();
				if(selectedConst.equals("8.314 J/mol.K")) {
					txtGas.setText("8.31446261815324");
					lblGas.setText("J/mol.K");
				}
				else if(selectedConst.equals("0.0821 L.atm/mol/K")) {
					txtGas.setText("0.082057366080960");
					lblGas.setText("L.atm/mol/K");
				}
				
			}
		});
		cbGas.setBounds(317, 333, 125, 22);
		frame.getContentPane().add(cbGas);
		
		JButton btnPres = new JButton("FIND PRESSURE");
		btnPres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double v = Double.parseDouble(txtVol.getText());
					double t = Double.parseDouble(txtTemp.getText());
					double n = Double.parseDouble(txtMol.getText());
					double r = Double.parseDouble(txtGas.getText());
					double ans1 = (double)(n*r*t)/v; 
					txtAns.setText(Double.toString(ans1));
					lblAns.setText(lblPres.getText());
					
					}
					catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
					}
			}
		});
		btnPres.setBounds(506, 44, 125, 23);
		frame.getContentPane().add(btnPres);
		
		JButton btnVol = new JButton("FIND VOLUME");
		btnVol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
				double p = Double.parseDouble(txtPres.getText());
				double t = Double.parseDouble(txtTemp.getText());
				double n = Double.parseDouble(txtMol.getText());
				double r = Double.parseDouble(txtGas.getText());
				double ans1 = (double)(n*r*t)/p; 
				txtAns.setText(Double.toString(ans1));
				lblAns.setText(lblVol.getText());
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnVol.setBounds(506, 122, 125, 23);
		frame.getContentPane().add(btnVol);
		
		JButton btnTemp = new JButton("FIND TEMPERATURE");
		btnTemp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			try {
				double p = Double.parseDouble(txtPres.getText());
				double v = Double.parseDouble(txtVol.getText());
				double n = Double.parseDouble(txtMol.getText());
				double r = Double.parseDouble(txtGas.getText());
				double ans1 = (double)(p*v)/(n*r); 
				txtAns.setText(Double.toString(ans1));
				lblAns.setText(lblTemp.getText());
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
			
				}
			}
		});
		btnTemp.setBounds(507, 213, 136, 23);
		frame.getContentPane().add(btnTemp);
		
		JButton btnMol = new JButton("FIND NO. OF MOLES");
		btnMol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double p = Double.parseDouble(txtPres.getText());
					double t = Double.parseDouble(txtTemp.getText());
					double v = Double.parseDouble(txtVol.getText());
					double r = Double.parseDouble(txtGas.getText());
					double ans1 = (double)(p*v)/(r*t); 
					txtAns.setText(Double.toString(ans1));
					lblAns.setText(lblMol.getText());
					}
					catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
					}
			}
		});
		btnMol.setBounds(507, 297, 136, 23);
		frame.getContentPane().add(btnMol);
		
		txtAns = new JTextField();
		txtAns.setBounds(271, 391, 148, 38);
		frame.getContentPane().add(txtAns);
		txtAns.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Answer is :");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_5.setBounds(196, 397, 80, 26);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblPres = new JLabel("Unit");
		lblPres.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPres.setBounds(238, 48, 46, 14);
		frame.getContentPane().add(lblPres);
		
	    lblVol = new JLabel("Unit");
	    lblVol.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblVol.setBounds(238, 126, 46, 14);
		frame.getContentPane().add(lblVol);
		
	    lblTemp = new JLabel("Unit");
	    lblTemp.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTemp.setBounds(240, 192, 46, 14);
		frame.getContentPane().add(lblTemp);
		
		lblGas = new JLabel("Unit");
		lblGas.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblGas.setBounds(241, 337, 46, 14);
		frame.getContentPane().add(lblGas);
		
		lblAns = new JLabel("Unit");
		lblAns.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAns.setBounds(429, 403, 46, 14);
		frame.getContentPane().add(lblAns);
		
		lblMol = new JLabel("mol.");
		lblMol.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblMol.setBounds(241, 264, 46, 14);
		frame.getContentPane().add(lblMol);
		
		JButton btnNewButton = new JButton("RESET");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   txtVol.setText("");
			   txtTemp.setText("");
			   txtPres.setText("");
			   txtGas.setText("");
			   txtMol.setText("");
			   txtAns.setText("");
			}
		});
		btnNewButton.setBounds(509, 353, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}

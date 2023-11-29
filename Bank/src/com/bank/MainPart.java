package com.bank;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*This program is an example only to show a mock bank program */

 class BankAccount {

	
	 double account_balance = 0.00;
	 
	 public BankAccount(double x) {account_balance = x;}

	public double getBalance() {return account_balance;}

	public void deposit(double intrest) {account_balance += intrest;}
	
}


public class MainPart {


	 private static final int FRAME_WIDTH = 120;
	 private static final int FRAME_HIGHT = 60;
	 private static final double INTREST_RATE = 10;
	 private static final double INTIAL_BALANCE = 1000;

	
	
public static void main(String[] args) {
		
	
	
	JFrame frame = new JFrame();
	JButton intrest_button = new JButton("INTREST");
	JPanel panel = new JPanel();
    final BankAccount account = new BankAccount(INTIAL_BALANCE);
    frame.add(panel);
	JLabel label = new JLabel("Balance: $" + account.getBalance());
	System.out.println("Start Balance: " + account.getBalance());
	
class AddInterestListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			double intrest = (account.getBalance() *  INTREST_RATE) / 100;
			account.deposit(intrest);
			System.out.println("Balance: $" + account.getBalance());
			label.setText("Balance: $" + account.getBalance());
		}}
	
	
	panel.add(intrest_button);
	panel.add(label);
	ActionListener listener = new AddInterestListener();
	intrest_button.addActionListener(listener);
	frame.setSize(FRAME_WIDTH, FRAME_HIGHT);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	
	
	
}

}

package rLaforeAlgorithmJava.bank;

public class BankAccount {

	private double balance;
	
	public BankAccount(double openingBalance) {
		balance = openingBalance;
	}
	
	public void deposit(double amaount) {
		balance = balance + amaount;
	}
	
	public void withdraw(double amaount) {
		balance = balance - amaount;
	}
	
	public void display() {
		System.out.println("balance=" + balance);
	}
}

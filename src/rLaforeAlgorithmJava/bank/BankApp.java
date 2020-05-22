package rLaforeAlgorithmJava.bank;

import java.io.*;

public class BankApp {

	public static void main(String[] args) {
		
		BankAccount ba1 = new BankAccount(100.00);
		System.out.println("Before transactions.");
		ba1.display();
		
		ba1.deposit(74.35);
		ba1.withdraw(20.00);
		System.out.println("After transactions.");
		ba1.display();
		
		System.out.println("@@@@@@@@@@@@@@@@@");
		try {
			String strTest = getString();
			System.out.println("@@@@@@@@@@@@@@@@@ String :");
			System.out.println("srtTest :: " + strTest);
			System.out.println("@@@@@@@@@@@@@@@@@ char :");
			char ch = getChar();
			System.out.println("ch :: " + ch);
			System.out.println("@@@@@@@@@@@@@@@@@ int :");
			int intStr = getInt();
			System.out.println("intStr :: " + intStr);
			System.out.println("@@@@@@@@@@@@@@@@@ double :");
			double doublStr = getDouble();
			System.out.println("doublStr :: " + doublStr);
			System.out.println("@@@@@@@@@@@@@@@@@");
		} catch(IOException ex) {
			System.out.println("IOException :: " + ex);
		}
		
	}
	
	public static String getString() throws IOException {
		InputStreamReader inStrReader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inStrReader);
		String str = br.readLine();
		return str;
	}
	
	public static char getChar() throws IOException {
		String str = getString();
		return str.charAt(0);
	}

	public static int getInt() throws IOException {
		String str = getString();
		return Integer.parseInt(str);
	}
	
	public static double getDouble() throws IOException {
		String str = getString();
		Double doub = Double.valueOf(str);
		return doub.doubleValue();
	}
}

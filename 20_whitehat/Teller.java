/*
Nafiz Labib, Jing Yi Feng, Jomin Zhang - Heroes of the Zeroes
APCS
HW 20 - External Audit
2021-10-19
DISCo
It was interesting to see code from someone else and test the code simultaneously. 

QCC -
What operations are possible from BankAccount's main() mthod but not Teller's?? 
 */

public class Teller {
	public static void main (String[] args){
		BankAccount hacker = new BankAccount();
		hacker.setName("Hacker");
		hacker.setPasswd("hacker");
		System.out.println(hacker.toString());
		hacker.setPin((short) 999);
		System.out.println(hacker.toString());
		// Pin restrictions work, just change error message to "Pin" instead of account number.
		// Also, 9999 is a valid PIN, so error statement should be changed a bit.
		hacker.setPin((short) 1234);
		// We tried putting a pin without short before, it gives error message. Good
		hacker.setAcctNum(12);
		System.out.println(hacker.toString());
		// Account Number error message appears like normal. Similar to Pin error message, you should still include 999999999 as part of the accepted interval set.
		hacker.setAcctNum(123456789);
		System.out.println(hacker.toString());
		// Works like normal when 9-digit number is entered.
		hacker.setBalance(100);
		// No unique restrictions other than double.
		System.out.println(hacker.toString());
		// Works like expected.
		hacker.deposit(200);
		System.out.println(hacker.toString());
		// Able to deposit money.
		hacker.withdraw(300);
		System.out.println(hacker.toString());
		// Able to withdraw money.
		System.out.println("Account Login: " + hacker.authenticate(111111111, "hacker"));
		// acctNum false, passwd true: login false
		System.out.println("Account Login: " + hacker.authenticate(123456789, "hack"));
		// acctNum true, passwd false: login false
		System.out.println("Account Login: " + hacker.authenticate(123456789, "hacker"));
		// acctNum true, passwd true: login true
		
		

		
	}

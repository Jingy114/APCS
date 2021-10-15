/*TNPG: Heros of the Zeros: Jing Yi Feng, Nafiz Labib, Jomin Zhang
APCS
HW18: CPA-One
20210-10-14

QCC
*/

public class BankAccount{
	String name;
	String accPass;
	int PIN;
	int accNum;
	double balance;
	
	public BankAccount(){
	name = "Jomin";
	accPass = "jomin";
	PIN = 1234;
	accNum = 123456789;
	balance = 1000.10;
	}
	
	public void ShowInfo(){
	System.out.println("Name: " + name);
	System.out.println("Account Password: " + accPass);
	System.out.println("PIN: " + PIN);
	System.out.println("Account Number: " + accNum);
	System.out.println("Balance: " + balance);
	}
	
	public void Deposit(double deposit){
		balance = balance + deposit;
		System.out.println("New balance: " + balance);
	}
	
	public static void main (String [] args){
	BankAccount Jomin = new BankAccount();
	Jomin.ShowInfo();
	Jomin.Deposit(1000.01);
	//System.out.println(name);
	//BankAccount.ShowInfo();
	}
	
}

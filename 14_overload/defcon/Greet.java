/*
TNPG: Tiger- Jing Yi Feng (Biscuit), Josiah Moltz (hedwig),Brian, help from Emi>
APCS
HW14 -- Customize Your Creation
2021-10-07

DISCO
-Default Constructors take no arguments
-Default constructor take no parameters
-     
QCC
-what are overloaded methods?
*/
public class Greet {
	public static void main (String[] args) {
		String greeting;
		BigSib richard = new BigSib();
		BigSib mark = new BigSib();
		BigSib farihah = new BigSib(); 
		BigSib bob = new BigSib();

	greeting = richard.greet("freshman");
		System.out.print(greeting);

	greeting = mark.greet("Dr.Spaceman");
	System.out.print(greeting);

	greeting = farihah.greet("Kong Fooey");
	System.out.print(greeting);

	greeting = bob.greet("mom");
	System.out.print(greeting);

	}
}

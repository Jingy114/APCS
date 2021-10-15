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
-why are there seperate greet.class and BigSib.class files on github when it was not there for previous hws?

*/
public class BigSib{
  public BigSib(){
    HelloMsg = "Word up";
}

	public BigSib (String message){
    HelloMsg = message;
  }

	String HelloMsg;

	public String greet(String name) {
		return(HelloMsg + " " + name);
	}
}

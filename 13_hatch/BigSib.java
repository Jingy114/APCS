/*TNPG:Tiger Jing Yi Feng(Biscuit),Josiah Moltz(hedwig)
APCS
HW12: On Elder Individuality and the Elimination of Radio Fuzz
2021-10-05

DISCO
-The format for constructor is public <class name>
-Constructor must be public so the other class can initialize the varaibles.
-Only one constructor per class (?)
QCC
-Why can't you initialize variables (ignoring their definition) outside of a method?
*/
public class BigSib{
	public BigSib(){//the format of constructor (public and then <classname>
		 HelloMsg  = "Word up";
	}

	String HelloMsg;

	public  String greet(String name){
		return HelloMsg + " " + name;
	}
}

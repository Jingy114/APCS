/*
Heroes of the Zeroes - Nafiz Labib, Jing Yi Feng, Jomin Zhang
APCS
HW 29 - Which Way Do You Roll?
2021-11-02
Time Spent: ~ 1 hour

DISCO
-Integer.parseInt converts from String to int
-In the main method the for (String arg : args) allows main method to run 
QCC
-are there alternative ways to convert from int to string without using parseInt?
-If parseInt is used in the main method does it still need to be used in the body?
*/

public class Commafier {

public static String commafyF(int n){
String output = ""; //changes from int to String(?)
String numberThatsString  = Integer.toString(n); //int to string
int strLen = numberThatsString.length(); 
for (int i = 0; i < strLen; i++) {
	output +=  numberThatsString.charAt(i); 
	if ((strLen - i) % 3 == 1 && (i != (strLen -1))) {
		output += ",";
	}
	}
	return output;
}

public static String commafyR(int n) {
String numberThatsString  = Integer.toString(n); //int to string
//int strLen = numberThatsString.length(); //not sure if this is needed
if (numberThatsString.length() <= 3){
	return numberThatsString;
	}
	else{
        return commafyR(Integer.parseInt(numberThatsString.substring(0, numberThatsString.length()-3))) + "," + numberThatsString.substring(numberThatsString.length()-3, numberThatsString.length());
	}
}

public static void main(String args[]) {
	for (String arg : args){
	int intArg = Integer.parseInt(arg);
	System.out.println(commafyF(intArg));
	System.out.println(commafyR(intArg));
	}
	System.out.println(commafyF(1000));
	System.out.println(commafyR(1000));
}
}

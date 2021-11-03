/*
headin
g*/

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

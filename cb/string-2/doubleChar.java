/**
Given a string, return a string where for every char in the original, there are two chars.
**/

public class doubleChar {

public static String doubleChar(String str) {
  String output = "";
  for (int i = 0; i <= str.length()-1; i++){
    String letter = str.substring(i, i+1);
    output = output + letter + letter;
  }
  return output;
}

public static void main (String args[]) {
System.out.println(doubleChar("The")); // → "TThhee"
System.out.println(doubleChar("AAbb")); // → "AAAAbbbb"
System.out.println(doubleChar("Hi-There")); //→ "HHii--TThheerree"
	}
}


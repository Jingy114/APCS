/*
* TNPG: Four {Fang Chen, Kaitlin Ho, Jing yi Feng}
* APCS
* HW34 -- A Pirate's Life for Me
* 2021-11-15
* time spent: 1 hr
*/

public class Loopier {

static int[] test0 = new int [10];
static int[] test1 = {1, 2, 3, 50, 100, 1, 11};

//A static method to populate an existing array with randomly generated ints.
public static int[] popInt(int[] a) {
	for(int i = 0; i < a.length; i++) {
		a[i] = (int)(Math.random()*100);
	}
	return a;
}

//A static method to return a String version of an array of ints.
public static String strVer(int[] a) {
	String result = "";
	for(int i = 0; i < a.length; i++) {
		result = result + a[i] + ", ";
	}
	return result.substring(0,result.length()-2);
}

//static implementations of a linear search function that will return the index of the first occurrence of a target in an existing array, or -1 if not found
//Iteration Version
public static int linSearch(int[] a, int target) {
	for(int i = 0; i < a.length; i++) {
		if (a[i] == target){
			return i;
		}
	}
	return -1;
}

//Recursive

public static boolean hasTarget(int[] a, int target) {
	boolean has = false;
	for (int i = 0; i < a.length; i++) {
		if (a[i] == target) {
			has = true;
		}
	}
	return has;
}

public static int linSearchR(int[] a, int target){
	if (hasTarget(a, target)) {
		if (a[0] == target) {
			return 0;
		} else {
			int[] aNew = new int[a.length-1];
	
			for (int i = 1; i < a.length; i++) {
				aNew[i-1] = a[i];
			}

			return 1 + linSearchR(aNew, target);
		}
	}
	return -1;
}

//static implementations of a frequency function that will return the number of occurrences of a target in an existing array
//Iteration
public static int freq( int[] a, int target) {
	int freqCount = 0;
	for(int i = 0; i < a.length; i++) {
		if (a[i] == target){
			freqCount = freqCount + 1;
		}
	}
	return freqCount;
}

//Recursive
public static int freqR( int[] a, int target){
	if (a.length == 0) {
		return 0;
	} else {
		int[] aNew = new int[a.length-1];
		for (int i = 1; i < a.length; i++) {
			aNew[i-1] = a[i];
		}
		if (a[0] == target) {
			return 1 + freqR(aNew, target);
		} else {
			return freqR(aNew, target);
		}
	}
}
public static void main(String[] args){
	System.out.println(strVer(popInt(test0)));
	System.out.println(linSearch(test1, 2));
	System.out.println(linSearchR(test1, 2));
	System.out.println(freq(test1, 1));
	System.out.println(freqR(test1, 1));
}
}

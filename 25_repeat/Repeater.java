/***
Nafiz Labib, Jing Yi Feng - Dream Team
APCS
HW 25 - Do I repeat myself?
2021-10-26
Time Spent: ~ 0.5 hr

DISCO
-recursion utlizies if else statements and while loops repeats the code while the condition is satisfied

QCC
-N/A 
***/

public class Repeater {

	public static String fenceW(int numPosts) {
	int posts = 1;
	String newFence = "|";
	//start of while loop
	while( numPosts > posts) {
		newFence+="--|";
		posts++;
	} return newFence;
	}

	public static String fenceR(int numPosts) {
		String newFence = "|";
		if (numPosts == 1){
			return "|"; //default, simplest form of fenc		
		} else{
			return fenceR(numPosts - 1) + "--|";}
		}

	public static void main(String[] args){
  System.out.println("fenceW Results...");
  System.out.println(fenceW(1) + "     fenceW(1)");
  System.out.println(fenceW(3) + "     fenceW(3)");
  System.out.println(fenceW(-1) + "     fenceW(-1)"); // prints original post because it's not part of while loop but does NOT print more posts because numPosts > posts never happens. 
  
  System.out.println("\nfenceR Results...");
  System.out.println(fenceR(1) + "     fence(1)");
  System.out.println(fenceR(3) + "     fence(3)");
  System.out.println(fenceR(-1) + "     fence(-1)"); // prints original post because it's part of condition, but does NOT print more posts because condition states that more can't be printed if numPosts <= 1.


} //end of main
} //end of class

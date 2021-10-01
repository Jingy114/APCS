/*
Jing Yi Feng
APCS
HW08 -- Refactor Freshie Zero/Writing java code that greets specific people
2021-09-30
*/

public class Greet {
	public static void main(String[] args) {
		greet("Brian");
		greet("Kaitlin");
		greet("Emily");
	}
	public static void greet(String name) {
		System.out.print("Why, hello there," + name + ". How do you do?");
	}
}


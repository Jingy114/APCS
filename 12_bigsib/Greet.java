/*TNPG:Tiger Jing Yi Feng,Josiah Moltz,  Biscuit
APCS
HW12: On Elder Individuality and the Elimination of Radio Fuzz
2021-10-05

*/
public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
    richard.setHelloMsg("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);

  } //end main()
} //end Greet

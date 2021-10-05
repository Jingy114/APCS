/*TNPG:... Jing Yi Feng, Biscuit
APCS
HW10 -- Refactor Big Sib One
2021-10-04

DISCOVERIES
Using System.out.println is different from just calling BigSib.greet.
The returned texts are not on the ssame line

UNRESOLVED QUESTIONS

*/public class Greet {
    public static void main( String[] args ){
        System.out.println( BigSib.greet("Crosby") );
        System.out.println( BigSib.greet("Stills") );
        System.out.println( BigSib.greet("Nash") );
    }
}

/***
TNPG: Dream Team Jing Feng, Nafix Labib
HW 23 - What Does Equality Look Like?
2021-10-24

QCC
-I had a lot of trouble with the method for toString and flip
-does Math.random() generate any random int or double and from what intervals?
DISCO
-
 ***/

public class Coin {

  //attributes aka instance vars
public double value;
public boolean upFace;
public String name;
public int flipCtr;
public int headsCtr;
public int tailsCtr;
public int bias;



  /***
   *  Coin() -- default constuctor
   *  precond:
   *  postcond:
   ***/
  public Coin() {

  }
  
/*
public Coin(String name) {
	name = name;
	
}

public Coin(String name, String upFace) {
	name = name;
	upFace = "heads";
}

public String flip(boolean upFace){
	if(){
	
	}
	else{
	
	}
	
}

public boolean equals(upFace, otherCoin){
	if(upFace = otherCoin){
		return true;
	}
	else{
		return false;
	}
}

public void assignValue(String name){
	if (name.equals ("penny")) {
		value = 0.01;
	} else if (name.equals ("nickel")) {
		value = 0.05;
	} else if (name.equals ("dime")) {
		value = 0.10;
	} else if (name.equals ("quarter")) {
		value = 0.25;
	}
	return value
	
}
*/


  /***
      Coin(String) -- overloaded constructor
      precond: input is one of
      "penny",
      "nickel",
      "dime",/***
    driver for class Coin
    ~~~ SUGGESTED WORKFLOW: ~~~
    1. Compile this file and run. Note anything notable.
    2. Move the "TOP" line down, so that it is below the first statement.
    (emacs: with cursor at beginning of TOP line, C-k C-k, DOWN, DOWN, C-y)
    (your editor: ???)
    3. Compile and run again.
    4. Resolve errors one at a time until it works.
    5. Repeat 2-4 until TOP meets BOTTOM.
***/

public class Driver {

  public static void main( String[] args ) {

    //build Objects from blueprint specified by class Coin


    //test default constructor
    /*===================TOP==========================
      Coin mine = new Coin();
      //test 1st overloaded constructor
      Coin yours = new Coin( "quarter" );
      //test 2nd overloaded constructor
      Coin wayne = new Coin( "dollar", "heads" );
      //test toString() methods of each Coin
      System.out.println("mine: " + mine);
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);
      //test flip() method
      System.out.println("\nAfter flipping...");
      yours.flip();
      wayne.flip();
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);
      //test equals() method
      if ( yours.equals(wayne) ) {
        System.out.println( "Matchee matchee!" );
      }
      else {
        System.out.println( "No match. Firestarter you can not be." );
      }
      ====================BOTTOM======================*/

  }//end main()

}//end class
      "quarter",
      "half dollar",
      "dollar"
      postcond:
  ***/
  public Coin( String s ) {
	name = s
  }


  /***
      Coin(String,String) --
      precond:
      postcond:
  ***/
  public Coin( String s, String nowFace ) {
	name = s;
	newFace = nowFace;
  }


  // Accessors...
  // ----------------------------
  public String getUpFace() {

  }

  public int getFlipCtr() {

  }

  public double getValue() {

  }

  public int getHeadsCtr() {

  }

  public int getTailsCtr() {

  }
  // ----------------------------


  /***
   * assignValue() -- set a Coin's monetary value based on its name
   * precond:  input String is a valid coin name ("penny", "nickel", etc.)
   * postcond: instvar value gets appropriate value
   * Returns value assigned.
   ***/
  private double assignValue( String s ) {
	if (name.equals ("penny")) {
		value = 0.01;
	} else if (name.equals ("nickel")) {
		value = 0.05;
	} else if (name.equals ("dime")) {
		value = 0.10;
	} else if (name.equals ("quarter")) {
		value = 0.25;
	} else if (name.equals ("half dollar")) {
		value = 0.50;
	} else if (name.equals ("dollar")) {
		value = 1.00;
	return value

  }


  /***
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
  ***/
  public void reset( String s, double d ) {
	s = upFace;
	d = bias;
  }


  /***
   * String flip() -- simulates a Coin flip
   * precond:  bias is a double on interval [0.0,1.0]
   * (1.0 indicates always heads, 0.0 always tails)
   * postcond: upFace updated to reflect result of flip.
   * flipCtr incremented by 1.
   * Either headsCtr or tailsCtr incremented by 1, as approp.
   * Returns "heads" or "tails"
   ***/
  public String flip() {
	//very confused about how to write flip
  }


  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up
   * precond: other is not null
   * postcond: Returns true if both coins showing heads
   * or both showing tails. False otherwise.
   ***/
  public boolean equals( Coin other ) {
	if (upFace = other.upFace) {
		return true;
		}
	else {
		eturn false;
	}
  }


  /***
   * String toString() -- overrides toString() provided by Java
   * precond: n/a
   * postcond: Return String comprised of name and current face
   ***/
  public String toString() {
// could not figure out 
  }

}//end class

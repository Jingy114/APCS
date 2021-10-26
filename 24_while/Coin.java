/***
Nafiz Labib, Jing Yi Feng - Dream Team
APCS
HW 23 - What Does Equality Look Like?
2021-10-24
Time Spent: ~1.0
DISCO - First time I tried printing out the results of my constructors, I get locations where new Coins are stored instead of actual string outputs (ex. Coin@85ede7b). 
Credit to Google, Math.random gives a random value from 0.0 to 1.0.
QCC - N/A
Credit to Ameer and Hugo, we compared our work with theirs, especially the overloaded constructors where we had the same idea to place if statements for the names.
 ***/

public class Coin {

  //attributes aka instance vars
  private double value;
  private String upFace;
  private String name;
  private int flipCtr;
  private int headsCtr;
  private int tailsCtr;
  private double bias;
  


  /***
   *  Coin() -- default constuctor
   *  precond:
   *  postcond:
   ***/
  public Coin() {
  name = "null";
  upFace = "heads";
  flipCtr = 0;
  headsCtr = 0;
  tailsCtr = 0;
  bias = 0.5;
    }


  /***
      Coin(String) -- overloaded constructor
      precond: input is one of
      "penny",
      "nickel",
      "dime",
      "quarter",
      "half dollar",
      "dollar"
      postcond:
  ***/
  public Coin( String s ) {
    if ((s == "penny")|| (s == "nickel") || (s == "dime")|| (s=="quarter")|| (s== "half dollar" )|| (s == "dollar")){
            name = s;
    } else {
  System.out.println("Invalid coin name");

}
upFace="heads";
}

  /***
      Coin(String,String) --
      precond:
      postcond:
  ***/
  public Coin( String s, String nowFace ) {
    if ((s == "penny")|| (s == "nickel") || (s == "dime")|| (s=="quarter")|| (s== "half dollar" )|| (s == "dollar")){
      name = s;
    }
    if((nowFace == "heads")|| (nowFace == "tails")){
      upFace = nowFace;
    }

}
  
// Accessors...
  // ----------------------------
  public String getUpFace() {
    return upFace;
  }

  public int getFlipCtr() {
    return flipCtr;
  }

  public double getValue() {
    return value;
  }

  public int getHeadsCtr() {
    return headsCtr;
  }

  public int getTailsCtr() {
    return tailsCtr;
  }
  // ----------------------------  
  
  /***
   * assignValue() -- set a Coin's monetary value based on its name
   * precond:  input String is a valid coin name ("penny", "nickel", etc.)
   * postcond: instvar value gets appropriate value
   * Returns value assigned.
   ***/
  private double assignValue( String s ) {
    if(s == "penny"){
    value = 0.01;
    }
    if(s == "nickel"){
    value = 0.05;
    }
    if(s == "dime"){
    value = 0.10;
    }
    if(s == "quarter"){
    value = 0.25;
    }
    if(s == "half dollar"){
    value = 0.50;
    } 
    if(s == "dollar"){
    value = 1.00;
    }
    return value;
  } 
  
 /***
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
  ***/
  public void reset( String s, double d ) {
    if((s == "heads")|| (s == "tails") && (0<=d) && (d<=1)){
    upFace = s;
    flipCtr=0;
    headsCtr=0;
    tailsCtr=0;
    bias=.5;
  }
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
  double n = Math.random();
  flipCtr+=1;
  if(n >= 0.50){
  headsCtr+=1;
  upFace = "heads";
  bias = headsCtr/flipCtr;
  return upFace;}
  else{
  tailsCtr+=1;
  upFace = "tails";
  flipCtr+=1;
  bias=headsCtr/flipCtr;
  return upFace;
    }
  }
  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up
   * precond: other is not null
   * postcond: Returns true if both coins showing heads
   * or both showing tails. False otherwise.
   ***/
  public boolean equals( Coin other ) {

    return other.upFace==upFace;
}
  /***
   * String toString() -- overrides toString() provided by Java
   * precond: n/a
   * postcond: Return String comprised of name and current face
   ***/
  public String toString() {
    return name + " -- " + upFace;
  }

}//end class     

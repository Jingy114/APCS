/*
<Brianiacs (Jing Yi Feng, Brian Kang, Brian Wang)
APCS
HW<55> --  Never Fear, Big Oh Is Here!
2022-01-11
time spent: .3 hrs

DISCO

QCC
-do we have to write time complexity/best case/worst case for toString?
-if so, what are the best/worst cases?
*/

import java.util.ArrayList;

public class OrderedArrayList
{

  // instance of class ArrayList, holding objects of type Integer
  // (i.e., objects of a class that implements interface Integer)
  private ArrayList<Integer> _data;

  // default constructor
  // initializes instance variables
  public OrderedArrayList()
  {
    _data = new ArrayList<Integer>(10);
  }

  public String toString()
  {
    if (_data.size() == 0) {
      return "[]";
    } 
    String string = "[";
    for (int x : _data) {
      string += x + ",";
    }
    return string.substring(0, string.length()-1) + "]";
  }

  //Time complexity is O(n), there is a linear relationship between size of array and Time
  //Best Case: Element at the end of array is removed requiring no shifts.
  //Worst Case: First element is removed, all other elements needs to be shifted.
  public Integer remove( int i )
  {
    return _data.remove(i);
  }

  //Time Complexity: O(1), there is a constant relationship
  //Best Case: -
  //Worst Case -
  public int size()
  {
    return _data.size();
  }

  //Time Complexity: O(1), constant relationship
  //Best Case:-
  //Worst Case:-
  public Integer get( int i )
  {
    return _data.get(i);
  }


  //add at index
  //Time complexity is O(n). There is a linear relationship between the of the array and the time it takes.
  //Best Case: Element is the smallest number in array, can be added to beginning of list
  //Worst Case: Element needs to be inserted at end of list or array needs to expand.

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public void addLinear(Integer newVal)
  {
    for (int i = 0; i < size(); i++) {
      if (newVal < get(i)) {
        _data.add(i, newVal);
        return;
      }
    }
    _data.add(newVal); // Adds the value at the end if there doesn't exist a value larger than newVal
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  
  public void addBinary(Integer newVal)
  {
    int midInd = 0;
    int midVal = 0;
    int startInd = 0;
    int endInd = size();
    

    if (endInd == 0) {
      endInd = 0;
    }

    while (startInd != endInd) {
      midInd = (startInd + endInd) / 2;
      midVal = get(midInd);

      if (midVal < newVal) {
        startInd = midInd + 1;
      }
      if (midVal >= newVal) {
        endInd = midInd;
      }
      if (midVal == newVal) {
        break;
      }
    }

    _data.add(endInd, newVal);

  }


  // main method solely for testing purposes
  public static void main( String[] args )
  {
 
    OrderedArrayList Franz = new OrderedArrayList();
    // testing linear search
    for( int i = 0; i < 15; i++ )
      Franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
    
    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ ) 
      Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );


  }//end main()

}//end class OrderedArrayList

// Tin Pig: Ryan Lau, Jing Yi Feng, Corina Chen
// APCS pd06
// HW 80: Generically Speaking
// 2022-03-24r
// time spent: 0.5 hrs

/***
 * interface List
 * subset of actual Java List interface
 * Specifies actions a List must be able to perform.
 *
 * If placed in current working dir, will be consulted instead of
 *  built-in Java library interface.
 *
 * new in version 2.0: 
 * REMOVE-AT-INDEX
 * ADD-AT-INDEX
 **/

public interface List<T>
{
  //add node to list, containing input T as its data
  public boolean add( T x );

  //insert at specified index
  public void add( int index, T newVal );

  //remove node from list, return its data
  public T remove( int index );

  //return data in element at position i
  public T get( int i );

  //overwrite data in element at position i
  public T set( int i, T x );

  //return length of list
  public int size();

}//end interface

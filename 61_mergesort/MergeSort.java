/**
Jing Yi Feng + Ari Gurovich
APCS pd06
HW61 -- Instructions so Simple... / merge sort
2022-02-8
time spent: 2 hours
**/


/***
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm:

  ***/

public class MergeSort
{
  /******************************************************
   * int[] merge(int[],int[])
   * Merges two input arrays
   * Precond:  Input arrays are sorted in ascending order
   * Postcond: Input arrays unchanged, and
   * output array sorted in ascending order.
   ******************************************************/
  private static int[] merge( int[] a, int[] b )
  {
		int aLength = a.length;
		int bLength = b.length;
		int aa = 0;
		int bb = 0;
		int outputC = 0;
	
		while ((aa < aLength) && bb < bLength) {
			if (a[aa] > b[bb]) {
				output[outputC] = a[aa];
				aa++;
				outputC++;
			}
			else {
				output[outputC] = b[bb];
				bb++;
				outputC++;
			}
		}
		if (a.length == 0) {
			for(int i = bb; i < bLength; i++){
				output[outputC] = b[i];
				outputC++;
			}
		}
		
		else {
			for(int i = aa; i < aLength; i++){
				output[outputC] = a[i];
				outputC++;
			}
		}
		return output;
		}

  }//end merge()


  /******************************************************
   * int[] sort(int[])
   * Sorts input array using mergesort algorithm
   * Returns sorted version of input array (ascending)
   ******************************************************/
  public static int[] sort( int[] arr )
  {
		int mid [arr.length /2];
		int[] left = new int[mid];
		int[] right =new int[arr.length - mid];

		for(int i = 0; i < mid; i++){
			left[i] = arr[i];
		}
		for(int i = mid; i < arr.length; i++){
			right[i - mid] = arr[i];
		}
		return merge(sort(left), sort(right));

  }//end sort()



  //-------------------HELPERS-------------------------
  //tester function for exploring how arrays are passed
  //usage: print array, mess(array), print array. Whaddayasee?
  public static void mess( int[] a ) {
    for( int i = 0 ; i<a.length; i++ )
      a[i] = 0;
  }

  //helper method for displaying an array
  public static void printArray( int[] a ) {
    System.out.print("[");
    for( int i : a )
      System.out.print( i + ",");
    System.out.println("]");
  }
  //---------------------------------------------------


  //main method for testing
  public static void main( String [] args )
  {
  
      int[] arr0 = {0};
      int[] arr1 = {1};
      int[] arr2 = {1,2};
      int[] arr3 = {3,4};
      int[] arr4 = {1,2,3,4};
      int[] arr5 = {4,3,2,1};
      int[] arr6 = {9,42,17,63,0,512,23};
      int[] arr7 = {9,42,17,63,0,9,512,23,9};

      System.out.println("\nTesting mess-with-array method...");
      printArray( arr3 );
      mess(arr3);
      printArray( arr3 );

      System.out.println("\nMerging arr1 and arr0: ");
      printArray( merge(arr1,arr0) );

      System.out.println("\nMerging arr4 and arr6: ");
      printArray( merge(arr4,arr6) );

      System.out.println("\nSorting arr4-7...");
      printArray( sort( arr4 ) );
      printArray( sort( arr5 ) );
      printArray( sort( arr6 ) );
      printArray( sort( arr7 ) );
    
  }//end main()

}//end class MergeSort

import java.io.*;
import java.util.*;


public class KnightTour
{
  public static void main( String[] args )
  {
    int n = 8;

    try {
      n = Integer.parseInt( args[0] );
    } catch( Exception e ) {
      System.out.println( "Invalid input. Using board size "
                          + n + "..." );
    }

    TourFinder tf = new TourFinder( n );

    //clear screen using ANSI control code
    System.out.println( "" );

    //display board
    System.out.println( tf );

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //for fixed starting location, use line below:
    tf.findTour( 2, 2, 1 );
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //for random starting location, use lines below:
    //int startX = (int)(Math.random() * n) +2//YOUR MATH CONSTRUCT FOR GENERATING A RANDOM LEGAL X VALUE
    //int startY = (int)(Math.random() * n) +2//YOUR MATH CONSTRUCT FOR GENERATING A RANDOM LEGAL X VALUE
    //tf.findTour( startX, startY, 1 );   // 1 or 0 ?
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // PUSHING FARTHER...
    // Systematically attempt to solve from every position on the board?
    // for( i=0; i < n+2; i++ ) {
    //   for( j=0; j < n+2; j++ ){
    //     tf.findTour( i+2, j+2, 1 );
    //   }
    // }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  }//end main()

}//end class KnightTour


class TourFinder
{
  //instance vars
  private int[][] _board;
  private int _sideLength; //board has dimensions n x n
  private boolean _solved = false;

  //constructor -- build board of size n x n
  public TourFinder( int n )
  {
    _sideLength = n + 4;

    //init 2D array to represent square board with moat
    _board = new int[_sideLength][_sideLength];

    //SETUP BOARD --  0 for unvisited cell
    //               -1 for cell in moat
    //---------------------------------------------------------
    //???
    for(int col = 0; col < _sideLength; col ++){
        _board[0][col] = -1;
        _board[1][col] = -1;
        _board[_sideLength-1][col] = -1;
        _board[_sideLength-2][col] = -1;
    }

    for(int row = 0; row < _sideLength; row ++){
        _board[row][0] = -1;
        _board[row][1] = -1;
        _board[row][_sideLength-1] = -1;
        _board[row][_sideLength-2] = -1;
    }

    //---------------------------------------------------------

  }//end constructor

// counter for row
// counter for collumn
// if row is first two or last two, cell = -1
// if collumn is first two or last two, cell = -1
// else, cell = 0
  /**
   * "stringify" the board
   **/


  public String toString()
  {
    //send ANSI code "ESC[0;0H" to place cursor in upper left
    String retStr = "0H";
    //emacs shortcut: C-q, then press ESC
    //emacs shortcut: M-x quoted-insert, then press ESC

    int i, j;
    for( i=0; i < _sideLength; i++ ) {
      for( j=0; j < _sideLength; j++ )
        retStr = retStr + String.format( "%3d", _board[j][i] );
      //"%3d" allots 3 spaces for each number
      retStr = retStr + "\n";
    }
    return retStr;
  }


  /**
   * helper method to keep try/catch clutter out of main flow
   * @param n      delay in ms
   **/
  private void delay( int n )
  {
    try {
      Thread.sleep(n);
    } catch( InterruptedException e ) {
      System.exit(0);
    }
  }


  /**
   * void findTour(int x,int y,int moves) -- use depth-first w/ backtracking algo
   * to find valid knight's tour
   * @param x      starting x-coord
   * @param y      starting y-coord
   * @param moves  number of moves made so far
   **/



  public void findTour( int x, int y, int moves )
  {
    

    
    if ( _solved  ) System.exit(0);                                

    //primary base case: tour completed
    if ( moves == (_sideLength - 4)*(_sideLength - 4) &&  _board[x][y] == 0) {              //Senpai Gabriel is goated
      //???
      _board[x][y] = moves;
      System.out.println( this ); //refresh screen
      _solved = true;
      return;
    }
    //other base case: stepped off board or onto visited cell
    if ( _board[x][y] != 0) {
      return;
    }
    //otherwise, mark current location
    //and recursively generate tour possibilities from current pos
    else {

      //mark current cell with current move number
      _board[x][y] = moves;

      System.out.println( this ); //refresh screen

      //delay(1000); //uncomment to slow down enough to view

      /******************************************
       * Recursively try to "solve" (find a tour) from
       * each of knight's available moves.
       *     . e . d .
       *     f . . . c
       *     . . @ . .
       *     g . . . b
       *     . h . a .
      ******************************************/
      //???
        findTour(  x+1,  y+2, moves + 1);
        findTour(  x+1,  y-2, moves + 1);
        findTour(  x+2,  y+1, moves + 1);
        findTour(  x-2,  y+1, moves + 1);
        findTour(  x-1,  y+2, moves + 1);
        findTour(  x-1,  y-2, moves + 1);
        findTour(  x+2,  y-1, moves + 1);
        findTour(  x-2,  y-1, moves + 1);

}
}

}//end class TourFinder

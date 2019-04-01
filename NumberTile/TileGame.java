/*** Complete the code below 
 * 
 * Expected output
 * place tile: expected=true, run=true
 * -------
 * |  6  |
 * |3   4|
 * |  3  |
 * -------
 * 
 * place tile: expected=false, run=false
 * -------
 * |  6  |
 * |3   4|
 * |  3  |
 * -------
 * 
 * place tile: expected=true, run=true
 * --------------
 * |  7  ||  6  |
 * |1   3||3   4|
 * |  8  ||  3  |
 * --------------
 * 
 * place tile: expected=true, run=true
 * ---------------------
 * |  7  ||  6  ||  3  |
 * |1   3||3   4||4   5|
 * |  8  ||  3  ||  2  |
 * ---------------------
 * 
 * place tile: expected=true, run=true
 * ----------------------------
 * |  7  ||  7  ||  6  ||  3  |
 * |1   3||3   3||3   4||4   5|
 * |  8  ||  7  ||  3  ||  2  |
 * ----------------------------
 * 
 * place tile: expected=false, run=false
 * ----------------------------
 * |  7  ||  7  ||  6  ||  3  |
 * |1   3||3   3||3   4||4   5|
 * |  8  ||  7  ||  3  ||  2  |
 * ----------------------------
 * 
 * place tile: expected=true, run=true
 * -----------------------------------
 * |  7  ||  0  ||  7  ||  6  ||  3  |
 * |1   3||3   3||3   3||3   4||4   5|
 * |  8  ||  4  ||  7  ||  3  ||  2  |
 * -----------------------------------
 **/ 

import java.util.ArrayList;

public class TileGame
{
  /** represents the game board; guaranteed never to be null */
  private ArrayList<NumberTile> board;

  public TileGame()
  { board = new ArrayList<NumberTile>(); }

  /** Determines where to insert tile, in its current orientation, into game board
   *  @param tile the tile to be placed on the game board
   *  @return the position of tile where tile is to be inserted:
   *           0 if the board is empty;
   *          -1 if tile does not fit in front, at end, 
   *             or between any existing tiles;
   *          otherwise, 0 = position returned = board.size()
   */
  private int getIndexForFit(NumberTile tile)
  { 
      /* Complete the code */ 
  }
  

  /** Places tile on the game board if it fits (checking all possible tile orientations if necessary).
   *  If there are no tiles on the game board, the tile is placed at position 0.
   *  The tile should be placed at most 1 time.
   *  Precondition: board is not null
   *  @param tile the tile to be placed on the game board
   *  @return true if tile is placed successfully; false otherwise
   *  Postcondition: the orientations of the other tiles on the board are not changed
   *  Postcondition: the order of the other tiles on the board relative to each other
   *  is not changed
   */
  public boolean insertTile(NumberTile tile)
  { 
      /* Complete the code */ 
  }
  
  public void printBoard()
  {
    for(int x=0; x < board.size(); x++)
    {
      System.out.print("-------");
    } 
    System.out.println("");
    for(int x=0; x < board.size(); x++)
    {
      System.out.print("|  "+board.get(x).getTop()+"  |");
    }    
    System.out.println("");
    for(int x=0; x < board.size(); x++)
    {
      System.out.print("|"+board.get(x).getLeft()+"   "+board.get(x).getRight()+"|");
    }    
    System.out.println("");
    for(int x=0; x < board.size(); x++)
    {
      System.out.print("|  "+board.get(x).getBottom()+"  |");
    }  
    System.out.print("\n");
    for(int x=0; x < board.size(); x++)
    {
      System.out.print("-------");
    } 
    System.out.println("\n");
  }
  
  public static void main(String[] args)
  {
    TileGame game = new TileGame();
    NumberTile t1 = new NumberTile(3, 4, 6, 3);
    NumberTile t2 = new NumberTile(1, 2, 5, 7);
    NumberTile t3 = new NumberTile(8, 7, 1, 3);
    NumberTile t4 = new NumberTile(2, 3, 4, 5);
    NumberTile t5 = new NumberTile(7, 7, 3, 3);
    NumberTile t6 = new NumberTile(9, 8, 7, 6);   
    NumberTile t7 = new NumberTile(3, 3, 0, 4);   

    System.out.println("place tile: expected=true, run="+game.insertTile(t1));
    game.printBoard();
    System.out.println("place tile: expected=false, run="+game.insertTile(t2));
    game.printBoard();
    System.out.println("place tile: expected=true, run="+game.insertTile(t3));
    game.printBoard();
    System.out.println("place tile: expected=true, run="+game.insertTile(t4));
    game.printBoard();
    System.out.println("place tile: expected=true, run="+game.insertTile(t5));
    game.printBoard();
    System.out.println("place tile: expected=false, run="+game.insertTile(t6));
    game.printBoard();
    System.out.println("place tile: expected=true, run="+game.insertTile(t7));
    game.printBoard();
  }
}

/*** The tiles are represented by the NumberTile class. 
 * This class is complete.
 ***/
public class NumberTile {
  private int left, right, top, bottom;

  public NumberTile(int l, int r, int t, int b)  {
    left = l;
    right = r;
    top = t;
    bottom = b;
  }

  /** Rotates the tile 90 degrees clockwise */
  public void rotate()   {
    int temp = left;
    left = bottom;
    bottom = right;
    right = top;
    top = temp;
  }
  public int getLeft() { return left; }
  public int getRight() { return right; }
  public int getTop() { return top; }
  public int getBottom() { return bottom; }
}


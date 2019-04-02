import java.util.List;
import java.util.ArrayList;

public class StringFormatter
{
  /** 
   * ---------------- PART A ---------------
   * Return the total number of letters in the words in 
   * parameter wordList.
   * For example, if the variable wordList is ["A", "frog", "is"]
   * then returns 7. 
   * You may assume that all words in wordList consist of one or 
   * more letters
   **/ 
  public static int totalLetters(List<String> wordList)
  {      
      //--- complete for part A ---
  }

  /** 
   * ---------------- PART B ---------------
   * Return the basic gap width as defined earlier.
   **/ 
  public static int basicGapWidth(List<String> wordList, int formattedLen)
  {    
      //--- complete for part B ---
  }


  /** The method below is complete ***/
  public static int leftoverSpaces(List<String> wordList, int formattedLen)
  {
    return formattedLen - totalLetters(wordList) -
                 basicGapWidth(wordList, formattedLen) * (wordList.size() - 1);
  }

 
  /** 
   * ---------------- PART C ---------------
   * Return the formatted string as defined earlier. 
   **/ 
  public static String format(List<String> wordList, int formattedLen)
  {    
      //--- complete for part C ---
  }
}

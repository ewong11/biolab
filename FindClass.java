import java.io.*;
import java.util.*;

public class FindClass {

  int size = 5;
  String input; //initializes String for user input
  public String[][] map; //initiliazes 2D array that will represent a 'map' to your classroom
  int curCol = (int) (Math.random() * 5); //sets starting column of student
  int curRow = (int) (Math.random() * 5); //sets starting row of student
  int finalCol = (int) (Math.random() * 5); //sets destination column of student
  int finalRow = (int) (Math.random() * 5); //set destination row of student

  private InputStreamReader isr;
  private BufferedReader in;

  // DEFAULT CONSTURCTOR--------------------------------------------------------
  public FindClass() {
    map = new String[size][size];
  }

  // HELPER FUNCTIONS-----------------------------------------------------------
  public void populate() {
    for (int y = 0; y < size; y++) {
      for (int x = 0; x < size; x++)
      map[y][x] = "O";
    }
    map[curRow][curCol] = "X"; //sets the player as String 'X'
  }

  public String toString() { //USED TO PRINT FINDCLASS()
    String a = "";
    for(int y = 0; y < size; y++) {
      a += "|";
      for(int x = 0; x < size; x++) {
        a += this.map[y][x];
      }
      a += "|\n";
    }
    return a;
  }

  public void prntMap(String[][] s) { //used to print 2D arrays, such as map
    String a = "";
    for(int y = 0; y < size; y++) {
      a += "|";
      for(int x = 0; x < size; x++) {
        a += s[y][x];
      }
      a += "|\n";
    }
    System.out.println(a);
  }

  /*--------------------------------------------------------------------
  PRECONDITION: a 2D String arrays
  POSTCONDTION: the positions of two Strings in the array are 'swapped'
  --------------------------------------------------------------------*/

  public void swap(int row1, int col1, int row2, int col2) {
    String temp = map[row2][col2];
    map[row2][col2] = map[row1][col1];
    map[row1][col1] = temp;
  }

  //------------------------------------------------------------------------------
  //the most important method

  public boolean finder(Student s) {
    int counter = 0;
    int wall = 0;
    isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );

    //determines the time the player has to get to class
    int time = (int)((.5 * s.sleep) + (int)(Woo.luck * 8));
    int timeLeft = time;

    while (counter <= time) {
      System.out.print("\033[H\033[2J"); //clears screen
      counter += 1;
      prntMap(map);
      if (wall == 1) {
        System.out.println("You walked into a wall...");
        wall = 0;
      }
      System.out.println("You have " + timeLeft + " minutes to get to class!");
      timeLeft -= 1;
      System.out.println("Your classroom is located at (" + (finalCol+1) + " , " + (finalRow + 1) + ")");
      System.out.println("Use the WASD keys to move");
      try {
        input = in.readLine();
      }
      catch(IOException e) {}

        if (input.equals("a")) {
          if (curCol - 1 < 0) { //checks if 'X' is on leftmost edge
          wall = 1;
          continue;
        }
        swap(curRow, curCol, curRow, curCol-1); //moves 'X' one column left
        curCol -= 1;
        if (curCol == finalCol && curRow == finalRow) { //checks if 'X' is at destination
        System.out.println("Hey, you made it on time!");
        return true;
      }
      else {}
      }

      else if (input.equals("w")) {
        if (curRow - 1 < 0) { //checks if 'X' is on upper edge
        wall = 1;
        continue;
      }
      swap(curRow, curCol, curRow - 1, curCol ); //moves 'X' one row up
      curRow -= 1;
      if (curCol == finalCol && curRow == finalRow) { //checks if 'X' is at destination
      System.out.println("Hey, you made it on time!");
      return true;
    }
    else {}
    }

    else if (input.equals("s")) {
      if (curRow + 1 >= map[0].length) { //checks if 'X' is on lower edge
      wall =1;
      continue;
    }
    swap(curRow, curCol, curRow + 1, curCol ); //moves 'X' one row down
    curRow += 1;
    if (curCol == finalCol && curRow == finalRow) {
      System.out.println("Hey, you made it on time!");
      return true;
    }
    else {}
    }
    else if (input.equals("d")) {
      if (curCol + 1 >= map.length) { //checks if 'X' is on right-most edge
      wall = 1;
      continue;
    }
    swap(curRow, curCol, curRow, curCol+1 ); //moves 'X' one column right
    curCol += 1;
    if (curCol == finalCol && curRow == finalRow) {
      System.out.println("Hey, you made it on time!");
      return true;
    }
    else {}
    }
    else {
      System.out.println("Bro, you're late! Get moving!");
    }
  }
  return false;
}

public void runToClass(Student s) {
  populate();
  if (finder(s) == false) {
    s.average -= 1;
    System.out.println("Don't be late! Minus 1 to your average!");
  }
}

public static void main(String[] args) {
}
}

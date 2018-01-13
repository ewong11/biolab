import java.io.*;
import java.util.*;

public class FindClass {

  int size = 5;
  String input;
  public String[][] map;
  int curCol = (int) (Math.random() * 5);
  int curRow = (int) (Math.random() * 5);
  int finalCol = (int) (Math.random() * 4);
  int finalRow = (int) (Math.random() * 4);

  int time = (int) (Math.random() * Woo.getLuck());


  private InputStreamReader isr;
  private BufferedReader in;

  public FindClass() {
    map = new String[size][size];
  }

  public void populate() {
    for (int y = 0; y < size; y++) {
      for (int x = 0; x < size; x++)
      map[y][x] = "O";
    }
    map[curRow][curCol] = "X";
  }

  public String toString() {
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

  public void prntMap(String[][] s) {
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

public void swap(int row1, int col1, int row2, int col2) {
  String temp = map[row2][col2];
  map[row2][col2] = map[row1][col1];
  map[row1][col1] = temp;
}

public void finder() {
  int counter = 0;
  isr = new InputStreamReader( System.in );
  in = new BufferedReader( isr );

  while (counter < 5) {
    System.out.print("\033[H\033[2J"); //clears screen
    prntMap(map);
    System.out.println("Your classroom is located at (" + (finalCol+1) + " , " + (finalRow + 1) + ")");
    try {
      input = in.readLine();
    }
    catch(IOException e) {}

      //System.out.println(input);

      if (input.equals("a")) {
        if (curCol - 1 <= 0) {
          System.out.println("Error. You can't go into a wall");
          return;
        }
        swap(curRow, curCol, curRow, curCol-1 );
        curCol -= 1;
        if (curCol == finalCol && curRow == finalRow) {
          System.out.println("Hey, you made it on time!");
          break;
        }
        else {
          counter += 1;
        }
      }

      else if (input.equals("w")) {
        if (curRow - 1 <= 0) {
          System.out.println("Error. You can't go into a wall");
          counter += 1;
          return;
        }
        swap(curRow, curCol, curRow - 1, curCol );
        curRow -= 1;
        if (curCol == finalCol && curRow == finalRow) {
          System.out.println("Hey, you made it on time!");
          break;
        }
        else {
          counter += 1;
        }
      }

      else if (input.equals("s")) {
        if (curRow + 1 >= map[0].length) {
          System.out.println("Error. You can't go into a wall");
          counter += 1;
          return;
        }
        swap(curRow, curCol, curRow + 1, curCol );
        curRow += 1;
        if (curCol == finalCol && curRow == finalRow) {
          System.out.println("Hey, you made it on time!");
          break;
        }
        else {
          counter += 1;
        }
      }
      else if (input.equals("d")) {
        if (curCol + 1 >= map[0].length) {
          System.out.println("Error. You can't go into a wall");
          counter += 1;
          return;
        }
        swap(curRow, curCol, curRow, curCol+1 );
        curCol += 1;
        if (curCol == finalCol && curRow == finalRow) {
          System.out.println("Hey, you made it on time!");
          break;
        }
        else {
          counter += 1;
        }
      }
      else {
        System.out.println("Bro, you're late! Get moving!");
        counter += 1;
      }
      //System.out.println("You're late and you're teacher hates you! Minus 1 to your average!");
      //a.average -= 1;
    }



  }


  public static void main(String[] args) {
    FindClass a = new FindClass();
    int y = 0;
    a.populate();
    a.finder();
  }
}

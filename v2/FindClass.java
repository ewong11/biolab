import java.io.*;
import java.util.*;

public class FindClass {

  int size = 5;
  String input;
  public String[][] map;
  int randX = (int) (Math.random() * 5);
  int randY = (int) (Math.random() * 5);

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
      map[randY][randX] = "X";

      isr = new InputStreamReader( System.in );
      in = new BufferedReader( isr );

    }

/*    //overwrite item at specified row and column with newVal
    //return old value
  private Object set( int r, int c, Object newVal ) {
    	Object retVal = map[r-1][c-1];
    	map[r-1][c-1] = newVal;
    	return retVal;
    }

  private Object get( int r, int c ) {
      return map[r-1][c-1]
}
*/

  public void swap(int y1, int x1, int y2, int x2) {
    String temp = map[y2][x2];
    map[y2][x2] = map[y1][x1];
    map[y1][x1] = temp;
    System.out.println(map);
  }

  public void move() {
    try {
    input = in.readLine();
  }
    catch ( IOException e ) {}
    
      for (int x =0 ; x < 5; x ++) {
      if (input == "a") {
        if (randX - 1 < 0) {
          System.out.println("Error. You can't go into a wall");
          return;
        }
	else if (map[randX][randY] == "X") {
          System.out.println("whoa you won!");
          return;
        }
        swap(randY, randX, randY, randX-1 );
        randX -= 1;
      }
      else if (input == "w") {
        if (randY + 1 < 0) {
          System.out.println("Error. You can't go into a wall");
          return;
        }
	else if (map[randX][randY] == "X") {
          System.out.println("whoa you won!");
          return;
	}
        swap(randY, randX, randY + 1, randX );
        randY += 1;
      }
      else if (input == "s") {
        if (randY - 1 < 0) {
          System.out.println("Error. You can't go into a wall");
          return;
        }
	else if (map[randX][randY] == "X") {
          System.out.println("whoa you won!");
          return;
	} 
        swap(randY, randX, randY -1, randX );
        randY -= 1;
      }
      else if (input == "d") {
        if (randX + 1 < 0) {
          System.out.println("Error. You can't go into a wall");
          return;
        }
	else if (map[randX][randY] == "X") {
	    System.out.println("whoa you won!");
	    return;
	} 
        swap(randY, randX, randY, randX+1 );
        randX += 1;
      }
      else {
	  System.out.println("Bro, you're late! Get moving!");
      }


  }
}

  public String toString() {
    String a = "";
    for(int y = 0; y < size; y++) {
      a += "|";
      for(int x = 0; x < size; x++) {
        a += map[y][x];
      }
      a += "|\n";
    }
    return a;
      }

  public static void main(String[] args) {
    FindClass a = new FindClass();
    a.populate();
    System.out.println(a);
  }
    }

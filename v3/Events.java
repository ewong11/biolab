import java.io.*;
import java.util.*;

public class Events {
  private InputStreamReader isr;
  private BufferedReader in;


  public void impressCrush(Student a) {
    int guess;
    isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );

    System.out.println("Guess a number: ");
    try {
      guess = Integer.parseInt(in.readLine());
    }
    catch (IOException e) {}
  }
}

import java.io.*;
import java.util.*;

public class Lunch {
    public int yourNum = 0;
    public int compNum = 0;
    private InputStreamReader isr;
    private BufferedReader in;

    public void play(Student a) {
      isr = new InputStreamReader( System.in );
      in = new BufferedReader( isr );
	while (yourNum == compNum) {
	    compNum = (int)(Math.random() * 10);
	    System.out.println("pick a number: ");
	    try {
		yourNum = Integer.parseInt( in.readLine() );
	    }
	    catch (IOException e) {}
	    if (yourNum != compNum)
		break;
	    else if (yourNum == compNum) {
		a.charisma += 1;
		System.out.println("You skipped the line! Congrats on being a rascal");
	    }
	}
    }
}

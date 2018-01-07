import java.io.*;
import java.util.*;

public class Woo {

  // instance variables -----------------------------------
    private Character player;
    private NPC npc1;

    public int days;
    public double luck;
    private int score;

    private InputStreamReader isr;
    private BufferedReader in;

    final String[] NAMES = {"Joe", "Gabby"}; //possible names for NPCS

//---------------------------------------------------------

  public Woo() {
    days = 0;

    isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );
    newGame();
  }

  //---------CREATES NEW GAME--------------------
public void newGame() {
  String s;
  String name;
  //these variables will determine the type of person you are
  int intelligence = 0;
  int social = 0;
  s = "Welcome to StuyLife: Freshman Frenzy! \n";
  s += "\n But first, let us know your name: \n";
  System.out.println(s);

  try {
    name = in.readLine();
  }
  catch ( IOException e ) { }

  //we can add a check here at the end aka "are you sure?"
  System.out.println("Cool, nice to meet you, " + name + "!");
  s = "\n To start, let us figure out what type of person you are!";
  System.out.println(s);

  //ADD QUIZ HERE

  // makes the player one of three characters
  if(Math.max(intelligence, social) == intelligence) {
    player = new Scholar();
  }
  else if(Math.max(intelligence, social) == social) {
    player = new Popular();
  }
  else {
    player = new Normal();
  }

}


    public static void main(String[] args) {
    }
}

import java.io.*;
import java.util.*;

public class Woo {

  // instance variables -----------------------------------
    private Character player;
    private NPC npc1;

    public int days;
    public double luck;

    private InputStreamReader isr;
    private BufferedReader in;

    final String[] NAMES = {"Kevin", "Gabby"};

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
  int athletic = 0;
  int social = 0;
  s = "Welcome to StuyLife: Freshman Frenzy! \n";
  s += "\t To start, let us figure out what type of person you are!";

  //ADD QUIZ HERE

  // makes the player one of three characters
  if(Math.max (Math.max(intelligence, athletic), social)) = intelligence {
    player = new Scholar();
  }
  else if(Math.max (Math.max(intelligence, athletic), social)) = athletic {
    player = new Jock();
  }
  else {
    player = new Bee();
  }

}


    public static void main(String[] args) {
    }
}

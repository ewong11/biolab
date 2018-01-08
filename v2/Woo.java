import java.io.*;
import java.util.*;

public class Woo {

  // instance variables -----------------------------------
    private Character player;
    private NPC npc1;

    public int days;
    public static double luck;
    private int score;

    private InputStreamReader isr;
    private BufferedReader in;

    final String[] NAMES = {"Joe", "Gaby"}; //possible names for NPCS

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
  String name = "";
  //these variables will determine the type of person you are
  int intelligence = 0;
  int social = 0;
  s = "Welcome to StuyLife: Freshman Frenzy! \n";
  s += "But first, let us know your name: ";
  System.out.println(s);

  try {
    name = in.readLine();
  }
  catch ( IOException e ) { }

  //we can add a check here at the end aka "are you sure?"
  System.out.println("Cool, nice to meet you, " + name + "!");
  s = "\nTo start, let us figure out what type of person you are!";
  System.out.println(s);

  //ADD QUIZ HERE----------------------------------------------
  int ans = 0;
  s = "What class did you like most? \n";
  s += "\t1: Science or Math or CS\n";
  s += "\t2: PE or the Humanities \n";
  s += "\t3: I hated all of them \n";
  s += "Selection: ";
  System.out.println(s);

  try {
      ans = Integer.parseInt( in.readLine() );
      if (ans == 1)
	  intelligence += 1;
      else if (ans == 2)
	  social += 1;	  
  }
  catch ( IOException e ) { }

  s = "Pick your afterschool club \n";
  s += "\t1: the Spectator or Speech/Debate \n";
  s += "\t2: Sports or Red Cross/Key CLub or maybe even slime club :)) \n";
  s += "\t3: I go home \n";
  s += "Selection: ";
  System.out.println(s);

  try {
      ans = Integer.parseInt( in.readLine() );
      if (ans == 1)
	  intelligence += 1;
      else if (ans == 2)
	  social += 1;	  
  }
  catch ( IOException e ) { }
  
  // makes the player one of three characters

  if(Math.max(intelligence, social) == intelligence && !(social == intelligence)) {
      player = new Scholar(name);
      System.out.println("congrats! you're a scholar\n"); 
  }
  else if(Math.max(intelligence, social) == social && !(social == intelligence)) {
      player = new Popular(name);
      System.out.println("congrats! you're a popular person\n"); 
  }
  else {
    player = new Normal(name);
    System.out.println("congrats! you're just normal\n"); 
  }
}
//sims a day, out of a possible 180 - we can put the methods in another class
public void simDay() {
  luck = (int) (Math.random() * 5);
}

public static double getLuck() {
  return luck;
}

    public static void main(String[] args) {
      Woo game = new Woo();

    }
}

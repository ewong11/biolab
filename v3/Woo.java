import java.io.*;
import java.util.*;

public class Woo {

    // instance variables -----------------------------------
    private Student player;
    private NPC npc1;

    public int days;
    public static double luck;
    private int score;

    private InputStreamReader isr;
    private BufferedReader in;

    final String[] NAMES = {"Joe", "Gaby", "Buford", "Edith", "Arnold", "Kat"}; //possible names for NPCS

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
	int normal = 0;
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
	s = "What is your favorite aspect of school? \n";
	s += "\t1: I like Homework!\n";
	s += "\t2: I like friends! \n";
	s += "\t3: I'm just here. \n";
	s += "Selection: ";
	System.out.println(s);

	try {
	    ans = Integer.parseInt( in.readLine() );
	    if (ans == 1)
		intelligence += 1;
	    else if (ans == 2)
		social += 1;
	    else
		normal += 1;
	}
	catch ( IOException e ) { }

	ans = 0;
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
	    else
		normal += 1;
	}
	catch ( IOException e ) { }
	ans = 0;
	s = "What are your plans on a Friday Night? \n";
	s += "\t1: Study for my Math Test\n";
	s += "\t2: Go out to a PARTY! \n";
	s += "\t3: Watch Breaking Bad \n";
	s += "Selection: ";
	System.out.println(s);

	try {
	    ans = Integer.parseInt( in.readLine() );
	    if (ans == 1)
		intelligence += 1;
	    else if (ans == 2)
		social += 1;
	    else
		normal += 1;
	}
	catch ( IOException e ) { }

	ans = 0;
	s = " You see a person crying in the hallway. What do you do? \n";
	s += "\t1: Pretend you didn't see. \n";
	s += "\t2: Give them a BIG HUG! \n";
	s += "\t3: \"Are you ok\" \n";
	s += "Selection: ";
	System.out.println(s);

	try {
	    ans = Integer.parseInt( in.readLine() );
	    if (ans == 1)
		intelligence += 1;
	    else if (ans == 2)
		social += 1;
	    else
		normal += 1;
	}
	catch ( IOException e ) { }


	// makes the player one of three characters
	int highest = Math.max(intelligence, Math.max(normal, social));
	if(highest == intelligence && !(highest == social || highest == normal)) {
	    player = new Scholar(name);
	    System.out.println("Congrats " + name +"! You're a scholar\n");
	}
	else if(highest == social && !(highest == intelligence || highest == normal)) {
	    player = new Popular(name);
	    System.out.println("Congrats " + name +"! You're a popular person\n");
	}
	else {
	    player = new Normal(name);
	    System.out.println("Congrats " + name +"! You're just normal\n");
	}

	System.out.println(player.getSched());
    }
    //sims a day, out of a possible 180 - we can put the methods in another class
    public boolean simDay() {
        Lunch lunch = new Lunch();
        Events event = new Events();
        event.impressCrush(player);
        lunch.play(player);
        if(!player.isDead()){
        luck = (int) (Math.random() * 5);
        System.out.println("Good Morning " + player.name + "!");
        return true;

      }
      return false;

    }


    public static double getLuck() {
	return luck;
    }

    public static void main(String[] args) {
	     Woo game = new Woo();
       int days = 0;

       while(days <= 180){
         System.out.println("Day " + days);
         System.out.println(game.player);
         if(!game.simDay())
           break;
           days++;
           System.out.println("");
         }
       //}
    }
}

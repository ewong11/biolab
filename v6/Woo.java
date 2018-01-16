import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Woo {
    // instance variables -----------------------------------
    protected Student player;

    public static int days;
    public static int birthday;
    public static double luck;
    private int score;
    public static Friend crush;
    public static Friend[] yourFriends;
    public static Friend friend1;
    public static Friend friend2;
    public static Friend friend3;
    public static boolean datenight = false;
    public static boolean flix = false;

    private InputStreamReader isr;
    private BufferedReader in;

    final String[] NAMES1 = {"Joe", "Gaby", "Beauford", "Marge", "Dwight", "Kat"};
    final String[] NAMES2 = {"Michael", "Pam", "Erin", "Felix", "Homer", "Ryan"};
    final String[] NAMES3 = {"Bart", "Lisa", "Manny", "Jim", "Phyllis", "Oscar"};//possible names for NPCS

    final String[] FORTUNES = {"a friend asks only for your time, not your money\n",
			       "you learn from your mistakes. you will learn a lot today\n",
			       "if you have something good in your life, don't let it go!\n",
			       "your shoes will make you a very happy person today\n",
			       "meeting adversary well is the source of your strength\n",
			       "it is now, and in this world, that we must live so live well.\n",
			       "you already know the answers to the questions lingering in your head\n",
			       "the greatest risk is not taking one\n",
			       "it's better to be alone sometimes\n",
			       "when hungry, order more Chinese food\n",
			       "all of your fingers can't be of the same length\n",
			       "patience is a virtue unless it is against a brick wall \n",
			       "the most important part of communication is hearing what isn't said\n",
			       "a different world cannot be built by indifferent people",
			       "you are not illiterate",
			       "this project will wow you",
			       "let your heart decide. it doesn't get as easily confused as your head\n"};
    //---------------------------------------------------------

    public Woo() {
	days = 1;
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
	newGame();
    }

    public static void confirm() {
	String out = "(press 'Enter' to continue)";
	Scanner sc = new Scanner(System.in);
	System.out.println(out);
	sc.nextLine();
    }

    public boolean isThere(Comparable a) {
	boolean ans = false; 
	for (int x = 0; x < player.badges.size(); x++) {
	    if (a.compareTo(player.badges.get(x)) == 0)
		ans = true; 
	}
	return ans; 
    } 

    //---------CREATES NEW GAME--------------------
    public void newGame() {
	String s;
	String name = "";
	String cname = "";
	//these variables will determine the type of person you are
	int intelligence = 0;
	int social = 0;
	int normal = 0;
	Scanner sc = new Scanner(System.in);
	System.out.print("\033[H\033[2J");
	s = "Welcome to\n";
	s += "   _____ _               _      _  __             \n"
	    +  "  / ____| |             | |    (_)/ _|    _       \n"
	    +  " | (___ | |_ _   _ _   _| |     _| |_ ___(_)      \n"
	    +  "  \\___ \\| __| | | | | | | |    | |  _/ _ \\        \n"
	    +  "  ____) | |_| |_| | |_| | |____| | ||  __/_       \n"
	    +  " |_____/ \\__|\\__,_|\\__, |______|_|_| \\___(_)      \n"
	    +  "                    __/ |                         \n"
	    +  "                   |___/                          \n";
	s += "  \t \tF r e s h m a n  F r e n z y! \n";
	System.out.println(s);
	s = "~~~\n";
	s += "It's been a week since you've submitted your college\n"
	    + "apps. The past few months as a senior have been grueling.\n";
	System.out.println(s);
	confirm();
	System.out.print("\033[H\033[2J");
	s = "You've discovered so much about yourself from analyzing\n";
	s += "your whole Stuyvesant career for your essays. Before you\n"
	    + "fell asleep last night, you began to wonder:\n"
	    + "What if I could start over...\n"
	    + "What if I could go back to first term Freshman Year?\n"
	    + "Then you drifted off to sleep...";
	System.out.println(s);
	confirm();
	System.out.print("\033[H\033[2J");
	s = "====================\n"
	    + "How to play:\n"
	    + "\t With each prompt, you will be asked to give some feedback!\n"
	    + "\t The easiest way to do that is typing your answer\n"
	    + "\t (usually 1,2,3... or y/n) then hitting ENTER!\n"
	    + "\t Your goal is to make it through your first term of\n"
	    + "\t FRESHMAN YEAR... DUN DUNN DUUUNNN!\n"
	    + "\t We hope you get through and enjoy!\n"
	    + "\t -Kaitlin, Eric and Susan\n";
	System.out.println(s);
	confirm();
	System.out.print("\033[H\033[2J");

	System.out.println("But first, let us know your name: ");
	try {
	    name = in.readLine();
	}
	catch ( IOException e ) { }

	System.out.print("\033[H\033[2J");
	s = "Everyone has a crush, who's yours?";
	System.out.println(s);

	try {
	    cname = in.readLine();
	}
	catch ( IOException e ) { }

	crush = new Crush(cname);

	System.out.println("your name: " + name);
	System.out.println(crush.name);

	//we can add a check here at the end aka "are you sure?"
	System.out.print("\033[H\033[2J");
	System.out.println("Cool, nice to meet you, " + name + "!");
	s = "To start, let us figure out what type of person you are!";
	System.out.print("\033[H\033[2J");
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
	System.out.print("\033[H\033[2J");
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
	System.out.print("\033[H\033[2J");
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
	System.out.print("\033[H\033[2J");
	ans = 0;
	s = "You see a person crying in the hallway. What do you do? \n";
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
	System.out.print("\033[H\033[2J");

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

	//Bithday!
	birthday = (int)(Math.random() * 150);
	System.out.println("Your birthday is: " + birthday + "\n");
	System.out.println("Your crush is " + crush.name + "!\n");
	System.out.println("This is your schedule!");
	System.out.println(player.getSched());
	confirm();


	//Making friends
	int friendgen = (int)(Math.random() * 6);
	friend1 = new Friend(NAMES1[friendgen]);
	friendgen = (int)(Math.random() * 6);
	friend2 = new Friend(NAMES2[friendgen]);
	friendgen = (int)(Math.random() * 6);
	friend3 = new Friend(NAMES3[friendgen]);
	yourFriends = new Friend[4];
	yourFriends[0] = friend1;
	yourFriends[1] = friend2;
	yourFriends[2] = friend3;
	yourFriends[3] = crush;



    }

    //sims a day, out of a possible 180 - we can put the methods in another class
    public boolean simDay() {
	luck = Math.random();
	boolean done = false;
	if(!player.isDead()){

	    while (done == false) {
		int ans = 0;
		String s = "";
		System.out.print("\033[H\033[2J");
		System.out.println("==============================================");
		System.out.println("Day " + days);
		System.out.println("==============================================");
		System.out.println("Good Morning " + player.name + "!");
		System.out.println("Please select one of the following:");
		s += "\t1: Show Your Status\n";
		s += "\t2. Judge ma fwends!\n";
		s += "\t3: show me ma achievments\n";
		s += "\t4: Fortune Me! \n";
		s += "\t5: INTO THE FRAY! \n";
		s += "Selection: ";
		System.out.println(s);

		if (days == 50) {
		    if (!(isThere("50-days-50-states")))
			player.badges.add("50-days-50-states");
		}
		else if (days == 10){ 
		    if (!(isThere("10-ten-to-10-ten")))
			player.badges.add("10-ten-to-10-ten");
		} 
		else if (days == 90) {
		    if (!(isThere("halfway-and-halfbaked")))
			player.badges.add("halfway-and-halfbaked");
		} 
		else if (days == 100){ 
		    if (!(isThere("100-days-100-lates")))
			player.badges.add("100-days-100-lates");
		}
		else if (player.average > 95 && days > 45) {
		    if (!(isThere("YO-AVERAGE-IS-NOT-DEAD")))
			player.badges.add("YO-AVERAGE-IS-NOT-DEAD");
		} 
		player.updateBadges(player);

		try {
		    ans = Integer.parseInt( in.readLine() );
		    String let;
		    if (ans == 1){
			System.out.println(player);
			confirm();
		    }
		    else if (ans == 2) {
			System.out.print("\033[H\033[2J");
			CompareFriendship compare = new CompareFriendship();
			compare.populate(friend1);
			compare.populate(friend2);
			compare.populate(friend3);
			compare.sort();
			System.out.println("\nThis is how close you are with " + crush.name);
			System.out.println("<" + crush.friendLev() + ">");
			confirm();
		    }
		    else if (ans == 3) {
			System.out.print("\033[H\033[2J");
			System.out.println("---------------------------------");
			System.out.println("badges: " + player.badges);
			System.out.println("---------------------------------");
			confirm();
		    }
		    else if (ans == 4){
			System.out.print("\033[H\033[2J");
			System.out.println("Fortune: ");
			System.out.print(FORTUNES[(int)(Math.random() * 17)]);
			System.out.println("\n");
			confirm();
		    }
		    else {
			System.out.println("Packing your turtle shell...");
			done = true;
			confirm();
		    }
		}
		catch ( IOException e ) { }
	    }
	    System.out.print("\033[H\033[2J");
	    System.out.println("OK HERE WE GO \n");
	    //Starting school

	    int eNum = 0;
	    if(days == birthday)
		eNum += Social.birthday(player);

	    while(eNum <= 0){
		if (Math.random() * player.sleep < 3) {
		    FindClass a = new FindClass();
		    a.runToClass(player);
		    confirm();
		    System.out.print("\033[H\033[2J");
		}
		if (luck < 0.2){
		    System.out.println("Nothing Special Happens...");
		    //No events
		    double ifCrushGame = Math.random();
		    if(ifCrushGame > 0.5){
			ImpressCrush tryLuck = new ImpressCrush();
			tryLuck.playGame(crush);
		    }
		}
		else if (luck <= 0.4){
		    System.out.println("Academic Event");
		    //Academic
		    if(luck < 0.25)
			Academic.test(player);
		    else if (luck < 0.3)
			Academic.quiz(player);
		    else if (luck < 0.35)
			Academic.project(player);
		    else
			Academic.sleep(player);
		}

		else if (luck <= 0.6 && luck > 0.4){
		    System.out.println("Social Event");
		    //Social
		    //friend // eatOut // brithday // rumors
		    if(luck < 0.45)
			Social.friend(player);
		    else if (luck < 0.5)
			Social.eatOut(player);
		    else if (luck < 0.55)
			Social.rumors(player);
		}


		else if (luck < 0.8 && luck > .6){
		    System.out.println("Personal Event!");
		    //Personal
		    if(luck < 0.65)
			Personal.netflix(player, crush);
		    else if (luck < 0.7) {
			if (crush.friendship > 2.5)
			    Personal.date(player, crush);
			else 
			    System.out.println("...You think about going on a date with " + crush.name);
		    }
		    else if (luck < 0.75)
			Personal.sick(player,friend1,friend2,friend3);
		    else
			Personal.nap(player);

		}
		else{
		    System.out.println("Special OTHER Event!");
		    //Other
		    if(luck < 0.85)
			Other.MTA(player);
		    else if (luck < 0.9)
			Other.allNighter(player);
		    else if (luck < 0.95)
			Other.soulCycle(player);
		    else
			Other.hqtrivia(player);
		}
		eNum+= 1;
	    }
	    confirm();
	    return true;
	}
	done = false;
	return false;
    }

    public static void main(String[] args) {
	Woo game = new Woo();

	while(days <= 180){
	    if(!game.simDay())
		break;
	    days++;
	    System.out.println("");
	}
	//}
    }
}

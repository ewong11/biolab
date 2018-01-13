import java.io.*;
import java.util.*;

public class Woo {

  // instance variables -----------------------------------
  private Student player;
  private Crush crush;
  private NPC npc1;

  public int days;
  public static double luck;
  private int score;
  public static int maxE;
  public static NPC[] yourFriends;
  public NPC friend1;
  public NPC friend2;
  public NPC friend3;

  private InputStreamReader isr;
  private BufferedReader in;

  final String[] NAMES = {"Joe", "Gaby", "Buford", "Edith", "Arnold", "Kat"}; //possible names for NPCS
  //---------------------------------------------------------

  public Woo() {
    days = 0;
    maxE = (int)(Math.random() * 5);
    isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );
    newGame();
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
    s = "Welcome to StuyLife: Freshman Frenzy! \n";
    s += "But first, let us know your name: ";
    System.out.println(s);

    try {
      name = in.readLine();
    }
    catch ( IOException e ) { }

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

    System.out.println(crush.name);


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
    System.out.println("==================");
    System.out.println("=====================");
    //Making Friends
    int friendgen = (int)(Math.random() * 6);
    friend1 = new NPC(1, NAMES[friendgen]);
    friend2 = new NPC(1, NAMES[friendgen]);
    friend2 = new NPC(1, NAMES[friendgen]);
    yourFriends = new NPC[3];
    yourFriends[0] = friend1;
    yourFriends[1] = friend2;
    yourFriends[2] = friend3;
  }
  //sims a day, out of a possible 180 - we can put the methods in another class
  public boolean simDay() {
    luck = Math.random();
    Personal Personal = new Personal();
    Personal.netflix(player, crush);
    //System.out.println(player.average);
    //Lunch lunch = new Lunch();
    //Events event = new Events();
    //event.impressCrush(player);
    //lunch.play(player);
    //FindClass run = new FindClass();
    //run.runToClass(player);
    //System.out.println(player.average);

    if(!player.isDead()){
      System.out.println(luck);
      System.out.println("Good Morning " + player.name + "!");
      System.out.println("Please select one of the following:");

      int ans = 0;
      String s = "";
      s += "\t1: Show Your Status\n";
      s += "\t2: Fortune Me! \n";
      s += "\t3: INTO THE FRAY! \n";
      s += "Selection: ";
      System.out.println(s);

      try {
        ans = Integer.parseInt( in.readLine() );
        String let;
        if (ans == 1){
          System.out.println(player);
          System.out.println("Would you like a fortune? (Y/N)");
          let = in.readLine();
          if(let == "Y"){
            System.out.println("Fortune: ");
          }

        }
        else if (ans == 2){
          System.out.println("Fortune: ");
        }
        //IMPLEMENT LATER :))
        else
        System.out.println("Packing your turtle shell...");
      }
      catch ( IOException e ) { }

      System.out.println("OK HERE WE GO");
      //Starting school
      int eNum = 0;
      while(eNum <= maxE){
        if (luck < 0.2){
          //No events
          break;
        }
        else if (luck < 0.4){
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

        else if (luck < 0.6){
          //Social
          //friend // eatOut // brithday // rumors
          if(luck < 0.45)
          Social.friend();
          else if (luck < 0.5)
          Social.eatOut();
          else if (luck < 0.55)
          Social.birthday();
          else
          Social.rumors();
        }
        else if (luck < 0.8){
          //Personal
          if(luck < 0.65)
          Personal.netflix(player, crush);
          else if (luck < 0.7)
          Personal.blindDate();
          else if (luck < 0.75)
          Personal.sick();
          else
          Personal.nap();
        }
        else{
          //Other
          if(luck < 0.85)
          Other.MTA();
          else if (luck < 0.9)
          Other.allNighter();
          else if (luck < 0.95)
          Other.soulCycle();
          else
          Other.urbex();
        }
        luck = Math.random();
        eNum+= 1;
      }

      return true;
    }
    return false;
  }


  public static double getLuck() {
    return luck;
  }

  public static void main(String[] args) {
    Woo game = new Woo();
    int days = 1;

    while(days <= 180){
      System.out.println("Day " + days);
      if(!game.simDay())
      break;
      days++;
      System.out.println("");
    }
    //}
  }
}

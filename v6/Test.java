import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Test {

  // instance variables -----------------------------------
  protected Student player;
  private Crush crush;
  private NPC npc1;

  public int days;
  public static double luck;
  private int score;
  public static int maxE;
  public static Friend[] yourFriends;
  public static Friend friend1;
  public static Friend friend2;
  public static Friend friend3;
  public static boolean datenight = false;
  public static boolean flix = false;


  private InputStreamReader isr;
  private BufferedReader in;

  final String[] NAMES = {"Joe", "Gaby", "Buford", "Edith", "Arnold", "Kat"}; //possible names for NPCS
  //---------------------------------------------------------

  public Test() {
    days = 0;
    maxE = (int)(Math.random() * 5);
    isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );




    //Making friends

    int friendgen = (int)(Math.random() * 6);
    friend1 = new Friend(NAMES[friendgen]);
    friend1.friendship = 3;
    friendgen = (int)(Math.random() * 6);
    friend2 = new Friend(NAMES[friendgen]);
    friend2.friendship = 1;
    friendgen = (int)(Math.random() * 6);
    friend3 = new Friend(NAMES[friendgen]);
    friend2.friendship = 7;
    yourFriends = new Friend[3];
    yourFriends[0] = friend1;
    yourFriends[1] = friend2;
    yourFriends[2] = friend3;
}
  //sims a day, out of a possible 180 - we can put the methods in another class
  public boolean testDay() {
    player = new Normal("Player");
    crush = new Crush("Crush");
    Academic.quiz(player); 
    //Other other = new Other();
    //Other.hqtrivia(player);
    
    return true;
  }
    //System.out.println(player.average);
    //Lunch lunch = new Lunch();
    //Events event = new Events();
    //event.impressCrush(player);
    //lunch.play(player);
    //FindClass run = new FindClass();
    //run.runToClass(player);
    //System.out.println(player.average);

/*    if(!player.isDead()){
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
/*
        else if (luck < 0.6){
          //Social
          //friend // eatOut // brithday // rumors
          if(luck < 0.45)
          Social.friend(player);
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
          Personal.date(player, crush);
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
        eNum+= 1;
        luck = Math.random();
      }

      return true;
    }
    return false;
  }
*/


  public static void main(String[] args) {
    Test game = new Test();
    int days = 1;
    game.testDay();
    }
    //}
}

import java.io.*;
import java.util.*;

public class Social {
    //   private isr = new InputStreamReader( System.in );
    //private in = new BufferedReader( isr );

    public static void friend() {
      int choiceF = (int)(Math.random() * 3);
      double choice = Math.random();
      NPC currFriend = Woo.yourFriends[choiceF];

      System.out.println("Your friend is:");
      System.out.println(currFriend + "\n");

      if(choice < 0.25){
	    String s = "Your friend, " +  " waved at you in the hallway! \n";
	    s+= "\n";
	    s+= "\t \n";
	    s+= "\t \n";
	    s+= "\t1: \n";
	    s+= "\t2: \n";
	    s+= "\t3: \n";
	    System.out.println(s);
    }
    else if (choice < 0.5) {
      String s = "";
	    s+= "\n";
	    s+= "\t \n";
	    s+= "\t \n";
	    s+= "\t1: \n";
	    s+= "\t2: \n";
	    s+= "\t3: \n";
	    System.out.println(s);
    }
    else if (choice < 0.75) {
      String s = "";
	    s+= "\n";
	    s+= "\t \n";
	    s+= "\t \n";
	    s+= "\t1: \n";
	    s+= "\t2: \n";
	    s+= "\t3: \n";
	    System.out.println(s);
    }
    else{
      String s = "";
	    s+= "\n";
	    s+= "\t \n";
	    s+= "\t \n";
	    s+= "\t1: \n";
	    s+= "\t2: \n";
	    s+= "\t3: \n";
	    System.out.println(s);
    }
    }
    public static void eatOut() {
	String s = "";
	s+= "\n";
	s+= "\t \n";
	s+= "\t \n";
	s+= "\t1: \n";
	s+= "\t2: \n";
	s+= "\t3: \n";
	System.out.println(s);
    }
    public static void birthday() {
	/*	String s = "";
	s+= "HAPPY BIRTHDAY BUD! *cue scanner song\n";
	s+= "\tYou're officially 15\n";
	s+= "\tWhat would you like to do today: \n";
	s+= "\t1: play hooky and go to Wok Wok! \n";
	s+= "\t2: do nothing. school is still a thing for you :( \n";
	s+= "\t3: \n";
	System.out.println(s);

	String ans = in.readLine(); */
    }
    public static void rumors() {
	String s = "";
	s+= "\n";
	s+= "\t \n";
	s+= "\t \n";
	s+= "\t1: \n";
	s+= "\t2: \n";
	s+= "\t3: \n";
	System.out.println(s);
    }

}

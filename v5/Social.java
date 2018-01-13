import java.io.*;
import java.util.*;

public class Social {
    private static InputStreamReader isr;
    private static BufferedReader in;


    public static void friend(Student player) {
      isr = new InputStreamReader( System.in );
      in = new BufferedReader( isr );
      int choiceF = (int)(Math.random() * 3);

      Friend currFriend = Woo.yourFriends[choiceF];
      System.out.println(choiceF);
      System.out.println("Your friend is:");
      System.out.println(currFriend + "\n");


      double choice = Math.random();
      if(choice < 0.25){
	    String s = "Your friend, " + currFriend +  " waved at you in the hallway! \n";
	    s+= "\t What would you like to do? \n";
	    s+= "\t1: Pretend you didn't notice \n";
	    s+= "\t2: Wave Back!\n";
	    s+= "\t3: Stop and Chat\n";
	    System.out.println(s);
      int ans = 0;

      try {
        ans = Integer.parseInt( in.readLine() );
        if (ans == 1){
          System.out.println("" + currFriend + " is a little offended and will\nremember your actions....");
          currFriend.friendship -= 0.5;
        }
        else if (ans == 2){
          System.out.println(currFriend + " feels a little closer to you now");
          currFriend.friendship += 1;
        }

        else{
          System.out.println(currFriend + " loves the conversation! \nYour friendship shoots up but you're late to class....");
          player.average -= 1;
      }
      }
      catch ( IOException e ) { }


    }
    else if (choice < 0.5) {
      String s = currFriend + " meets you at your locker and asks if you \nwant to go to help them with their homework after school.";
	    s+= "\n What do you do?";
	    s+= "\t1: No. I can't sorry. I have a lot of work to do\n";
	    s+= "\t2: Sure! I gotcha!\n";
	    s+= "\t3: You can just copy mine!\n";
	    System.out.println(s);

      int ans = 0;

      try {
        ans = Integer.parseInt( in.readLine() );
        if (ans == 1){
          System.out.println(currFriend + " is a little offended and will \nremember your actions....");
          currFriend.friendship -= 1;
        }
        else if (ans == 2){
          System.out.println(currFriend + " finishes their homework and gets 100!\nThey owe it all to you :)");
          currFriend.friendship += 1.5;
        }

        else{
          double caughtChance = Math.random();
          if(caughtChance < 0.3){
          System.out.println(currFriend + " gets caught copying your homework... \nYour average goes down 5 points but you and " + currFriend + " are closer than ever!");
          player.average -= 5;
          currFriend.friendship += 2;
        }
        else{
          System.out.println(currFriend + " appreciates you.");
          currFriend.friendship += 2;
        }
      }
      }
      catch ( IOException e ) { }

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

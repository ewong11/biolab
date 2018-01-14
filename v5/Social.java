import java.io.*;
import java.util.*;

public class Social {
    private static InputStreamReader isr;
    private static BufferedReader in;
    //Readers

    public static void friend(Student player) {
      isr = new InputStreamReader( System.in );
      in = new BufferedReader( isr );
      //Chooses whcih friend to interact with
      int choiceF = (int)(Math.random() * 3);
      //References friend with currFriend
      Friend currFriend = Woo.yourFriends[choiceF];
      //Which FriendEvent to do?
      double choice = Math.random();
      if(choice < 0.33){
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
    else if (choice < 0.66) {
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
    else{
      String s = currFriend + "has a new significant other...";
	    s+= "\n Recently, you've been neglected by the couple";
	    s+= "\n and when you do get together, you're the third wheel.";
	    s+= "\n What do you do?";
	    s+= "\t1: Confront " + currFriend + "\n";
	    s+= "\t2: Stop hanging out with them all together\n";
	    s+= "\t3: You're not bothered by this.\n";
	    System.out.println(s);

      int ans = 0;

      try {
        ans = Integer.parseInt( in.readLine() );
        if (ans == 2){
          System.out.println(currFriend + " is a little offended and will \nremember your actions....");
          if (currFriend.friendship < 1) {
            currFriend.friendship = 0;
          }
          else
            currFriend.friendship -= .3;
        }
        else if (ans == 3) {
          System.out.println("Nothing Happens.");
        }

        else{
          double caughtChance = Math.random();
          if(currFriend.friendship < 2){
          System.out.println(currFriend + " understands your situation. \nYour friendship goes up!");
          currFriend.friendship += 0.5;
        }
        else{
          System.out.println(currFriend + " is angered...");
          currFriend.friendship -= 1;
        }
      }
      }
      catch ( IOException e ) { }
    }

    }
    public static void eatOut() {
	String s = "EATING OUT TONIGHT!!!?!";
	s+= "\n";
	s+= "\t \n";
	s+= "\t \n";
	s+= "\t1: \n";
	s+= "\t2: \n";
	s+= "\t3: \n";
	System.out.println(s);
    }
    public static void birthday() {
      /*String s = "";
      s+= "HAPPY BIRTHDAY BUD! *cue scanner song\n";
      s+= "\tYou're officially 15\n";
      s+= "\tWhat would you like to do today: \n";
      s+= "\t1: play hooky and go to Wok Wok! \n";
      s+= "\t2: do nothing. school is still a thing for you :( \n";
      s+= "\t3: Convince your teacher not to assign you homework\n";
	System.out.println(s);

	String ans = in.readLine(); */
    }
    public static void rumors() {
	String s = "THERE'S A RUMOR GOING AROUND?!";
	s+= "\n";
	s+= "\t \n";
	s+= "\t \n";
	s+= "\t1: \n";
	s+= "\t2: \n";
	s+= "\t3: \n";
	System.out.println(s);
    }

}

import java.io.*;
import java.util.*;

public class Social {
  private static InputStreamReader isr;
  private static BufferedReader in;
  //Readers

  public static void friend(Student player) {
    isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );
    //Chooses which friend to interact with
    int choiceF = (int)(Math.random() * 3);
    Friend currFriend;
    //References friend with currFriend
    currFriend = Woo.yourFriends[3];
    //Which FriendEvent to do?
    double choice = Math.random();

    //Friend Event 1
    if(choice < 0.33){
      String s = "Your friend, " + currFriend.name +  " waved at you in the hallway! \n";
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
      catch ( IOException e ){ }
    }

    //Friend Event 2
    else if (choice < 0.66) {
      String s = currFriend.name + " meets you at your locker and asks if you \nwant to go to help them with their homework after school.";
      s+= "\n What do you do? \n";
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
          //Get caught copying!!
          if(caughtChance < 0.3){
            System.out.println(currFriend + " gets caught copying your homework... \nYour average goes down 5 points but you and " + currFriend + " are closer than ever!");
            player.average -= 5;
            currFriend.friendship += 2;
          }
          //Just increases.
          else{
            System.out.println(currFriend + " appreciates you.");
            currFriend.friendship += 2;
          }
        }
      }
      catch ( IOException e ) { }
    }
    else{
      String s = currFriend.name + " has a new significant other...";
      s+= "\nRecently, you've been neglected by the couple";
      s+= "\nand when you do get together, you're the third wheel.";
      s+= "\nWhat do you do? \n";
      s+= "\t1: Confront " + currFriend.name + "\n";
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
          else{
            currFriend.friendship -= .3;
          }
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

  public static void AllFriendsChange(String change, double amt){
    if(change.equals("add")){
      Woo.friend1.friendship += amt;
      Woo.friend2.friendship += amt;
      Woo.friend3.friendship += amt;
      Woo.crush.friendship += amt;
    }
    else{
      Woo.friend1.friendship -= amt;
      Woo.friend2.friendship -= amt;
      Woo.friend3.friendship -= amt;
      Woo.crush.friendship -= amt;
    }
  }

  public static void eatOut(Student p) {
    isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );

    String s = "EATING OUT TONIGHT!!!?!";
    s+= "\nAll your friends want to go out to eat tonight!";
    s+= "\nThey want you to come along as well!\n";
    s+= "\nYou have a lot of homework... What do you do?\n";
    s+= "\t1: You go home. Grades are more important today!\n";
    s+= "\t2: HECK YEAH! LET'S HAVE FUNNN TONIGHT!\n";
    s+= "\t3: You have other plans today!\n";
    System.out.println(s);

    int ans = 0;
    try {
      ans = Integer.parseInt( in.readLine() );
      if (ans == 1){
        System.out.println("You studied hard that night and finished all your homework to your best possibility!");
        System.out.println("Your average increases a little!");
        p.average += 0.5;
      }
      else if (ans == 2){
        System.out.println("It was SUCH a fun night :) However, you dont finish ANY of your homework... ");
        System.out.println("Average does down slightly but friendship all goes up!");
        p.average =+ 0.5;
        AllFriendsChange("add", 0.3);
      }
      else{
        int newOne = 0;
        System.out.println("What are your new plans?");
        System.out.println("\t1: Study Session @ AIS tutoring");
        System.out.println("\t2: Going to sleep the second you get home!");
        newOne = Integer.parseInt(in.readLine());
        if(newOne == 1){
          System.out.println("You ACE your test tomorrow!! WOoo!");
          System.out.println("Grades go up... Friends go down :(");
          p.average += .5;
          AllFriendsChange("sub", 0.3);
        }
        else{
          System.out.println("The best sleep yet!");
          System.out.println("You wake up to texts from group chat texts \n");
          System.out.println("\t: Can't believe " + p.name + " didn't come today." );
          System.out.println("\t: At least now I know who my real friends are!");
          AllFriendsChange("sub", 0.3);
          p.sleep += 2;
        }
      }
    }
    catch ( IOException e ) { }
  }

  public static int birthday(Student p) {
    isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );
    String s = "\n";
    s += "           iiiiiiiiii\n";
    s += "          |:H:a:p:p:y:|\n";
    s += "        __|___________|__\n";
    s += "       |^^^^^^^^^^^^^^^^^|\n";
    s += "       |:B:i:r:t:h:d:a:y:|\n";
    s += "       |                 |\n";
    s += "       ~~~~~~~~~~~~~~~~~~~\n";
    s += "HAPPY BIRTHDAY BUD!\n";
    s += "\tYou're officially 15\n";
    s += "\tWhat would you like to do today: \n";
    s += "\t1: play hooky and go to Wok Wok! \n";
    s += "\t2: do nothing. school is still a thing for you :( \n";
    System.out.println(s);

    int ans = 0;
    try{
      ans = Integer.parseInt(in.readLine());
      if(ans == 1){
        System.out.println("You had a great time today!\n");
        System.out.println("Have a great year! <3");
        p.mental += 0.5;
        return 1;
      }
      else{
        System.out.println("You go to school...\n");
        return 0;
      }
    }
  catch ( IOException e ) { }
  return 0;
  }

  public static void rumors(Student p) {
    isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );
    //Chooses whcih friend to interact with
    int choiceF = (int)(Math.random() * 3);
    //References friend with currFriend
    Friend currFriend = Woo.yourFriends[choiceF];
    //Which FriendEvent to do?
    double choice = Math.random();

    if(choice < 0.33){
      String s = "THERE'S A RUMOR GOING AROUND?!";
      s+= "\nThey say that you're trying to bribe others to write your papers?!";
      s+= "\nWhat do you do?\n";
      s+= "\t1: Keep quiet... It just might be true... \n";
      s+= "\t2: Go to your guidance counselor. Talk it out!\n";
      s+= "\t3: Ignore them!! You know it's not true!\n";
      System.out.println(s);

      int ans = 0;
      try {
        ans = Integer.parseInt( in.readLine() );
        if (ans == 1){
          double maybeDone = Math.random();

          //GET KICKED OUT?!?
          if (maybeDone < 0.1){
            System.out.println("You just lost. Never cheat yourself :(");
            p.setMental(0);
          }
          else{
            System.out.println("You better get yourself together!");
          }
        }
        else if (ans == 2){
          System.out.println("The rumor dies down and you continue with your life! :)");
        }
        else{
          System.out.println("The rumor dies down and you continue with your life! :)");
        }
      }
      catch ( IOException e ) { }

    }
    else if (choice < 0.66) {
      String s = "THERE'S A RUMOR GOING AROUND?!";
      s+= "\nPeople are saying that " + currFriend + " started it...";
      s+= "\nIt says that you're really mean and fake?!\n";
      s+= "What do you do? \n";
      s+= "\t1: Confront " + currFriend + "\n";
      s+= "\t2: Laugh it off\n";
      s+= "\t3: Ignore everyone.\n";
      System.out.println(s);

      int ans = 0;
      try {
        ans = Integer.parseInt( in.readLine() );
        if (ans == 1){
          System.out.println("You and " + currFriend.name + " have an intense argument...");
          System.out.println("Friendship level decreases...");
          currFriend.friendship -= 1;
        }
        else if (ans == 2){
          System.out.println("The rumor dies down and you continue with your life! :)");
        }
        else{
          System.out.println("Oh no :( You've stopped talking to a lot of people");
          System.out.println("It's bad for all your friendships :(");
          AllFriendsChange("sub", 0.5);
        }
      }
      catch ( IOException e ) { }
    }
    else{
      String s = "THERE'S A RUMOR GOING AROUND?!";
      s+= "\nPeople are saying that you're failing all your classes!";
      s+= "\n What do you do?\n";
      s+= "\t1: Prove to everyone that you're a scholar!\n";
      s+= "\t2: Ignore it. You know you're not failing :)\n";
      s+= "\t3: Cry :(\n";
      System.out.println(s);

      int ans = 0;
      try {
        ans = Integer.parseInt( in.readLine() );
        if (ans == 1){
          double posorneg = Math.random();

          if (posorneg < 0.5){
            System.out.println("People think you're annoying :( Friendships lower");
            AllFriendsChange("sub", 0.5);
          }
          else{
            System.out.println("People think you're a role model!");
            System.out.println("Friendships go up!");
            AllFriendsChange("add", 0.5);
          }
        }
        else if (ans == 2){
          System.out.println("The rumor dies down and you continue with your life! :)");
        }
        else{
          System.out.println("The rumor gets to you :( Your friendships suffer...");
          AllFriendsChange("sub", 0.5);
        }

      }
      catch ( IOException e ) { }


    }
  }

}

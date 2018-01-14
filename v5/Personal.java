import java.io.*;
import java.util.*;

public class Personal {

  private static InputStreamReader isr;
  private static BufferedReader in;

  public static void netflix(Student a, Crush b) {
    String input = "";
    isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );
    //PROMPT------------------------------------------------------------------
    String s = "Something good just came out on Netflix!";
    s += "\nYou really want to watch the show, but you also know that you need to do homework...";
    s += "\nWhat do you do?";
    s += "\n1: BINGE WATCH NETFLIX DUH";
    s += "\n2: Call " + b.name +  " and see if she wants to Netflix and chilll";
    s += "\n3: I really need to do hw...";
    System.out.println(s);
    //RESPONSES---------------------------------------------------------------
    try {
      input = in.readLine();
    }
    catch (IOException e) {};

    int time = (int)(Math.random() * 6);
    if (input.equals("1")) {
      s = "Before you know it, its ";
      s += time;
      s += " \nYou slowly drift off, with the sound of your TV in the background...";
      a.sleep -= time;
      a.intel -= 5;
      a.mental += 20;
      System.out.println(s);

    }
    else if (input.equals("2")) {
      int num = 1;
      s = "You begin to call " + b.name;
      if (a.mental > 50) {
        s += "..." + b.name + " picks up!";
        s += "\nWhat do you do?";
        if (b.friendship < 1.75) {
          s += "\n" + num + ": stammer...";
          num += 1;
          s += "\n" + num + ": (hang up)";
          num += 1;
          if ((a.charisma + a.mental) > 140) {
            s += "\n" + num + ": Hey, I happened to pick up your book on the way to your house...";
            s += "\nCome over...we can write a new chapter together!";
            num += 1;
            s += "\n" + num + ": I'll be the 'net' in Netflix, because you're my catch!";
            num += 1;
          }
          if (b.friendship > 3) {
            s += "\n" + num + ": free tonite? wanna come over?";
          }
        }
      }
      System.out.println(s);

      try {
        input = in.readLine();
      }
      catch (IOException e) {}


        if (input.equals("1") && b.friendship < 1.75) {
          s = b.name + ": \"hello? hello?\"";
          s += "\n (you struggle to get words out)";
          s += "\n" + b.name + " hangs up, and you start to cry...";
          a.charisma -= 5;
          a.mental -= 10;
        }
        else if (input.equals("1") && (a.charisma + a.mental) > 140 ) {
          s = b.name + ": \"wtf stalker...";
          s += "\n (you stammer)";
          s += "\n" + b.name + " :\"get away from me weirdo...\"";
          s += "\n" + b.name + " hangs up.";
          s += "\n Ok that was pretty creepy...maybe back off a bit";
          b.friendship -= 1.0;
        }

        else if (input.equals("1")) {
          if (Math.random() > .5) {
            s = "on my way!";
            b.friendship += .1;
          }
          else {
            s = "Sorry...I'm busy. How about another time!";
            b.friendship += .1;
          }
        }

        else if (input.equals("2") && b.friendship > 1.75) {
          s = "What'd you do that for? \nNow" + b.name + " probably thinks you're a weirdo...";
          a.charisma -= 10;
          a.mental -= 5;
        }

        else if (input.equals("2") && (a.charisma + a.mental) > 140 ) {
          s = b.name + ": \"...haha love me a mans with good puns haha... \"";
          s += b.name + " hangs up...what did you do wrong?";
          a.charisma -= 20;
        }

        else if (input.equals("3")) {
          s = b.name + ": \"wtf stalker...";
          s += "\n (you stammer)";
          s += "\n" + b.name + " :\"get away from me weirdo...\"";
          s += "\n" + b.name + " hangs up.";
          s += "\n Ok that was pretty creepy...maybe back off a bit";
          b.friendship -= 1.0;
        }

        else if (input.equals("4")) {
          s = b.name + ": \"...haha love me a mans with good puns haha... \"";
          s += b.name + " hangs up...what did you do wrong?";
          a.charisma -= 20;
        }

        else if (input.equals("5")) {
          if (Math.random() > .5) {
            s = "on my way!";
            b.friendship += .1;
          }
          else {
            s = "Sorry...I'm busy. How about another time!";
            b.friendship += .1;
          }
        }
        System.out.println(s);
      }

      else if (input.equals("3")) {
        s = "What a scholar!";
        s += "\nYou become smarter and more rested!";
        a.intel += 3;
        a.sleep += 3;
        System.out.println(s);
      }
    }
    public static void date(Student a, Crush b) {
      String input = "";
      if (b.friendship > 2.5);
      String s = b.date + " asks you out on a date";
      s += "\nDo you want to go? (y/n)";
      System.out.println(s);
      isr = new InputStreamReader( System.in );
      in = new BufferedReader( isr );

      try {
        input = in.readLine();
      }
      catch (IOException) {}
      if (input.equals("y")) {
        s = b.name + " asks you where you want to go, but recommends the arcade.";
        s += "\nWhere do you want to go?";
        s += "\n1. the arcade";
        s += "\n2. the carnival";
        s += "\n3. The Uncommons";
        s += "\n4. actually...I don't really want to go on a date..";
        System.out.println(s);
      }

      try {
        input = Integer.parseInt(in.readLine());
      }
      catch (IOException) {}

        if (input == 1) {
          s = "You guys go to the arcade!";
          System.out.println(s);
          double chance = Math.random();
          if (chance > .5) {
            s = b.name + " decides to plays the claw machine and ";
            if (Math.random() < .5) {
              s += b.name + "wins!\n" + b.name + " gives you the stuffed animal.";
              b.friendship += .2;
            }
            else if (Math.random() > .8) {
              s += b.name + "loses :(." + "\nIn a rage, he knocks over the machine and storms off!";
              s += "\n Your date ends badly.";
              b.friendship -= .5;
            }
            else {
              s = "Nothing special happens, but " + b.name + " seems interested!";
              b.frienship += .3;
            }
          }
          else if (chance > .5 && chance < .9) {
            s = "\n" + b.name + " faces you in a game of air hockey!";
            s += "\n" + b.name + " doesn't know it, but you are a air hockey champion!";
            s += "\n Do you let him win?";
            if (input == 1) {
            }
            else if (input == 2) {
            }
            else {
            }
              }
          }
          if (input == 1) {
          }
          else if (input == 2) {
          }
          else {
          }
            }
      	}
      	else if (input == 2) {
      	}
      	else {
      	}
          }

      else {
        s = b.name + " acts like " + b.name + " okay, but you can see the disappointment";
        s += "\n wash across " + b.name + "'s face...";
        s += "\n" + b.name + "walks away, leaving you alone.";
        b.friendship -= 2;
        System.out.println(s);
      }


    public static void blindDate() {
    }
    public static void sick() {
    }
    public static void nap() {
    }

  }

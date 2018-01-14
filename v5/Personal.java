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
      String s = b.name + " asks you out on a 'date'";
      s += "\nDo you want to go? (y/n)";
      System.out.println(s);
      isr = new InputStreamReader( System.in );
      in = new BufferedReader( isr );

      try {
        input = in.readLine();
      }
      catch (IOException e) {}
        if (input.equals("y")) {
          s = b.name + " asks you where you want to go, and recommends the arcade.";
          s += "\nWhere do you want to go?";
          s += "\n1. the arcade";
          s += "\n2. the carnival";
          s += "\n3. the movies";
          s += "\n4. actually...I don't really want to go on a date..";
          System.out.println(s);
        try {
          input = in.readLine();
        }
        catch (IOException e) {}

          if (input.equals("1")) {
            s = "You guys go to the arcade!";
            System.out.println(s);
            double chance = Math.random();
            if (chance > .5) {
              s = b.name + " decides to plays the claw machine and ";
              if (Math.random() < .5) {
                s += b.name + "wins!\n" + b.name + " gives you the stuffed animal.";
                b.friendship += .3;
              }
              else if (Math.random() > .7) {
                s += b.name + " loses :(." + "\nIn a rage, " + b.name + " knocks over the machine and storms off!";
                s += "\nYour date ends badly...";
                b.friendship -= .5;
              }
              else {
                s = "loses, but you guys had a good time nonetheless.";
                b.friendship += .2;
              }
              System.out.println(s);
            }
            else if (chance > .5 && chance < .9) {
              s = "\n" + b.name + " faces you in a game of ping pong!";
              s += "\n" + b.name + " doesn't know it, but you are a ping pong champion!";
              s += "\n Do you let him win? (y/n)";

              try {
                input = in.readLine();
              }
              catch (IOException e) {}

                if (input.equals("y")) {
                  s = b.name + " seems to notice that you're going easy on him, and seems disinterested...";
                  s += "\n Do you start to play hard? (y/n)";
                  try {
                    input = in.readLine();
                  }
                  catch (IOException e) {}
                    if (input.equals("y")) {
                      s = "\n Even though you beat " + b.name +" easily," + b.name;
                      s += "\n gives a sly grin and seems really into it.";
                      s += "\n You guys lose track of time and before you know it,";
                      s += "\n it's dark outside.";
                      s += "\n" + b.name + " and you had a great time!";
                      b.friendship += .5;
                      a.charisma += 5;
                    }
                    else {
                      s = "You keep going easy, and " + b.name + "becomes bored.";
                      s += "\nYour date had barely started, but" + b.name;
                      s += "\n makes up an excuse and leaves..";
                      b.friendship -= .2;
                      a.charisma -= 5;
                    }
                  }
                  else {
                    s = "\n Even though you beat " + b.name +" easily," + b.name;
                    s += "\n becomes fired up!.";
                    s += "\n You guys lose track of time and before you know it,";
                    s += "\n it's dark outside.";
                    s += "\n" + b.name + " and you had a great time!";
                    b.friendship += .6;
                  }
                  System.out.println(s);
                }
                else  {
                  if (Woo.luck > .3) {
                    s = "You guys are just playing Pac-Man, when you feel ";
                    s += "\n" + b.name + " leaning closer.";
                    s += "\n What do you do?";
                    s += "\n1. Go with the flow!";
                    s += "\n2. Push " + b.name + " away";
                    if (a.charisma > 80) {
                      s += "\n3.Be aggressive!";
                    }
                    System.out.println(s);
                    try {
                      input = in.readLine();
                    }
                    catch (IOException e) {}
                      if (input.equals("1")) {
                        s = "The night goes by in a whirlwind and you wake up in a daze...";
                        s += "\nYou don't know what happened...";
                        s += "\nMaybe you should ask!";
                        Woo.datenight = true;
                        b.friendship += 1;
                        a.charisma += 10;
                        a.mental -= 5;
                      }
                      else if (input.equals("2")) {
                        s = b.name + ": ...";
                        s += "\n" + b.name + " chuckles nervously and you guys keep playing Pac-Man";
                        s += "\n The rest of the night goes by without incident, but ";
                        s += "\n there is an undeniable awkwardness between you two";
                        b.friendship -= 1.2;
                      }
                      else if (input.equals(3) && a.charisma > 80) {
                        s = "You guys have the best night ever";
                        s += "You feel infinitely closer to" + b.name;
                        b.friendship += 2.0;
                      }
                      else {
                        s = "You just stand there...";
                        s += "Nothing happens and the date ends";
                      }
                    }
                    else {
                      s = "Nothing special happens tonight.";
                      s += "\nMaybe one of you wanted more, but no one made a move.";
                      b.friendship += .2;
                    }
                    System.out.println(s);
                  }
                }
                else if (input.equals("2")) {
                  s = b.name + ": ...okay, but I don't really like carnivals.";
                  s += "\nType anything to continue";
                  try {
                    in.readLine();
                  }
                  catch (IOException e) {}

                    if (Math.random() > .6) {
                      s += "\nIt begins to drizzle, then rain, then pour as the day goes on.";
                      s += "\nBoth of you are miserable, and " + b.name + "clearly isn't interested.";
                      s += "\nYou go home dejected and angry for picking the carnival";
                      b.friendship -= 1;
                    }
                    else if (a.charisma > 80) {
                      s += "\n Even though " + b.name + " doesn't like carnivals, ";
                      s += "\n your radiant personality makes the whole experience great!";
                      s += "\n It was a surprisingly good date!";
                      b.friendship += .5;
                    }
                    else {
                      s += "\n" + b.name + " didn't pay any attention to you and was obviously bored out of his mind.";
                      s += "\n This was a mistake...";
                      b.friendship -= .5;
                    }
                    System.out.println(s);
                  }
                  else if(input.equals("3")) {
                    s = "Nothing wrong with a basic date!";
                    s += "\nWhat do you watch?";
                    s += "\n1. an action movie";
                    s += "\n2. a drama";
                    s += "\n3. a romantic movie";
                    s += "\n4: a comedy";
                    System.out.println(s);

                    try {
                      input = in.readLine();
                    }
                    catch (IOException e) {}
                      if (input.equals("1")) {
                        s = "Everyone loves some action!";
                        s += "You have a good time";
                        a.mental += 5;
                        b.friendship += .2;
                      }
                      else if (input.equals("2")) {
                        s = "Turns out " + b.name + " is really into drama!";
                        b.friendship += .3;
                      }
                      else if (input.equals("3")) {
                        s = ";)";
                        s += b.name + " (looks at you weird)";
                        a.charisma += 20;
                      }
                      else {
                        s = "Comedy it is!";
                        s += "\nUnfortunately it's a cheesy comedy...";
                        a.charisma += 10;
                        a.mental -= 10;
                        a.intel -= 10;
                        b.friendship += .2;
                      }
                      System.out.println(s);
                    }
                  }
                    else {
                      s = b.name + " acts like its no big deal, but you can see the disappointment ";
                      s += "\nwash across " + b.name + "'s face...";
                      s += "\n" + b.name + " walks away, leaving you alone.";
                      b.friendship -= 1.5;
                      System.out.println(s);
                    }
                  }

                  public static void sick() {
                  }
                  public static void nap() {
                  }

                }

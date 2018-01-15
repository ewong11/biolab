import java.io.*;
import java.util.*;

public class Other {
    private static InputStreamReader isr;
    private static BufferedReader in;

    public static void MTA(Student a) {
	isr = new InputStreamReader(System.in);
	in = new BufferedReader( isr);
	String out = "";
	int ans = 0;

	out += a.name + ", the train is running late! What's your plan?\n";
	out += "\t1: take a cab. my life revolves around school.\n";
	out += "\t2: wait it out. the train will come eventually.\n";
	out += "\t3: transfer to another line.\n";
	try {
	    ans = Integer.parseInt(in.readLine());
	}
	catch (IOException e) {}

	if (ans == 1) {
	    out = "the morning traffic holds the cab driver up. ";
	    out += "you have 5 minutes left and you're at canal street.";
	    out += "what do you do?\n";
	    out += "\t1: ask him to drop you off. you'll run.\n";
	    out += "\t2: you're okay with being a little late\n";
	    out += "\t3: have him stop the car. if you're going to be late, you might as well not be there at all\n";
	    try {
		ans = Integer.parseInt(in.readLine());
	    }
	    catch (IOException e) {}

	    if (ans == 1) {
		System.out.println();
		a.physical += 1;
	    }
	    else if (ans == 2) {
	    }
	    else {
	    }
	}
	else if (ans == 2) {
	}
	else {
	}
    }
public static void allNighter(Student a) {
  boolean question = false;
	isr = new InputStreamReader(System.in);
	in = new BufferedReader( isr);
	String out = "";
	int ans = 0;
	out = "Projects are looming.";
	out += "\nTests are coming up";
	out += "\nYou have homework you didn't do.";
  if (Woo.flix == true) {
	out += "\nOh why did I watch binge Netflix?";
}
  System.out.println(out);
while (question == false) {
out += "\n\n1. You can pull an all-nighter and finish all your work OR";
out += "\n2. You can just sleep, its a lost cause anyways";
System.out.println(out);
	try {
	    ans = Integer.parseInt(in.readLine());
	}
	catch (IOException e) {}

	if (ans == 1) {
    out = "That was a long night, but you finally got everything done!";
    out += "\nUnfortunately, you got no sleep and you won't be able to focus in class";
    a.sleep = 1;
    a.physical -= 20;
    a.mental -= 20;
    a.average += 3;
    question = true;
	}
	else if (ans == 2) {
    out = "Yeah, sleeping was definitely the right choice!";
    out += "You feel refreshed and invigorated, but your grades take a hit";
    a.sleep += 3;
    a.physical += 20;
    a.mental += 20;
    a.average -= 3;
    question = true;
	}
	else {
    out = "make a choice, silly";
	}
  System.out.println(out);
    }
  }
    public static void soulCycle(Student a) {
	isr = new InputStreamReader(System.in);
	in = new BufferedReader( isr);
	String out = "";
	int ans = 0;

	out += "";
	out += "";
	out += "";
	out += "";
	try {
	    ans = Integer.parseInt(in.readLine());
	}
	catch (IOException e) {}

	if (ans == 1) {
	}
	else if (ans == 2) {
	}
	else {
	}
    }
    public static void urbex(Student a) {
	isr = new InputStreamReader(System.in);
	in = new BufferedReader( isr);
	String out = "";
	int ans = 0;

	out += "";
	out += "";
	out += "";
	out += "";
	try {
	    ans = Integer.parseInt(in.readLine());
	}
	catch (IOException e) {}

	if (ans == 1) {
	}
	else if (ans == 2) {
	}
	else {
	}
    }

}

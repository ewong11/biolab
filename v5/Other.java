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
	System.out.println(out); 
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
	    System.out.println(out); 
	    try {
		ans = Integer.parseInt(in.readLine());
	    }
	    catch (IOException e) {}

	    if (ans == 1) {
	        out = "okay, on the way, you catch a whiff of ferry's and coffee. ";
		out += "do you stop to buy?\n";
		out += "\t1: yes\n";
		out += "\t2: no\n";
		System.out.println(out); 
		a.physical += 1;

		try {
		    ans = Integer.parseInt(in.readLine()); 
		}
		catch (IOException e) {}

		if (ans == 1) {
		    System.out.println("give yourself a big pat on the back. you did it\n");
		    a.charisma += 1;
		    a.mental += 1; 
		}
		else {
		    System.out.println("ah curse that delicious food. you were 10 minutes late.");
		    System.out.println(" also, the security guards took your coffee away :( \n"); 
		    a.average -= 1;
		    a.mental -= 1; 
		} 
	    }
	    else if (ans == 2) {
		out = "somehow, by the power vested in the traffic gods, the path to school clears up, but then it starts pouring. ";
		out += "do you take the elevator up the tribeca bridge or no?";
		out += "\t1: yes\n";
		out += "\t2: no, and I run up the slippery steps\n"; 
	    	out += "\t3: no, but I walk carefully the way up\n";
		System.out.println(out); 

		try {
		    ans = Integer.parseInt(in.readLine()); 
		}
		catch (IOException e) { }

		if (ans == 1)
		    System.out.println("it's all good. you come in right on time.\n");
		else if (ans == 2) {
		    System.out.println("oh no! you trip but then again, what did you think would happen?\n");
		    a.physical -= 1;
		    a.charisma -= 1; 
		}
		else {
		    System.out.println("you're ahead of schedule by a minute. ahhh the feeling of making it.\n");
		    a.charisma += 1; 
		} 
	    }
	    else {
<<<<<<< HEAD
		System.out.println("you had a great day eating food and having fun buuuut your mom gets a call and now you're in trouble\n");
		a.charisma -= 1;
		a.average -= 1; 
	    } 
=======
	    }
>>>>>>> 8dfdf23376b5b50cec5212b8482dd97bcf586441
	}
	else if (ans == 2) {
	    out = "okay. so you're already 15 minutes late when you get to tribeca bridge. ";
	    out += "do you decide to skip first period and get food? \n";
	    out += "\t1: yes, you have to finish your english hw anyway\n";
	    out += "\t2: no, that's still 30 minutes of learning\n"; 
	    out += "\t3: no, you already have food\n"; 
	    System.out.println(out);

	    try {
		ans = Integer.parseInt(in.readLine()); 
	    }
	    catch (IOException e) {}
	    
	    if (ans == 1)
		System.out.println("you're late but the only questions you get are from your mom when you say the trainwas late 40 minutes");
	
	    else if (ans == 2) {
		System.out.println("you go, glen coco! your teacher, however, does not appreciate your effort as much");
		a.average -= 1;
		a.charisma += 1; 
	    }
	    else
		System.out.println("welp. just another day i guess.");
	}
	else {
<<<<<<< HEAD
	    out = "okay, you're at Times Square 42nd on the delayed 2 train. ";
	    out += "which line do you take to get to Stuy?\n";
	    out += "\t1: the ACE\n";
	    out += "\t2: the local 1\n";
	    out += "\t3: you walk to the 456\n";
	    System.out.println(out);
	    
	    try {
		ans = Integer.parseInt(in.readLine()); 
	    }
	    catch (IOException e) {}

	    if (ans == 1) {
	        System.out.println("the ACE is even more delayed, if that's possible, and you get to school an hour late.\n");
		a.average -= 1;
		a.mental -= 1;
		a.charisma -= 1; 
	    }
	    else if (ans == 2) {
		out = "the local 1 gets you there just on time. do you go to your locker to put away your coat and get your books?\n";
		out += "\t1: no, late is bad. you'll just take notes on looseleaf and carry your coat\n";
		out += "\t2: yes, you need your books. you sprint there\n";
		out += "\t3: yes, the coat is heavy and you are being slowed down by it.\n";
		System.out.println(out);
		
		try {
		    ans = Integer.parseInt(in.readLine()); 
		}
		catch (IOException e) {}

		if (ans == 1) {
		    System.out.println("oof. you end up having a notebook quiz but you don't have your notes. bad quiz grade.");
		    a.average -= 2;
		    a.mental -= 1;
		    a.physical += 1; 
		}
		else if (ans == 2) {
		    System.out.println("WHOOOOOO. everything is swell even if your hair is a little matted with sweat.\n");
		    a.physical += 1;
		    a.mental += 1;
		    a.charisma += 1;
		}
		else {
		    System.out.println("fair point. but you end up a little late.");
		    a.average -= 1;
		    a.physical -= 1;
		    a.mental += 1; 
		} 
	    }
	    else {
		System.out.println("you're late, but not as late as you could've been so you decide to just go on with the day.\n");
		a.charisma += 1;
		a.physical += 1; 
	    } 	    
	} 
=======
	}
>>>>>>> 8dfdf23376b5b50cec5212b8482dd97bcf586441
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
out = "\n1. You can pull an all-nighter and finish all your work OR";
out += "\n2. You can just sleep, its a lost cause anyways";
System.out.println(out);
	try {
	    ans = Integer.parseInt(in.readLine());
	}
	catch (IOException e) {}

	if (ans == 1) {
    out = "That was a long night, but you finally got everything done!";
    out += "\nUnfortunately, you got no sleep and you won't be able to focus in class.";
    a.sleep = 1;
    a.physical -= 20;
    a.mental -= 20;
    a.average += 3;
    question = true;
	}
	else if (ans == 2) {
    out = "Yeah, sleeping was definitely the right choice! ";
    out += "\nYou feel refreshed and invigorated, but your grades take a hit";
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

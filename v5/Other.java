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

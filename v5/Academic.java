import java.io.*;
import java.util.*;

public class Academic {
    private static InputStreamReader isr;
    private static BufferedReader in; 
	
    public static void test(Student a) {
	isr = new InputStreamReader(System.in);
	in = new BufferedReader( isr);
	int score = 0; 
	String out = ""; 
	out += "hello " + a.name + "! this is a pop test!\n";
	out += "\tif you fail, 5 points will be deducted from your average\n";
	out += "\tif you score over 90, one point will be added\n";
	out += "\there we go...\n";
        out += "\tquestion 1: what is the powerhouse of the cell?\n";
	out += "\t1: topher brown of room 251\n";
	out += "\t2: Ben Franklin\n";
	out += "\t3: mitochondria\n"; 
	System.out.println(out);
	int ans = 0;
	try {
	    ans = Integer.parseInt( in.readLine() ); 
	}
	catch (IOException e) {}
	if (ans == 3) { 
	    score += 20;
	    System.out.println("you're right!!!!");
	}
	else
	    System.out.println("stop sleeping in class");
	
	out = "\tquestion 2: who defeated Washington in the Battle of Brooklyn Heights?\n";
	out += "\t1: Napoleon\n";
	out += "\t2: the Howe Brothers\n";
	out += "\t3: Vladimir Putin\n"; 
	System.out.println(out); 
	try {
	    ans = Integer.parseInt( in.readLine() ); 
	}
	catch (IOException e) {}

	if (ans == 2) {
	    score += 20;
	    System.out.println("you're right!!!!");
	}
	else
	    System.out.println("you're going to FAIL"); 
	
	out = "\tquestion 3: what are the ways to prove triganular congruency\n";
	out += "\t1: SSS, SAS, AAS, ASA\n";
	out += "\t2: AAA, SSS, SAS, HL\n";
	out += "\t3: SAS, ASA, SSA, AAS\n"; 
	System.out.println(out); 
	try {
	    ans = Integer.parseInt( in.readLine() ); 
	}
	catch (IOException e) {}

	if (ans == 1) { 
	    score += 20;
	    System.out.println("you're right!!!!"); 
	}
	else
	    System.out.println("brush up on your geomtry smh");

	out = "\tquestion 4: what movement was Edward Hopper part of?\n";
	out += "\t1: the renaissance\n";
	out += "\t2: hellenistic art\n";
	out += "\t3: american realism\n"; 
	System.out.println(out); 
	try {
	    ans = Integer.parseInt( in.readLine() ); 
	}
	catch (IOException e) {}

	if (ans == 3) { 
	    score += 20;
	    System.out.println("you're right!!!!"); 
	}
	else
	    System.out.println("do better, bud");

	out = "\tquestion 5: who were the lovers in A Midsummer Night's Dream?\n";
	out += "\t1: Left Shark and Right Shark\n";
	out += "\t2: Hermia and Demetrius\n";
	out += "\t3: Mr. and Mrs. Sterr\n"; 
	System.out.println(out); 
	try {
	    ans = Integer.parseInt( in.readLine() ); 
	}
	catch (IOException e) {}

	if (ans == 2) { 
	    score += 20;
	    System.out.println("topher is proud!!!!"); 
	}
	else
	    System.out.println("topher would be disappointed");

	System.out.println("========= END OF QUIZ ========");
	System.out.println("your score: " + score);
	if (score < 65)
	    a.average -= 5;
	else if (score > 95)
	    a.average += 1; 
    }
    public static void quiz(Student a) {
	isr = new InputStreamReader(System.in);
	in = new BufferedReader( isr);
    }
    public static void project(Student a) {
	isr = new InputStreamReader(System.in);
	in = new BufferedReader( isr);
    }
    public static void sleep(Student a) {
	isr = new InputStreamReader(System.in);
	in = new BufferedReader( isr);
    }
    
} 

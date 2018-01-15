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
	System.out.println(out); 
        out = "\tquestion 1: what is the powerhouse of the cell?\n";
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
	System.out.print("\033[H\033[2J");
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
	System.out.print("\033[H\033[2J");
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
	System.out.print("\033[H\033[2J");
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
	System.out.print("\033[H\033[2J");
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
	System.out.print("\033[H\033[2J");
	System.out.println("========= END OF TEST ========");
	System.out.println("your score: " + score);
	if (score < 65)
	    a.average -= 5;
	else if (score > 95)
	    a.average += 1; 
    }
    public static void quiz(Student a) {
	isr = new InputStreamReader(System.in);
	in = new BufferedReader( isr);
		int score = 0; 
	String out = "";
	out += "hello " + a.name + "! POP QUIZ!\n";
	out += "\tif you fail, 2 points will be deducted from your average\n";
	out += "\tif you score over 90, one point will be added\n";
	out += "\there we go...\n\n";
        out += "\tquestion 1: what does the right atrium do?\n";
	out += "\t\t1: takes oxygen rich bood from the lungs\n";
	out += "\t\t2: receives oxygen poor blood from body\n";
	out += "\t\t3: isn't that the thing on the 3rd floor that people dance in?\n"; 
	System.out.println(out);
	int ans = 0;
	try {
	    ans = Integer.parseInt( in.readLine() ); 
	}
	catch (IOException e) {}
	if (ans == 2) { 
	    score += 50;
	    System.out.println("mr. brown is supa pwoud");
	}
	else
	    System.out.println("stop sleeping in class");
	System.out.print("\033[H\033[2J");
	out = "\tquestion 2: how much does the bartender charge a neutron for a drink?\n";
	out += "\t\t1: nothing\n";
	out += "\t\t2: 7 dollars, vodka is expensive\n";
	out += "\t\t3: 2.54$\n"; 
	System.out.println(out); 
	try {
	    ans = Integer.parseInt( in.readLine() ); 
	}
	catch (IOException e) {}

	if (ans == 1) {
	    score += 50;
	    System.out.println("you're right!!!!");
	}
	else
	    System.out.println("Ms. Banfield would be disappointed");
	System.out.print("\033[H\033[2J");
	System.out.println("========= END OF QUIZ ========");
	System.out.println("your score: " + score);
	if (score < 65)
	    a.average -= 2;
	else if (score > 90)
	    a.average += 1; 
    }
    public static void project(Student a) {
	isr = new InputStreamReader(System.in);
	in = new BufferedReader( isr);
	String out = "";
	int ans = 0;
	out += "hello " + a.name + "! Your teacher decides to assign you a project the week before break\n";
	out += "\tWhat do you do?\n";
	out += "\t1: squad up\n";
	out += "\t2: try and ask to do it lone wolf style\n";
	out += "\t3: cry because you have no friends\n";
	System.out.println(out); 
	try {
	    ans = Integer.parseInt( in.readLine() ); 
	}
	catch (IOException e) {}
	if (ans == 1) {
	    System.out.print("\033[H\033[2J");
	    out = "atta boy! what do you do next with yo squa when you meet up?\n";
	    out += "\t1: get some keys\n";
	    out += "\t2: end up gorging on whole foods and forget to work\n";
	    out += "\t3: you didn't meet up. the project died. \n";
	    System.out.println(out); 
	    try {
		ans = Integer.parseInt( in.readLine() ); 
	    }
	    catch (IOException e) {}
	    if (ans == 1) {
		System.out.print("\033[H\033[2J");
		out = "okay. It's presentation day... what do you have for breakfast?\n";
		out += "\t1: granola, yogurt and some pomelo\n";
		out += "\t2: pizza from like a week ago\n";
		out += "\t3: a five course meal\n";
		System.out.println(out); 
		try {
		    ans = Integer.parseInt( in.readLine() ); 
		}
		catch (IOException e) {}
		if (ans == 1){
		    System.out.print("\033[H\033[2J");
		    System.out.print("you got a hundred! woooooo!");
		    a.average += 2; 
		}
		else if (ans == 2) {
		    System.out.print("\033[H\033[2J");
		    System.out.print("you got a zero because you were too busy in the bathroom to show up.\n");
		    a.average -= 5; 
		}
		else {
		    System.out.print("\033[H\033[2J");
		    System.out.print("you ended up late and got 20 points deducted\n");
		    a.average -= 2; 
		} 
	    } 
	    else if (ans == 2) {
		System.out.print("\033[H\033[2J");
		out = "okay. It's presentation day and you stayed up finishing the project\n";
		out += "When do you wake up to go to school?\n";
		out += "\t1: 6:00AM. your parents raised you up to have willpower. hooyah!\n";
		out += "\t2: 6:00AM the next day. yikes. \n";
		out += "\t3: 6:00PM. you overslept. by a little. :( \n";
		System.out.println(out); 
		try {
		    ans = Integer.parseInt( in.readLine() ); 
		}
		catch (IOException e) {}
		if (ans == 1){
		    System.out.print("\033[H\033[2J");
		    System.out.print("you got a hundred! woooooo! thank you mom, dad, Jamie FoxPickle the dog\n");
		    a.average += 2; 
		}
		else if (ans == 2) {
		    System.out.print("\033[H\033[2J");
		    System.out.print("you got a zero. you didn't email the teacher for a makeup\n");
		    a.average -= 5; 
		}
		else {
		    System.out.print("\033[H\033[2J");
		    System.out.print("you had to make up the presentation and got 20 points deducted\n");
		    a.average -= 2; 
		} 
	    } 
	    else {
		System.out.print("\033[H\033[2J");
		System.out.print("you got a zero\n");
		a.average -= 5; 
	    } 
	}
	else if (ans == 2) {
	    System.out.print("\033[H\033[2J");
	    out = "the teacher is hesitant but ultimately gives in. where do you go from here?\n";
	    out += "\t1: write an outline, set up a schedule, and get some keys\n";
	    out += "\t2: wait until the weekend before and have to pull two all nighters.\n";
	    out += "\t3: do the project but overcomplicate it and it ends up mess\n";
	    System.out.println(out); 
	    try {
		ans = Integer.parseInt( in.readLine() ); 
	    }
	    catch (IOException e) {}
	    if (ans == 1) {
		System.out.print("\033[H\033[2J");
		out = "okay, things are going good. then, you encounter a problem you don't know how to solve.\n";
		out += "What do you do?\n"; 
		out += "\t1: ask friends, teachers, go to the library and work it out. you got this down.\n";
		out += "\t2: desperation seeps in. you go on the intertubes.\n";
		out += "\t3: cry, give up, and buy a ticket to paris. you're here for a good time, not a long time.\n";
		System.out.println(out); 
		try {
		    ans = Integer.parseInt( in.readLine() ); 
		}
		catch (IOException e) {}
		if (ans == 1) {
		    System.out.print("\033[H\033[2J");
		    out = "good good. you pass the obstacle. presentation day comes.\n";
		    out += "What do you day to yourself?\n"; 
		    out += "\t1: you can do it. just imagine everyone else in grandma underwear\n";
		    out += "\t2: meh. just another school day.\n";
		    out += "\t3: you're going to fail. omg don't go.\n";
		    System.out.println(out); 
		    try {
			ans = Integer.parseInt( in.readLine() ); 
		    }
		    catch (IOException e) {}
		    if (ans == 1) {
			System.out.print("\033[H\033[2J");
			System.out.println("your teacher loves it so much he gives you extra credit for being you. 105!\n");
			a.average += 2; 
		    }
		    else if (ans == 2) {
			System.out.print("\033[H\033[2J");
			System.out.println("good job but not great job. your average goes up by a point\n");
			a.average += 1;
		    }
		    else {
			System.out.print("\033[H\033[2J");
			System.out.println("you panic and forget all your lines. big yikes. 50 for you!\n");
			a.average -= 3;
		    } 
		}
		else if (ans == 2) {
		    System.out.print("\033[H\033[2J");
		    out = "you get lost for quite a while in the world of cat videos and memes and super complicated concepts.\n";
		    out += "suddenly, it's presentation day. What do you do?\n"; 
		    out += "\t1: pretend to be sick and prep the whole day to go tomorrow\n";
		    out += "\t2: go to school and own up.\n";
		    out += "\t3: stay lost.\n";
		    System.out.println(out); 
		    try {
			ans = Integer.parseInt( in.readLine() ); 
		    }
		    catch (IOException e) {}
		    if (ans == 1) {
			System.out.print("\033[H\033[2J");
			out = "it's game day. good presentation and you apologize to your teacher.\n";
			out += "What do you say to him/her?\n"; 
			out += "\t1: i'm so sorry. the mumps just came.\n";
			out += "\t2: it'll never happen again. thank you for being so understanding\n";
			out += "\t3: actually, I wasn't sick\n";
			System.out.println(out); 
			try {
			    ans = Integer.parseInt( in.readLine() ); 
			}
			catch (IOException e) { }
			if (ans == 1) {
			    System.out.print("\033[H\033[2J");
			    System.out.println("turns out you were supposed to have strep throat. you confess and get a 0\n");
			    a.average -= 5;
			    a.charisma -= 1; 
			}
			else if (ans == 2) {
			    System.out.print("\033[H\033[2J");
			    System.out.println("you charm your teacher and get away with it. rascal.\n");
			    a.average += 3; 
			}
			else {
			    System.out.print("\033[H\033[2J");
			    System.out.println("you confess your sins and feel better. an empty average is better than an empty soul\n");
			    a.average -= 3;
			    a.mental += 2; 
			} 
		    } 
		    else if (ans == 2) {
			System.out.print("\033[H\033[2J");
			System.out.println(" you lose a couple points in score but your teacher trusts you now\n");
			a.charisma += 1;
			a.mental += 1; 
			
		    }
		    else {
			System.out.print("\033[H\033[2J");
			System.out.println("you had to be hospitalized for malnutrition and sleep deprivation. your mom makes you rest for a month\n");
 			a.average -= 3;
			a.mental -= 5;
			a.physical -= 10; 
		    } 
		}
		else {
		    System.out.print("\033[H\033[2J");
		    System.out.print("you got a zero\n");
		    a.average -= 5; 
		}
	    }   
	}
	else {
	    System.out.print("\033[H\033[2J");
	    System.out.print("you got a zero\n");
	    a.average -= 5; 
	} 
    }
    public static void sleep(Student a) {
	isr = new InputStreamReader(System.in);
	in = new BufferedReader( isr);
	String out = "";
	int ans = 0;

	out = "After a long day at school, you come back to home sweet home\n";
	out += "For a snack to eat while doing hw, what do you pick?\n";
	out += "\t1: cookies and hot cocoa\n";
	out += "\t2: some kbbq chickpeas and aloe vera\n";
	out += "\t3: earl grey tea and scones\n";
	System.out.println(out);

	try {
	    ans = Integer.parseInt( in.readLine() ); 
	}
	catch (IOException e) { }
	
	if (ans == 1) {
	    System.out.print("\033[H\033[2J");
	    out = "you fell straight asleep. uh oh.";
	    out += "you wake up at 4AM. bless your soul. which hw do you do first? \n" ;
	    out += "\t1: Geometry\n";
	    out += "\t2: Biology\n";
	    out += "\t3: History\n";
	    System.out.println(out);
		
	    
	    try {
		ans = Integer.parseInt( in.readLine() ); 
	    }
	    catch (IOException e) { }

	    if (ans == 1) {
		System.out.print("\033[H\033[2J");
		out = "yikes. it takes you two hours. now you have to go to school.";
		out += "you catch the express. which hw do you do on the train?\n" ;
		out += "\t1: Biology\n";
		out += "\t2: History\n";
		out += "\t3: English\n";
		System.out.println(out);
			    
		try {
		    ans = Integer.parseInt( in.readLine() ); 
		}
		catch (IOException e) { }

		if (ans == 1){
		    System.out.print("\033[H\033[2J");
		    System.out.println("woo! you can do the rest at lunch. congrats, you've survived\n");
		    a.sleep += 6; 
		} 
		else if (ans == 2) {
		    System.out.print("\033[H\033[2J");
		    System.out.println("oh no, your other classes came first\n");
		    a.average -= 1;
		    a.sleep += 4; 
		}
		else {
		    System.out.print("\033[H\033[2J");
		    System.out.println("okay, you barely manage by skimming, but it works and you finish everything and sprinting to school\n");
		    a.mental += 1;
		    a.physical += 1;
		    a.sleep += 4; 
		} 	    
	    }
	    else if (ans == 2) {
		System.out.print("\033[H\033[2J");
		out = "olay olay. you get it done but realize you have spanish hw too.\n";
		out += "when do you do it?\n";
		out += "\t1: during Biology\n";
		out += "\t2: during lunch\n";
		out += "\t3: in the hallways\n";
		System.out.println(out);
		
		try {
		    ans = Integer.parseInt( in.readLine() ); 
		}
		catch (IOException e) { }

		if (ans == 1) {
		    System.out.print("\033[H\033[2J");
		    System.out.println("yikes you got caught red handed. your average goes down.\n");
		    a.average -=1;
		    a.sleep += 6; 
		}
		else if (ans == 2) {
		    System.out.print("\033[H\033[2J");
		    System.out.println("okay. it's done. but you're starving. your physical strength decreases.");
		    a.physical -= 1;
		    a.sleep += 6; 
		}
		else {
		    System.out.print("\033[H\033[2J");
		    System.out.println("unfortunately, your teacher actually grades the hw. it's shoddy work at best. shame on you.");
		    a.average -= 1;
		    a.sleep += 6; 
		}
	    }
	    else{
		System.out.print("\033[H\033[2J");
		System.out.println("you end up not doing any hw and eat breakfast instead");
		a.physical += 1;
		a.mental += 1;
		a.average -= 1;
		a.sleep += 8; 
	    }  
	}
	else if (ans == 2) {
	    System.out.print("\033[H\033[2J");
	    out = "okay, you solid. you finish all your hw and decide to go out for breakfast the next day.";
	    out += "where do you go?\n";
	    out += "\t1: the breakfast cart for coffee\n";
	    out += "\t2: zuckers for a bagel\n";
	    out += "\t3: ferry's for a bacon chiptole avocado on a roll\n";
	    System.out.println(out);
		
	    try {
		ans = Integer.parseInt( in.readLine() ); 
	    }
	    catch (IOException e) { }

	    if (ans == 1) {
		System.out.print("\033[H\033[2J");
		System.out.println("oh no. the coffee makes you want to pee and you had no fiber so you end up with a tummy ache. you miss class. your teacher thinks you cut");
		a.average -= 1;
		a.physical -= 1;
		a.sleep += 6; 
	    }
	    else if (ans == 2) {
		System.out.print("\033[H\033[2J");
		System.out.println("the everything bagel with scallions sets you right for the day. what a great day.");
		a.mental += 1;
		a.charisma += 1;
		a.sleep += 6; 
	    }
	    else {
		System.out.print("\033[H\033[2J");
		System.out.println("the BAC makes you happy but super full and you end up falling asleep. you get don't get caught but miss the lesson.");	
		a.intel -= 1;
		a.mental += 1;
		a.sleep += 1;
		a.physical += 1; 
	    } 
	}
	else {
	    System.out.print("\033[H\033[2J");
	    out = "the tea gives you insomnia and you stay awake thinking about ducks. you get work done... \n";
	    out += "but no sleep feels terrible the next day. what do you do?\n";
	    out += "\t1: play hooky\n";
	    out += "\t2: go to school. power to the player!\n";
	    out += "\t3: i will go on, my poor soul\n";
	    System.out.println(out);
		
	    try {
		ans = Integer.parseInt( in.readLine() ); 
	    }
	    catch (IOException e) { }

	    if (ans == 1) {
		System.out.print("\033[H\033[2J");
		System.out.println("what a scallywag.");
		a.average -= 1;
		a.sleep += 1;
		a.physical += 1; 
	    }
	    else if (ans == 2) {
		System.out.print("\033[H\033[2J");
		System.out.println("sigh......the effort drains you but at least the show went on");
		a.mental -= 1;
		a.charisma -= 1;
		a.physical -= 1; 
	    }
	    else {
		System.out.print("\033[H\033[2J");
		System.out.println("you poor soul. you'll be alright");
		a.mental -= 1;
		a.physical -= 1;
		a.sleep += 1;
	    } 
	} 	
    }  
} 

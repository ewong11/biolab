public class Lunch {
    public int yourNum = 0;
    public int compNum = 0;

    public void play(Student a) { 
	while (yourNum >= compNum) {
	    compNum = (int)(Math.random() * 100); 
	    System.out.println("pick a number: ");
	    try {
		yourNum = Integer.parseInt( in.readLine() ); 
	    }
	    catch (IOException e) {}
	    if (yourNum < compNum)
		break;
	    else {
		a.charisma += 1;
		System.out.println("You skipped the line! Congrats on being a rascal"); 
	    } 
	} 
    } 
} 

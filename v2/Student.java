public abstract class Student extends Character {
    protected static int intel;
    protected static int friendCount;
    protected static double average;
    protected static double sleep;
    protected static int mental;
    protected static int physical;
    protected static String[] schedule;
    protected static String[] badges;

    public String toString() {
	String ans = "";
	ans += "intelligence: " + intel + "\n";
	ans += "friend count: " + friendCount + "\n";
	ans += "average: " + average + "\n";
	ans += "sleep: " + sleep + "\n";
	ans += "mental strength: " + mental + "\n";
	ans += "physical strength: " + physical + "\n";
	return ans;
    }

    //When any characteristic of the Student
    //is below zero, then the Student is dead
    // Returns true if dead!
    public boolean isDead() {
	     return sleep == 0 ||
       mental == 0 ||
       physical == 0 ||
       average == 0 ||
       friendCount == 0;
    }

    //sets sleep to new number
    //returns old sleep
  public double setSleep(double s) {
	   double old = sleep;
	   sleep = s;
	     return old;
    }

    //sets average to new number
    //returns old average
    public double setAverage(double newAvg) {
	double old = average;
	average = newAvg;
	return old;
    }

    //sets friendCount to new number
    //returns old friendCount
    public int setFriends(int a) {
	int old = friendCount;
	friendCount = a;
	return old;
    }

    //sets mental to new number
    //returns old mental
    public int setMental(int newMen) {
	int old = mental;
	mental = newMen;
	return old;
    }

    //sets physical to new number
    //returns old physical
    public int setPhysical(int newPhys) {
	int old = physical;
	physical = newPhys;
	return old;
    }

    //returns a string of the badges
    public String getBadges() {
	String ans = "badges: [";
	for (String a: badges)
	    ans += a + ", ";
	return ans + "]";
    }

    //adds a badge to the array
    public void setBadges(String a) {
    }

    public String getSched() {
      String ans = "Schedule: [";
    	for (String a: schedule)
    	    ans += a + ", ";
    	return ans + "]";
    }
}

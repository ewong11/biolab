public abstract class Student extends Character {
    protected static int intel;
    protected static int friendCount;
    protected static double average;
    protected static double sleep;
    protected static int mental;
    protected static int physical;
    //protected static String[] badges;

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

    //returns if player is dead
    public boolean notDead() {
	return sleep == 0 ||
	    mental == 0 ||
	    physical == 0 ||
	    average == 0 ||
	    friendCount == 0;
    }

    //sets sleep to new number
    //returns old sleep
    public double setSleep(double new) {
	double old = sleep;
	sleep = new;
	return old;
    }

    //sets average to new number
    //returns old average
    public double setAverage(double new) {
	double old = average;
	average = new;
	return old;
    }

    //sets friendCount to new number
    //returns old friendCount
    public int setFriends(int new) {
	int old = friendCount;
	friendCount = new;
	return old;
    }

    //sets mental to new number
    //returns old mental
    public int setMental(int new) {
	int old = mental;
	mental = new;
	return old;
    }

    //sets physical to new number
    //returns old physical
    public int setPhysical(int new) {
	int old = physical;
	physical = new;
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
}

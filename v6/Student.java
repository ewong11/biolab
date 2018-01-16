public abstract class Student extends Character {
  protected static String name ;
    protected static int intel;
    protected static int friendCount;
    protected static double average;
    protected static double sleep;
    protected static int mental;
    protected static int physical;
    protected static String[] schedule;
    protected static Badges badges;

    public Student() {
	badges = new Badges();
    }

    public String toString() {
	System.out.print("\033[H\033[2J");
	String ans = "";
	ans += "intelligence: " + intel + "\n";
	ans += "friend count: " + friendCount + "\n";
	ans += "average: " + average + "\n";
	ans += "sleep: " + sleep + "\n";
	ans += "mental strength: " + mental + "\n";
	ans += "physical strength: " + physical + "\n";
	return ans;
    }

    public void updateBadges(Student player) {
	if (player.sleep == 100)
	    player.badges.add("slept-for-more-than-4and1/16-days");
	else if (player.average < 65)
	    player.badges.add("failed-once-or-twice");
	else if (player.friendCount == 5)
	    player.badges.add("not-a-loner-anymore");
	else if (player.physical == 100)
	    player.badges.add("can-climb-more-than-two-flights");
	else if (player.mental == 100)
	    player.badges.add("in-a-golden-state-of-mind");
	else if (player.average > 90 && player.sleep > 90 && player.friendCount > 5)
	  player.badges.add("stuy-triangle-achieved");
    }

    //When any characteristic of the Student
    //is below zero, then the Student is dead
    // Returns true if dead!
    public boolean isDead() {
	return
	    mental <= 0 ||
	    physical <= 0 ||
	    
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

    public String getSched() {
	String ans = "Schedule: [";
	for (int x = 0; x < schedule.length; x++) {
	    if (x == schedule.length - 1)
		ans += schedule[x];
	    else
		ans += schedule[x] + ", ";
	}
	return ans + "]";
    }
}

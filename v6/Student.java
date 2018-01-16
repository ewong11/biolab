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

    public Student(){
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
    public boolean isThere(Comparable a) {
	boolean ans = false;
	for (int x = 0; x < badges.size(); x++) {
	    if (a.compareTo(badges.get(x)) == 0)
		ans = true;
	}
	return ans;
    }

    public void updateBadges(Student player) {
  	if (player.sleep == 100 ) {
	    if (!(isThere("slept-for-more-than-4and1/16-days")))
		player.badges.add("slept-for-more-than-4and1/16-days");
	}
	else if (player.average < 65) {
	    if (!(isThere("failed-once-or-twice")))
		player.badges.add("failed-once-or-twice");
	}
	else if (player.friendCount == 5) {
	    if (!(isThere("not-a-loner-anymore")))
		player.badges.add("not-a-loner-anymore");
	}
	else if (player.physical == 100) {
	    if (!(isThere("can-climb-more-than-two-flights")))
		player.badges.add("can-climb-more-than-two-flights");
	}
	else if (player.mental == 100){
	    if (!(isThere("in-a-golden-state-of-mind")))
		player.badges.add("in-a-golden-state-of-mind");
	}
	else if (player.average > 90 && player.sleep > 90 && player.friendCount > 5) {
	    if (!(isThere("stuy-triangle-achieved")))
		player.badges.add("stuy-triangle-achieved");
	}
    }

			//When any characteristic of the Student
			//is below zero, then the Student is dead
    // Returns true if dead!
    public boolean isDead() {
      return ((mental <= 0) || (physical <= 0) || (average <= 0) || (sleep <= 0) || (friendCount <= 0));
    }

    public void avgReset() {
	if (average > 100)
	    average = 100;
	if (average < 0)
	    average = 0;
    }

    //sets sleep to new number
    //returns old sleep
    public double setSleep(double s) {
	double old = sleep;
	sleep = s;
	return old;
    }

    //gets sleep
    public double getSleep(){
      return sleep;
    }

    //sets average to new number
    //returns old average
    public double setAverage(double newAvg) {
	double old = average;
	if (!(newAvg > 100))
	    average = newAvg;
	return old;
    }

    //returns average
    public double getAverage(){
      return average;
    }

    //sets friendCount to new number
    //returns old friendCount
    public int setFriends(int a) {
	     int old = friendCount;
	     friendCount = a;
	     return old;
    }

    //returns number of friends
    public int getFriends(){
      return friendCount;
    }

    //sets mental to new number
    //returns old mental
    public int setMental(int newMen) {
	     int old = mental;
	     mental = newMen;
	     return old;
    }

    //returns Mental
    public int getMental() {
      return mental;
    }

    //returns physical
    public int getPhysical(){
      return physical;
    }

    //sets physical to new number
    //returns old physical
    public int setPhysical(int newPhys) {
      int old = physical;
      physical = newPhys;
      return old;
    }

    //changes intel
    public int setIntel(int i) {
      int old = intel;
      intel = i;
      return old;
    }

    public int getIntel(){
      return intel;
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

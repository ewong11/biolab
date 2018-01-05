public abstract class Student extends Character {
    protected static int intelligence;
    protected static int friendCount;
    protected static double average;
    protected static double sleep;
    protected static int mental;
    protected static int physical;
    protected static String[] badges;
    
    public String toString() {
	String ans = "";
	ans += "intelligence: " + intelligence + "\n";
	ans += "friend count: " + friendCount + "\n";
	ans += "average: " + average + "\n";
	ans += "sleep: " + sleep + "\n";
	ans += "mental strength: " + mental + "\n";
	ans += "physical strength: " + physical + "\n";
	ans += "badges: ";
	for (String a: badges)
	    ans += a + ", "; 
	return ans; 
    } 
    
}

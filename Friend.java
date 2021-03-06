public class Friend extends Character implements Comparable<Friend>{

  public String name;
  public double friendship;

  public Friend() {
  }

  public Friend(String n) {
    name = n;
    friendship = 0;
  }

  public String toString(){
    return getName();
  }

  public String getName(){
    return name;
  }


  public String friendLev() {
    if (friendship < 0.5)
        return "stranger";
    else if (friendship <= 2 && friendship >= .05)
        return "acquaintance";
    else if (friendship <= 3 && friendship > 2)
        return "close friend";
    else if (friendship > 3)
        return "best fwend";
else
    return "blood bonded sibwings";
  }
  public int compareTo(Friend other){
    return Double.compare(this.friendship,other.friendship);
  }
}

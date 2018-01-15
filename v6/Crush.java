public class Crush extends Friend {

  protected static String name ;

  public Crush() {
  }

  public Crush(String n) {
    name = n;
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
    return "lovebwds";
  }
}

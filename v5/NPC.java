public class NPC extends Character{

    public NPC(){
    }
    public NPC(String n){
      this();
      name = n;
    }

    public String name;
    public double friendship;
    public int health;


    public String getName(){
      return name;
    }

    public void setName(String n){
      name = n;
    }

    public double getFriendship(){
	     return friendship;
    }

    public void setFriendship(double n){
	     friendship = n;
    }

    public boolean isDead(){
      return health <= 0;
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


}

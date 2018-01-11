public class NPC extends Character{
    public int friendship;
    public int health;

    public int getFriendship(){
	return friendship;
    }

    public void setFriendship(int n){
	friendship = n;
    }

    public boolean isDead(){
      return health <= 0;
    }
    public String friendLev() {
	if (friendship == 0)
	    return "stranger";
	else if (friendship == 1)
	    return "acquaintance";
	else if (friendship == 2)
	    return "close friend";
	else if (friendship == 3)
	    return "best fwend";
	else
	    return "blood bonded sibwings";
    }


}

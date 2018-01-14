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


    public String toString(){
      return getName();
    }
    
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


}

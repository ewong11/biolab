import java.util.ArrayList;

public class Badges {

  public ArrayList<Comparable> badges;

  public Badges() {
    badges = new ArrayList<Comparable>();
  }
//METHODS OF ArrayList-------------------
    public String toString(){
      return badges.toString();
    }

    public boolean add(Comparable x) {
	badges.add(x);
	return true; 
    } 

    public Comparable remove( int index ) {
      return badges.remove(index);
    }

    public int size() {
      return badges.size();
    }

    public Comparable get( int index ) {
      return badges.get(index);
    }
//---------------------------------------

    

}

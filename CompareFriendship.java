import java.util.ArrayList;

public class CompareFriendship {
  protected ArrayList<Comparable> _data;
  protected ArrayList names;
  //==========================================

  public CompareFriendship() {
    _data = new ArrayList<Comparable>();
    names = new ArrayList();
  }

  public String toString() {
    return _data.toString();
  }

  public int size() {
    return _data.size();
  }


  public Comparable get( int index ) {
    return _data.get(index);
  }

  //--------------------------------------------

//-----------------------------------------------
//PRECONDITION: ArrayList _data and ArrayList names
//POSTCONDTION: add value of friendship to _data
//and name of corresponding friend to names
//-----------------------------------------------
  public void populate(Friend a) {
    _data.add(a.friendship);
    names.add(a.name);
  }
  //-----------------------------------------------
  //PRECONDITION: ArrayList _data and ArrayList names
  //POSTCONDTION: sorts values of friendship from greatest to least
  //sorts names corresponding to _data
  //-----------------------------------------------
  public void sort() {
    for (int pos = 0; pos < _data.size(); pos ++) {
      for (int index = _data.size()-1; index > 0; index--)
      if (_data.get(index).compareTo(_data.get(index - 1)) > 0) {
        _data.set(index, _data.set(index-1, _data.get(index)));
        names.set(index, names.set(index-1, names.get(index)));
      }
    }
    System.out.println("Done! Your list of friends from best to worst!");
    System.out.println(names);
  }


  public static void main(String[] args) {
  }
}

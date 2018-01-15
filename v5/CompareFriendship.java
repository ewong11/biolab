import java.util.ArrayList;

public class CompareFriendship {

  protected ArrayList<Comparable> _data;
  protected ArrayList names;
  //==========================================

  public CompareFriendship(){
    _data = new ArrayList<Comparable>();
    names = new ArrayList[5];
  }

    public String toString()
    {
      return _data.toString();
    }


    public Comparable remove( int index )
    {
      return _data.remove(index);
    }


    public int size()
    {
      return _data.size();
    }


    public Comparable get( int index )
    {
      return _data.get(index);
    }

    //--------------------------------------------


    public void populate(Friend a) {
        _data.add(a.friendship);
        names.add(a.name);
        System.out.println(_data);
      }
    public void sort() {
      for (int pos = 0; pos < _data.size; pos ++) {
        for (int index = 0; index < data.size-1; index++)
        if (_data.get(index).compareTo(data.get(index + 1)) > 1)
          data.set(index, data.set(index+1, data.get(index)))
      }
    }
      public static void main(String[] args) {
      }
    }

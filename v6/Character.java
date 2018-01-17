public abstract class Character {
    protected static int grade;
    protected static int charisma;
    protected static String name;

    public void setCharisma(int s) {
      charisma = s;
    }

    public int getCharisma() {
      return charisma;
    }


    public String getName(){
      return name;
    }

    public abstract String friendLev();

}

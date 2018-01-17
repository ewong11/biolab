import java.io.*;
import java.util.*;

//For this game, you will be using slots to try and CHANGE
//your crush level. Therefore, you will either go up or down
//There are different classes there and then if you get
//all 3 of them as one, you get to change your thing into that.
// You will be given a RANDOM amount of chances between 1 - 5
// When you spin, and NONE are the same, you will not get anything
// If all 3 are the same, then you will be switched to that level.
// If at the end you have NOT gotten a jackpot then you're out of luck.
public class ImpressCrush {
    public int randNum;
    public int guessesUsed;
    public int totalGuesses;
    private static final String[] LEVELS = {
    "stranger", "stranger", "stranger",
    "acquaintance", "acquaintance", "acquaintance",
    "close friend", "close friend", "close friend",
    "best fwend", "best fwend", "best fwend",
    "lovebwds", "lovebwds", "lovebwds"};

    private String[] _levels; //to be init'd by each instance


  /*=====================================
    ImpressCrush() -- default constructor
    pre:  constant array LEVELS exists, has been initialized
    post: mutable array _levels contains same elements as levels
    =====================================*/
  public ImpressCrush()
  {
    //allocate memory for _levels based on size of LEVELS:
    _levels = new String[ LEVELS.length ];

    //copy elements of LEVELS into _levels:
    for( int i=0; i<LEVELS.length; i++ ) {
      _levels[i] = LEVELS[i];
    }

    //How many SPINS you get
    randNum = (int) (Math.random() * 6);

  }


  /*=====================================
    String toString() -- overrides inherited toString()
    pre:
    post: returns String of elements in ImpressCrush 0 thru 2, separated by tabs
    =====================================*/
    public String toString()
    {
        String rtrString = "";
        System.out.println("~~~~~~~~~~~~~~~~~~ GENIE MACHINE ~~~~~~~~~~~~~~~~~~");
        System.out.println("||" + _levels[0] + "||\t ||" + _levels[1] + "||\t|| " + _levels[2] + "||");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        return rtrString;
    }



  /*=====================================
    void swap(int,int) -- array swap util fxn
    pre:  _levels array exists
    post: elements at indices i, j are swapped
    =====================================*/
  private void swap( int i, int j )
  {
    String holder = _levels[i]; //init temp storage
    _levels[i] = _levels[j]; //overwrite slot i with slot j's contents
    _levels[j] = holder;        //copy fr temp storage to slot j
  }


  /*=====================================
    void spinOnce() -- simulate a pull of the slot machine lever
    pre:  _levels array exists
    post: randomized order of elements in _levels array
    =====================================*/
  public void spinOnce()
  {
    // A simple approach to shuffling:
    // iterate through the array, swapping
    // the val at each index with a randomly chosen other index
    for( int i = 0; i < _levels.length; i++ )
      swap( i, (int)( Math.random() * _levels.length) );
  }

  public static void confirm() {
    String out = "(press 'Enter' to continue)";
    Scanner sc = new Scanner(System.in);
    System.out.println(out);
    sc.nextLine();
  }

  /*=====================================
    boolean jackpot() -- checks for a winning combo
    pre:  _levels is existing array
    post: returns true if first 3 ImpressCrush represent winning combo,
    false otherwise
    =====================================*/
  public boolean jackpot()
  {
    if(_levels[0].equals(_levels[1])){
	     if(_levels[0].equals(_levels[2])){
	      return true;
      }
    }
    return false;
  }

  public void playGame(Friend crush)
  {
    System.out.println("Wow... " + crush.name + " has been running through your mind.");
    System.out.println("Last night you wished to a genie... I wish I could change how");
    System.out.println(crush.name + " thought about me. The genie being a geenie took it");
    System.out.println("with a twist. You never said HOW you wanted to change it...");
    System.out.println();
    System.out.println("Now it's up to this slot machine to decide your fate...");
    System.out.println("It might not even work! :P");
    System.out.println("If you get 3 of the SAME ");
    confirm();
    System.out.print("\033[H\033[2J");
    int spun = 0;
    System.out.println();
    System.out.println( "Your vision fades to white and this weird machine appears...\n");
    System.out.println("~TRY YOUR LUCK WITH A SPIN!~");
    System.out.println(this);
    confirm();
    System.out.print("\033[H\033[2J");

    while(spun <= randNum){
      this.spinOnce();
      System.out.println("After Spinning... It looks like this!");
      System.out.println("~TRY YOUR LUCK WITH A SPIN!~");
      System.out.println(this);
      if(this.jackpot() == true){
        System.out.println("Hmmm... It matched. Somehow.");
        System.out.println("Your crush level is now: " + _levels[0] );
        if(_levels[0].equals("stranger")){
          System.out.println("NEW CRUSH LEVEL SET!");
          crush.friendship = 0;
        }
        else if (_levels[0].equals("acquaintance")){
          System.out.println("NEW CRUSH LEVEL SET!");
          crush.friendship = 1;
        }
        else if (_levels[0].equals("close friend")){
          System.out.println("NEW CRUSH LEVEL SET!");
          crush.friendship = 2.5;
        }
        else if (_levels[0].equals("best fwend")){
          System.out.println("NEW CRUSH LEVEL SET!");
          crush.friendship = 3.5;
        }
        else{
          System.out.println("NEW CRUSH LEVEL SET!");
          crush.friendship = 4.5;
        }
        spun = randNum + 1;
      }
      else{
        System.out.println("Seems like it wasn't a match! Sorry bud <3");
      }
      spun++;
      confirm();
      System.out.print("\033[H\033[2J");
    }
    System.out.print("\033[H\033[2J");
    System.out.println("You're done!");
    System.out.println("See you next time ;)");
  }//end playGame
}

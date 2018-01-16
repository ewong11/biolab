import import java.io.*;
import java.util.*;

public class ImpressCrush {
    public int randNum;
    public int guessesUsed;
    public int totalGuesses;

    public ImpressCrush() {
      randNum = (int) (Math.random() * 100);
	    guessesUsed = 0;
      totalGuesses = 7;

    }

    public static void PlayGame(){
      System.out.println("Hello! Welcome. I am your mind.\nLook... there's your crush! Say hi!");
      System.out.println("");
    }

    public static void main(String[] args){

    }
}

package week2;
import java.util.Scanner;
import java.util.Random;
public class Rock{ 
   public static void main(String[] args) { 
   String personPlay="S"; //User's play -- "R", "P", or "S"
   String computerPlay="R"; //Computer's play -- "R", "P", or "S"
   int computerInt=1;//Randomly generated number used to determine
 //computer's play
    Scanner scan = new Scanner(System.in); 
    Random generator = new Random();
   /* switch(computerInt) {
    case 0:
    	System.out.println("put 0 is human is doing play");
    	String r="R";
    	break;
    case 1:
    	System.out.println("put 1 is human have more possibility to win");
    	break;
    case 2:
    	System.out.println("put 2 is computer have a chance to win");
    	String s="S";
    	break;
    }*/
//Get player's play -- note that this is stored as a string
//Make player's play uppercase for ease of comparison
//Generate computer's play (0,1,2)
//Translate computer's randomly generated play to string
   
//Print computer's play
//See who won. Use nested ifs instead of &&.
    if (personPlay.equals(computerPlay)) {
        System.out.println("It's a tie!"); 
    }
    else if (personPlay.equals("S")) {
            System.out.println("Rock crushes scissors. You win!!");
       
    }
    else { 
       System.out.println("computer won!!!");
  } 
 } 
}

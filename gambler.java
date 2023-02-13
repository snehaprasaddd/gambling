import java.util.Random;
import java.util.*;

public class gambler {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter how much You want to put on stake");
    int stake=sc.nextInt();
    System.out.println("Enter what's your goal");
    int goal=sc.nextInt();
    System.out.println("Please wait till we run the bets");
    int trails= 2;
    int bets = 0;                              
    int wins = 0;                             
  
    Random rand = new Random();
  
    for (int t = 0; t < trails; t++) {
      int cash = stake;
      while (cash > 0 && cash < goal) {
        bets++;
        if (rand.nextInt(2) == 0) {
          cash++; 
        } else {
          cash--; 
        }
      }
      if (cash == goal) {
        wins++;
      }
    }
    double avg=1.0 * bets / trails;
    System.out.println(wins + " wins of " + trails);
    System.out.println("Percent of games won = " + 100.0 * wins / trails);
    System.out.println("Avg number of bets   = $" +avg*wins );
    
  }
}

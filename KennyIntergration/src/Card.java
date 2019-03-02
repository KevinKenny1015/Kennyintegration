import java.util.Random;

public class Card {

    private String suit;
    private int number;
    
    public String getSuit() {
      return suit;
    }
    
    public void setSuit(String suitToBeSet) {
      suit = suitToBeSet;
    }
    
    public void draw() {
      Random randomGen = new Random();
      int suitNum = Math.abs(randomGen.nextInt() % 4);
      if (suitNum == 0) {
        suit = "Diamonds"; //can be random
      } else if (suitNum == 1) {
        suit = "Spades"; // can be random
      } else if (suitNum == 2) {
        suit = "Clubs"; // Can be random
      } else if (suitNum == 3) {
        suit = "Hearts"; // can be random
      } else {
        System.out.println("Broken try again");
      }
      number = Math.abs(randomGen.nextInt() % 13) + 1;
      
    }
      
      }
      
    


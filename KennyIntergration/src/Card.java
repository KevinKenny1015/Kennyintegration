
public class Card {

    private String suite;
    private int number;
    
    public String getSuite() {
      return suite;
    }
    
    public void steSuite(String suiteToBeSet) {
      suite = suiteToBeSet;
    }
    
    public void draw() {
      suite = "Diamonds";
      number = 4;
    }
}

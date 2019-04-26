// Kevin Kenny

/**
 * @author Kevin
 *This Truck class is used in my main.java file to get the 
 *color and year of truck.
 */
public class Truck {

  private String color;
  private int year;

  public String getColor() {
    return color;
  }

  public void setColor(String newColor) {
    color = newColor;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int newYear) {
    year = newYear;
  }

  public Truck(String newColor, int newYear) {
    color = newColor;
    year = newYear;
  }


  public Truck() {
    color = "Unknown";
    year = 2019;
  }
}

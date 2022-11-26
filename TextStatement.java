import java.util.Enumeration;

public class TextStatement extends Statement {

  public String stringTitle(String customerName) {
    return "Rental Record for " + customerName + "\n";
  };

  public String stringMovie(String movieTitle, double rentCharge) {
    return "\t" + movieTitle + "\t" + String.valueOf(rentCharge) + "\n";
  };

  public String stringAmountOwed(double totalCharge) {
    return "Amount owed is " + String.valueOf(totalCharge) + "\n";
  };

  public String stringPointsEarned(double totalFrequentRenterPoints) {
    return "You earned " + String.valueOf(totalFrequentRenterPoints) + " frequent renter points";
  };

}
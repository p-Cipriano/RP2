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

  public String value(Customer aCustomer) {
    Enumeration rentals = aCustomer.getRentals();
    String result = stringTitle(aCustomer.getName());
    while (rentals.hasMoreElements()) {
      Rental each = (Rental) rentals.nextElement();
      // show figures for this rental
      result += stringMovie(each.getMovie().getTitle(), each.getCharge());
    }
    // add footer lines
    result += stringAmountOwed(aCustomer.getTotalCharge());
    result += stringPointsEarned(aCustomer.getTotalFrequentRenterPoints());
    return result;
  }
}
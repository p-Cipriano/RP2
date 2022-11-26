import java.util.Enumeration;

public class HtmlStatement extends Statement {

  public String stringTitle(String customerName) {
    return "<H1>Rentals for <EM>" + customerName + "</EM></H1><P>\n";
  };

  public String stringMovie(String movieTitle, double rentCharge) {
    return movieTitle + ": " + String.valueOf(rentCharge) + "<BR>\n";
  };

  public String stringAmountOwed(double totalCharge) {
    return "<P>You owe <EM>" + String.valueOf(totalCharge) + "</EM><P>\n";
  };

  public String stringPointsEarned(double totalFrequentRenterPoints) {
    return "On this rental you earned <EM>" + String.valueOf(totalFrequentRenterPoints)
        + "</EM> frequent renter points<P>";
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
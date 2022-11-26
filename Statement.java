import java.util.Enumeration;


public abstract class Statement {
  public abstract String stringTitle(String customerName);

  public abstract String stringMovie(String movieName, double rentCharge);

  public abstract String stringAmountOwed(double totalCharge);

  public abstract String stringPointsEarned(double totalFrequentRenterPoints);

  public final String value(Customer aCustomer) {
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
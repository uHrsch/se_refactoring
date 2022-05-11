import org.junit.*;
import static org.junit.Assert.assertEquals;


import java.util.Vector;


public class CustomerTest {

    static final Customer customer = new Customer("Adam");
    static final Vector rentals = new Vector();

    @Test
    public void getName() {
        assertEquals("Adam", this.customer.getName());
    }

    @Test
    public void statement() {
        String statementExp = "Rental Record for " + customer.getName() + "\n";
        statementExp += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
        statementExp += "Amount owed is " + "0.0" + "\n";
        statementExp += "You earned " + "0" + " frequent renter points";

        assertEquals(statementExp, customer.statement());
    }

    @Test
    public void addRental() {
        int i = rentals.size();

        rentals.addElement(new Rental(new Movie("TITLE", 0), 0));
        assertEquals(i + 1, rentals.size());
    }
}
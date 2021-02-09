import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;

    @Before
    public void before() {borrower = new Borrower("Winston Smith"); }

    @Test
    public void hasName(){
        assertEquals("Winston Smith", borrower.getName());
    }

    @Test
    public void hasCollectionOfLoanedBooks() {
        assertEquals(0, borrower.getLoanedBooks());
    }
}

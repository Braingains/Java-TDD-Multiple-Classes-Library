import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before() {
        borrower = new Borrower("Winston Smith");
        book = new Book("1984", "George Orwell", "Non-Fiction");
        library = new Library(100);
    }


    @Test
    public void hasName(){
        assertEquals("Winston Smith", borrower.getName());
    }

    @Test
    public void hasCollectionOfLoanedBooks() {
        assertEquals(0, borrower.getLoanedBooks());
    }

    @Test
    public void canBorrowFromLibrary() {
        library.addBookToCollection(book);
        borrower.loanBookFromLibrary(library);
        assertEquals(1, borrower.getLoanedBooks());

    }
}

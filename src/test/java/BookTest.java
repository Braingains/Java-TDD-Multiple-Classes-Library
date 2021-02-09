import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("1984", "George Orwell", "Non-Fiction");
    }

    @Test
    public void hasTitle(){
        assertEquals("1984", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("George Orwell", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Non-Fiction", book.getGenre());
    }
}

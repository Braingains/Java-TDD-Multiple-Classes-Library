import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(100);
        book = new Book("1984", "George Orwell", "Non-Fiction");
    }

    @Test
    public void hasCapacity(){
        assertEquals(100, library.getCapacity());
    }

    @Test
    public void hasCollection(){
        assertEquals(0, library.collectionCount());
    }

//    @Test
//    public void libraryCanHaveBooksAdded() {
//        library.addBookToCollection(book);
//        assertEquals(1, library.collection.add);
//    }
}

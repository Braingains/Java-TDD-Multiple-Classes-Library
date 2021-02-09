import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;

    @Before
    public void before(){
        library = new Library(100);
    }

    @Test
    public void hasCapacity(){
        assertEquals(100, library.getCapacity());
    }
}

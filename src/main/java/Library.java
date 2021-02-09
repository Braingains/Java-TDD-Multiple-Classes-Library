import javax.lang.model.type.ArrayType;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity) {
        this.collection = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int collectionCount() {
        return this.collection.size();
    }

    public boolean addBookToCollection(Book book) {
        if (this.collectionCount() < this.capacity) {
            this.collection.add(book);
            return true;
        }
        return false;
    }

    public Book loanOutBook() {
        return this.collection.remove(0);
    }
}

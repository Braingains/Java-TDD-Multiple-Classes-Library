import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;
    public HashMap<String, Integer> genreCollection = new HashMap<String, Integer>();

    public Library(int capacity) {
        this.collection = new ArrayList<>();
        this.capacity = capacity;
        this.genreCollection = new HashMap<String, Integer>();
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

    public void addBookToGenreCollection(Book book) {
        this.genreCollection.merge(book.getGenre(), 1, Integer::sum);
    }

    public int genreCollectionCount() {
        return this.genreCollection.size();
    }

    public int countBooksByGenre(String genre) {
        return this.genreCollection.get(genre);
    }
}


import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> loanedBooks;

    public Borrower(String name){
        this.name = name;
        this.loanedBooks = new ArrayList<>();

    }

    public String getName() {
        return this.name;
    }

    public int getLoanedBooks() {
        return this.loanedBooks.size();
    }

    public void loanBookFromLibrary(Library library) {
        Book book = library.loanOutBook();
        this.loanedBooks.add(book);
    }
}

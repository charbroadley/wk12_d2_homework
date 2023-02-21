 import java.util.ArrayList;

public class Library {

    private ArrayList<Book> libraryBooks;
    private int libraryShelfSpace;

    public Library(int libraryShelfSpace) {
        this.libraryBooks = new ArrayList<>();
        this.libraryShelfSpace = libraryShelfSpace;
    }

    public int getBookCount() {
        return this.libraryBooks.size();
    }

    public void addBook(Book book) {
        if (this.libraryBooks.size() < this.libraryShelfSpace){
        this.libraryBooks.add(book);}
    }
}
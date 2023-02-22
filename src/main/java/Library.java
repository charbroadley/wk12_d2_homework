 import java.util.ArrayList;

public class Library {

    private ArrayList<Book> libraryBooks;
    private int libraryShelfSpace;

    public Library(ArrayList<Book> libraryBooks, int libraryShelfSpace) {
        this.libraryBooks = libraryBooks;
        this.libraryShelfSpace = libraryShelfSpace;
    }

    public int getBookCount() {
        return this.libraryBooks.size();
    }

    // Instead of doing capacity logic in addBook could at it as a separate function and then call that function:
    public boolean hasCapacity() {
        return libraryShelfSpace > libraryBooks.size();
    }

    public void addBook(Book book) {
        // if(hasCapacity()){
        // this.libraryBooks.add(book);}
        if (this.libraryBooks.size() < this.libraryShelfSpace){
        this.libraryBooks.add(book);}
    }
}

// Borrower arrayList for their borrowed books set up in the same way as libraryBooks
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {
        // Library: Class, libraryBooks: instance of the class as a variable
        private Library libraryBooks;
        private Book book1;
        private Book book2;
        private Book book3;

        @Before
        public void before() {
            libraryBooks = new Library(2);
            book1 = new Book("Bleak House", "Charles Dickens", "Victorian Literature");
            book2 = new Book("Great Expectations", "Charles Dickens", "Victorian Literature");
            book3 = new Book("Oliver Twist", "Charles Dickens", "Victorian Literature");
        }

        @Test
        public void can_count_all_books_in_the_library() {
            libraryBooks.addBook(book1);
            libraryBooks.addBook(book2);
            assertEquals(2, libraryBooks.getBookCount());
        }
        @Test
        public void can_add_books_to_library() {
            libraryBooks.addBook(book1);
            libraryBooks.addBook(book2);
            assertEquals(2, libraryBooks.getBookCount());
        }
        // cantAddBook__whenNoRoom
        @Test
        public void shelves_full_dont_add_new_book() {
            libraryBooks.addBook(book1);
            libraryBooks.addBook(book2);
            libraryBooks.addBook(book3);
            assertEquals(2, libraryBooks.getBookCount());
        }
        // canAddBook__whenThereIsRoom
        @Test
        public void shelves_have_space_add_new_book() {
            libraryBooks.addBook(book1);
            assertEquals(1, libraryBooks.getBookCount());
        }

        // Test canLendBook
        // Arrange - add a book to the library
        // Act - loanBook - add a book and a borrower (check if book in collection, pass in a book, if it is in the collection remove the book, add the book to the borrower using borrowers add book function)
        // libraryBooks.remove(book) <- can remove by book instead of index but it does have to literally be the same object in memory

}



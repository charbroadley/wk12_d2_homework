import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

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
        public void can_add_books_to_library() {
            libraryBooks.addBook(book1);
            libraryBooks.addBook(book2);
            assertEquals(2, libraryBooks.getBookCount());
        }

        @Test
        public void shelves_full_dont_add_new_book() {
            libraryBooks.addBook(book1);
            libraryBooks.addBook(book2);
            libraryBooks.addBook(book3);
            assertEquals(2, libraryBooks.getBookCount());
        }

        @Test
        public void shelves_have_space_add_new_book() {
            libraryBooks.addBook(book1);
            assertEquals(1, libraryBooks.getBookCount());
        }
}



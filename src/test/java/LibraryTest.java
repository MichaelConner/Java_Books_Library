import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class LibraryTest {

    Library library;
    Books book1;
    Books book2;
    Books book3;


    @Before
    public void before(){
        library = new Library();
        book1 = new Books("Philisophical Investigations", "Ludwig Wittgenstein", "Philosophy");
        book2 = new Books("Imaginary Cities", "Darran Anderson", "Architecture");
        book3 = new Books("Blood Meridian", "Cormac McCarthy", "Western");
    }

    @Test
    public void canCountBooks(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }



}

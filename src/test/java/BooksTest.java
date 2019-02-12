import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BooksTest {


    Books book;

    @Before
    public void before(){
        book = new Books("Philisophical Investigations", "Ludwig Wittgenstein", "Philosophy");

    }

    @Test
    public void bookHasTitle(){
        assertEquals("Philisophical Investigations", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Ludwig Wittgenstein", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Philosophy", book.getGenre());
    }










}

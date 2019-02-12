import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BorrowerTest {

    Library library;
    Books book1;
    Books book2;
    Books book3;
    Borrower borrower;


    @Before
    public void before(){

        borrower = new Borrower();

        library = new Library(2);

        book1 = new Books("Philosophical Investigations", "Ludwig Wittgenstein", "Philosophy");
        library.addBook(book1);

        book2 = new Books("Imaginary Cities", "Darran Anderson", "Architecture");
        library.addBook(book2);

        book3 = new Books("Blood Meridian", "Cormac McCarthy", "Western");
        borrower.addBook(book3);
    }

    @Test
    public void canCountBooks(){
        assertEquals(1, borrower.bookCount());
    }

    @Test
    public void canAddBook(){
        borrower.addBook(book1);
        assertEquals(2, borrower.bookCount());
    }


    @Test
    public void canBorrowBook(){
        borrower.borrowBook(library, book1);
        assertEquals(1, library.bookCount());
        assertEquals(2, borrower.bookCount());
    }

    @Test
    public void canBorrowDifferentBook(){
        borrower.borrowBook(library, book2);
        assertEquals(1, library.bookCount());
        assertEquals(2, borrower.bookCount());
    }

    @Test
    public void canBorrowMultipleBooks(){
        borrower.borrowBook(library, book1);
        borrower.borrowBook(library, book2);
        assertEquals(0, library.bookCount());
        assertEquals(3, borrower.bookCount());
    }




}


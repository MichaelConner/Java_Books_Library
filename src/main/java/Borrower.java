import java.util.ArrayList;


public class Borrower {

    private ArrayList<Books> bookshelf;

    public Borrower(){
        this.bookshelf = new ArrayList<>();
    }

    public int bookCount(){
        return this.bookshelf.size();
    }

    public void addBook(Books book){
        this.bookshelf.add(book);
    }

    public void borrowBook(Library library, Books book){
        library.removeBook(book);
        addBook(book);
    }

}

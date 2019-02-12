import java.util.ArrayList;

public class Library {


    private ArrayList<Books> catalogue;


    public Library(){
        this.catalogue = new ArrayList<>();
    }

    public int bookCount(){
        return this.catalogue.size();
    }

    public void addBook(Books book){
        this.catalogue.add(book);
    }




}

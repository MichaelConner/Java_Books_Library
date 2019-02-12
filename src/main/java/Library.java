import java.util.ArrayList;

public class Library {


    private ArrayList<Books> catalogue;
    private int capacity;


    public Library(int capacity){
        this.catalogue = new ArrayList<>();
        this.capacity = capacity;
    }

    public int bookCount(){
        return this.catalogue.size();
    }

    public void addBook(Books book){
        if (bookCount() < this.capacity) {
        this.catalogue.add(book);}
    }

    public Books removeBook(Books book){
        int index = catalogue.indexOf(book);
        return this.catalogue.remove(index);
    }




}

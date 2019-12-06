import java.util.ArrayList;

public class Library {
    private ArrayList<Book>Library;

    public Library(){
        this.Library = new ArrayList<Book>();
    }

    public void addBook(Book newBook){
        this.Library.add(newBook);
    }

    public void printBooks(){
        for (Book book:this.Library) {
            System.out.println(book.toString());
        }
    }

    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book:this.Library) {
            if (StringUtils.included(book.title(),title)){
                found.add(book);
            }
        }
        return found;
    }
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book:this.Library) {
            if (StringUtils.included(book.publisher(),publisher)){
                found.add(book);
            }
        }
        return found;
    }
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book:this.Library) {
            if (book.year() == year){
                found.add(book);
            }
        }
        return found;
    }
}

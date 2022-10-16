package Practice2.task_7;

import Practice2.task_7.Book;

import java.util.ArrayList;

public class BookShelf {
    private ArrayList<Book> shelf;
    private int count = shelf.size();

    public BookShelf(){

    }
    public Book newBook(String name, String author, int year){
        return new Book(name, author, year);
    }
    public void addBook(Book book){
        shelf.add(book);
    }
    public ArrayList<Book> getShelf(){
        return shelf;
    }
    public Book findLatest(){
        if (count == 0){
            return null;
        }
        else{
            Book latest = shelf.get(0);
            for(int i = 0; i < count; ++i){
                if (shelf.get(i).getYear() > latest.getYear()) latest = shelf.get(i);
            }
            return latest;
        }
    }
    public Book findOldest(){
        if (count == 0){
            return null;
        }
        else{
            Book oldest = shelf.get(0);
            for(int i = 0; i < count; ++i){
                if (shelf.get(i).getYear() < oldest.getYear()) oldest = shelf.get(i);
            }
            return oldest;
        }
    }
    public void sortBooks(){
        shelf.stream().sorted();
    }
    @Override
    public String toString(){
        return "BookShelf{" +
                "\n\tbooks:" + shelf +
                "}";
    }
}

package Practice2.task_7;

public class Book {
    private String author;
    private String name;
    private int year;

    public Book(String name, String author, int year){
        this.name = name;
        this.author = author;
        this.year = year;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public int getYear(){
        return year;
    }
    public void setName(int year){
        this.year = year;
    }
    @Override
    public String toString(){
        return "Book{" +
                "\n\tname: " + name +
                "\n\tauthor: " + author +
                "\n\tyear: " + year +
                "}";
    }
}

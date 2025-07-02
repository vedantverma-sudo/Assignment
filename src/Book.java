public class Book {
    private String title;
    protected String author;
    int pages;
    public boolean available;

    public String getTitle(){
        return title;
    }

    public Book(String title, String author, int pages, boolean available ){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.available = available;
    }
}
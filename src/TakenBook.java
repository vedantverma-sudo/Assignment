public class TakenBook extends Book {

    public TakenBook(String title, String author, int pages, boolean available) {
        super(title,author,pages,available);
    }

    public void displayInfo() {
        System.out.println("Author " + author);
        System.out.println("Pages " + pages);
        System.out.println("Available " + available);
        System.out.println("Title " + getTitle());
    }

    public static void main(String[] args) {
        TakenBook book = new TakenBook("BEAST QUEST", "ADAM BLADE", 500, true);
        book.displayInfo();
    }
}
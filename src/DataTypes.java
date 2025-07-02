//public class DataTypes {
//
//    int bookId;
//    int price;
//    boolean availability;
//    float rating;
//    int edition;
//    String title;
//    String author;
//    String[] genre;
//
//    void displayDetails() {
//        System.out.println(bookId);
//        System.out.println(price);
//        System.out.println(availability);
//        System.out.println(rating);
//        System.out.println(title);
//        System.out.println(author);
//        System.out.print("Genres: ");
//        for (int i = 0; i < genre.length; i++) {
//            System.out.print(genre[i]);
//            if (i < genre.length - 1) {
//                System.out.print(", ");
//            }
//        }
//        System.out.println(" ");
//        System.out.println(edition);
//    }
//
//
//    public static void main(String[] args) {
//
//        DataTypes b1 = new DataTypes();
//        b1.bookId = 101;
//        b1.price = 499;
//        b1.availability = true;
//        b1.rating = 4.5f;
//        b1.title = "BEAST QUEST";
//        b1.author = "Adam Blade";
//        b1.genre = new String[]{"Fictional","Action"};
//        b1.edition= 2;
//
//        b1.displayDetails();
//    }
//}
//
////
////}
import java.util.Scanner;
public class DataTypes {

    int bookId;
    int price;
    boolean availability;
    float rating;
    int edition;
    String title;
    String author;
    String[] genre;

    void displayDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Price:" + price);
        System.out.println("Available: " + availability);
        System.out.println("Rating: " + rating);
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.print("Genres : ");
        for (int i = 0; i < genre.length; i++) {
            System.out.print(genre[i]);
            if (i < genre.length - 1) System.out.print(", ");
        }
        System.out.println("\nEdition Year: " + edition);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DataTypes b1 = new DataTypes();

        System.out.print("Enter Book ID: ");
        b1.bookId = sc.nextInt();

        System.out.print("Enter Price: ");
        b1.price = sc.nextInt();

        System.out.print("Is it available: ");
        b1.availability = sc.nextBoolean();

        System.out.print("Enter Rating");
        b1.rating = sc.nextFloat();

        sc.nextLine();

        System.out.print("Enter Book Title: ");
        b1.title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        b1.author = sc.nextLine();

        System.out.print("Enter number of genres: ");
        int genreCount = sc.nextInt();
        sc.nextLine();

        b1.genre = new String[genreCount];
        for (int i = 0; i < genreCount; i++) {
            System.out.print("Enter Genre " + (i + 1));
            b1.genre[i] = sc.nextLine();
        }

        System.out.print("Enter Edition Year: ");
        b1.edition = sc.nextInt();

        b1.displayDetails();

        sc.close();
    }
}

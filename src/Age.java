import java.util.Scanner;

public class Age {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age;
        String nationality;
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your nationality: ");
        nationality = sc.nextLine();

        if (age >= 18 && nationality.equalsIgnoreCase("Indian")) {
            System.out.println("You are eligible to vote ");
        } else {
            System.out.println("You are not eligible to vote");
        }

        sc.close();
    }
}

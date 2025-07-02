import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.println("1. +");
            System.out.println("2. - ");
            System.out.println("3. * ");
            System.out.println("4. /");
            System.out.println("5. Exit");
            System.out.print("Choose from 1 to 5: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting calculator");
                break;
            }

            System.out.print("Enter first number");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number");
            double num2 = sc.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result" + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result" + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result" + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0)
                        System.out.println("Result " + (num1 / num2));
                    else
                        System.out.println("Cannot divide by zero");
                    break;
                default:
                    System.out.println("Please select from 1 to 5 only.");
            }
        }

        sc.close();
    }
}

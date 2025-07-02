import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your basic salary: ");
        double salary = sc.nextDouble();
        double tax = salary * 0.20;
        double bonus = 1500;
        double finalSalary = salary - tax + bonus;

        System.out.println("Basic Salary " + salary);
        System.out.println("Tax Deducted " + tax);
        System.out.println("Bonus Added  " + bonus);
        System.out.println("Net Salary   " + finalSalary);

        sc.close();
    }
}

import java.util.Scanner;

public class Operators0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double basicSalary, tax, finalSalary;
        double bonus = 1500;
        System.out.print("Enter Employeelogic Basic NetSalary: ");
        basicSalary = sc.nextDouble();

        tax = 0.20 * basicSalary;

        finalSalary = basicSalary - tax + bonus;
        System.out.println(basicSalary);
        System.out.println(tax);
        System.out.println(bonus);
        System.out.println(finalSalary);

        sc.close();
    }
}

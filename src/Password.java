import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        int digitCount = 0;
        int uppercaseCount = 0;
        int specialCount = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (!Character.isLetterOrDigit(ch)) {
                specialCount++;
            }
        }
        System.out.println("Digits " + digitCount);
        System.out.println("Uppercase " + uppercaseCount);
        System.out.println("Special Chars " + specialCount);
        if (digitCount >= 2 && uppercaseCount >= 1 && specialCount >= 1 && password.length() >= 8) {
            System.out.println("Your password is STRONG");
        } else {
            System.out.println("Your password is WEAK");
        }

        sc.close();
    }
}

import java.util.Scanner;

public class Login {

    public boolean login(String savedUser, int savedPin) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n===== LOGIN =====");

        System.out.println("Enter username:");
        String username = input.nextLine();

        System.out.println("Enter PIN:");
        int pin = input.nextInt();

        if (username.equals(savedUser) && pin == savedPin) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid username or PIN!");
            return false;
        }
    }
}
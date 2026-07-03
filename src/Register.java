import java.util.Scanner;

public class Register {

    String username;
    int pin;

    public void createAccount() {

        Scanner input = new Scanner(System.in);

        System.out.println("===== REGISTER =====");

        // USERNAME VALIDATION
        while (true) {
            System.out.println("Enter username:");
            username = input.nextLine();

            if (username.matches("[a-zA-Z]{3,}") && !allSameChars(username)) {
                break;
            } else {
                System.out.println("Invalid username!Use at least 3 letters");
            }
        }

        // PIN VALIDATION
        while (true) {
            System.out.println("Enter PIN:");
            pin = input.nextInt();

            if (pin >= 1000 && pin <= 99999) {
                break;
            } else {
                System.out.println("PIN must be 4 or 5 digits only.");
            }
        }

        System.out.println("Registration successful!");
    }

    // METHOD TO CHECK REPEATED CHARACTERS
    public boolean allSameChars(String username) {
        char first = username.charAt(0);

        for (int i = 1; i < username.length(); i++) {
            if (username.charAt(i) != first) {
                return false;
            }
        }
        return true;
    }
}
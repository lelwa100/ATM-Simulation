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

            if (username.matches("[a-zA-Z]+") && !hasRepeatedChars(username)) {
                break;
            } else {
                System.out.println("Invalid username! Use normal letters only.");
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
    public boolean hasRepeatedChars(String text) {
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == text.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }
}
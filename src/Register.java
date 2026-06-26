import java.util.Scanner;

public class Register {

    String username;
    int pin;

    public void createAccount() {

        Scanner input = new Scanner(System.in);

        System.out.println("===== REGISTER =====");

        System.out.println("Enter username:");
        username = input.nextLine();

        System.out.println("Enter PIN:");
        pin = input.nextInt();

        if (pin < 1000 || pin > 99999) {
            System.out.println("PIN must be 4 or 5 digits only.");
            return;
        }

        System.out.println("Registration successful!");
    }
}



import java.util.Scanner;

public class Validation {

    public int getChoice() {

        Scanner input = new Scanner(System.in);

        System.out.print("Choose option: ");

        if (input.hasNextInt()) {
            return input.nextInt();
        } else {
            System.out.println("Invalid input! Numbers only.");
            return -1;
        }
    }
}

import java.util.Scanner;

public class Deposit {

  public void depositMoney(Balance account) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter deposit amount:");
    double amount = input.nextDouble();

    if (amount > 0) {
      account.balance += amount;
      System.out.println("Deposit successful!");
    } else {
      System.out.println("Invalid amount!");
    }
  }


}

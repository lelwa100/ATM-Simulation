import java.util.Scanner;

public class Deposit {

  public void depositMoney(Balance account) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter deposit amount:");
    double amount = input.nextDouble();

    if (amount >= 10 && amount % 10 == 0) {
      account.balance += amount;
      System.out.println("Deposit successful!");
      System.out.println("New balance: R" + account.balance);

    } else if (amount < 10) {
      System.out.println("Minimum deposit is R10!");

    } else {
      System.out.println("Maximum Deposit is R10!");
    }
  }
}

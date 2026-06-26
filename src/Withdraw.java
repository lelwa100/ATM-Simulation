import java.util.Scanner;

public class Withdraw {

  public void withdrawMoney(Balance account) {
    System.out.println("Withdrawing from: R" + account.balance);

    Scanner input = new Scanner(System.in);

    System.out.println("Enter withdrawal amount:");
    double amount = input.nextDouble();

    if (amount >= 10 && amount % 10 == 0 && amount <= account.balance) {
      account.balance -= amount;
      System.out.println("Withdrawal successful!");

    } else if (amount < 10) {
      System.out.println("Minimum withdrawal is R10!");

    } else {
      System.out.println("Insufficient balance!");
    }
  }
}

import java.util.Scanner;

public class Withdraw {

  public void withdrawMoney(Balance account) {
    System.out.println("Withdrawing from: " + account.balance);

    Scanner input = new Scanner(System.in);

    System.out.println("Enter withdrawal amount:");
    double amount = input.nextDouble();

    if (amount > 0 && amount <= account.balance) {
      account.balance -= amount;
      System.out.println("Withdrawal successful!");
    } else {
      System.out.println("insufficient balance!");
    }
  }
}

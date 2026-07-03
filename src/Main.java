public class Main {
    public static void main(String[] args) {

        Register register = new Register();
        Login login = new Login();
        Balance balance = new Balance();
        Deposit deposit = new Deposit();
        Withdraw withdraw = new Withdraw();
        Validation validation = new Validation();

        // STEP 1: REGISTER
        register.createAccount();

        // STEP 2: LOGIN
        boolean loggedIn = login.login(register.username, register.pin);

        if (loggedIn) {

            while (true) {


                System.out.println("╔════════════════════════════════════╗");
                System.out.println("║          🏧WELCOME TO ATM          ║");
                System.out.println("║════════════════════════════════════╣");
                System.out.println("║  1. 💰 Check Account Balance       ║");
                System.out.println("║  2. 💵 Deposit Funds               ║");
                System.out.println("║  3. 💸 Withdraw Funds              ║");
                System.out.println("║  4. ❌ Logout                      ║");
                System.out.println("╚════════════════════════════════════╝");

                System.out.print("Select an option: ");

                int choice = validation.getChoice();

                switch (choice) {

                    case 1:
                        balance.checkBalance();
                        break;

                    case 2:
                        deposit.depositMoney(balance);
                        break;

                    case 3:
                        withdraw.withdrawMoney(balance);
                        break;

                    case 4:
                        System.out.println("Thank you for using ATM!");
                        return;

                    default:
                        System.out.println("Invalid option!Try again");
                }
            }

        } else {
            System.out.println("Access denied!");
        }
    }
}

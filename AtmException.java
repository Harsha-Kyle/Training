import java.util.*;


class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class ATM {
    double balance = 1000;

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance!");
        }
        balance -= amount;
        System.out.println("Withdraw Successful!");
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful!");
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class AtmException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();

        while (true) {
            try {
                System.out.println("\n1. Withdraw\n2. Deposit\n3. Check Balance\n4. Exit");
                System.out.print("Choose option: ");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter amount: ");
                        double withdrawAmount = sc.nextDouble();
                        atm.withdraw(withdrawAmount);
                        break;

                    case 2:
                        System.out.print("Enter amount: ");
                        double depositAmount = sc.nextDouble();
                        atm.deposit(depositAmount);
                        break;

                    case 3:
                        atm.checkBalance();
                        break;

                    case 4:
                        System.out.println("Thank you!");
                        return;

                    default:
                        System.out.println("Invalid choice! Try again.");
                }

            } 
            catch (InsufficientBalanceException e) {
                System.out.println("Error: " + e.getMessage());
            } 
            catch (Exception e) {
                System.out.println("Invalid input! Please enter numbers only.");
                sc.nextLine(); 
            } 
            finally {
                System.out.println("Transaction completed.\n");
            }
        }
    }
}
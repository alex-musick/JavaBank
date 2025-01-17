import static java.lang.System.out;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
public class CheckingAccount {
    private double balance;

    public CheckingAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            out.println("Deposited: " + amount);
            out.println("New Balance: " + balance);
            UpdateHistory("Deposit", amount, balance);
        } else {
            out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            out.println("Withdrew: " + amount);
            out.println("New Balance: " + balance);
            UpdateHistory("Withdraw", amount, balance);
        } else if (amount > balance) {
            out.println("Insufficient funds.");
        } else {
            out.println("Withdrawal amount must be positive.");
        }
    }

    public void UpdateHistory(String TransactionType, double amount, double balance) {
        try {
            FileWriter writer = new FileWriter("Transaction_History.txt", true);
            writer.write(LocalDate.now() + ": " + TransactionType + ": " + amount + "\tNew balance " + balance + "\n");
            writer.close();
        } catch (IOException e) {
            out.println("An error occurred while updating the history.");
        }
    }

}

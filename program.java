import java.util.HashMap;
import java.util.Scanner;

public class program 
{
    public static void main(String[] args)
    {
        HashMap<Integer, Account> accounts = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int choice;
        double checking_balance = 0.00;
        // double saving_balance = 0.00;
        // String name;

        CheckingAccount checkingAccount = new CheckingAccount(checking_balance);

        do 
        {
            //double checking_balance = 0.00;
            //double saving_balance = 0.00;
           //String name;

            System.out.println("=======Menu=======");
            System.out.println("1. Select Profile");
            System.out.println("2. Print Account Information");
            System.out.println("3. Check Balance");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Make an account");
            System.out.println("7. Exit");
            System.out.print("Please enter a number: ");

            choice = scan.nextInt();
            // scan.nextLine();

            switch(choice)
            {
                case 1:
                    System.out.println(accounts);
                    System.out.println("Routing Number: ");
                    int selected_routing_number = scan.nextInt();
                    // System.out.println("Account: " + accounts.get(selected_routing_number));
                    Account selected_account = new Account();
                    // System.out.println(accounts.get(selected_routing_number.get_name()));

                    break;

                case 2:
                    System.out.println("Account info: ");
                    // System.out.println(selected_account.get_name());
                    break;

                case 3:
                    System.out.println("Check Balance: ");
                    break;

                case 4: 
                    System.out.println("Deposit: ");
                    System.out.println("Which account do you want to deposit to?");
                    System.out.println("1. Checking\n 2. Saving?");

                    int account_choice = scan.nextInt();

                    if (account_choice == 1)
                    {
                        System.out.println("Please enter the amount: ");
                        double amount = scan.nextDouble();
                        checkingAccount.deposit(amount);
                    }
                    break;

                case 5:
                    System.out.println("Withdraw: ");
                    break;

                case 6:
                    Account new_account = new Account();
                    accounts.put(new_account.get_routing_number(), new_account);
                    System.out.println(new_account.get_name());
                    break;

                case 7:
                    System.out.println("Exiting the bank, thank you!");
                    break;

                default:
                    System.out.println("Please enter a correct menu choice: ");
                    choice = scan.nextInt();
            }

        } while(choice != 7);
        
        scan.close();
    }
}
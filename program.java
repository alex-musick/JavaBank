import java.util.HashMap;
import java.util.Scanner;

public class program 
{
    public static void main(String[] args)
    {
        HashMap<Integer, Account> accounts = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int choice;

        do 
        {
            System.out.println("====Menu====");
            System.out.println("1. Select Profile");
            System.out.println("2. Print Account Information");
            System.out.println("3. Check Balance");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Make an account");
            System.out.println("7. Exit");
            System.out.print("Please enter a number: ");

            choice = scan.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Routing Number: ");
                    break;

                case 2:
                    System.out.println("Account info: ");

                case 3:
                    System.out.println("Check Balance: ");
                    break;

                case 4: 
                    System.out.println("Depost: ");
                    break;

                case 5:
                    System.out.println("Withdraw: ");
                    break;

                case 6:
                    Account new_account = new Account();
                    accounts.put(new_account.get_routing_number(), new_account);
                    break;

                case 7:
                    System.out.println("Exiting the bank, thank you!");
                    break;

                default:
                    System.out.println("Please enter a correct menu choice: ");
                    choice = scan.nextInt();
            }

        } while(choice != 6);
        
        scan.close();
    }
}
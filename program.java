import java.util.Scanner;

public class program 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int choice;

        do 
        {
            System.out.println("====Menu====");
            System.out.println("1. Select Profile");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Make an account");
            System.out.println("6. Exit");
            System.out.println("Please enter a number: ");

            choice = scan.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Account Name: ");
                    break;

                case 2:
                    System.out.println("Check Balance: ");
                    break;

                case 3: 
                    System.out.println("Depost: ");
                    break;

                case 4:
                    System.out.println("Withdraw: ");
                    break;

                case 5:
                    System.out.println("Make an Account: ");
                    break;

                case 6:
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
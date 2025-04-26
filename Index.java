import java.util.Scanner;

public class Index {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        double balance = 1000.00;

        int pin = 123;

        System.out.println("Please enter your pin");

        int userPin = sc.nextInt();

        if (userPin == pin) {

            System.out.println("Welcome to the Nafi Bank");

            int choice = 0;

            while (choice != 4) {

                System.out.println("ATM Menu:");
                System.out.println("1- Check Balance");
                System.out.println("2- Deposite Money");
                System.out.println("3- Withdraw Money");
                System.out.println("4- Exit");
                System.out.println("Enter your choice: ");

                choice = sc.nextInt();

                if (choice == 1) {
                    System.out.println("Your Current balance is : " + balance);
                }

                else if (choice == 2) {
                    System.out.println("Enter amount to deposit: ");

                    int deposit = sc.nextInt();
                    balance = balance + deposit;

                    System.out.println("Deposit successful! your current balance is :  " + balance);
                }

                else if (choice == 3) {
                    System.out.println("Enter amount to withdraw: ");
                    int withdraw = sc.nextInt();

                    if (balance < withdraw) {

                        System.out.println("Sorry insufficient balance");

                    }

                    else {

                        balance = balance - withdraw;

                        System.out.println("Withdraw successful! your current balance is : " + balance);

                    }

                }

                else if (choice == 4) {
                    System.out.println("Exiting. Thank you for using the ATM.");
                }

                else {
                    System.out.println("Invalid option. Please try again.");
                }

            }

        }

        else {

            System.out.println("Incorrect PIN. Access denied.");

        }

        sc.close();

    }

}

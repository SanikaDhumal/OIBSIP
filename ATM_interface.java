import java.util.Scanner;

public class ATM_interface {

    public static int Withdraw(int withdraw, int balance) {
        if(withdraw >= balance){
            System.out.println("Insufficient Funds");
        }
        else{
        System.out.println("Collect your cash !!");
        balance = balance - withdraw;
        System.out.println("Balance after withdrawl: " + balance);
        }
        return balance;
    }

    public static int deposit(int deposit, int balance) {
        System.out.println("Amount has been deposited successfully !!");
        balance = balance + deposit;
        System.out.println("Balance after deposition: " + balance);
        return balance;
    }

    public static int transfer(int transfer, int balance) {
        if(transfer >= balance){
            System.out.println("Insufficient Funds");
        }
        else{
        System.out.println("Amount has been transfered successfully !!");
        balance = balance - transfer;
        System.out.println("Balance after transfer: " + balance);
        }
        return balance;
    }

    public static int balance(int balance) {
        return balance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user_id = 23;
        int user_pin = 2315;
        int balance = 5000;
        int attempt = 3;
        int withdraw, deposit, transfer, i;
        System.out.println("Welcome to Automated Teller Machine !!");

        for (i = 1; i <= 3; i++) {
            System.out.println("Enter your User ID & User Pin");
            System.out.print("Enter User ID: ");
            user_id = sc.nextInt();
            System.out.print("Enter User Pin: ");
            user_pin = sc.nextInt();
            if (user_id != 23 || user_pin != 2315) {
                if (i == 3 || (attempt - i) == 0) {
                    System.out.println("Sorry, authentication failed.");
                    System.exit(0);
                } 
                else {
                    System.out.println("Please enter valid details in " + (attempt - i) + " attempts.");
                }
            }

            else {
                System.out.println("Authentication Successful !!");
                while (true) {
                    System.out.println(
                            "Choose the operation you want to perform.\n1.Withdraw\n2.Deposit\n3.Transfer\n4.Check Balance\n5. Exit");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Enter the amount to withdraw: ");
                            withdraw = sc.nextInt();
                            balance = Withdraw(withdraw, balance);
                            break;
                        case 2:
                            System.out.print("Enter the amount to deposit: ");
                            deposit = sc.nextInt();
                            balance = deposit(deposit, balance);

                            break;
                        case 3:
                            System.out.print("Enter the amount to transfer: ");
                            transfer = sc.nextInt();
                            System.out.print("Enter the beneficiary account number: ");
                            int account = sc.nextInt();
                            balance = transfer(transfer, balance);
                            break;
                        case 4:
                            System.out.println("Balance is: " + balance(balance));
                            break;
                        case 5:
                            System.out.println("Thanks for using me !!");
                            System.exit(0);
                    }
                }
            }

        }
    }

}

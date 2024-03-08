import java.util.Scanner;

public class Bank_Account {
    private int accountNo;
    private String userName;
    private String email;
    private String accountType;
    private double accountBalance;

    // Constructor
    public Bank_Account(int accountNo, String userName, String email, String accountType, double accountBalance) {
        this.accountNo = accountNo;
        this.userName = userName;
        this.email = email;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    // Method to get account details from the user
    public void getAccountDetails() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Account Number:");
        this.accountNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.println("Enter User Name:");
        this.userName = scanner.nextLine();
        
        System.out.println("Enter Email:");
        this.email = scanner.nextLine();
        
        System.out.println("Enter Account Type:");
        this.accountType = scanner.nextLine();
        
        System.out.println("Enter Account Balance:");
        this.accountBalance = scanner.nextDouble();
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + this.accountNo);
        System.out.println("User Name: " + this.userName);
        System.out.println("Email: " + this.email);
        System.out.println("Account Type: " + this.accountType);
        System.out.println("Account Balance: " + this.accountBalance);
    }

    public static void main(String[] args) {
        Bank_Account account = new Bank_Account(0, "", "", "", 0.0);
        account.getAccountDetails();
        account.displayAccountDetails();
    }
}

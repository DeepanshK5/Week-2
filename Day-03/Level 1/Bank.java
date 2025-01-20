class BankAccount {
    final String accountNumber;
    protected String accountHolderName;
    double balance;

    static String bankName;
    static double accountCount=0;

    public static double getTotalAccounts(){
        return accountCount;
    }

    // Constructor to initialize the bank account details
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        accountCount++;
    }

    // Method to access the balance
    public double getBalance() {
        return this.balance;
    }

    // Method to modify the balance
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    // Method to withdraw from the balance
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
        }
    }

    public void displayAccountDetails() {
        if(this instanceof BankAccount) {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        // Create a new SavingsAccount object
        BankAccount savingsAccount = new BankAccount("12345", "Deepansh", 10000000.0);

        // Display account details
        savingsAccount.displayAccountDetails();

        // Accessing and modifying balance
        System.out.println("Initial Balance: " + savingsAccount.getBalance());
        savingsAccount.deposit(500000.0);
        System.out.println("Balance after deposit: " + savingsAccount.getBalance());
        savingsAccount.withdraw(200000.0);
        System.out.println("Balance after withdrawal: " + savingsAccount.getBalance());
    }
}

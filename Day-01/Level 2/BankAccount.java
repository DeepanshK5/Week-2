class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    // Constructor to initialize account details
    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display current balance
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account = new BankAccount("Alice", 12345, 1000.0);

        // Simulating ATM operations
        account.displayBalance();
        account.deposit(500.0);
        account.displayBalance();
        account.withdraw(300.0);
        account.displayBalance();
        account.withdraw(1500.0);
    }
}

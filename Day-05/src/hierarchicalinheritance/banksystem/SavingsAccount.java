package hierarchicalinheritance.banksystem;

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        super.displayAccountType();
        System.out.println("Account Type Savings Account");
        System.out.println("Interest Rate " + interestRate);
    }
}

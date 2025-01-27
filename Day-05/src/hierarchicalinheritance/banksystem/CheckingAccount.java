package hierarchicalinheritance.banksystem;

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        super.displayAccountType();
        System.out.println("Account Type Checking Account");
        System.out.println("Withdrawal Limit " + withdrawalLimit);
    }
}

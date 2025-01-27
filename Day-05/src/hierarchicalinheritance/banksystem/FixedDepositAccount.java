package hierarchicalinheritance.banksystem;

class FixedDepositAccount extends BankAccount {
    int maturityPeriod;

    FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    void displayAccountType() {
        super.displayAccountType();
        System.out.println("Account Type Fixed Deposit Account");
        System.out.println("Maturity Period " + maturityPeriod);
    }
}

package hierarchicalinheritance.banksystem;

public class BankSystem {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount("SBIN2312", 500000, 3);
        BankAccount checkingAccount = new CheckingAccount("UBIN4567", 200000, 10000);
        BankAccount fixedDepositAccount = new FixedDepositAccount("CBIN3245", 1000000, 12);

        savingsAccount.displayAccountType();
        checkingAccount.displayAccountType();
        fixedDepositAccount.displayAccountType();
    }
}

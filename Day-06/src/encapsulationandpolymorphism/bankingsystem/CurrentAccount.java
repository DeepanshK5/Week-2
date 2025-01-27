package encapsulationandpolymorphism.bankingsystem;

// BankingSystem.CurrentAccount class
class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest for current accounts
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void displayOverdraftDetails() {
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

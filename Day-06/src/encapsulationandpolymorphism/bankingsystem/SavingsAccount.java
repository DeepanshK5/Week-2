package encapsulationandpolymorphism.bankingsystem;

// BankingSystem.SavingsAccount class
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * (interestRate / 100);
    }

    @Override
    public boolean applyForLoan(double amount) {
        if (amount <= calculateLoanEligibility()) {
            System.out.println("Loan of " + amount + " approved for Savings Account.");
            return true;
        } else {
            System.out.println("Loan of " + amount + " denied for Savings Account.");
            return false;
        }
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5; // Loan eligibility is 5 times the balance
    }
}

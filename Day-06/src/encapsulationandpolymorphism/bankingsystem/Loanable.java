package encapsulationandpolymorphism.bankingsystem;

// BankingSystem.Loanable Interface
interface Loanable {
    boolean applyForLoan(double amount);

    double calculateLoanEligibility();
}
